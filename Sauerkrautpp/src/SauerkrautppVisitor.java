package src;

// Generated from C:\Users\smgug_000\Documents\GitHub\Sauerkrautpp\Sauerkrautpp\src\Sauerkrautpp.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SauerkrautppVisitor<T> extends ParseTreeVisitor<T> {
	T visitWhile_cntrl(SauerkrautppParser.While_cntrlContext ctx);

	T visitBstatement(SauerkrautppParser.BstatementContext ctx);

	T visitNicht(SauerkrautppParser.NichtContext ctx);

	T visitFor_loop(SauerkrautppParser.For_loopContext ctx);

	T visitGroessergleich(SauerkrautppParser.GroessergleichContext ctx);

	T visitKleinergleich(SauerkrautppParser.KleinergleichContext ctx);

	T visitUnd(SauerkrautppParser.UndContext ctx);

	T visitDeklaration(SauerkrautppParser.DeklarationContext ctx);

	T visitLstatement(SauerkrautppParser.LstatementContext ctx);

	T visitIf_cntrl(SauerkrautppParser.If_cntrlContext ctx);

	T visitArg(SauerkrautppParser.ArgContext ctx);

	T visitEmptyArglist(SauerkrautppParser.EmptyArglistContext ctx);

	T visitElse_(SauerkrautppParser.Else_Context ctx);

	T visitPrint_func(SauerkrautppParser.Print_funcContext ctx);

	T visitKleiner(SauerkrautppParser.KleinerContext ctx);

	T visitWahrheitswert(SauerkrautppParser.WahrheitswertContext ctx);

	T visitFunction_decl(SauerkrautppParser.Function_declContext ctx);

	T visitOder(SauerkrautppParser.OderContext ctx);

	T visitMultiplikation(SauerkrautppParser.MultiplikationContext ctx);

	T visitWhile_loop(SauerkrautppParser.While_loopContext ctx);

	T visitUngleich(SauerkrautppParser.UngleichContext ctx);

	T visitInitialisierung(SauerkrautppParser.InitialisierungContext ctx);

	T visitPlus(SauerkrautppParser.PlusContext ctx);

	T visitArguments(SauerkrautppParser.ArgumentsContext ctx);

	T visitMinus(SauerkrautppParser.MinusContext ctx);

	T visitVariable(SauerkrautppParser.VariableContext ctx);

	T visitGleich(SauerkrautppParser.GleichContext ctx);

	T visitKlammer(SauerkrautppParser.KlammerContext ctx);

	T visitAusdruecke(SauerkrautppParser.AusdrueckeContext ctx);

	T visitZahl(SauerkrautppParser.ZahlContext ctx);

	T visitStatement(SauerkrautppParser.StatementContext ctx);

	T visitArgument(SauerkrautppParser.ArgumentContext ctx);

	T visitZuweisung(SauerkrautppParser.ZuweisungContext ctx);

	T visitStart(SauerkrautppParser.StartContext ctx);

	T visitKlammerstatement(SauerkrautppParser.KlammerstatementContext ctx);

	T visitFunction_call(SauerkrautppParser.Function_callContext ctx);

	T visitDivision(SauerkrautppParser.DivisionContext ctx);

	T visitFor_cntrl(SauerkrautppParser.For_cntrlContext ctx);

	T visitIf_(SauerkrautppParser.If_Context ctx);

	T visitGroesser(SauerkrautppParser.GroesserContext ctx);

	T visitFullArglist(SauerkrautppParser.FullArglistContext ctx);
}