package src;

// Generated from C:\Users\smgug_000\Documents\GitHub\Sauerkrautpp\Sauerkrautpp\src\Sauerkrautpp.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauerkrautppParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, ZAHL=29, BOOL=30, WHITE=31, LKLAMMER=32, 
		RKLAMMER=33, SEMICOLON=34, TYP=35, NAME=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'zurueck'", "'und'", "'oder'", "'funktion'", "'plus'", "'?'", 
		"'groessergleich'", "'minus'", "'wenn'", "'groesser'", "'gibt'", "'gleich'", 
		"'ungleich'", "'ansonsten'", "'geteiltdurch'", "'aus'", "'.'", "'mal'", 
		"'nicht'", "'fuer'", "'kleiner'", "'solange'", "'Programm<>'", "'ist'", 
		"'nimmt'", "'gib'", "'kleinergleich'", "'!'", "ZAHL", "BOOL", "WHITE", 
		"'<'", "'>'", "'/'", "TYP", "NAME"
	};
	public static final int
		RULE_start = 0, RULE_function_decls = 1, RULE_deklaration = 2, RULE_init = 3, 
		RULE_function_decl = 4, RULE_print_func = 5, RULE_arg = 6, RULE_arglist = 7, 
		RULE_args = 8, RULE_function_call = 9, RULE_ausdruecke = 10, RULE_lstatement = 11, 
		RULE_rueckgabe = 12, RULE_statement = 13, RULE_klammerstatement = 14, 
		RULE_bstatement = 15, RULE_ausdruck = 16, RULE_for_loop = 17, RULE_while_loop = 18, 
		RULE_while_cntrl = 19, RULE_if_ = 20, RULE_if_cntrl = 21, RULE_else_ = 22;
	public static final String[] ruleNames = {
		"start", "function_decls", "deklaration", "init", "function_decl", "print_func", 
		"arg", "arglist", "args", "function_call", "ausdruecke", "lstatement", 
		"rueckgabe", "statement", "klammerstatement", "bstatement", "ausdruck", 
		"for_loop", "while_loop", "while_cntrl", "if_", "if_cntrl", "else_"
	};

	@Override
	public String getGrammarFileName() { return "Sauerkrautpp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SauerkrautppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramWithDeclarationsContext extends StartContext {
		public Function_declsContext declarations;
		public StatementContext content;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Function_declsContext function_decls() {
			return getRuleContext(Function_declsContext.class,0);
		}
		public ProgramWithDeclarationsContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitProgramWithDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramContext extends StartContext {
		public StatementContext content;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case 23:
				_localctx = new ProgramContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(23);
				setState(47); ((ProgramContext)_localctx).content = statement();
				}
				break;
			case 4:
				_localctx = new ProgramWithDeclarationsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48); ((ProgramWithDeclarationsContext)_localctx).declarations = function_decls();
				setState(49); match(23);
				setState(50); ((ProgramWithDeclarationsContext)_localctx).content = statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declsContext extends ParserRuleContext {
		public Function_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decls; }
	 
		public Function_declsContext() { }
		public void copyFrom(Function_declsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends Function_declsContext {
		public Function_declContext declaration;
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public FunctionDeclarationContext(Function_declsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclarationsContext extends Function_declsContext {
		public Function_declContext declaration;
		public Function_declsContext rest;
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public Function_declsContext function_decls() {
			return getRuleContext(Function_declsContext.class,0);
		}
		public FunctionDeclarationsContext(Function_declsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunctionDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declsContext function_decls() throws RecognitionException {
		Function_declsContext _localctx = new Function_declsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_decls);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); ((FunctionDeclarationContext)_localctx).declaration = function_decl();
				}
				break;

			case 2:
				_localctx = new FunctionDeclarationsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); ((FunctionDeclarationsContext)_localctx).declaration = function_decl();
				setState(56); ((FunctionDeclarationsContext)_localctx).rest = function_decls();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeklarationContext extends ParserRuleContext {
		public Token typ;
		public Token name;
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode TYP() { return getToken(SauerkrautppParser.TYP, 0); }
		public DeklarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitDeklaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeklarationContext deklaration() throws RecognitionException {
		DeklarationContext _localctx = new DeklarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deklaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); ((DeklarationContext)_localctx).typ = match(TYP);
			setState(61); ((DeklarationContext)_localctx).name = match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZuweisungContext extends InitContext {
		public Token name;
		public AusdruckContext wert;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public ZuweisungContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitZuweisung(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitialisierungContext extends InitContext {
		public Token typ;
		public Token name;
		public AusdruckContext wert;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode TYP() { return getToken(SauerkrautppParser.TYP, 0); }
		public InitialisierungContext(InitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitInitialisierung(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_init);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case TYP:
				_localctx = new InitialisierungContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63); ((InitialisierungContext)_localctx).typ = match(TYP);
				setState(64); ((InitialisierungContext)_localctx).name = match(NAME);
				setState(65); match(24);
				setState(66); ((InitialisierungContext)_localctx).wert = ausdruck(0);
				}
				break;
			case NAME:
				_localctx = new ZuweisungContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67); ((ZuweisungContext)_localctx).name = match(NAME);
				setState(68); match(24);
				setState(69); ((ZuweisungContext)_localctx).wert = ausdruck(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declContext extends ParserRuleContext {
		public Token name;
		public ArglistContext argumentlist;
		public Token typ;
		public StatementContext body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode TYP() { return getToken(SauerkrautppParser.TYP, 0); }
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(4);
			setState(73); ((Function_declContext)_localctx).name = match(NAME);
			setState(74); match(25);
			setState(75); ((Function_declContext)_localctx).argumentlist = arglist();
			setState(76); match(11);
			setState(77); ((Function_declContext)_localctx).typ = match(TYP);
			setState(78); match(1);
			setState(79); ((Function_declContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_funcContext extends ParserRuleContext {
		public AusdruckContext wert;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public Print_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitPrint_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_funcContext print_func() throws RecognitionException {
		Print_funcContext _localctx = new Print_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(26);
			setState(82); ((Print_funcContext)_localctx).wert = ausdruck(0);
			setState(83); match(16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public Token typ;
		public Token name;
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode TYP() { return getToken(SauerkrautppParser.TYP, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); ((ArgContext)_localctx).typ = match(TYP);
			setState(86); ((ArgContext)_localctx).name = match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	 
		public ArglistContext() { }
		public void copyFrom(ArglistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyArglistContext extends ArglistContext {
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public EmptyArglistContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitEmptyArglist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullArglistContext extends ArglistContext {
		public ArgsContext content;
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public FullArglistContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFullArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arglist);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new EmptyArglistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(LKLAMMER);
				setState(89); match(RKLAMMER);
				}
				break;

			case 2:
				_localctx = new FullArglistContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(LKLAMMER);
				setState(91); ((FullArglistContext)_localctx).content = args();
				setState(92); match(RKLAMMER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentContext extends ArgsContext {
		public ArgContext content;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ArgumentContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentsContext extends ArgsContext {
		public ArgContext left;
		public ArgsContext right;
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgumentsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96); ((ArgumentContext)_localctx).content = arg();
				}
				break;

			case 2:
				_localctx = new ArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97); ((ArgumentsContext)_localctx).left = arg();
				setState(98); match(SEMICOLON);
				setState(99); ((ArgumentsContext)_localctx).right = args();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallWithoutArgsContext extends Function_callContext {
		public Token name;
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public FunctionCallWithoutArgsContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunctionCallWithoutArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallWithArgsContext extends Function_callContext {
		public Token name;
		public AusdrueckeContext arguments;
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public AusdrueckeContext ausdruecke() {
			return getRuleContext(AusdrueckeContext.class,0);
		}
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public FunctionCallWithArgsContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunctionCallWithArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FunctionCallWithoutArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103); ((FunctionCallWithoutArgsContext)_localctx).name = match(NAME);
				setState(104); match(LKLAMMER);
				setState(105); match(RKLAMMER);
				}
				break;

			case 2:
				_localctx = new FunctionCallWithArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106); ((FunctionCallWithArgsContext)_localctx).name = match(NAME);
				setState(107); match(LKLAMMER);
				setState(108); ((FunctionCallWithArgsContext)_localctx).arguments = ausdruecke();
				setState(109); match(RKLAMMER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusdrueckeContext extends ParserRuleContext {
		public AusdrueckeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausdruecke; }
	 
		public AusdrueckeContext() { }
		public void copyFrom(AusdrueckeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiAusdruckContext extends AusdrueckeContext {
		public AusdruckContext expr;
		public AusdrueckeContext rest;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public AusdrueckeContext ausdruecke() {
			return getRuleContext(AusdrueckeContext.class,0);
		}
		public MultiAusdruckContext(AusdrueckeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitMultiAusdruck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EinzelAusdruckContext extends AusdrueckeContext {
		public AusdruckContext expr;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public EinzelAusdruckContext(AusdrueckeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitEinzelAusdruck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusdrueckeContext ausdruecke() throws RecognitionException {
		AusdrueckeContext _localctx = new AusdrueckeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ausdruecke);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new EinzelAusdruckContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113); ((EinzelAusdruckContext)_localctx).expr = ausdruck(0);
				}
				break;

			case 2:
				_localctx = new MultiAusdruckContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114); ((MultiAusdruckContext)_localctx).expr = ausdruck(0);
				setState(115); match(SEMICOLON);
				setState(116); ((MultiAusdruckContext)_localctx).rest = ausdruecke();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstatementContext extends ParserRuleContext {
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public RueckgabeContext rueckgabe() {
			return getRuleContext(RueckgabeContext.class,0);
		}
		public DeklarationContext deklaration() {
			return getRuleContext(DeklarationContext.class,0);
		}
		public LstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitLstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstatementContext lstatement() throws RecognitionException {
		LstatementContext _localctx = new LstatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lstatement);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); ausdruck(0);
				setState(121); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); init();
				setState(124); match(17);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); deklaration();
				setState(127); match(17);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); print_func();
				setState(130); match(17);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132); function_call();
				setState(133); match(17);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135); rueckgabe();
				setState(136); match(17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RueckgabeContext extends ParserRuleContext {
		public AusdruckContext expr;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public RueckgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rueckgabe; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitRueckgabe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RueckgabeContext rueckgabe() throws RecognitionException {
		RueckgabeContext _localctx = new RueckgabeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rueckgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(26);
			setState(141); ((RueckgabeContext)_localctx).expr = ausdruck(0);
			setState(142); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public KlammerstatementContext klammerstatement() {
			return getRuleContext(KlammerstatementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LstatementContext lstatement() {
			return getRuleContext(LstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case 19:
			case 26:
			case ZAHL:
			case BOOL:
			case LKLAMMER:
			case TYP:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); lstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); klammerstatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); for_loop();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(148); if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KlammerstatementContext extends ParserRuleContext {
		public BstatementContext content;
		public BstatementContext bstatement() {
			return getRuleContext(BstatementContext.class,0);
		}
		public KlammerstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_klammerstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitKlammerstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KlammerstatementContext klammerstatement() throws RecognitionException {
		KlammerstatementContext _localctx = new KlammerstatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_klammerstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(6);
			setState(152); ((KlammerstatementContext)_localctx).content = bstatement(0);
			setState(153); match(28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BstatementContext extends ParserRuleContext {
		public int _p;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<BstatementContext> bstatement() {
			return getRuleContexts(BstatementContext.class);
		}
		public BstatementContext bstatement(int i) {
			return getRuleContext(BstatementContext.class,i);
		}
		public BstatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BstatementContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_bstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitBstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BstatementContext bstatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BstatementContext _localctx = new BstatementContext(_ctx, _parentState, _p);
		BstatementContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_bstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BstatementContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_bstatement);
					setState(158);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(159); bstatement(0);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AusdruckContext extends ParserRuleContext {
		public int _p;
		public AusdruckContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AusdruckContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_ausdruck; }
	 
		public AusdruckContext() { }
		public void copyFrom(AusdruckContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class PlusContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public PlusContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public MinusContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NichtContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public NichtContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitNicht(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AusdruckContext {
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public VariableContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunktionsAufrufContext extends AusdruckContext {
		public Function_callContext call;
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunktionsAufrufContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunktionsAufruf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GleichContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public GleichContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitGleich(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroessergleichContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public GroessergleichContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitGroessergleich(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KleinergleichContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public KleinergleichContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitKleinergleich(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KlammerContext extends AusdruckContext {
		public AusdruckContext inKlammer;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public KlammerContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitKlammer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UndContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public UndContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitUnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZahlContext extends AusdruckContext {
		public TerminalNode ZAHL() { return getToken(SauerkrautppParser.ZAHL, 0); }
		public ZahlContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitZahl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public DivisionContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KleinerContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public KleinerContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitKleiner(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WahrheitswertContext extends AusdruckContext {
		public TerminalNode BOOL() { return getToken(SauerkrautppParser.BOOL, 0); }
		public WahrheitswertContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitWahrheitswert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroesserContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public GroesserContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitGroesser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OderContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public OderContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitOder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplikationContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public MultiplikationContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitMultiplikation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UngleichContext extends AusdruckContext {
		public AusdruckContext links;
		public AusdruckContext rechts;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public UngleichContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitUngleich(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusdruckContext ausdruck(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AusdruckContext _localctx = new AusdruckContext(_ctx, _parentState, _p);
		AusdruckContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_ausdruck);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NichtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166); match(19);
				setState(167); ((NichtContext)_localctx).links = ausdruck(18);
				}
				break;

			case 2:
				{
				_localctx = new KlammerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(LKLAMMER);
				setState(169); ((KlammerContext)_localctx).inKlammer = ausdruck(0);
				setState(170); match(RKLAMMER);
				}
				break;

			case 3:
				{
				_localctx = new ZahlContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(ZAHL);
				}
				break;

			case 4:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173); match(NAME);
				}
				break;

			case 5:
				{
				_localctx = new WahrheitswertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(BOOL);
				}
				break;

			case 6:
				{
				_localctx = new FunktionsAufrufContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); ((FunktionsAufrufContext)_localctx).call = function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new AusdruckContext(_parentctx, _parentState, _p));
						((DivisionContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(178);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(179); match(15);
						setState(180); ((DivisionContext)_localctx).rechts = ausdruck(18);
						}
						break;

					case 2:
						{
						_localctx = new MultiplikationContext(new AusdruckContext(_parentctx, _parentState, _p));
						((MultiplikationContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(181);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(182); match(18);
						setState(183); ((MultiplikationContext)_localctx).rechts = ausdruck(17);
						}
						break;

					case 3:
						{
						_localctx = new MinusContext(new AusdruckContext(_parentctx, _parentState, _p));
						((MinusContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(184);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(185); match(8);
						setState(186); ((MinusContext)_localctx).rechts = ausdruck(16);
						}
						break;

					case 4:
						{
						_localctx = new PlusContext(new AusdruckContext(_parentctx, _parentState, _p));
						((PlusContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(187);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(188); match(5);
						setState(189); ((PlusContext)_localctx).rechts = ausdruck(15);
						}
						break;

					case 5:
						{
						_localctx = new OderContext(new AusdruckContext(_parentctx, _parentState, _p));
						((OderContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(190);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(191); match(3);
						setState(192); ((OderContext)_localctx).rechts = ausdruck(14);
						}
						break;

					case 6:
						{
						_localctx = new UndContext(new AusdruckContext(_parentctx, _parentState, _p));
						((UndContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(193);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(194); match(2);
						setState(195); ((UndContext)_localctx).rechts = ausdruck(13);
						}
						break;

					case 7:
						{
						_localctx = new GleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(196);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(197); match(12);
						setState(198); ((GleichContext)_localctx).rechts = ausdruck(12);
						}
						break;

					case 8:
						{
						_localctx = new KleinerContext(new AusdruckContext(_parentctx, _parentState, _p));
						((KleinerContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(199);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(200); match(21);
						setState(201); ((KleinerContext)_localctx).rechts = ausdruck(11);
						}
						break;

					case 9:
						{
						_localctx = new KleinergleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((KleinergleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(202);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(203); match(27);
						setState(204); ((KleinergleichContext)_localctx).rechts = ausdruck(10);
						}
						break;

					case 10:
						{
						_localctx = new GroesserContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GroesserContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(205);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(206); match(10);
						setState(207); ((GroesserContext)_localctx).rechts = ausdruck(9);
						}
						break;

					case 11:
						{
						_localctx = new GroessergleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GroessergleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(208);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(209); match(7);
						setState(210); ((GroessergleichContext)_localctx).rechts = ausdruck(8);
						}
						break;

					case 12:
						{
						_localctx = new UngleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((UngleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(211);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(212); match(13);
						setState(213); ((UngleichContext)_localctx).rechts = ausdruck(7);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public InitContext initialization;
		public AusdruckContext condition;
		public InitContext afterthought;
		public StatementContext body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(SauerkrautppParser.SEMICOLON, i);
		}
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SauerkrautppParser.SEMICOLON); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(20);
			setState(220); match(LKLAMMER);
			setState(221); ((For_loopContext)_localctx).initialization = init();
			setState(222); match(SEMICOLON);
			setState(223); ((For_loopContext)_localctx).condition = ausdruck(0);
			setState(224); match(SEMICOLON);
			setState(225); ((For_loopContext)_localctx).afterthought = init();
			setState(226); match(RKLAMMER);
			setState(227); ((For_loopContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public While_cntrlContext control;
		public StatementContext body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_cntrlContext while_cntrl() {
			return getRuleContext(While_cntrlContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(22);
			setState(230); ((While_loopContext)_localctx).control = while_cntrl();
			setState(231); ((While_loopContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_cntrlContext extends ParserRuleContext {
		public AusdruckContext condition;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public While_cntrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cntrl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitWhile_cntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cntrlContext while_cntrl() throws RecognitionException {
		While_cntrlContext _localctx = new While_cntrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(LKLAMMER);
			setState(234); ((While_cntrlContext)_localctx).condition = ausdruck(0);
			setState(235); match(RKLAMMER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_Context extends ParserRuleContext {
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
	 
		public If_Context() { }
		public void copyFrom(If_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_then_elseContext extends If_Context {
		public StatementContext then_body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_cntrlContext if_cntrl() {
			return getRuleContext(If_cntrlContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_then_elseContext(If_Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitIf_then_else(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_thenContext extends If_Context {
		public StatementContext then;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_cntrlContext if_cntrl() {
			return getRuleContext(If_cntrlContext.class,0);
		}
		public If_thenContext(If_Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new If_thenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237); match(9);
				setState(238); if_cntrl();
				setState(239); ((If_thenContext)_localctx).then = statement();
				}
				break;

			case 2:
				_localctx = new If_then_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); match(9);
				setState(242); if_cntrl();
				setState(243); ((If_then_elseContext)_localctx).then_body = statement();
				setState(244); else_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_cntrlContext extends ParserRuleContext {
		public AusdruckContext expr;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public If_cntrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cntrl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitIf_cntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_cntrlContext if_cntrl() throws RecognitionException {
		If_cntrlContext _localctx = new If_cntrlContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(LKLAMMER);
			setState(249); ((If_cntrlContext)_localctx).expr = ausdruck(0);
			setState(250); match(RKLAMMER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_Context extends ParserRuleContext {
		public StatementContext else_body;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(14);
			setState(253); ((Else_Context)_localctx).else_body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return bstatement_sempred((BstatementContext)_localctx, predIndex);

		case 16: return ausdruck_sempred((AusdruckContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ausdruck_sempred(AusdruckContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 17 >= _localctx._p;

		case 2: return 16 >= _localctx._p;

		case 3: return 15 >= _localctx._p;

		case 4: return 14 >= _localctx._p;

		case 5: return 13 >= _localctx._p;

		case 6: return 12 >= _localctx._p;

		case 7: return 11 >= _localctx._p;

		case 8: return 10 >= _localctx._p;

		case 9: return 9 >= _localctx._p;

		case 10: return 8 >= _localctx._p;

		case 11: return 7 >= _localctx._p;

		case 12: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean bstatement_sempred(BstatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3&\u0102\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\3\2\3\2\3\2\3\2\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\5\3=\n\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\ta\n\t\3\n\3\n\3\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13r\n\13\3\f\3\f\3\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00a3\n\21\f\21\16\21\u00a6\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d9\n\22\f\22\16\22\u00dc"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f9\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\2\31\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u010d\2\66\3\2\2\2\4<\3\2"+
		"\2\2\6>\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fS\3\2\2\2\16W\3\2\2\2\20`\3\2\2"+
		"\2\22g\3\2\2\2\24q\3\2\2\2\26x\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2"+
		"\2\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \u009d\3\2\2\2\"\u00b2\3\2\2\2$\u00dd"+
		"\3\2\2\2&\u00e7\3\2\2\2(\u00eb\3\2\2\2*\u00f8\3\2\2\2,\u00fa\3\2\2\2."+
		"\u00fe\3\2\2\2\60\61\7\31\2\2\61\67\5\34\17\2\62\63\5\4\3\2\63\64\7\31"+
		"\2\2\64\65\5\34\17\2\65\67\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2\67\3\3"+
		"\2\2\28=\5\n\6\29:\5\n\6\2:;\5\4\3\2;=\3\2\2\2<8\3\2\2\2<9\3\2\2\2=\5"+
		"\3\2\2\2>?\7%\2\2?@\7&\2\2@\7\3\2\2\2AB\7%\2\2BC\7&\2\2CD\7\32\2\2DI\5"+
		"\"\22\2EF\7&\2\2FG\7\32\2\2GI\5\"\22\2HA\3\2\2\2HE\3\2\2\2I\t\3\2\2\2"+
		"JK\7\6\2\2KL\7&\2\2LM\7\33\2\2MN\5\20\t\2NO\7\r\2\2OP\7%\2\2PQ\7\3\2\2"+
		"QR\5\34\17\2R\13\3\2\2\2ST\7\34\2\2TU\5\"\22\2UV\7\22\2\2V\r\3\2\2\2W"+
		"X\7%\2\2XY\7&\2\2Y\17\3\2\2\2Z[\7\"\2\2[a\7#\2\2\\]\7\"\2\2]^\5\22\n\2"+
		"^_\7#\2\2_a\3\2\2\2`Z\3\2\2\2`\\\3\2\2\2a\21\3\2\2\2bh\5\16\b\2cd\5\16"+
		"\b\2de\7$\2\2ef\5\22\n\2fh\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\23\3\2\2\2ij\7"+
		"&\2\2jk\7\"\2\2kr\7#\2\2lm\7&\2\2mn\7\"\2\2no\5\26\f\2op\7#\2\2pr\3\2"+
		"\2\2qi\3\2\2\2ql\3\2\2\2r\25\3\2\2\2sy\5\"\22\2tu\5\"\22\2uv\7$\2\2vw"+
		"\5\26\f\2wy\3\2\2\2xs\3\2\2\2xt\3\2\2\2y\27\3\2\2\2z{\5\"\22\2{|\7\23"+
		"\2\2|\u008d\3\2\2\2}~\5\b\5\2~\177\7\23\2\2\177\u008d\3\2\2\2\u0080\u0081"+
		"\5\6\4\2\u0081\u0082\7\23\2\2\u0082\u008d\3\2\2\2\u0083\u0084\5\f\7\2"+
		"\u0084\u0085\7\23\2\2\u0085\u008d\3\2\2\2\u0086\u0087\5\24\13\2\u0087"+
		"\u0088\7\23\2\2\u0088\u008d\3\2\2\2\u0089\u008a\5\32\16\2\u008a\u008b"+
		"\7\23\2\2\u008b\u008d\3\2\2\2\u008cz\3\2\2\2\u008c}\3\2\2\2\u008c\u0080"+
		"\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d"+
		"\31\3\2\2\2\u008e\u008f\7\34\2\2\u008f\u0090\5\"\22\2\u0090\u0091\7\3"+
		"\2\2\u0091\33\3\2\2\2\u0092\u0098\5\30\r\2\u0093\u0098\5\36\20\2\u0094"+
		"\u0098\5$\23\2\u0095\u0098\5&\24\2\u0096\u0098\5*\26\2\u0097\u0092\3\2"+
		"\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\35\3\2\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5 \21"+
		"\2\u009b\u009c\7\36\2\2\u009c\37\3\2\2\2\u009d\u009e\b\21\1\2\u009e\u009f"+
		"\5\34\17\2\u009f\u00a4\3\2\2\2\u00a0\u00a1\6\21\2\3\u00a1\u00a3\5 \21"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5!\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\b\22\1\2\u00a8"+
		"\u00a9\7\25\2\2\u00a9\u00b3\5\"\22\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5"+
		"\"\22\2\u00ac\u00ad\7#\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00b3\7\37\2\2\u00af"+
		"\u00b3\7&\2\2\u00b0\u00b3\7 \2\2\u00b1\u00b3\5\24\13\2\u00b2\u00a7\3\2"+
		"\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00da\3\2\2\2\u00b4\u00b5\6\22"+
		"\3\3\u00b5\u00b6\7\21\2\2\u00b6\u00d9\5\"\22\2\u00b7\u00b8\6\22\4\3\u00b8"+
		"\u00b9\7\24\2\2\u00b9\u00d9\5\"\22\2\u00ba\u00bb\6\22\5\3\u00bb\u00bc"+
		"\7\n\2\2\u00bc\u00d9\5\"\22\2\u00bd\u00be\6\22\6\3\u00be\u00bf\7\7\2\2"+
		"\u00bf\u00d9\5\"\22\2\u00c0\u00c1\6\22\7\3\u00c1\u00c2\7\5\2\2\u00c2\u00d9"+
		"\5\"\22\2\u00c3\u00c4\6\22\b\3\u00c4\u00c5\7\4\2\2\u00c5\u00d9\5\"\22"+
		"\2\u00c6\u00c7\6\22\t\3\u00c7\u00c8\7\16\2\2\u00c8\u00d9\5\"\22\2\u00c9"+
		"\u00ca\6\22\n\3\u00ca\u00cb\7\27\2\2\u00cb\u00d9\5\"\22\2\u00cc\u00cd"+
		"\6\22\13\3\u00cd\u00ce\7\35\2\2\u00ce\u00d9\5\"\22\2\u00cf\u00d0\6\22"+
		"\f\3\u00d0\u00d1\7\f\2\2\u00d1\u00d9\5\"\22\2\u00d2\u00d3\6\22\r\3\u00d3"+
		"\u00d4\7\t\2\2\u00d4\u00d9\5\"\22\2\u00d5\u00d6\6\22\16\3\u00d6\u00d7"+
		"\7\17\2\2\u00d7\u00d9\5\"\22\2\u00d8\u00b4\3\2\2\2\u00d8\u00b7\3\2\2\2"+
		"\u00d8\u00ba\3\2\2\2\u00d8\u00bd\3\2\2\2\u00d8\u00c0\3\2\2\2\u00d8\u00c3"+
		"\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db#\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\5\b\5\2"+
		"\u00e0\u00e1\7$\2\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3\7$\2\2\u00e3\u00e4"+
		"\5\b\5\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\5\34\17\2\u00e6%\3\2\2\2\u00e7"+
		"\u00e8\7\30\2\2\u00e8\u00e9\5(\25\2\u00e9\u00ea\5\34\17\2\u00ea\'\3\2"+
		"\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\7#\2\2\u00ee"+
		")\3\2\2\2\u00ef\u00f0\7\13\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\5\34\17"+
		"\2\u00f2\u00f9\3\2\2\2\u00f3\u00f4\7\13\2\2\u00f4\u00f5\5,\27\2\u00f5"+
		"\u00f6\5\34\17\2\u00f6\u00f7\5.\30\2\u00f7\u00f9\3\2\2\2\u00f8\u00ef\3"+
		"\2\2\2\u00f8\u00f3\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc"+
		"\5\"\22\2\u00fc\u00fd\7#\2\2\u00fd-\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff"+
		"\u0100\5\34\17\2\u0100/\3\2\2\2\20\66<H`gqx\u008c\u0097\u00a4\u00b2\u00d8"+
		"\u00da\u00f8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}