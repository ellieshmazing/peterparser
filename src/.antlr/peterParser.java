// Generated from c://Users//ellie//OneDrive//Desktop//Fall 2023//POPL//Parser Project//src//peterParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class peterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SERIAL=1, INTEGER=2, FLOAT=3, CHAR=4, ID=5, STRING=6, ADD=7, SUB=8, MULT=9, 
		DIV=10, MOD=11, ASN=12, ADDASN=13, SUBASN=14, MULTASN=15, DIVASN=16, LT=17, 
		LTE=18, GT=19, GTE=20, EQUIV=21, NEQUIV=22, IF=23, ELSE=24, ELIF=25, WHILE=26, 
		FOR=27, AND=28, OR=29, NOT=30, OPENBRACK=31, CLOSEBRACK=32, OPENPAREN=33, 
		CLOSEPAREN=34, LINECMT=35, BLCKCMT=36, SPACE=37, WHITESPACE=38, NEWLINE=39;
	public static final int
		RULE_start_ = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_list = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "block", "statement", "assignment", "expr", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>+'", 
			"'=='", "'!='", "'if'", "'else'", "'elif'", "'while'", "'for'", "'and'", 
			"'or'", "'not'", "'['", "']'", "'('", "')'", "'#'", "'''''", "' '", "'\\t'", 
			"'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SERIAL", "INTEGER", "FLOAT", "CHAR", "ID", "STRING", "ADD", "SUB", 
			"MULT", "DIV", "MOD", "ASN", "ADDASN", "SUBASN", "MULTASN", "DIVASN", 
			"LT", "LTE", "GT", "GTE", "EQUIV", "NEQUIV", "IF", "ELSE", "ELIF", "WHILE", 
			"FOR", "AND", "OR", "NOT", "OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", 
			"LINECMT", "BLCKCMT", "SPACE", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "peterParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public peterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Context extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				block();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(peterParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(peterParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				statement();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(peterParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(peterParser.EOF, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			assignment();
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(peterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(peterParser.ID, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(peterParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(peterParser.SPACE, i);
		}
		public TerminalNode ASN() { return getToken(peterParser.ASN, 0); }
		public TerminalNode ADDASN() { return getToken(peterParser.ADDASN, 0); }
		public TerminalNode SUBASN() { return getToken(peterParser.SUBASN, 0); }
		public TerminalNode MULTASN() { return getToken(peterParser.MULTASN, 0); }
		public TerminalNode DIVASN() { return getToken(peterParser.DIVASN, 0); }
		public TerminalNode CHAR() { return getToken(peterParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(peterParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(peterParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(peterParser.FLOAT, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ID);
			setState(28);
			match(SPACE);
			setState(29);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			match(SPACE);
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(31);
				match(ID);
				}
				break;
			case 2:
				{
				setState(32);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(33);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(34);
				match(INTEGER);
				}
				break;
			case 5:
				{
				setState(35);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(36);
				list();
				}
				break;
			case 7:
				{
				setState(37);
				expr();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(peterParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(peterParser.SPACE, i);
		}
		public List<TerminalNode> ID() { return getTokens(peterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(peterParser.ID, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(peterParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(peterParser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(peterParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(peterParser.FLOAT, i);
		}
		public TerminalNode ADD() { return getToken(peterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(peterParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(peterParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(peterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(peterParser.MOD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 44L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			match(SPACE);
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			match(SPACE);
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(44);
				match(ID);
				}
				break;
			case 2:
				{
				setState(45);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(46);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(47);
				expr();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPENBRACK() { return getToken(peterParser.OPENBRACK, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(peterParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(peterParser.INTEGER, i);
		}
		public TerminalNode CLOSEBRACK() { return getToken(peterParser.CLOSEBRACK, 0); }
		public List<TerminalNode> SERIAL() { return getTokens(peterParser.SERIAL); }
		public TerminalNode SERIAL(int i) {
			return getToken(peterParser.SERIAL, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(peterParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(peterParser.FLOAT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(peterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(peterParser.CHAR, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		try {
			int _alt;
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(OPENBRACK);
				setState(53); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(51);
						match(INTEGER);
						setState(52);
						match(SERIAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(55); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(57);
				match(INTEGER);
				setState(58);
				match(CLOSEBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(OPENBRACK);
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(60);
						match(FLOAT);
						setState(61);
						match(SERIAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(66);
				match(FLOAT);
				setState(67);
				match(CLOSEBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(OPENBRACK);
				setState(71); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						match(CHAR);
						setState(70);
						match(SERIAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(73); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(75);
				match(CHAR);
				setState(76);
				match(CLOSEBRACK);
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
		"\u0004\u0001\'P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0004\u0001\u0013\b\u0001\u000b\u0001\f\u0001"+
		"\u0014\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00041\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u00056\b\u0005\u000b\u0005\f\u00057\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005?\b\u0005"+
		"\u000b\u0005\f\u0005@\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005H\b\u0005\u000b\u0005\f\u0005I\u0001\u0005\u0001"+
		"\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0004\u0001\u0001\'\'\u0001\u0000\f\u0010\u0002"+
		"\u0000\u0002\u0003\u0005\u0005\u0001\u0000\u0007\u000bY\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0018\u0001"+
		"\u0000\u0000\u0000\u0006\u001b\u0001\u0000\u0000\u0000\b(\u0001\u0000"+
		"\u0000\u0000\nM\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000"+
		"\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001"+
		"\u0001\u0000\u0000\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0007\u0000\u0000\u0000\u0017\u0003"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a"+
		"\u0007\u0000\u0000\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\u0005\u0000\u0000\u001c\u001d\u0005%\u0000\u0000\u001d\u001e\u0007"+
		"\u0001\u0000\u0000\u001e&\u0005%\u0000\u0000\u001f\'\u0005\u0005\u0000"+
		"\u0000 \'\u0005\u0004\u0000\u0000!\'\u0005\u0006\u0000\u0000\"\'\u0005"+
		"\u0002\u0000\u0000#\'\u0005\u0003\u0000\u0000$\'\u0003\n\u0005\u0000%"+
		"\'\u0003\b\u0004\u0000&\u001f\u0001\u0000\u0000\u0000& \u0001\u0000\u0000"+
		"\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000&#\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0007"+
		"\u0001\u0000\u0000\u0000()\u0007\u0002\u0000\u0000)*\u0005%\u0000\u0000"+
		"*+\u0007\u0003\u0000\u0000+0\u0005%\u0000\u0000,1\u0005\u0005\u0000\u0000"+
		"-1\u0005\u0002\u0000\u0000.1\u0005\u0003\u0000\u0000/1\u0003\b\u0004\u0000"+
		"0,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u000025\u0005\u001f"+
		"\u0000\u000034\u0005\u0002\u0000\u000046\u0005\u0001\u0000\u000053\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0002\u0000"+
		"\u0000:N\u0005 \u0000\u0000;>\u0005\u001f\u0000\u0000<=\u0005\u0003\u0000"+
		"\u0000=?\u0005\u0001\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0003\u0000\u0000CN\u0005 \u0000\u0000DG\u0005"+
		"\u001f\u0000\u0000EF\u0005\u0004\u0000\u0000FH\u0005\u0001\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0004"+
		"\u0000\u0000LN\u0005 \u0000\u0000M2\u0001\u0000\u0000\u0000M;\u0001\u0000"+
		"\u0000\u0000MD\u0001\u0000\u0000\u0000N\u000b\u0001\u0000\u0000\u0000"+
		"\b\u000f\u0014&07@IM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}