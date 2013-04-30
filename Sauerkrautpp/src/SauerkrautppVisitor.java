package src;

// Generated from C:\Users\smgug_000\Documents\GitHub\Sauerkrautpp\Sauerkrautpp\src\Sauerkrautpp.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SauerkrautppVisitor<T> extends ParseTreeVisitor<T> {
	T visitProgramWithDeclarations(SauerkrautppParser.ProgramWithDeclarationsContext ctx);

	T visitWhile_cntrl(SauerkrautppParser.While_cntrlContext ctx);

	T visitBstatement(SauerkrautppParser.BstatementContext ctx);

	T visitNicht(SauerkrautppParser.NichtContext ctx);

	T visitFor_loop(SauerkrautppParser.For_loopContext ctx);

	T visitIf_then_else(SauerkrautppParser.If_then_elseContext ctx);

	T visitGroessergleich(SauerkrautppParser.GroessergleichContext ctx);

	T visitKleinergleich(SauerkrautppParser.KleinergleichContext ctx);

	T visitUnd(SauerkrautppParser.UndContext ctx);

	T visitDeklaration(SauerkrautppParser.DeklarationContext ctx);

	T visitFunctionCallWithArgs(SauerkrautppParser.FunctionCallWithArgsContext ctx);

	T visitLstatement(SauerkrautppParser.LstatementContext ctx);

	T visitIf_cntrl(SauerkrautppParser.If_cntrlContext ctx);

	T visitArg(SauerkrautppParser.ArgContext ctx);

	T visitEmptyArglist(SauerkrautppParser.EmptyArglistContext ctx);

	T visitElse_(SauerkrautppParser.Else_Context ctx);

	T visitPrint_func(SauerkrautppParser.Print_funcContext ctx);

	T visitKleiner(SauerkrautppParser.KleinerContext ctx);

	T visitWahrheitswert(SauerkrautppParser.WahrheitswertContext ctx);

	T visitMultiAusdruck(SauerkrautppParser.MultiAusdruckContext ctx);

	T visitFunction_decl(SauerkrautppParser.Function_declContext ctx);

	T visitOder(SauerkrautppParser.OderContext ctx);

	T visitMultiplikation(SauerkrautppParser.MultiplikationContext ctx);

	T visitWhile_loop(SauerkrautppParser.While_loopContext ctx);

	T visitProgram(SauerkrautppParser.ProgramContext ctx);

	T visitEinzelAusdruck(SauerkrautppParser.EinzelAusdruckContext ctx);

	T visitUngleich(SauerkrautppParser.UngleichContext ctx);

	T visitInitialisierung(SauerkrautppParser.InitialisierungContext ctx);

	T visitPlus(SauerkrautppParser.PlusContext ctx);

	T visitMinus(SauerkrautppParser.MinusContext ctx);

	T visitArguments(SauerkrautppParser.ArgumentsContext ctx);

	T visitVariable(SauerkrautppParser.VariableContext ctx);

	T visitFunctionDeclaration(SauerkrautppParser.FunctionDeclarationContext ctx);

	T visitGleich(SauerkrautppParser.GleichContext ctx);

	T visitKlammer(SauerkrautppParser.KlammerContext ctx);

	T visitFunctionDeclarations(SauerkrautppParser.FunctionDeclarationsContext ctx);

	T visitZahl(SauerkrautppParser.ZahlContext ctx);

	T visitStatement(SauerkrautppParser.StatementContext ctx);

	T visitArgument(SauerkrautppParser.ArgumentContext ctx);

	T visitZuweisung(SauerkrautppParser.ZuweisungContext ctx);

	T visitKlammerstatement(SauerkrautppParser.KlammerstatementContext ctx);

	T visitDivision(SauerkrautppParser.DivisionContext ctx);

	T visitIf_then(SauerkrautppParser.If_thenContext ctx);

	T visitGroesser(SauerkrautppParser.GroesserContext ctx);

	T visitFullArglist(SauerkrautppParser.FullArglistContext ctx);

	T visitFunctionCallWithoutArgs(SauerkrautppParser.FunctionCallWithoutArgsContext ctx);
}