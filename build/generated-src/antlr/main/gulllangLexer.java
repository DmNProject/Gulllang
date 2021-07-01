// Generated from gulllang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gulllangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALUE=1, FUN=2, RETURN=3, ASSIGN=4, PLUS=5, MINUS=6, MUL=7, DIV=8, NOT=9, 
		AND=10, OR=11, EQ=12, NE=13, DIFFERENT=14, LESS_SIGN=15, LESS_EQUALS_SIGN=16, 
		GREATER_SIGN=17, GREATER_EQUALS_SIGN=18, PP=19, NSD=20, REF=21, ANNOTATION=22, 
		ACCESS=23, COMPANION_ACCESS=24, COLON=25, OPEN=26, CLOSE=27, SEMI=28, 
		COMMA=29, OSB=30, CSB=31, OB=32, CB=33, IDENTIFIER=34, NULL=35, BOOL=36, 
		INT=37, DOUBLE=38, STRING=39, COMMENT0=40, COMMENT1=41, SPACE=42, OTHER=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VALUE", "FUN", "RETURN", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "NOT", 
			"AND", "OR", "EQ", "NE", "DIFFERENT", "LESS_SIGN", "LESS_EQUALS_SIGN", 
			"GREATER_SIGN", "GREATER_EQUALS_SIGN", "PP", "NSD", "REF", "ANNOTATION", 
			"ACCESS", "COMPANION_ACCESS", "COLON", "OPEN", "CLOSE", "SEMI", "COMMA", 
			"OSB", "CSB", "OB", "CB", "IDENTIFIER", "NULL", "BOOL", "INT", "DOUBLE", 
			"STRING", "COMMENT0", "COMMENT1", "SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'return'", "'='", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'&&'", "'||'", "'=='", "'!='", "'<>'", "'<'", "'<='", "'>'", "'>='", 
			"'#'", "'\\'", "'->'", "'@'", "'.'", "'::'", "':'", "'('", "')'", "';'", 
			"','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VALUE", "FUN", "RETURN", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", 
			"NOT", "AND", "OR", "EQ", "NE", "DIFFERENT", "LESS_SIGN", "LESS_EQUALS_SIGN", 
			"GREATER_SIGN", "GREATER_EQUALS_SIGN", "PP", "NSD", "REF", "ANNOTATION", 
			"ACCESS", "COMPANION_ACCESS", "COLON", "OPEN", "CLOSE", "SEMI", "COMMA", 
			"OSB", "CSB", "OB", "CB", "IDENTIFIER", "NULL", "BOOL", "INT", "DOUBLE", 
			"STRING", "COMMENT0", "COMMENT1", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gulllangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gulllang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\5!\u00be\n!\3\"\3\"\3\"\3\"\5\"\u00c4\n\"\3"+
		"#\3#\7#\u00c8\n#\f#\16#\u00cb\13#\3$\3$\3$\3$\3$\3$\3$\5$\u00d4\n$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00df\n%\3&\6&\u00e2\n&\r&\16&\u00e3\3\'\6"+
		"\'\u00e7\n\'\r\'\16\'\u00e8\3\'\3\'\7\'\u00ed\n\'\f\'\16\'\u00f0\13\'"+
		"\3\'\3\'\6\'\u00f4\n\'\r\'\16\'\u00f5\5\'\u00f8\n\'\3(\3(\3(\3(\7(\u00fe"+
		"\n(\f(\16(\u0101\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u0112"+
		"\n*\f*\16*\u0115\13*\3*\3*\3*\3+\3+\3+\3+\3,\3,\2\2-\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4"+
		"\2\13\f\17\17\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3_\3\2\2\2\5l\3\2\2\2\7n\3"+
		"\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177"+
		"\3\2\2\2\25\u0081\3\2\2\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2\33\u008a\3"+
		"\2\2\2\35\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0095\3\2\2\2"+
		"%\u0097\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2-\u00a1\3"+
		"\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2\2"+
		"\2\67\u00ac\3\2\2\29\u00ae\3\2\2\2;\u00b0\3\2\2\2=\u00b2\3\2\2\2?\u00b4"+
		"\3\2\2\2A\u00bd\3\2\2\2C\u00c3\3\2\2\2E\u00c5\3\2\2\2G\u00d3\3\2\2\2I"+
		"\u00de\3\2\2\2K\u00e1\3\2\2\2M\u00f7\3\2\2\2O\u00f9\3\2\2\2Q\u0104\3\2"+
		"\2\2S\u010b\3\2\2\2U\u0119\3\2\2\2W\u011d\3\2\2\2Y`\5E#\2Z`\5G$\2[`\5"+
		"I%\2\\`\5K&\2]`\5M\'\2^`\5O(\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2"+
		"\2_]\3\2\2\2_^\3\2\2\2`\4\3\2\2\2ab\7h\2\2bc\7w\2\2cm\7p\2\2de\7h\2\2"+
		"ef\7w\2\2fg\7p\2\2gh\7e\2\2hi\7v\2\2ij\7k\2\2jk\7q\2\2km\7p\2\2la\3\2"+
		"\2\2ld\3\2\2\2m\6\3\2\2\2no\7t\2\2op\7g\2\2pq\7v\2\2qr\7w\2\2rs\7t\2\2"+
		"st\7p\2\2t\b\3\2\2\2uv\7?\2\2v\n\3\2\2\2wx\7-\2\2x\f\3\2\2\2yz\7/\2\2"+
		"z\16\3\2\2\2{|\7,\2\2|\20\3\2\2\2}~\7\61\2\2~\22\3\2\2\2\177\u0080\7#"+
		"\2\2\u0080\24\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7(\2\2\u0083\26\3"+
		"\2\2\2\u0084\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086\30\3\2\2\2\u0087\u0088"+
		"\7?\2\2\u0088\u0089\7?\2\2\u0089\32\3\2\2\2\u008a\u008b\7#\2\2\u008b\u008c"+
		"\7?\2\2\u008c\34\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7@\2\2\u008f\36"+
		"\3\2\2\2\u0090\u0091\7>\2\2\u0091 \3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094"+
		"\7?\2\2\u0094\"\3\2\2\2\u0095\u0096\7@\2\2\u0096$\3\2\2\2\u0097\u0098"+
		"\7@\2\2\u0098\u0099\7?\2\2\u0099&\3\2\2\2\u009a\u009b\7%\2\2\u009b(\3"+
		"\2\2\2\u009c\u009d\7^\2\2\u009d*\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a0"+
		"\7@\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7B\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7"+
		"\60\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\7<\2\2\u00a7\62"+
		"\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\66\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad8\3\2\2\2\u00ae\u00af\7=\2\2\u00af"+
		":\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3>"+
		"\3\2\2\2\u00b4\u00b5\7_\2\2\u00b5@\3\2\2\2\u00b6\u00be\7}\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2\2\u00ba\u00be\7p\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00be\7q\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b7\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00beB\3\2\2\2\u00bf\u00c4\7\177\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c4\7f\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4D\3\2\2\2\u00c5\u00c9\t\2\2\2\u00c6\u00c8\t\3\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00caF\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7w\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d4\7n\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d4\7n\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00d0\3\2\2"+
		"\2\u00d4H\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7"+
		"w\2\2\u00d8\u00df\7g\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00df\7g\2\2\u00de\u00d5\3\2\2\2\u00de"+
		"\u00d9\3\2\2\2\u00dfJ\3\2\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4L\3"+
		"\2\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\7\60"+
		"\2\2\u00eb\u00ed\t\4\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f3\7\60\2\2\u00f2\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8N\3\2\2\2\u00f9\u00ff"+
		"\7$\2\2\u00fa\u00fe\n\5\2\2\u00fb\u00fc\7^\2\2\u00fc\u00fe\7$\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7$\2\2\u0103P\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7\61\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\n\6\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\b)\2\2\u010aR\3\2\2\2\u010b\u010c\7\61\2\2\u010c\u010d\7,\2\2\u010d\u0113"+
		"\3\2\2\2\u010e\u0112\n\5\2\2\u010f\u0110\7^\2\2\u0110\u0112\7$\2\2\u0111"+
		"\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7,\2\2\u0117\u0118\7\61\2\2\u0118T\3\2\2\2\u0119\u011a\t\6\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u011c\b+\2\2\u011cV\3\2\2\2\u011d\u011e\13"+
		"\2\2\2\u011eX\3\2\2\2\23\2_l\u00bd\u00c3\u00c9\u00d3\u00de\u00e3\u00e8"+
		"\u00ee\u00f5\u00f7\u00fd\u00ff\u0111\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}