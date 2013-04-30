package src;

import org.antlr.v4.runtime.ParserRuleContext;

public class SauerkrautppMyVisitor extends SauerkrautppBaseVisitor<String> {
	Scope currentScope;
	static String BOOL = "wahrheitswert";
	static String INT = "zahl";
	static String INT2BOOL = "i2l\nldc 0\ni2l\nlcmp\ndup\nimul\n";
	static int labelCount;
	
	@Override
	public String visitPlus(SauerkrautppParser.PlusContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "iadd\n";
	}

	@Override
	public String visitNicht(SauerkrautppParser.NichtContext ctx) {
		String result = visit(ctx.links);
		result += INT2BOOL;
		result += "isub\n";
		result += "dup\n";
		result += "imul\n";
		return result;
	}

	@Override
	public String visitUngleich(SauerkrautppParser.UngleichContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append(visit(ctx.rechts));
		builder.append("i2l\n");
		builder.append("swap\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("dup\n");
		builder.append("imul\n");
		builder.append("ldc 1\n");
		builder.append("isub\n");
		builder.append("dup\n");
		builder.append("imul\n");
		return builder.toString();
	}

	@Override
	public String visitWhile_cntrl(SauerkrautppParser.While_cntrlContext ctx) {
		return visit(ctx.condition);
	}

	@Override
	public String visitBstatement(SauerkrautppParser.BstatementContext ctx) {
		return this.visitChildren(ctx);
	}

	@Override
	public String visitKlammerstatement(SauerkrautppParser.KlammerstatementContext ctx) {
		this.currentScope = new Scope(this.currentScope);
		String result = visit(ctx.content);
		this.currentScope = this.currentScope.getParent();
		return result;
	}

	@Override
	public String visitFor_loop(SauerkrautppParser.For_loopContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFor_loop(ctx);
	}

	@Override
	public String visitPrint_func(SauerkrautppParser.Print_funcContext ctx) {
		String result = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		result += visit(ctx.wert);
		result += "invokevirtual java/io/PrintStream/println(I)V\n";
		return result;
	}

	@Override
	public String visitEmptyArglist(SauerkrautppParser.EmptyArglistContext ctx) {
		return "";
	}

	@Override
	public String visitFullArglist(SauerkrautppParser.FullArglistContext ctx) {
		return "(" + visit(ctx) + ")";
	}

	@Override
	public String visitArguments(SauerkrautppParser.ArgumentsContext ctx) {
		return visit(ctx.left) + ", " + visit(ctx.right);
	}

	@Override
	public String visitArgument(SauerkrautppParser.ArgumentContext ctx) {
		return visit(ctx);
	}

	@Override
	public String visitGroessergleich(SauerkrautppParser.GroessergleichContext ctx) {
		// TODO Auto-generated method stub
		return super.visitGroessergleich(ctx);
	}

	@Override
	public String visitKleinergleich(SauerkrautppParser.KleinergleichContext ctx) {
		return super.visitKleinergleich(ctx);
	}

	@Override
	public String visitUnd(SauerkrautppParser.UndContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "imul\n" + INT2BOOL;
	}

	@Override
	public String visitDeklaration(SauerkrautppParser.DeklarationContext ctx) {
		String name = ctx.name.getText();
		if (currentScope.contains(name)) {
			System.err.println("Error: Variable already initialized.");
		} else {
			currentScope.put(name, Type.getType(ctx.typ.getText()));
		}
		return "";
	}

	@Override
	public String visitLstatement(SauerkrautppParser.LstatementContext ctx) {
		return visit(ctx.getChild(0));
	}

	private String visitChildren(ParserRuleContext ctx) {
		StringBuilder builder =  new StringBuilder();
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			builder.append(visit(ctx.getChild(i)));
		}
		return builder.toString();
	}
	
	@Override
	public String visitIf_cntrl(SauerkrautppParser.If_cntrlContext ctx) {
		return visit(ctx.expr);
	}

	@Override
	public String visitArg(SauerkrautppParser.ArgContext ctx) {
		return "int "+ctx.name.getText();
	}

	@Override
	public String visitElse_(SauerkrautppParser.Else_Context ctx) {
		return visit(ctx.else_body);
	}

