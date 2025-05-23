// Generated from guitartab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class guitartabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BA=3, BB=4, BC=5, BD=6, BE=7, BF=8, BG=9, LA=10, LB=11, 
		LC=12, LD=13, LE=14, LF=15, LG=16, FINGER=17, BARLNE=18, FRET=19, INTLITERAL=20, 
		WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BA", "BB", "BC", "BD", "BE", "BF", "BG", "LA", "LB", 
			"LC", "LD", "LE", "LF", "LG", "FINGER", "BARLNE", "FRET", "DIGIT", "INTLITERAL", 
			"WS"
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


	public guitartabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "guitartab.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26b\n\26"+
		"\r\26\16\26c\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26"+
		"-\27\3\2\5\4\2qqzz\3\2\62;\5\2\13\f\17\17\"\"\2h\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7<\3\2\2\2\t>\3\2"+
		"\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3"+
		"\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!V\3"+
		"\2\2\2#X\3\2\2\2%Z\3\2\2\2\'\\\3\2\2\2)^\3\2\2\2+a\3\2\2\2-e\3\2\2\2/"+
		"\60\7D\2\2\60\61\7R\2\2\61\62\7O\2\2\62\63\7<\2\2\63\4\3\2\2\2\64\65\7"+
		"U\2\2\65\66\7v\2\2\66\67\7t\2\2\678\7w\2\289\7o\2\29:\7u\2\2:;\7<\2\2"+
		";\6\3\2\2\2<=\7C\2\2=\b\3\2\2\2>?\7D\2\2?\n\3\2\2\2@A\7E\2\2A\f\3\2\2"+
		"\2BC\7F\2\2C\16\3\2\2\2DE\7G\2\2E\20\3\2\2\2FG\7H\2\2G\22\3\2\2\2HI\7"+
		"I\2\2I\24\3\2\2\2JK\7c\2\2K\26\3\2\2\2LM\7d\2\2M\30\3\2\2\2NO\7e\2\2O"+
		"\32\3\2\2\2PQ\7f\2\2Q\34\3\2\2\2RS\7g\2\2S\36\3\2\2\2TU\7h\2\2U \3\2\2"+
		"\2VW\7i\2\2W\"\3\2\2\2XY\t\2\2\2Y$\3\2\2\2Z[\7/\2\2[&\3\2\2\2\\]\7~\2"+
		"\2](\3\2\2\2^_\t\3\2\2_*\3\2\2\2`b\5)\25\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d,\3\2\2\2ef\t\4\2\2fg\3\2\2\2gh\b\27\2\2h.\3\2\2\2\4\2c\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}