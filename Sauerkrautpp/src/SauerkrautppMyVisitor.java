package src;

import org.antlr.v4.runtime.ParserRuleContext;

import src.SauerkrautppParser.FunctionCallWithArgsContext;
import src.SauerkrautppParser.FunctionCallWithoutArgsContext;
import src.SauerkrautppParser.FunktionsAufrufContext;

public class SauerkrautppMyVisitor extends SauerkrautppBaseVisitor<String> {
	Scope currentScope;
	static String BOOL = "wahrheitswert";
	static String INT = "zahl";
	static String INT2BOOL = "i2l\nldc 0\ni2l\nlcmp\ndup\nimul\n";
	static int labelCount;
	static String mainString = ".method public <init>()V\naload_0\ninvokenonvirtual java/lang/Object/<init>()V\nreturn\n.end method\n\n.method public static main([Ljava/lang/String;)V\n";
	static String limits = ".limit stack 10000\n.limit locals 10000\n";
	static String CLASS = ".class public Spp\n.super java/lang/Object\n";
	
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
	public String visitFunktionsAufruf(FunktionsAufrufContext ctx) {
		return visit(ctx.call);
	}

	@Override
	public String visitFor_loop(SauerkrautppParser.For_loopContext ctx) {
		int label = labelCount;
		++labelCount;
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.initialization));
		builder.append(String.format("for_head_label_%d:\n", label));
		builder.append(visit(ctx.condition));
		builder.append(String.format("ifeq for_end_label_%d\n",label));
		builder.append(visit(ctx.body));
		builder.append(visit(ctx.afterthought));
		builder.append(String.format("goto for_head_label_%d\n", label));
		builder.append(String.format("for_end_label_%d:\n", label));
		return builder.toString();
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
		return visit(ctx.content);
	}

	@Override
	public String visitArguments(SauerkrautppParser.ArgumentsContext ctx) {
		return visit(ctx.left) + visit(ctx.right);
	}

	@Override
	public String visitArgument(SauerkrautppParser.ArgumentContext ctx) {
		return visit(ctx.content);
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
		currentScope.fPut(ctx.name.getText(), Type.getType(ctx.typ.getText()));
		return "I";
	}

	@Override
	public String visitElse_(SauerkrautppParser.Else_Context ctx) {
		return visit(ctx.else_body);
	}

	@Override
	public String visitKleiner(SauerkrautppParser.KleinerContext ctx) {
		StringBuilder builder = new StringBuilder();
		builder.append(visit(ctx.links));
		builder.append("i2l\n");
		builder.append(visit(ctx.rechts));
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
		Scope oldScope = currentScope;
		currentScope = new Scope(null);
		String result = String.format(".method public static %s(%s)I\n", ctx.name.getText(), visit(ctx.argumentlist));
		result += limits;
		result += visit(ctx.body);
		result += ".end method\n";
		currentScope = oldScope; 
		return result;
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
		result += String.format("while_end_label_%d:\n", label);
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
	public String visitProgramWithDeclarations(
			SauerkrautppParser.ProgramWithDeclarationsContext ctx) {
		return CLASS + visit(ctx.declarations) + mainString + limits + visit(ctx.content) + "return\n.end method\n";
	}

	@Override
	public String visitProgram(SauerkrautppParser.ProgramContext ctx) {
		return CLASS + mainString + limits + visit(ctx.content) + "return\n.end method\n";
	}

	@Override
	public String visitFunctionDeclaration(SauerkrautppParser.FunctionDeclarationContext ctx) {
		return visit(ctx.declaration);
	}

	@Override
	public String visitFunctionDeclarations(SauerkrautppParser.FunctionDeclarationsContext ctx) {
		return visit(ctx.declaration) + visit(ctx.rest);
	}

	private int countCharInString(char c, String s) {
		int result = 0;
		for (int i = 0; i < s.length() ; ++i) {
			if (c == s.toCharArray()[i]) {
				++result;
			}
		}
		return result;
	}
	
	@Override
	public String visitFunctionCallWithArgs(FunctionCallWithArgsContext ctx) {
		String args = "";
		for (int i = 0; i < countCharInString('/',ctx.arguments.getText()) + 1; ++i) {
			args += "I";
		}
		return visit(ctx.arguments) + 
				String.format("invokestatic Spp/%s(%s)I\n", ctx.name.getText(), args);
	}

	@Override
	public String visitFunctionCallWithoutArgs(
			FunctionCallWithoutArgsContext ctx) {
		return String.format("invokestatic Spp%s()I\n", ctx.name.getText());
	}

	@Override
	public String visitDivision(SauerkrautppParser.DivisionContext ctx) {
		return visit(ctx.links) + visit(ctx.rechts) + "idiv\n";
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
	public String visitRueckgabe(SauerkrautppParser.RueckgabeContext ctx) {
		return visit(ctx.expr) + "ireturn\n";
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