	@Override
	public String visitKleiner(SauerkrautppParser.KleinerContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append(visit(ctx.rechts));
		builder.append("i2l\n");
		builder.append("swap\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("ldc 1\n");
		builder.append("iadd\n");
		builder.append("i2l\n");
		builder.append("ldc 0\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("ldc 1\n");
		builder.append("isub\n");
		builder.append("dup\n");
		builder.append("imul\n");
		return builder.toString();
	}

	@Override
	public String visitWahrheitswert(SauerkrautppParser.WahrheitswertContext ctx) {
		String result = "";
		if (ctx.getText().equals("wahr")) {
			result = "ldc 1\n";
		} else if (ctx.getText().equals("falsch")) {
			result = "ldc 0\n";
		} else {
			System.err.println("Error: Invalid boolean value.");
		}
		return result;
	}

	@Override
	public String visitFunction_decl(SauerkrautppParser.Function_declContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_decl(ctx);
	}

	@Override
	public String visitMultiplikation(SauerkrautppParser.MultiplikationContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "imul\n";
	}

	@Override
	public String visitOder(SauerkrautppParser.OderContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append(INT2BOOL);
		builder.append(visit(ctx.rechts));
		builder.append(INT2BOOL);
		builder.append("iadd\n");
		builder.append(INT2BOOL);
		return builder.toString();
	}

	@Override
	public String visitWhile_loop(SauerkrautppParser.While_loopContext ctx) {
		int label = labelCount;
		++labelCount;
		String result = String.format("while_head_label_%d:\n", label);
		result += visit(ctx.control);
		result += String.format("ifeq while_end_label_%d\n", label);
		result += visit(ctx.body);
		result += String.format("goto while_head_label_%d\n", label);
		result += String.format("while_end_label_%d\n", label);
 		return result;
	}

	@Override
	public String visitInitialisierung(SauerkrautppParser.InitialisierungContext ctx) {
		String name = ctx.name.getText();
		String result = "";
		if (currentScope.contains(name)) {
			System.err.println("Error: Variable already initialized.");
		} else {
			currentScope.put(name, Type.getType(ctx.typ.getText()));
			result = visit(ctx.wert);
			result += "istore " + String.valueOf(currentScope.getVariable(name).getIndex())+"\n";
		}
		return result;
	}

	@Override
	public String visitMinus(SauerkrautppParser.MinusContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "isub\n";
	}

	@Override
	public String visitGleich(SauerkrautppParser.GleichContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append(visit(ctx.rechts));
		builder.append("i2l\n");
		builder.append("swap\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("dup\n");
		builder.append("imul\n");
		builder.append("dup\n");
		builder.append("decr\n");
		builder.append("imul\n");
		return builder.toString();
	}

	@Override
	public String visitKlammer(SauerkrautppParser.KlammerContext ctx) {
		return visit(ctx.inKlammer);
	}

	@Override
	public String visitMultiAusdruck(SauerkrautppParser.MultiAusdruckContext ctx) {
		return visit(ctx.expr) + visit(ctx.rest);
	}

	@Override
	public String visitEinzelAusdruck(SauerkrautppParser.EinzelAusdruckContext ctx) {
		return visit(ctx.expr);
	}

	@Override
	public String visitZahl(SauerkrautppParser.ZahlContext ctx) {
		return "ldc " + ctx.getText() + "\n";
	}

	@Override
	public String visitStatement(SauerkrautppParser.StatementContext ctx) {
		return this.visitChildren(ctx);
	}

	@Override
	public String visitZuweisung(SauerkrautppParser.ZuweisungContext ctx) {
		String name = ctx.name.getText();
		String result = "";
		int index = currentScope.searchVar(name);
		if (index == -1) {
			System.err.println("Error: Variable does not exist.");
		} else {
			result = visit(ctx.wert);
			result += "istore " + String.valueOf(index)+"\n";
		}
		return result;
	}

	@Override
	public String visitStart(SauerkrautppParser.StartContext ctx) {
		currentScope = new Scope(null);
		labelCount = 0;
		return visitChildren(ctx);
	}

	@Override
	public String visitFunction_call(SauerkrautppParser.Function_callContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunction_call(ctx);
	}

	@Override
	public String visitDivision(SauerkrautppParser.DivisionContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "idiv\n";
	}

	@Override
	public String visitFor_cntrl(SauerkrautppParser.For_cntrlContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFor_cntrl(ctx);
	}

	@Override
	public String visitIf_then_else(SauerkrautppParser.If_then_elseContext ctx) {
		int label = labelCount;
		++labelCount;
		String result = visit(ctx.if_cntrl());
		result += String.format("ifeq if_label_%d\n", label);
		result += visit(ctx.statement());
		result += String.format("goto else_label_%d\n", label);
		result += String.format("if_label_%d:\n", label);
		result += visit(ctx.else_());
		result += String.format("else_label_%d:\n", label);
		return result;
	}

	@Override
	public String visitIf_then(SauerkrautppParser.If_thenContext ctx) {
		int label = labelCount;
		++labelCount;
		String result = visit(ctx.if_cntrl());
		result += String.format("ifeq if_label_%d\n", label);
		result += visit(ctx.statement());
		result += String.format("if_label_%d:\n", label);
		return result;
	}

	@Override
	public String visitGroesser(SauerkrautppParser.GroesserContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append(visit(ctx.rechts));
		builder.append("i2l\n");
		builder.append("swap\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("ldc 1\n");
		builder.append("isub\n");
		builder.append("i2l\n");
		builder.append("ldc 0\n");
		builder.append("i2l\n");
		builder.append("lcmp\n");
		builder.append("ldc 1\n");
		builder.append("iadd\n");
		return builder.toString();
	}
	
	@Override
	public String visitVariable(SauerkrautppParser.VariableContext ctx) {
		String result = "";
		String name = ctx.getText();
		int index = currentScope.searchVar(name);
		if (index != -1) {
			result = "iload " + String.valueOf(index)+"\n";
		} else {
			System.err.println("Error: Variable does not exist.");
		}
		return result;
	}
}
