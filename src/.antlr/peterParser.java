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
		TRUE=1, FALSE=2, IF=3, ELSE=4, ELIF=5, WHILE=6, FOR=7, AND=8, OR=9, NOT=10, 
		INTEGER=11, FLOAT=12, COMMA=13, CHAR=14, ID=15, STRING=16, ADD=17, SUB=18, 
		MULT=19, DIV=20, MOD=21, ASN=22, ADDASN=23, SUBASN=24, MULTASN=25, DIVASN=26, 
		LT=27, LTE=28, GT=29, GTE=30, EQUIV=31, NEQUIV=32, OPENBRACK=33, CLOSEBRACK=34, 
		OPENPAREN=35, CLOSEPAREN=36, LINECMT=37, BLCKCMT=38, SPACE=39, COLON=40, 
		WHITESPACE=41, NEWLINE=42;
	public static final int
		RULE_start_ = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_ifblock = 5, RULE_body = 6, RULE_conditional = 7, 
		RULE_conditionalval = 8, RULE_conditionalop = 9, RULE_list = 10, RULE_rval = 11, 
		RULE_arithop = 12, RULE_asnop = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "block", "statement", "assignment", "expr", "ifblock", "body", 
			"conditional", "conditionalval", "conditionalop", "list", "rval", "arithop", 
			"asnop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'True'", "'False'", "'if'", "'else'", "'elif'", "'while'", "'for'", 
			"'and'", "'or'", "'not'", null, null, "','", null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'['", "']'", "'('", "')'", "'#'", 
			"'''''", "' '", "':'", "'\\t'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "IF", "ELSE", "ELIF", "WHILE", "FOR", "AND", "OR", 
			"NOT", "INTEGER", "FLOAT", "COMMA", "CHAR", "ID", "STRING", "ADD", "SUB", 
			"MULT", "DIV", "MOD", "ASN", "ADDASN", "SUBASN", "MULTASN", "DIVASN", 
			"LT", "LTE", "GT", "GTE", "EQUIV", "NEQUIV", "OPENBRACK", "CLOSEBRACK", 
			"OPENPAREN", "CLOSEPAREN", "LINECMT", "BLCKCMT", "SPACE", "COLON", "WHITESPACE", 
			"NEWLINE"
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
		public TerminalNode EOF() { return getToken(peterParser.EOF, 0); }
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				block();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==ID );
			setState(33);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				statement();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==ID );
			setState(40);
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
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				assignment();
				setState(43);
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
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				ifblock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(peterParser.ID, 0); }
		public AsnopContext asnop() {
			return getRuleContext(AsnopContext.class,0);
		}
		public RvalContext rval() {
			return getRuleContext(RvalContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			asnop();
			setState(50);
			rval();
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
		public ArithopContext arithop() {
			return getRuleContext(ArithopContext.class,0);
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
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 38912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			arithop();
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(54);
				match(ID);
				}
				break;
			case 2:
				{
				setState(55);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(56);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(57);
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
	public static class IfblockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(peterParser.IF, 0); }
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(peterParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(peterParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(peterParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(peterParser.NEWLINE, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode EOF() { return getToken(peterParser.EOF, 0); }
		public List<TerminalNode> ELIF() { return getTokens(peterParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(peterParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(peterParser.ELSE, 0); }
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IF);
			setState(61);
			conditional(0);
			setState(62);
			match(COLON);
			setState(63);
			match(NEWLINE);
			setState(64);
			body();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(65);
				match(ELIF);
				setState(66);
				conditional(0);
				setState(67);
				match(COLON);
				setState(68);
				match(NEWLINE);
				setState(69);
				body();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(76);
				match(ELSE);
				setState(77);
				match(COLON);
				setState(78);
				match(NEWLINE);
				setState(79);
				body();
				}
			}

			setState(82);
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
	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(peterParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(peterParser.WHITESPACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(WHITESPACE);
				setState(85);
				statement();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
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
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(peterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(peterParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(peterParser.ID, 0); }
		public TerminalNode OPENPAREN() { return getToken(peterParser.OPENPAREN, 0); }
		public List<ConditionalvalContext> conditionalval() {
			return getRuleContexts(ConditionalvalContext.class);
		}
		public ConditionalvalContext conditionalval(int i) {
			return getRuleContext(ConditionalvalContext.class,i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(peterParser.CLOSEPAREN, 0); }
		public ConditionalopContext conditionalop() {
			return getRuleContext(ConditionalopContext.class,0);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public TerminalNode AND() { return getToken(peterParser.AND, 0); }
		public TerminalNode OR() { return getToken(peterParser.OR, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		return conditional(0);
	}

	private ConditionalContext conditional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalContext _localctx = new ConditionalContext(_ctx, _parentState);
		ConditionalContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_conditional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(92);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(93);
				match(ID);
				}
				break;
			case 4:
				{
				setState(94);
				match(OPENPAREN);
				setState(95);
				conditionalval();
				setState(96);
				match(CLOSEPAREN);
				}
				break;
			case 5:
				{
				setState(98);
				conditionalval();
				setState(99);
				conditionalop();
				setState(100);
				conditionalval();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(AND);
						setState(106);
						conditional(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(107);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(108);
						match(OR);
						setState(109);
						conditional(2);
						}
						break;
					}
					} 
				}
				setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalvalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(peterParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(peterParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(peterParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(peterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(peterParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(peterParser.NOT, 0); }
		public ConditionalvalContext conditionalval() {
			return getRuleContext(ConditionalvalContext.class,0);
		}
		public ConditionalvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalval; }
	}

	public final ConditionalvalContext conditionalval() throws RecognitionException {
		ConditionalvalContext _localctx = new ConditionalvalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalval);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ID);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(FLOAT);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(FALSE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(NOT);
				setState(121);
				conditionalval();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalopContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(peterParser.LT, 0); }
		public TerminalNode LTE() { return getToken(peterParser.LTE, 0); }
		public TerminalNode GT() { return getToken(peterParser.GT, 0); }
		public TerminalNode GTE() { return getToken(peterParser.GTE, 0); }
		public TerminalNode EQUIV() { return getToken(peterParser.EQUIV, 0); }
		public TerminalNode NEQUIV() { return getToken(peterParser.NEQUIV, 0); }
		public ConditionalopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalop; }
	}

	public final ConditionalopContext conditionalop() throws RecognitionException {
		ConditionalopContext _localctx = new ConditionalopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPENBRACK() { return getToken(peterParser.OPENBRACK, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(peterParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(peterParser.INTEGER, i);
		}
		public TerminalNode CLOSEBRACK() { return getToken(peterParser.CLOSEBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(peterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(peterParser.COMMA, i);
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
		enterRule(_localctx, 20, RULE_list);
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(OPENBRACK);
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(127);
						match(INTEGER);
						setState(128);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(133);
				match(INTEGER);
				setState(134);
				match(CLOSEBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(OPENBRACK);
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(136);
						match(FLOAT);
						setState(137);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(142);
				match(FLOAT);
				setState(143);
				match(CLOSEBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(OPENBRACK);
				setState(147); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						match(CHAR);
						setState(146);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(151);
				match(CHAR);
				setState(152);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RvalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(peterParser.ID, 0); }
		public TerminalNode CHAR() { return getToken(peterParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(peterParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(peterParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(peterParser.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(peterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(peterParser.FALSE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rval; }
	}

	public final RvalContext rval() throws RecognitionException {
		RvalContext _localctx = new RvalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rval);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithopContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(peterParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(peterParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(peterParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(peterParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(peterParser.MOD, 0); }
		public ArithopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithop; }
	}

	public final ArithopContext arithop() throws RecognitionException {
		ArithopContext _localctx = new ArithopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0)) ) {
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
	public static class AsnopContext extends ParserRuleContext {
		public TerminalNode ASN() { return getToken(peterParser.ASN, 0); }
		public TerminalNode ADDASN() { return getToken(peterParser.ADDASN, 0); }
		public TerminalNode SUBASN() { return getToken(peterParser.SUBASN, 0); }
		public TerminalNode MULTASN() { return getToken(peterParser.MULTASN, 0); }
		public TerminalNode DIVASN() { return getToken(peterParser.DIVASN, 0); }
		public AsnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asnop; }
	}

	public final AsnopContext asnop() throws RecognitionException {
		AsnopContext _localctx = new AsnopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asnop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130023424L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return conditional_sempred((ConditionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditional_sempred(ConditionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001%"+
		"\b\u0001\u000b\u0001\f\u0001&\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005"+
		"\f\u0005K\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005Q\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004"+
		"\u0006W\b\u0006\u000b\u0006\f\u0006X\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"o\b\u0007\n\u0007\f\u0007r\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b{\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u0082\b\n\u000b\n\f\n\u0083\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0004\n\u008b\b\n\u000b\n\f\n\u008c\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u0094\b\n\u000b\n\f\n\u0095\u0001\n\u0001\n\u0003\n"+
		"\u009a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0001\u000e\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0005\u0001\u0001**\u0002\u0000\u000b\f\u000f\u000f\u0001\u0000\u001b"+
		" \u0001\u0000\u0011\u0015\u0001\u0000\u0016\u001a\u00bd\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000"+
		"\u0000\u00060\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n<\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000"+
		"\u0000\u0010z\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014"+
		"\u0099\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018"+
		"\u00a6\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0007\u0000\u0000"+
		"\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0007"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-/\u0003\n\u0005\u0000.*\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000"+
		"\u000001\u0005\u000f\u0000\u000012\u0003\u001a\r\u000023\u0003\u0016\u000b"+
		"\u00003\u0007\u0001\u0000\u0000\u000045\u0007\u0001\u0000\u00005:\u0003"+
		"\u0018\f\u00006;\u0005\u000f\u0000\u00007;\u0005\u000b\u0000\u00008;\u0005"+
		"\f\u0000\u00009;\u0003\b\u0004\u0000:6\u0001\u0000\u0000\u0000:7\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";\t\u0001\u0000\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0003\u000e\u0007"+
		"\u0000>?\u0005(\u0000\u0000?@\u0005*\u0000\u0000@I\u0003\f\u0006\u0000"+
		"AB\u0005\u0005\u0000\u0000BC\u0003\u000e\u0007\u0000CD\u0005(\u0000\u0000"+
		"DE\u0005*\u0000\u0000EF\u0003\f\u0006\u0000FH\u0001\u0000\u0000\u0000"+
		"GA\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JP\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0005(\u0000\u0000NO\u0005*\u0000"+
		"\u0000OQ\u0003\f\u0006\u0000PL\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u000b\u0001"+
		"\u0000\u0000\u0000TU\u0005)\u0000\u0000UW\u0003\u0004\u0002\u0000VT\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0006\u0007\uffff"+
		"\uffff\u0000[g\u0005\u0001\u0000\u0000\\g\u0005\u0002\u0000\u0000]g\u0005"+
		"\u000f\u0000\u0000^_\u0005#\u0000\u0000_`\u0003\u0010\b\u0000`a\u0005"+
		"$\u0000\u0000ag\u0001\u0000\u0000\u0000bc\u0003\u0010\b\u0000cd\u0003"+
		"\u0012\t\u0000de\u0003\u0010\b\u0000eg\u0001\u0000\u0000\u0000fZ\u0001"+
		"\u0000\u0000\u0000f\\\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000"+
		"f^\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000gp\u0001\u0000\u0000"+
		"\u0000hi\n\u0002\u0000\u0000ij\u0005\b\u0000\u0000jo\u0003\u000e\u0007"+
		"\u0003kl\n\u0001\u0000\u0000lm\u0005\t\u0000\u0000mo\u0003\u000e\u0007"+
		"\u0002nh\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u000f"+
		"\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000s{\u0005\u000f\u0000"+
		"\u0000t{\u0005\u000b\u0000\u0000u{\u0005\f\u0000\u0000v{\u0005\u0001\u0000"+
		"\u0000w{\u0005\u0002\u0000\u0000xy\u0005\n\u0000\u0000y{\u0003\u0010\b"+
		"\u0000zs\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zu\u0001\u0000"+
		"\u0000\u0000zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0007\u0002\u0000"+
		"\u0000}\u0013\u0001\u0000\u0000\u0000~\u0081\u0005!\u0000\u0000\u007f"+
		"\u0080\u0005\u000b\u0000\u0000\u0080\u0082\u0005\r\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u009a"+
		"\u0005\"\u0000\u0000\u0087\u008a\u0005!\u0000\u0000\u0088\u0089\u0005"+
		"\f\u0000\u0000\u0089\u008b\u0005\r\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\f\u0000\u0000\u008f\u009a\u0005\"\u0000"+
		"\u0000\u0090\u0093\u0005!\u0000\u0000\u0091\u0092\u0005\u000e\u0000\u0000"+
		"\u0092\u0094\u0005\r\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u000e\u0000\u0000\u0098\u009a\u0005\"\u0000\u0000\u0099~"+
		"\u0001\u0000\u0000\u0000\u0099\u0087\u0001\u0000\u0000\u0000\u0099\u0090"+
		"\u0001\u0000\u0000\u0000\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u00a5"+
		"\u0005\u000f\u0000\u0000\u009c\u00a5\u0005\u000e\u0000\u0000\u009d\u00a5"+
		"\u0005\u0010\u0000\u0000\u009e\u00a5\u0005\u000b\u0000\u0000\u009f\u00a5"+
		"\u0005\f\u0000\u0000\u00a0\u00a5\u0005\u0001\u0000\u0000\u00a1\u00a5\u0005"+
		"\u0002\u0000\u0000\u00a2\u00a5\u0003\u0014\n\u0000\u00a3\u00a5\u0003\b"+
		"\u0004\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4\u009c\u0001\u0000"+
		"\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000"+
		"\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u0017\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0007\u0003\u0000\u0000\u00a7\u0019\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0007\u0004\u0000\u0000\u00a9\u001b\u0001\u0000"+
		"\u0000\u0000\u0010\u001f&.:IPXfnpz\u0083\u008c\u0095\u0099\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}