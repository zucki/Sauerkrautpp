package src;

// Generated from C:\Users\smgug_000\Documents\GitHub\Sauerkrautpp\Sauerkrautpp\src\Sauerkrautpp.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauerkrautppLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, ZAHL=28, BOOL=29, WHITE=30, LKLAMMER=31, RKLAMMER=32, 
		SEMICOLON=33, TYP=34, NAME=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'zurueck'", "'und'", "'oder'", "'funktion'", "'plus'", "'?'", "'groessergleich'", 
		"'minus'", "'wenn'", "'groesser'", "'gibt'", "'gleich'", "'ungleich'", 
		"'ansonsten'", "'geteiltdurch'", "'aus'", "'.'", "'mal'", "'nicht'", "'fuer'", 
		"'kleiner'", "'solange'", "'ist'", "'nimmt'", "'gib'", "'kleinergleich'", 
		"'!'", "ZAHL", "BOOL", "WHITE", "'<'", "'>'", "'/'", "TYP", "NAME"
	};
	public static final String[] ruleNames = {
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ZAHL", "BOOL", "WHITE", "LKLAMMER", "RKLAMMER", "SEMICOLON", 
		"TYP", "NAME"
	};


	public SauerkrautppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sauerkrautpp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29: WHITE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u0132\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\6\35\u00fe\n\35\r\35\16\35\u00ff"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u010c\n\36\3\37"+
		"\6\37\u010f\n\37\r\37\16\37\u0110\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u012c\n#\3$\6$\u012f"+
		"\n$\r$\16$\u0130\2%\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1"+
		"\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24"+
		"\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36"+
		"\1;\37\1= \2?!\1A\"\1C#\1E$\1G%\1\3\2\5\3\62;\5\13\f\17\17\"\"\5C\\aa"+
		"c|\u0136\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\3I\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\tZ\3\2\2\2\13c\3\2\2\2\r"+
		"h\3\2\2\2\17j\3\2\2\2\21y\3\2\2\2\23\177\3\2\2\2\25\u0084\3\2\2\2\27\u008d"+
		"\3\2\2\2\31\u0092\3\2\2\2\33\u0099\3\2\2\2\35\u00a2\3\2\2\2\37\u00ac\3"+
		"\2\2\2!\u00b9\3\2\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c3\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00ce\3\2\2\2-\u00d6\3\2\2\2/\u00de\3\2\2\2\61\u00e2\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00ec\3\2\2\2\67\u00fa\3\2\2\29\u00fd\3\2\2\2;\u010b"+
		"\3\2\2\2=\u010e\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E"+
		"\u012b\3\2\2\2G\u012e\3\2\2\2IJ\7|\2\2JK\7w\2\2KL\7t\2\2LM\7w\2\2MN\7"+
		"g\2\2NO\7e\2\2OP\7m\2\2P\4\3\2\2\2QR\7w\2\2RS\7p\2\2ST\7f\2\2T\6\3\2\2"+
		"\2UV\7q\2\2VW\7f\2\2WX\7g\2\2XY\7t\2\2Y\b\3\2\2\2Z[\7h\2\2[\\\7w\2\2\\"+
		"]\7p\2\2]^\7m\2\2^_\7v\2\2_`\7k\2\2`a\7q\2\2ab\7p\2\2b\n\3\2\2\2cd\7r"+
		"\2\2de\7n\2\2ef\7w\2\2fg\7u\2\2g\f\3\2\2\2hi\7A\2\2i\16\3\2\2\2jk\7i\2"+
		"\2kl\7t\2\2lm\7q\2\2mn\7g\2\2no\7u\2\2op\7u\2\2pq\7g\2\2qr\7t\2\2rs\7"+
		"i\2\2st\7n\2\2tu\7g\2\2uv\7k\2\2vw\7e\2\2wx\7j\2\2x\20\3\2\2\2yz\7o\2"+
		"\2z{\7k\2\2{|\7p\2\2|}\7w\2\2}~\7u\2\2~\22\3\2\2\2\177\u0080\7y\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7p\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7i\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7g\2\2"+
		"\u0088\u0089\7u\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7t\2\2\u008c\26\3\2\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7d\2\2\u0090\u0091\7v\2\2\u0091\30\3\2\2\2\u0092\u0093\7i\2\2\u0093\u0094"+
		"\7n\2\2\u0094\u0095\7g\2\2\u0095\u0096\7k\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7j\2\2\u0098\32\3\2\2\2\u0099\u009a\7w\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7i\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7"+
		"c\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\u00b3\7v\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7j\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7u\2\2\u00bc\"\3\2\2\2\u00bd\u00be"+
		"\7\60\2\2\u00be$\3\2\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7n\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7e\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7v\2\2\u00c8(\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"*\3\2\2\2\u00ce\u00cf\7m\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5,\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7n\2"+
		"\2\u00d9\u00da\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd.\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7o\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7v\2\2\u00e7\62\3\2\2\2\u00e8\u00e9"+
		"\7i\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7d\2\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7m\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7p\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7i\2\2"+
		"\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7e\2\2\u00f8\u00f9\7j\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb8"+
		"\3\2\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100:\3\2\2\2\u0101\u0102\7y\2\2\u0102"+
		"\u0103\7c\2\2\u0103\u0104\7j\2\2\u0104\u010c\7t\2\2\u0105\u0106\7h\2\2"+
		"\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109\u010a"+
		"\7e\2\2\u010a\u010c\7j\2\2\u010b\u0101\3\2\2\2\u010b\u0105\3\2\2\2\u010c"+
		"<\3\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\b\37\2\2\u0113>\3\2\2\2\u0114\u0115\7>\2\2\u0115@\3\2\2\2\u0116\u0117"+
		"\7@\2\2\u0117B\3\2\2\2\u0118\u0119\7\61\2\2\u0119D\3\2\2\2\u011a\u011b"+
		"\7|\2\2\u011b\u011c\7c\2\2\u011c\u011d\7j\2\2\u011d\u012c\7n\2\2\u011e"+
		"\u011f\7y\2\2\u011f\u0120\7c\2\2\u0120\u0121\7j\2\2\u0121\u0122\7t\2\2"+
		"\u0122\u0123\7j\2\2\u0123\u0124\7g\2\2\u0124\u0125\7k\2\2\u0125\u0126"+
		"\7v\2\2\u0126\u0127\7u\2\2\u0127\u0128\7y\2\2\u0128\u0129\7g\2\2\u0129"+
		"\u012a\7t\2\2\u012a\u012c\7v\2\2\u012b\u011a\3\2\2\2\u012b\u011e\3\2\2"+
		"\2\u012cF\3\2\2\2\u012d\u012f\t\4\2\2\u012e\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131H\3\2\2\2\b\2\u00ff"+
		"\u010b\u0110\u012b\u0130";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}