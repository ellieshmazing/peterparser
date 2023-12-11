// Generated from c://Users//ellie//OneDrive//Desktop//Fall 2023//POPL//Parser Project//src//peterLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class peterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, FLOAT=2, ID=3, ADD=4, SUB=5, MULT=6, DIV=7, MOD=8, ASN=9, ADDASN=10, 
		SUBASN=11, MULTASN=12, DIVASN=13, LT=14, LTE=15, GT=16, GTE=17, EQUIV=18, 
		NEQUIV=19, IF=20, ELSE=21, ELIF=22, WHILE=23, FOR=24, AND=25, OR=26, NOT=27, 
		LINECMT=28, BLCKCMT=29, WHITESPACE=30, NEWLINE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "INTEGER", "FLOAT", "LETTER", "ID", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "ASN", "ADDASN", "SUBASN", "MULTASN", "DIVASN", "LT", "LTE", "GT", 
			"GTE", "EQUIV", "NEQUIV", "IF", "ELSE", "ELIF", "WHILE", "FOR", "AND", 
			"OR", "NOT", "LINECMT", "BLCKCMT", "WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>+'", "'=='", "'!='", 
			"'if'", "'else'", "'elif'", "'while'", "'for'", "'and'", "'or'", "'not'", 
			"'#'", "'''''", "'\\t'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "FLOAT", "ID", "ADD", "SUB", "MULT", "DIV", "MOD", "ASN", 
			"ADDASN", "SUBASN", "MULTASN", "DIVASN", "LT", "LTE", "GT", "GTE", "EQUIV", 
			"NEQUIV", "IF", "ELSE", "ELIF", "WHILE", "FOR", "AND", "OR", "NOT", "LINECMT", 
			"BLCKCMT", "WHITESPACE", "NEWLINE"
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


	public peterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "peterLexer.g4"; }

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
		"\u0004\u0000\u001f\u00b4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001G\b\u0001\u000b\u0001\f\u0001H\u0001"+
		"\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002S\b\u0002\u000b\u0002\f\u0002T\u0001\u0003\u0003\u0003"+
		"X\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004]\b\u0004\u000b"+
		"\u0004\f\u0004^\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0000\u0000!\u0001\u0000\u0003\u0001"+
		"\u0005\u0002\u0007\u0000\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011"+
		"\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e"+
		"!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u0018"+
		"5\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001f\u0001\u0000\u0002\u0001"+
		"\u000009\u0002\u0000AZaz\u00b7\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000"+
		"\u0003F\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007W"+
		"\u0001\u0000\u0000\u0000\t\\\u0001\u0000\u0000\u0000\u000b`\u0001\u0000"+
		"\u0000\u0000\rb\u0001\u0000\u0000\u0000\u000fd\u0001\u0000\u0000\u0000"+
		"\u0011f\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000\u0000\u0015j"+
		"\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019o\u0001\u0000"+
		"\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000"+
		"\u001fx\u0001\u0000\u0000\u0000!z\u0001\u0000\u0000\u0000#}\u0001\u0000"+
		"\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0082\u0001\u0000\u0000"+
		"\u0000)\u0085\u0001\u0000\u0000\u0000+\u0088\u0001\u0000\u0000\u0000-"+
		"\u008b\u0001\u0000\u0000\u0000/\u0090\u0001\u0000\u0000\u00001\u0095\u0001"+
		"\u0000\u0000\u00003\u009b\u0001\u0000\u0000\u00005\u009f\u0001\u0000\u0000"+
		"\u00007\u00a3\u0001\u0000\u0000\u00009\u00a6\u0001\u0000\u0000\u0000;"+
		"\u00aa\u0001\u0000\u0000\u0000=\u00ac\u0001\u0000\u0000\u0000?\u00b0\u0001"+
		"\u0000\u0000\u0000A\u00b2\u0001\u0000\u0000\u0000CD\u0007\u0000\u0000"+
		"\u0000D\u0002\u0001\u0000\u0000\u0000EG\u0003\u0001\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\u0004\u0001\u0000\u0000\u0000JL\u0003\u0001"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PR\u0005.\u0000\u0000QS\u0003\u0001\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u0006\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X\b\u0001\u0000\u0000\u0000"+
		"Y]\u0003\u0007\u0003\u0000Z]\u0003\u0001\u0000\u0000[]\u0005_\u0000\u0000"+
		"\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\n\u0001\u0000\u0000\u0000`a\u0005+\u0000\u0000a\f"+
		"\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000c\u000e\u0001\u0000\u0000"+
		"\u0000de\u0005*\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fg\u0005/\u0000"+
		"\u0000g\u0012\u0001\u0000\u0000\u0000hi\u0005%\u0000\u0000i\u0014\u0001"+
		"\u0000\u0000\u0000jk\u0005=\u0000\u0000k\u0016\u0001\u0000\u0000\u0000"+
		"lm\u0005+\u0000\u0000mn\u0005=\u0000\u0000n\u0018\u0001\u0000\u0000\u0000"+
		"op\u0005-\u0000\u0000pq\u0005=\u0000\u0000q\u001a\u0001\u0000\u0000\u0000"+
		"rs\u0005*\u0000\u0000st\u0005=\u0000\u0000t\u001c\u0001\u0000\u0000\u0000"+
		"uv\u0005/\u0000\u0000vw\u0005=\u0000\u0000w\u001e\u0001\u0000\u0000\u0000"+
		"xy\u0005<\u0000\u0000y \u0001\u0000\u0000\u0000z{\u0005<\u0000\u0000{"+
		"|\u0005=\u0000\u0000|\"\u0001\u0000\u0000\u0000}~\u0005>\u0000\u0000~"+
		"$\u0001\u0000\u0000\u0000\u007f\u0080\u0005>\u0000\u0000\u0080\u0081\u0005"+
		"+\u0000\u0000\u0081&\u0001\u0000\u0000\u0000\u0082\u0083\u0005=\u0000"+
		"\u0000\u0083\u0084\u0005=\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005!\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087*\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005i\u0000\u0000\u0089\u008a\u0005f\u0000"+
		"\u0000\u008a,\u0001\u0000\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c"+
		"\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u008f\u0005"+
		"e\u0000\u0000\u008f.\u0001\u0000\u0000\u0000\u0090\u0091\u0005e\u0000"+
		"\u0000\u0091\u0092\u0005l\u0000\u0000\u0092\u0093\u0005i\u0000\u0000\u0093"+
		"\u0094\u0005f\u0000\u0000\u00940\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"w\u0000\u0000\u0096\u0097\u0005h\u0000\u0000\u0097\u0098\u0005i\u0000"+
		"\u0000\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005e\u0000\u0000\u009a"+
		"2\u0001\u0000\u0000\u0000\u009b\u009c\u0005f\u0000\u0000\u009c\u009d\u0005"+
		"o\u0000\u0000\u009d\u009e\u0005r\u0000\u0000\u009e4\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0\u00a1\u0005n\u0000\u0000\u00a1"+
		"\u00a2\u0005d\u0000\u0000\u00a26\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"o\u0000\u0000\u00a4\u00a5\u0005r\u0000\u0000\u00a58\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8"+
		"\u00a9\u0005t\u0000\u0000\u00a9:\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"#\u0000\u0000\u00ab<\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\'\u0000"+
		"\u0000\u00ad\u00ae\u0005\'\u0000\u0000\u00ae\u00af\u0005\'\u0000\u0000"+
		"\u00af>\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1"+
		"@\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3B\u0001"+
		"\u0000\u0000\u0000\u0007\u0000HMTW\\^\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}