// Generated from guitartab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class guitartabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BA=3, BB=4, BC=5, BD=6, BE=7, BF=8, BG=9, LA=10, LB=11, 
		LC=12, LD=13, LE=14, LF=15, LG=16, FINGER=17, BARLNE=18, FRET=19, INTLITERAL=20, 
		WS=21;
	public static final int
		RULE_song = 0, RULE_bpm = 1, RULE_tab = 2, RULE_num_strums = 3, RULE_string = 4, 
		RULE_position = 5, RULE_finger = 6, RULE_note = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"song", "bpm", "tab", "num_strums", "string", "position", "finger", "note"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'BPM:'", "'Strums:'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", 
			"'G'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", null, "'-'", 
			"'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BA", "BB", "BC", "BD", "BE", "BF", "BG", "LA", "LB", 
			"LC", "LD", "LE", "LF", "LG", "FINGER", "BARLNE", "FRET", "INTLITERAL", 
			"WS"
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
	public String getGrammarFileName() { return "guitartab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public guitartabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SongContext extends ParserRuleContext {
		public BpmContext bpm() {
			return getRuleContext(BpmContext.class,0);
		}
		public TerminalNode EOF() { return getToken(guitartabParser.EOF, 0); }
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public SongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_song; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterSong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitSong(this);
		}
	}

	public final SongContext song() throws RecognitionException {
		SongContext _localctx = new SongContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_song);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			bpm();
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				tab();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BA) | (1L << BB) | (1L << BC) | (1L << BD) | (1L << BE) | (1L << BF) | (1L << BG) | (1L << LA) | (1L << LB) | (1L << LC) | (1L << LD) | (1L << LE) | (1L << LF) | (1L << LG))) != 0) );
			setState(23);
			match(EOF);
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

	public static class BpmContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(guitartabParser.INTLITERAL, 0); }
		public BpmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterBpm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitBpm(this);
		}
	}

	public final BpmContext bpm() throws RecognitionException {
		BpmContext _localctx = new BpmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bpm);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(INTLITERAL);
				}
				break;
			case T__1:
			case BA:
			case BB:
			case BC:
			case BD:
			case BE:
			case BF:
			case BG:
			case LA:
			case LB:
			case LC:
			case LD:
			case LE:
			case LF:
			case LG:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TabContext extends ParserRuleContext {
		public Num_strumsContext num_strums() {
			return getRuleContext(Num_strumsContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tab);
		try {
			int _alt;
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__1);
				setState(30);
				num_strums();
				setState(32); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(31);
						string();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(34); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BA:
			case BB:
			case BC:
			case BD:
			case BE:
			case BF:
			case BG:
			case LA:
			case LB:
			case LC:
			case LD:
			case LE:
			case LF:
			case LG:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(36);
						string();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(39); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Num_strumsContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(guitartabParser.INTLITERAL, 0); }
		public Num_strumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_strums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterNum_strums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitNum_strums(this);
		}
	}

	public final Num_strumsContext num_strums() throws RecognitionException {
		Num_strumsContext _localctx = new Num_strumsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num_strums);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(INTLITERAL);
				}
				break;
			case BA:
			case BB:
			case BC:
			case BD:
			case BE:
			case BF:
			case BG:
			case LA:
			case LB:
			case LC:
			case LD:
			case LE:
			case LF:
			case LG:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StringContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public List<TerminalNode> FRET() { return getTokens(guitartabParser.FRET); }
		public TerminalNode FRET(int i) {
			return getToken(guitartabParser.FRET, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			note();
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				position();
				setState(49);
				match(FRET);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FINGER || _la==BARLNE );
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

	public static class PositionContext extends ParserRuleContext {
		public List<FingerContext> finger() {
			return getRuleContexts(FingerContext.class);
		}
		public FingerContext finger(int i) {
			return getRuleContext(FingerContext.class,i);
		}
		public List<TerminalNode> BARLNE() { return getTokens(guitartabParser.BARLNE); }
		public TerminalNode BARLNE(int i) {
			return getToken(guitartabParser.BARLNE, i);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_position);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINGER:
					{
					setState(55);
					finger();
					}
					break;
				case BARLNE:
					{
					setState(56);
					match(BARLNE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FINGER || _la==BARLNE );
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

	public static class FingerContext extends ParserRuleContext {
		public TerminalNode FINGER() { return getToken(guitartabParser.FINGER, 0); }
		public FingerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterFinger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitFinger(this);
		}
	}

	public final FingerContext finger() throws RecognitionException {
		FingerContext _localctx = new FingerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_finger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FINGER);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode BA() { return getToken(guitartabParser.BA, 0); }
		public TerminalNode BB() { return getToken(guitartabParser.BB, 0); }
		public TerminalNode BC() { return getToken(guitartabParser.BC, 0); }
		public TerminalNode BD() { return getToken(guitartabParser.BD, 0); }
		public TerminalNode BE() { return getToken(guitartabParser.BE, 0); }
		public TerminalNode BF() { return getToken(guitartabParser.BF, 0); }
		public TerminalNode BG() { return getToken(guitartabParser.BG, 0); }
		public TerminalNode LA() { return getToken(guitartabParser.LA, 0); }
		public TerminalNode LB() { return getToken(guitartabParser.LB, 0); }
		public TerminalNode LC() { return getToken(guitartabParser.LC, 0); }
		public TerminalNode LD() { return getToken(guitartabParser.LD, 0); }
		public TerminalNode LE() { return getToken(guitartabParser.LE, 0); }
		public TerminalNode LF() { return getToken(guitartabParser.LF, 0); }
		public TerminalNode LG() { return getToken(guitartabParser.LG, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof guitartabListener ) ((guitartabListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BA) | (1L << BB) | (1L << BC) | (1L << BD) | (1L << BE) | (1L << BF) | (1L << BG) | (1L << LA) | (1L << LB) | (1L << LC) | (1L << LD) | (1L << LE) | (1L << LF) | (1L << LG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\6\4#\n\4\r\4\16"+
		"\4$\3\4\6\4(\n\4\r\4\16\4)\5\4,\n\4\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6"+
		"\6\6\66\n\6\r\6\16\6\67\3\7\3\7\6\7<\n\7\r\7\16\7=\3\b\3\b\3\t\3\t\3\t"+
		"\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\5\22\2D\2\22\3\2\2\2\4\35\3\2\2\2\6+"+
		"\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f;\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22"+
		"\23\7\3\2\2\23\25\5\4\3\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33"+
		"\36\7\26\2\2\34\36\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37"+
		" \7\4\2\2 \"\5\b\5\2!#\5\n\6\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2"+
		"\2%,\3\2\2\2&(\5\n\6\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2"+
		"\2\2+\37\3\2\2\2+\'\3\2\2\2,\7\3\2\2\2-\60\7\26\2\2.\60\3\2\2\2/-\3\2"+
		"\2\2/.\3\2\2\2\60\t\3\2\2\2\61\65\5\20\t\2\62\63\5\f\7\2\63\64\7\25\2"+
		"\2\64\66\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8\13\3\2\2\29<\5\16\b\2:<\7\24\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2"+
		"\2\2=>\3\2\2\2>\r\3\2\2\2?@\7\23\2\2@\17\3\2\2\2AB\t\2\2\2B\21\3\2\2\2"+
		"\13\27\35$)+/\67;=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}