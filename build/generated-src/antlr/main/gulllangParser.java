// Generated from gulllang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gulllangParser extends Parser {
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
	public static final int
		RULE_expression = 0, RULE_state = 1, RULE_call = 2, RULE_fun = 3, RULE_ret = 4, 
		RULE_args = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "state", "call", "fun", "ret", "args"
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

	@Override
	public String getGrammarFileName() { return "gulllang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gulllangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(gulllangParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(gulllangParser.CLOSE, 0); }
		public TerminalNode OB() { return getToken(gulllangParser.OB, 0); }
		public TerminalNode CB() { return getToken(gulllangParser.CB, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(OPEN);
				setState(13);
				expression();
				setState(14);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(OB);
				setState(17);
				expression();
				setState(18);
				match(CB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(OB);
				setState(21);
				state();
				setState(22);
				match(CB);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(gulllangParser.OPEN, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(gulllangParser.CLOSE, 0); }
		public TerminalNode OB() { return getToken(gulllangParser.OB, 0); }
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode CB() { return getToken(gulllangParser.CB, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(gulllangParser.VALUE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(OPEN);
				setState(27);
				state();
				setState(28);
				match(CLOSE);
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(OB);
				setState(31);
				state();
				setState(32);
				ret();
				setState(33);
				match(CB);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				call();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(VALUE);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gulllangParser.IDENTIFIER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(IDENTIFIER);
			setState(40);
			args();
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

	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(gulllangParser.FUN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(gulllangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gulllangParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(gulllangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gulllangParser.COLON, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitFun(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(FUN);
				setState(43);
				match(IDENTIFIER);
				setState(44);
				match(ASSIGN);
				setState(45);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(FUN);
				setState(47);
				match(IDENTIFIER);
				setState(48);
				match(ASSIGN);
				setState(49);
				state();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(FUN);
				setState(51);
				match(IDENTIFIER);
				setState(52);
				match(COLON);
				setState(53);
				match(IDENTIFIER);
				setState(54);
				match(ASSIGN);
				setState(55);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(FUN);
				setState(57);
				match(IDENTIFIER);
				setState(58);
				match(COLON);
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(ASSIGN);
				setState(61);
				state();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(FUN);
				setState(63);
				match(IDENTIFIER);
				setState(64);
				args();
				setState(65);
				match(ASSIGN);
				setState(66);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(FUN);
				setState(69);
				match(IDENTIFIER);
				setState(70);
				args();
				setState(71);
				match(ASSIGN);
				setState(72);
				state();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				match(FUN);
				setState(75);
				match(IDENTIFIER);
				setState(76);
				args();
				setState(77);
				match(COLON);
				setState(78);
				match(IDENTIFIER);
				setState(79);
				match(ASSIGN);
				setState(80);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				match(FUN);
				setState(83);
				match(IDENTIFIER);
				setState(84);
				args();
				setState(85);
				match(COLON);
				setState(86);
				match(IDENTIFIER);
				setState(87);
				match(ASSIGN);
				setState(88);
				state();
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gulllangParser.RETURN, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ret);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(RETURN);
				setState(94);
				state();
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
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public TerminalNode OPEN() { return getToken(gulllangParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(gulllangParser.CLOSE, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gulllangListener ) ((gulllangListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			int _alt;
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(97);
				state();
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						state();
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(OPEN);
				{
				setState(105);
				state();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUE) | (1L << OPEN) | (1L << OB) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(106);
					state();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(112);
				match(CLOSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-w\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"(\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5]\n\5\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7"+
		"\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7\5\7u\n\7\3\7\2\2\b\2\4\6\b\n\f\2"+
		"\2\2\u0080\2\32\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\\\3\2\2\2\na\3\2\2\2"+
		"\ft\3\2\2\2\16\17\7\34\2\2\17\20\5\2\2\2\20\21\7\35\2\2\21\33\3\2\2\2"+
		"\22\23\7\"\2\2\23\24\5\2\2\2\24\25\7#\2\2\25\33\3\2\2\2\26\27\7\"\2\2"+
		"\27\30\5\4\3\2\30\31\7#\2\2\31\33\3\2\2\2\32\16\3\2\2\2\32\22\3\2\2\2"+
		"\32\26\3\2\2\2\33\3\3\2\2\2\34\35\7\34\2\2\35\36\5\4\3\2\36\37\7\35\2"+
		"\2\37(\3\2\2\2 !\7\"\2\2!\"\5\4\3\2\"#\5\n\6\2#$\7#\2\2$(\3\2\2\2%(\5"+
		"\6\4\2&(\7\3\2\2\'\34\3\2\2\2\' \3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2"+
		"\2\2)*\7$\2\2*+\5\f\7\2+\7\3\2\2\2,-\7\4\2\2-.\7$\2\2./\7\6\2\2/]\5\2"+
		"\2\2\60\61\7\4\2\2\61\62\7$\2\2\62\63\7\6\2\2\63]\5\4\3\2\64\65\7\4\2"+
		"\2\65\66\7$\2\2\66\67\7\33\2\2\678\7$\2\289\7\6\2\29]\5\2\2\2:;\7\4\2"+
		"\2;<\7$\2\2<=\7\33\2\2=>\7$\2\2>?\7\6\2\2?]\5\4\3\2@A\7\4\2\2AB\7$\2\2"+
		"BC\5\f\7\2CD\7\6\2\2DE\5\2\2\2E]\3\2\2\2FG\7\4\2\2GH\7$\2\2HI\5\f\7\2"+
		"IJ\7\6\2\2JK\5\4\3\2K]\3\2\2\2LM\7\4\2\2MN\7$\2\2NO\5\f\7\2OP\7\33\2\2"+
		"PQ\7$\2\2QR\7\6\2\2RS\5\2\2\2S]\3\2\2\2TU\7\4\2\2UV\7$\2\2VW\5\f\7\2W"+
		"X\7\33\2\2XY\7$\2\2YZ\7\6\2\2Z[\5\4\3\2[]\3\2\2\2\\,\3\2\2\2\\\60\3\2"+
		"\2\2\\\64\3\2\2\2\\:\3\2\2\2\\@\3\2\2\2\\F\3\2\2\2\\L\3\2\2\2\\T\3\2\2"+
		"\2]\t\3\2\2\2^b\7\5\2\2_`\7\5\2\2`b\5\4\3\2a^\3\2\2\2a_\3\2\2\2b\13\3"+
		"\2\2\2cg\5\4\3\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hu\3"+
		"\2\2\2ig\3\2\2\2jk\7\34\2\2ko\5\4\3\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om"+
		"\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\35\2\2su\3\2\2\2tc\3\2\2\2"+
		"tj\3\2\2\2u\r\3\2\2\2\t\32\'\\agot";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}