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
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, ZAHL=29, BOOL=30, WHITE=31, LKLAMMER=32, 
		RKLAMMER=33, SEMICOLON=34, TYP=35, NAME=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'zurueck'", "'und'", "'oder'", "'funktion'", "'plus'", "'?'", "'groessergleich'", 
		"'ansonsten wenn'", "'minus'", "'wenn'", "'groesser'", "'gibt'", "'gleich'", 
		"'ungleich'", "'ansonsten'", "'geteiltdurch'", "'aus'", "'.'", "'nicht'", 
		"'mal'", "'fuer'", "'kleiner'", "'solange'", "'ist'", "'nimmt'", "'gib'", 
		"'kleinergleich'", "'!'", "ZAHL", "BOOL", "WHITE", "'<'", "'>'", "'/'", 
		"TYP", "NAME"
	};
	public static final String[] ruleNames = {
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ZAHL", "BOOL", "WHITE", "LKLAMMER", "RKLAMMER", 
		"SEMICOLON", "TYP", "NAME"
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
		case 30: WHITE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4&\u0143\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\6\36\u010f\n\36\r\36\16\36\u0110\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u011d\n\37\3 \6"+
		" \u0120\n \r \16 \u0121\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u013d\n$\3%\6%\u0140\n%\r%\16%\u0141"+
		"\2&\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\2"+
		"A\"\1C#\1E$\1G%\1I&\1\3\2\5\3\62;\5\13\f\17\17\"\"\5C\\aac|\u0147\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\t\\\3\2\2\2\13e\3\2\2\2\rj"+
		"\3\2\2\2\17l\3\2\2\2\21{\3\2\2\2\23\u008a\3\2\2\2\25\u0090\3\2\2\2\27"+
		"\u0095\3\2\2\2\31\u009e\3\2\2\2\33\u00a3\3\2\2\2\35\u00aa\3\2\2\2\37\u00b3"+
		"\3\2\2\2!\u00bd\3\2\2\2#\u00ca\3\2\2\2%\u00ce\3\2\2\2\'\u00d0\3\2\2\2"+
		")\u00d6\3\2\2\2+\u00da\3\2\2\2-\u00df\3\2\2\2/\u00e7\3\2\2\2\61\u00ef"+
		"\3\2\2\2\63\u00f3\3\2\2\2\65\u00f9\3\2\2\2\67\u00fd\3\2\2\29\u010b\3\2"+
		"\2\2;\u010e\3\2\2\2=\u011c\3\2\2\2?\u011f\3\2\2\2A\u0125\3\2\2\2C\u0127"+
		"\3\2\2\2E\u0129\3\2\2\2G\u013c\3\2\2\2I\u013f\3\2\2\2KL\7|\2\2LM\7w\2"+
		"\2MN\7t\2\2NO\7w\2\2OP\7g\2\2PQ\7e\2\2QR\7m\2\2R\4\3\2\2\2ST\7w\2\2TU"+
		"\7p\2\2UV\7f\2\2V\6\3\2\2\2WX\7q\2\2XY\7f\2\2YZ\7g\2\2Z[\7t\2\2[\b\3\2"+
		"\2\2\\]\7h\2\2]^\7w\2\2^_\7p\2\2_`\7m\2\2`a\7v\2\2ab\7k\2\2bc\7q\2\2c"+
		"d\7p\2\2d\n\3\2\2\2ef\7r\2\2fg\7n\2\2gh\7w\2\2hi\7u\2\2i\f\3\2\2\2jk\7"+
		"A\2\2k\16\3\2\2\2lm\7i\2\2mn\7t\2\2no\7q\2\2op\7g\2\2pq\7u\2\2qr\7u\2"+
		"\2rs\7g\2\2st\7t\2\2tu\7i\2\2uv\7n\2\2vw\7g\2\2wx\7k\2\2xy\7e\2\2yz\7"+
		"j\2\2z\20\3\2\2\2{|\7c\2\2|}\7p\2\2}~\7u\2\2~\177\7q\2\2\177\u0080\7p"+
		"\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7\"\2\2\u0085\u0086\7y\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7p\2\2\u0089\22\3\2\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7w\2\2\u008e\u008f\7u\2\2"+
		"\u008f\24\3\2\2\2\u0090\u0091\7y\2\2\u0091\u0092\7g\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7p\2\2\u0094\26\3\2\2\2\u0095\u0096\7i\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7g\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2\u009d\30\3\2\2\2\u009e"+
		"\u009f\7i\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\32\3\2\2\2\u00a3\u00a4\7i\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7"+
		"g\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\34"+
		"\3\2\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7i\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7e\2\2"+
		"\u00b1\u00b2\7j\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7"+
		"p\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		" \3\2\2\2\u00bd\u00be\7i\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\u00c5\7f\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8"+
		"\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7w\2\2\u00cc\u00cd\7u\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf&"+
		"\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7j\2\2\u00d4\u00d5\7v\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7o\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9*\3\2\2\2\u00da\u00db\7h\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de,\3\2\2\2\u00df"+
		"\u00e0\7m\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7k\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6.\3\2\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7i\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\60\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\62\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7o\2\2\u00f6"+
		"\u00f7\7o\2\2\u00f7\u00f8\7v\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa"+
		"\u00fb\7k\2\2\u00fb\u00fc\7d\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7m\2\2\u00fe"+
		"\u00ff\7n\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2"+
		"\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104\u0105\7i\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7g\2\2\u0107\u0108\7k\2\2\u0108\u0109\7e\2\2\u0109"+
		"\u010a\7j\2\2\u010a8\3\2\2\2\u010b\u010c\7#\2\2\u010c:\3\2\2\2\u010d\u010f"+
		"\t\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111<\3\2\2\2\u0112\u0113\7y\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7j\2\2\u0115\u011d\7t\2\2\u0116\u0117\7h\2\2\u0117\u0118\7c\2\2"+
		"\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7e\2\2\u011b\u011d"+
		"\7j\2\2\u011c\u0112\3\2\2\2\u011c\u0116\3\2\2\2\u011d>\3\2\2\2\u011e\u0120"+
		"\t\3\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b \2\2\u0124@\3\2\2\2\u0125"+
		"\u0126\7>\2\2\u0126B\3\2\2\2\u0127\u0128\7@\2\2\u0128D\3\2\2\2\u0129\u012a"+
		"\7\61\2\2\u012aF\3\2\2\2\u012b\u012c\7|\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7j\2\2\u012e\u013d\7n\2\2\u012f\u0130\7y\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7j\2\2\u0132\u0133\7t\2\2\u0133\u0134\7j\2\2\u0134\u0135\7g\2\2"+
		"\u0135\u0136\7k\2\2\u0136\u0137\7v\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7y\2\2\u0139\u013a\7g\2\2\u013a\u013b\7t\2\2\u013b\u013d\7v\2\2\u013c"+
		"\u012b\3\2\2\2\u013c\u012f\3\2\2\2\u013dH\3\2\2\2\u013e\u0140\t\4\2\2"+
		"\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142J\3\2\2\2\b\2\u0110\u011c\u0121\u013c\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}