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
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, ZAHL=28, BOOL=29, WHITE=30, LKLAMMER=31, RKLAMMER=32, 
		SEMICOLON=33, TYP=34, NAME=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'zurueck'", "'und'", "'oder'", "'funktion'", "'plus'", "'?'", 
		"'groessergleich'", "'minus'", "'wenn'", "'groesser'", "'gibt'", "'gleich'", 
		"'ungleich'", "'ansonsten'", "'geteiltdurch'", "'aus'", "'.'", "'mal'", 
		"'nicht'", "'fuer'", "'kleiner'", "'solange'", "'ist'", "'nimmt'", "'gib'", 
		"'kleinergleich'", "'!'", "ZAHL", "BOOL", "WHITE", "'<'", "'>'", "'/'", 
		"TYP", "NAME"
	};
	public static final int
		RULE_start = 0, RULE_deklaration = 1, RULE_init = 2, RULE_function_decl = 3, 
		RULE_print_func = 4, RULE_arg = 5, RULE_arglist = 6, RULE_args = 7, RULE_function_call = 8, 
		RULE_ausdruecke = 9, RULE_lstatement = 10, RULE_statement = 11, RULE_klammerstatement = 12, 
		RULE_bstatement = 13, RULE_ausdruck = 14, RULE_for_loop = 15, RULE_for_cntrl = 16, 
		RULE_while_loop = 17, RULE_while_cntrl = 18, RULE_if_ = 19, RULE_if_cntrl = 20, 
		RULE_else_ = 21;
	public static final String[] ruleNames = {
		"start", "deklaration", "init", "function_decl", "print_func", "arg", 
		"arglist", "args", "function_call", "ausdruecke", "lstatement", "statement", 
		"klammerstatement", "bstatement", "ausdruck", "for_loop", "for_cntrl", 
		"while_loop", "while_cntrl", "if_", "if_cntrl", "else_"
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); statement();
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
		enterRule(_localctx, 2, RULE_deklaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); ((DeklarationContext)_localctx).typ = match(TYP);
			setState(47); ((DeklarationContext)_localctx).name = match(NAME);
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
		enterRule(_localctx, 4, RULE_init);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case TYP:
				_localctx = new InitialisierungContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49); ((InitialisierungContext)_localctx).typ = match(TYP);
				setState(50); ((InitialisierungContext)_localctx).name = match(NAME);
				setState(51); match(23);
				setState(52); ((InitialisierungContext)_localctx).wert = ausdruck(0);
				}
				break;
			case NAME:
				_localctx = new ZuweisungContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53); ((ZuweisungContext)_localctx).name = match(NAME);
				setState(54); match(23);
				setState(55); ((ZuweisungContext)_localctx).wert = ausdruck(0);
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
		public Token typ;
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
		enterRule(_localctx, 6, RULE_function_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(4);
			setState(59); ((Function_declContext)_localctx).name = match(NAME);
			setState(60); match(24);
			setState(61); arglist();
			setState(62); match(11);
			setState(63); ((Function_declContext)_localctx).typ = match(TYP);
			setState(64); match(1);
			setState(65); statement();
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
		enterRule(_localctx, 8, RULE_print_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(25);
			setState(68); ((Print_funcContext)_localctx).wert = ausdruck(0);
			setState(69); match(16);
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
		enterRule(_localctx, 10, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); ((ArgContext)_localctx).typ = match(TYP);
			setState(72); ((ArgContext)_localctx).name = match(NAME);
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
		enterRule(_localctx, 12, RULE_arglist);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new EmptyArglistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(LKLAMMER);
				setState(75); match(RKLAMMER);
				}
				break;

			case 2:
				_localctx = new FullArglistContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(LKLAMMER);
				setState(77); args();
				setState(78); match(RKLAMMER);
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
		enterRule(_localctx, 14, RULE_args);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82); arg();
				}
				break;

			case 2:
				_localctx = new ArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83); ((ArgumentsContext)_localctx).left = arg();
				setState(84); match(SEMICOLON);
				setState(85); ((ArgumentsContext)_localctx).right = args();
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
		public Token name;
		public TerminalNode NAME() { return getToken(SauerkrautppParser.NAME, 0); }
		public TerminalNode RKLAMMER() { return getToken(SauerkrautppParser.RKLAMMER, 0); }
		public AusdrueckeContext ausdruecke() {
			return getRuleContext(AusdrueckeContext.class,0);
		}
		public TerminalNode LKLAMMER() { return getToken(SauerkrautppParser.LKLAMMER, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); ((Function_callContext)_localctx).name = match(NAME);
			setState(90); match(LKLAMMER);
			setState(91); ausdruecke();
			setState(92); match(RKLAMMER);
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
		public AusdruckContext expr;
		public AusdrueckeContext rest;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public AusdrueckeContext ausdruecke() {
			return getRuleContext(AusdrueckeContext.class,0);
		}
		public AusdrueckeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausdruecke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitAusdruecke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusdrueckeContext ausdruecke() throws RecognitionException {
		AusdrueckeContext _localctx = new AusdrueckeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ausdruecke);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); ausdruck(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); ((AusdrueckeContext)_localctx).expr = ausdruck(0);
				setState(96); match(SEMICOLON);
				setState(97); ((AusdrueckeContext)_localctx).rest = ausdruecke();
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
		enterRule(_localctx, 20, RULE_lstatement);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); ausdruck(0);
				setState(102); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); init();
				setState(105); match(17);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); deklaration();
				setState(108); match(17);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); print_func();
				setState(111); match(17);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113); function_call();
				setState(114); match(17);
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
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case 19:
			case 25:
			case ZAHL:
			case BOOL:
			case LKLAMMER:
			case TYP:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); lstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); klammerstatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); for_loop();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 4);
				{
				setState(121); while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 6);
				{
				setState(123); function_decl();
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
		enterRule(_localctx, 24, RULE_klammerstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(6);
			setState(127); ((KlammerstatementContext)_localctx).content = bstatement(0);
			setState(128); match(27);
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
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_bstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BstatementContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_bstatement);
					setState(133);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(134); bstatement(0);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_ausdruck);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			switch (_input.LA(1)) {
			case 19:
				{
				_localctx = new NichtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141); match(19);
				setState(142); ((NichtContext)_localctx).links = ausdruck(17);
				}
				break;
			case LKLAMMER:
				{
				_localctx = new KlammerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); match(LKLAMMER);
				setState(144); ((KlammerContext)_localctx).inKlammer = ausdruck(0);
				setState(145); match(RKLAMMER);
				}
				break;
			case ZAHL:
				{
				_localctx = new ZahlContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147); match(ZAHL);
				}
				break;
			case NAME:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); match(NAME);
				}
				break;
			case BOOL:
				{
				_localctx = new WahrheitswertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplikationContext(new AusdruckContext(_parentctx, _parentState, _p));
						((MultiplikationContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(152);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(153); match(18);
						setState(154); ((MultiplikationContext)_localctx).rechts = ausdruck(17);
						}
						break;

					case 2:
						{
						_localctx = new DivisionContext(new AusdruckContext(_parentctx, _parentState, _p));
						((DivisionContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(155);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(156); match(15);
						setState(157); ((DivisionContext)_localctx).rechts = ausdruck(16);
						}
						break;

					case 3:
						{
						_localctx = new MinusContext(new AusdruckContext(_parentctx, _parentState, _p));
						((MinusContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(158);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(159); match(8);
						setState(160); ((MinusContext)_localctx).rechts = ausdruck(15);
						}
						break;

					case 4:
						{
						_localctx = new PlusContext(new AusdruckContext(_parentctx, _parentState, _p));
						((PlusContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(161);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(162); match(5);
						setState(163); ((PlusContext)_localctx).rechts = ausdruck(14);
						}
						break;

					case 5:
						{
						_localctx = new OderContext(new AusdruckContext(_parentctx, _parentState, _p));
						((OderContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(164);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(165); match(3);
						setState(166); ((OderContext)_localctx).rechts = ausdruck(13);
						}
						break;

					case 6:
						{
						_localctx = new UndContext(new AusdruckContext(_parentctx, _parentState, _p));
						((UndContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(167);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(168); match(2);
						setState(169); ((UndContext)_localctx).rechts = ausdruck(12);
						}
						break;

					case 7:
						{
						_localctx = new GleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(170);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(171); match(12);
						setState(172); ((GleichContext)_localctx).rechts = ausdruck(11);
						}
						break;

					case 8:
						{
						_localctx = new KleinerContext(new AusdruckContext(_parentctx, _parentState, _p));
						((KleinerContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(173);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(174); match(21);
						setState(175); ((KleinerContext)_localctx).rechts = ausdruck(10);
						}
						break;

					case 9:
						{
						_localctx = new KleinergleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((KleinergleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(176);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(177); match(26);
						setState(178); ((KleinergleichContext)_localctx).rechts = ausdruck(9);
						}
						break;

					case 10:
						{
						_localctx = new GroesserContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GroesserContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(179);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(180); match(10);
						setState(181); ((GroesserContext)_localctx).rechts = ausdruck(8);
						}
						break;

					case 11:
						{
						_localctx = new GroessergleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((GroessergleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(182);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(183); match(7);
						setState(184); ((GroessergleichContext)_localctx).rechts = ausdruck(7);
						}
						break;

					case 12:
						{
						_localctx = new UngleichContext(new AusdruckContext(_parentctx, _parentState, _p));
						((UngleichContext)_localctx).links = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(185);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(186); match(13);
						setState(187); ((UngleichContext)_localctx).rechts = ausdruck(6);
						}
						break;
					}
					} 
				}
				setState(192);
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

	public static class For_loopContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_cntrlContext for_cntrl() {
			return getRuleContext(For_cntrlContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(20);
			setState(194); for_cntrl();
			setState(195); statement();
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

	public static class For_cntrlContext extends ParserRuleContext {
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
		public For_cntrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cntrl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SauerkrautppVisitor ) return ((SauerkrautppVisitor<? extends T>)visitor).visitFor_cntrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cntrlContext for_cntrl() throws RecognitionException {
		For_cntrlContext _localctx = new For_cntrlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(LKLAMMER);
			setState(198); init();
			setState(199); match(SEMICOLON);
			setState(200); ausdruck(0);
			setState(201); match(SEMICOLON);
			setState(202); init();
			setState(203); match(RKLAMMER);
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
		enterRule(_localctx, 34, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(22);
			setState(206); while_cntrl();
			setState(207); statement();
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
		enterRule(_localctx, 36, RULE_while_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(LKLAMMER);
			setState(210); ausdruck(0);
			setState(211); match(RKLAMMER);
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
		enterRule(_localctx, 38, RULE_if_);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new If_thenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(9);
				setState(214); if_cntrl();
				setState(215); ((If_thenContext)_localctx).then = statement();
				}
				break;

			case 2:
				_localctx = new If_then_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(9);
				setState(218); if_cntrl();
				setState(219); ((If_then_elseContext)_localctx).then_body = statement();
				setState(220); else_();
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
		enterRule(_localctx, 40, RULE_if_cntrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(LKLAMMER);
			setState(225); ((If_cntrlContext)_localctx).expr = ausdruck(0);
			setState(226); match(RKLAMMER);
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
		enterRule(_localctx, 42, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(14);
			setState(229); ((Else_Context)_localctx).else_body = statement();
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
		case 13: return bstatement_sempred((BstatementContext)_localctx, predIndex);

		case 14: return ausdruck_sempred((AusdruckContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ausdruck_sempred(AusdruckContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 16 >= _localctx._p;

		case 2: return 15 >= _localctx._p;

		case 3: return 14 >= _localctx._p;

		case 4: return 13 >= _localctx._p;

		case 5: return 12 >= _localctx._p;

		case 6: return 11 >= _localctx._p;

		case 7: return 10 >= _localctx._p;

		case 8: return 9 >= _localctx._p;

		case 9: return 8 >= _localctx._p;

		case 10: return 7 >= _localctx._p;

		case 11: return 6 >= _localctx._p;

		case 12: return 5 >= _localctx._p;
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
		"\2\3%\u00ea\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bS\n\b\3\t\3\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\5\13f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u008a\n\17\f\17\16\17"+
		"\u008d\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0099"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00bf\n\20\f\20\16"+
		"\20\u00c2\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00e1\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u00f2\2"+
		".\3\2\2\2\4\60\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2\16"+
		"R\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24e\3\2\2\2\26v\3\2\2\2\30~\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u0084\3\2\2\2\36\u0098\3\2\2\2 \u00c3\3\2\2\2\"\u00c7"+
		"\3\2\2\2$\u00cf\3\2\2\2&\u00d3\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,"+
		"\u00e6\3\2\2\2./\5\30\r\2/\3\3\2\2\2\60\61\7$\2\2\61\62\7%\2\2\62\5\3"+
		"\2\2\2\63\64\7$\2\2\64\65\7%\2\2\65\66\7\31\2\2\66;\5\36\20\2\678\7%\2"+
		"\289\7\31\2\29;\5\36\20\2:\63\3\2\2\2:\67\3\2\2\2;\7\3\2\2\2<=\7\6\2\2"+
		"=>\7%\2\2>?\7\32\2\2?@\5\16\b\2@A\7\r\2\2AB\7$\2\2BC\7\3\2\2CD\5\30\r"+
		"\2D\t\3\2\2\2EF\7\33\2\2FG\5\36\20\2GH\7\22\2\2H\13\3\2\2\2IJ\7$\2\2J"+
		"K\7%\2\2K\r\3\2\2\2LM\7!\2\2MS\7\"\2\2NO\7!\2\2OP\5\20\t\2PQ\7\"\2\2Q"+
		"S\3\2\2\2RL\3\2\2\2RN\3\2\2\2S\17\3\2\2\2TZ\5\f\7\2UV\5\f\7\2VW\7#\2\2"+
		"WX\5\20\t\2XZ\3\2\2\2YT\3\2\2\2YU\3\2\2\2Z\21\3\2\2\2[\\\7%\2\2\\]\7!"+
		"\2\2]^\5\24\13\2^_\7\"\2\2_\23\3\2\2\2`f\5\36\20\2ab\5\36\20\2bc\7#\2"+
		"\2cd\5\24\13\2df\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\25\3\2\2\2gh\5\36\20\2h"+
		"i\7\23\2\2iw\3\2\2\2jk\5\6\4\2kl\7\23\2\2lw\3\2\2\2mn\5\4\3\2no\7\23\2"+
		"\2ow\3\2\2\2pq\5\n\6\2qr\7\23\2\2rw\3\2\2\2st\5\22\n\2tu\7\23\2\2uw\3"+
		"\2\2\2vg\3\2\2\2vj\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\27\3\2\2\2x"+
		"\177\5\26\f\2y\177\5\32\16\2z\177\5 \21\2{\177\5$\23\2|\177\5(\25\2}\177"+
		"\5\b\5\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\31\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7\35"+
		"\2\2\u0083\33\3\2\2\2\u0084\u0085\b\17\1\2\u0085\u0086\5\30\r\2\u0086"+
		"\u008b\3\2\2\2\u0087\u0088\6\17\2\3\u0088\u008a\5\34\17\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\35\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\20\1\2\u008f\u0090\7\25"+
		"\2\2\u0090\u0099\5\36\20\2\u0091\u0092\7!\2\2\u0092\u0093\5\36\20\2\u0093"+
		"\u0094\7\"\2\2\u0094\u0099\3\2\2\2\u0095\u0099\7\36\2\2\u0096\u0099\7"+
		"%\2\2\u0097\u0099\7\37\2\2\u0098\u008e\3\2\2\2\u0098\u0091\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u00c0\3\2"+
		"\2\2\u009a\u009b\6\20\3\3\u009b\u009c\7\24\2\2\u009c\u00bf\5\36\20\2\u009d"+
		"\u009e\6\20\4\3\u009e\u009f\7\21\2\2\u009f\u00bf\5\36\20\2\u00a0\u00a1"+
		"\6\20\5\3\u00a1\u00a2\7\n\2\2\u00a2\u00bf\5\36\20\2\u00a3\u00a4\6\20\6"+
		"\3\u00a4\u00a5\7\7\2\2\u00a5\u00bf\5\36\20\2\u00a6\u00a7\6\20\7\3\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00bf\5\36\20\2\u00a9\u00aa\6\20\b\3\u00aa\u00ab"+
		"\7\4\2\2\u00ab\u00bf\5\36\20\2\u00ac\u00ad\6\20\t\3\u00ad\u00ae\7\16\2"+
		"\2\u00ae\u00bf\5\36\20\2\u00af\u00b0\6\20\n\3\u00b0\u00b1\7\27\2\2\u00b1"+
		"\u00bf\5\36\20\2\u00b2\u00b3\6\20\13\3\u00b3\u00b4\7\34\2\2\u00b4\u00bf"+
		"\5\36\20\2\u00b5\u00b6\6\20\f\3\u00b6\u00b7\7\f\2\2\u00b7\u00bf\5\36\20"+
		"\2\u00b8\u00b9\6\20\r\3\u00b9\u00ba\7\t\2\2\u00ba\u00bf\5\36\20\2\u00bb"+
		"\u00bc\6\20\16\3\u00bc\u00bd\7\17\2\2\u00bd\u00bf\5\36\20\2\u00be\u009a"+
		"\3\2\2\2\u00be\u009d\3\2\2\2\u00be\u00a0\3\2\2\2\u00be\u00a3\3\2\2\2\u00be"+
		"\u00a6\3\2\2\2\u00be\u00a9\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00af\3\2"+
		"\2\2\u00be\u00b2\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\37\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5"+
		"\5\"\22\2\u00c5\u00c6\5\30\r\2\u00c6!\3\2\2\2\u00c7\u00c8\7!\2\2\u00c8"+
		"\u00c9\5\6\4\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7"+
		"#\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\"\2\2\u00ce#\3\2\2\2\u00cf\u00d0"+
		"\7\30\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\5\30\r\2\u00d2%\3\2\2\2\u00d3"+
		"\u00d4\7!\2\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\7\"\2\2\u00d6\'\3\2\2"+
		"\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5*\26\2\u00d9\u00da\5\30\r\2\u00da"+
		"\u00e1\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\5"+
		"\30\r\2\u00de\u00df\5,\27\2\u00df\u00e1\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\5\36\20\2"+
		"\u00e4\u00e5\7\"\2\2\u00e5+\3\2\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00e8\5"+
		"\30\r\2\u00e8-\3\2\2\2\r:RYev~\u008b\u0098\u00be\u00c0\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}