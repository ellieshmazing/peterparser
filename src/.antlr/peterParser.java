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
		IN=11, RANGE=12, INTEGER=13, FLOAT=14, COMMA=15, CHAR=16, ID=17, STRING=18, 
		ADD=19, SUB=20, MULT=21, DIV=22, MOD=23, ASN=24, ADDASN=25, SUBASN=26, 
		MULTASN=27, DIVASN=28, LT=29, LTE=30, GT=31, GTE=32, EQUIV=33, NEQUIV=34, 
		OPENBRACK=35, CLOSEBRACK=36, OPENPAREN=37, CLOSEPAREN=38, COLON=39, LINECMT=40, 
		BLCKCMT=41, NL=42, WHITESPACE=43;
	public static final int
		RULE_start_ = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_expr = 4, RULE_ifblock = 5, RULE_elseblock = 6, RULE_elifblock = 7, 
		RULE_whileblock = 8, RULE_forblock = 9, RULE_body = 10, RULE_conditional = 11, 
		RULE_conditionalval = 12, RULE_conditionalop = 13, RULE_comment = 14, 
		RULE_list = 15, RULE_rval = 16, RULE_arithop = 17, RULE_asnop = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "block", "statement", "assignment", "expr", "ifblock", "elseblock", 
			"elifblock", "whileblock", "forblock", "body", "conditional", "conditionalval", 
			"conditionalop", "comment", "list", "rval", "arithop", "asnop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'True'", "'False'", "'if'", "'else'", "'elif'", "'while'", "'for'", 
			"'and'", "'or'", "'not'", "'in'", "'range'", null, null, "','", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'['", 
			"']'", "'('", "')'", "':'", null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "IF", "ELSE", "ELIF", "WHILE", "FOR", "AND", "OR", 
			"NOT", "IN", "RANGE", "INTEGER", "FLOAT", "COMMA", "CHAR", "ID", "STRING", 
			"ADD", "SUB", "MULT", "DIV", "MOD", "ASN", "ADDASN", "SUBASN", "MULTASN", 
			"DIVASN", "LT", "LTE", "GT", "GTE", "EQUIV", "NEQUIV", "OPENBRACK", "CLOSEBRACK", 
			"OPENPAREN", "CLOSEPAREN", "COLON", "LINECMT", "BLCKCMT", "NL", "WHITESPACE"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				block();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3298535014600L) != 0) );
			setState(43);
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
		public TerminalNode NL() { return getToken(peterParser.NL, 0); }
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
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				statement();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3298535014600L) != 0) );
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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
		public TerminalNode NL() { return getToken(peterParser.NL, 0); }
		public TerminalNode EOF() { return getToken(peterParser.EOF, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public WhileblockContext whileblock() {
			return getRuleContext(WhileblockContext.class,0);
		}
		public ForblockContext forblock() {
			return getRuleContext(ForblockContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				assignment();
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LINECMT:
			case BLCKCMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				comment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				ifblock();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				whileblock();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				forblock();
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
			setState(61);
			match(ID);
			setState(62);
			asnop();
			setState(63);
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
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 155648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			arithop();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				match(ID);
				}
				break;
			case 2:
				{
				setState(68);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(69);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(70);
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
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(peterParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElifblockContext> elifblock() {
			return getRuleContexts(ElifblockContext.class);
		}
		public ElifblockContext elifblock(int i) {
			return getRuleContext(ElifblockContext.class,i);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IF);
			setState(74);
			conditional(0);
			setState(75);
			match(COLON);
			setState(76);
			body();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					elifblock();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(83);
				elseblock();
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
	public static class ElseblockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(peterParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(peterParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ELSE);
			setState(87);
			match(COLON);
			setState(88);
			body();
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
	public static class ElifblockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(peterParser.ELIF, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(peterParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifblock; }
	}

	public final ElifblockContext elifblock() throws RecognitionException {
		ElifblockContext _localctx = new ElifblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ELIF);
			setState(91);
			conditional(0);
			setState(92);
			match(COLON);
			setState(93);
			body();
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
	public static class WhileblockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(peterParser.WHILE, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(peterParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(peterParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(peterParser.CLOSEPAREN, 0); }
		public WhileblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblock; }
	}

	public final WhileblockContext whileblock() throws RecognitionException {
		WhileblockContext _localctx = new WhileblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileblock);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(WHILE);
				setState(96);
				conditional(0);
				setState(97);
				match(COLON);
				setState(98);
				body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(WHILE);
				setState(101);
				match(OPENPAREN);
				setState(102);
				conditional(0);
				setState(103);
				match(CLOSEPAREN);
				setState(104);
				match(COLON);
				setState(105);
				body();
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
	public static class ForblockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(peterParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(peterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(peterParser.ID, i);
		}
		public TerminalNode IN() { return getToken(peterParser.IN, 0); }
		public TerminalNode COLON() { return getToken(peterParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(peterParser.RANGE, 0); }
		public TerminalNode OPENPAREN() { return getToken(peterParser.OPENPAREN, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(peterParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(peterParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(peterParser.COMMA, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(peterParser.CLOSEPAREN, 0); }
		public ForblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblock; }
	}

	public final ForblockContext forblock() throws RecognitionException {
		ForblockContext _localctx = new ForblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FOR);
			setState(110);
			match(ID);
			setState(111);
			match(IN);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(112);
				match(ID);
				}
				break;
			case OPENBRACK:
				{
				setState(113);
				list();
				}
				break;
			case RANGE:
				{
				setState(114);
				match(RANGE);
				setState(115);
				match(OPENPAREN);
				setState(116);
				match(INTEGER);
				setState(117);
				match(COMMA);
				setState(118);
				match(INTEGER);
				setState(119);
				match(CLOSEPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(COLON);
			setState(123);
			body();
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
		public TerminalNode NL() { return getToken(peterParser.NL, 0); }
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
		enterRule(_localctx, 20, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NL);
			setState(127); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(126);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_conditional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(132);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(133);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(134);
				match(ID);
				}
				break;
			case 4:
				{
				setState(135);
				match(OPENPAREN);
				setState(136);
				conditionalval();
				setState(137);
				match(CLOSEPAREN);
				}
				break;
			case 5:
				{
				setState(139);
				conditionalval();
				setState(140);
				conditionalop();
				setState(141);
				conditionalval();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(146);
						match(AND);
						setState(147);
						conditional(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(148);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(149);
						match(OR);
						setState(150);
						conditional(2);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 24, RULE_conditionalval);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ID);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(FLOAT);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(FALSE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(NOT);
				setState(162);
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
		enterRule(_localctx, 26, RULE_conditionalop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINECMT() { return getToken(peterParser.LINECMT, 0); }
		public TerminalNode NL() { return getToken(peterParser.NL, 0); }
		public TerminalNode BLCKCMT() { return getToken(peterParser.BLCKCMT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comment);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINECMT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(LINECMT);
				setState(168);
				match(NL);
				}
				break;
			case BLCKCMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(BLCKCMT);
				setState(170);
				match(NL);
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
		enterRule(_localctx, 30, RULE_list);
		try {
			int _alt;
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(OPENBRACK);
				setState(176); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(174);
						match(INTEGER);
						setState(175);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(180);
				match(INTEGER);
				setState(181);
				match(CLOSEBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(OPENBRACK);
				setState(185); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						match(FLOAT);
						setState(184);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(187); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(189);
				match(FLOAT);
				setState(190);
				match(CLOSEBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(OPENBRACK);
				setState(194); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(192);
						match(CHAR);
						setState(193);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(196); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(198);
				match(CHAR);
				setState(199);
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
		enterRule(_localctx, 32, RULE_rval);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(INTEGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(FALSE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				list();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
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
		enterRule(_localctx, 34, RULE_arithop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_asnop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
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
		case 11:
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
		"\u0004\u0001+\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001/\b\u0001\u000b\u0001\f\u00010\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005"+
		"R\t\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ty\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u0080\b\n\u000b"+
		"\n\f\n\u0081\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0098\b\u000b\n\u000b"+
		"\f\u000b\u009b\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00a4\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ac\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00b1\b\u000f\u000b\u000f\f\u000f\u00b2\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00ba\b\u000f"+
		"\u000b\u000f\f\u000f\u00bb\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0004\u000f\u00c3\b\u000f\u000b\u000f\f\u000f\u00c4\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0000\u0001\u0016\u0013\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005"+
		"\u0001\u0001**\u0002\u0000\r\u000e\u0011\u0011\u0001\u0000\u001d\"\u0001"+
		"\u0000\u0013\u0017\u0001\u0000\u0018\u001c\u00ee\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0002.\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006"+
		"=\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nI\u0001\u0000\u0000"+
		"\u0000\fV\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010"+
		"k\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014}\u0001"+
		"\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018\u00a3\u0001"+
		"\u0000\u0000\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00ab\u0001"+
		"\u0000\u0000\u0000\u001e\u00c8\u0001\u0000\u0000\u0000 \u00d3\u0001\u0000"+
		"\u0000\u0000\"\u00d5\u0001\u0000\u0000\u0000$\u00d7\u0001\u0000\u0000"+
		"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000"+
		"\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0007\u0000\u0000\u00003\u0003\u0001\u0000\u0000"+
		"\u000045\u0003\u0006\u0003\u000056\u0007\u0000\u0000\u00006<\u0001\u0000"+
		"\u0000\u00007<\u0003\u001c\u000e\u00008<\u0003\n\u0005\u00009<\u0003\u0010"+
		"\b\u0000:<\u0003\u0012\t\u0000;4\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\u0011\u0000"+
		"\u0000>?\u0003$\u0012\u0000?@\u0003 \u0010\u0000@\u0007\u0001\u0000\u0000"+
		"\u0000AB\u0007\u0001\u0000\u0000BG\u0003\"\u0011\u0000CH\u0005\u0011\u0000"+
		"\u0000DH\u0005\r\u0000\u0000EH\u0005\u000e\u0000\u0000FH\u0003\b\u0004"+
		"\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0003\u0000\u0000JK\u0003\u0016\u000b\u0000KL\u0005\'\u0000\u0000LP\u0003"+
		"\u0014\n\u0000MO\u0003\u000e\u0007\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0003\f\u0006\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u000b\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0005\'\u0000\u0000XY\u0003\u0014"+
		"\n\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0003"+
		"\u0016\u000b\u0000\\]\u0005\'\u0000\u0000]^\u0003\u0014\n\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`a\u0003\u0016\u000b"+
		"\u0000ab\u0005\'\u0000\u0000bc\u0003\u0014\n\u0000cl\u0001\u0000\u0000"+
		"\u0000de\u0005\u0006\u0000\u0000ef\u0005%\u0000\u0000fg\u0003\u0016\u000b"+
		"\u0000gh\u0005&\u0000\u0000hi\u0005\'\u0000\u0000ij\u0003\u0014\n\u0000"+
		"jl\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000"+
		"\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0005"+
		"\u0011\u0000\u0000ox\u0005\u000b\u0000\u0000py\u0005\u0011\u0000\u0000"+
		"qy\u0003\u001e\u000f\u0000rs\u0005\f\u0000\u0000st\u0005%\u0000\u0000"+
		"tu\u0005\r\u0000\u0000uv\u0005\u000f\u0000\u0000vw\u0005\r\u0000\u0000"+
		"wy\u0005&\u0000\u0000xp\u0001\u0000\u0000\u0000xq\u0001\u0000\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\'\u0000\u0000"+
		"{|\u0003\u0014\n\u0000|\u0013\u0001\u0000\u0000\u0000}\u007f\u0005*\u0000"+
		"\u0000~\u0080\u0003\u0004\u0002\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0006\u000b\uffff\uffff\u0000\u0084\u0090\u0005\u0001\u0000\u0000"+
		"\u0085\u0090\u0005\u0002\u0000\u0000\u0086\u0090\u0005\u0011\u0000\u0000"+
		"\u0087\u0088\u0005%\u0000\u0000\u0088\u0089\u0003\u0018\f\u0000\u0089"+
		"\u008a\u0005&\u0000\u0000\u008a\u0090\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003\u0018\f\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d\u008e\u0003"+
		"\u0018\f\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000"+
		"\u0000\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u0086\u0001\u0000"+
		"\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000"+
		"\u0000\u0000\u0090\u0099\u0001\u0000\u0000\u0000\u0091\u0092\n\u0002\u0000"+
		"\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0098\u0003\u0016\u000b\u0003"+
		"\u0094\u0095\n\u0001\u0000\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096"+
		"\u0098\u0003\u0016\u000b\u0002\u0097\u0091\u0001\u0000\u0000\u0000\u0097"+
		"\u0094\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u0017\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u00a4\u0005\u0011\u0000\u0000\u009d\u00a4\u0005\r\u0000\u0000\u009e\u00a4"+
		"\u0005\u000e\u0000\u0000\u009f\u00a4\u0005\u0001\u0000\u0000\u00a0\u00a4"+
		"\u0005\u0002\u0000\u0000\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u00a4\u0003"+
		"\u0018\f\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000"+
		"\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0002"+
		"\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005(\u0000"+
		"\u0000\u00a8\u00ac\u0005*\u0000\u0000\u00a9\u00aa\u0005)\u0000\u0000\u00aa"+
		"\u00ac\u0005*\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0005#\u0000\u0000\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b1\u0005"+
		"\u000f\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\r\u0000\u0000\u00b5\u00c9\u0005$\u0000\u0000\u00b6\u00b9\u0005#\u0000"+
		"\u0000\u00b7\u00b8\u0005\u000e\u0000\u0000\u00b8\u00ba\u0005\u000f\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000e\u0000"+
		"\u0000\u00be\u00c9\u0005$\u0000\u0000\u00bf\u00c2\u0005#\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0010\u0000\u0000\u00c1\u00c3\u0005\u000f\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0010\u0000\u0000\u00c7"+
		"\u00c9\u0005$\u0000\u0000\u00c8\u00ad\u0001\u0000\u0000\u0000\u00c8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000\u0000\u00c9\u001f"+
		"\u0001\u0000\u0000\u0000\u00ca\u00d4\u0005\u0011\u0000\u0000\u00cb\u00d4"+
		"\u0005\u0010\u0000\u0000\u00cc\u00d4\u0005\u0012\u0000\u0000\u00cd\u00d4"+
		"\u0005\r\u0000\u0000\u00ce\u00d4\u0005\u000e\u0000\u0000\u00cf\u00d4\u0005"+
		"\u0001\u0000\u0000\u00d0\u00d4\u0005\u0002\u0000\u0000\u00d1\u00d4\u0003"+
		"\u001e\u000f\u0000\u00d2\u00d4\u0003\b\u0004\u0000\u00d3\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000\u0000\u00d3\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4!\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0003\u0000"+
		"\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0004\u0000\u0000"+
		"\u00d8%\u0001\u0000\u0000\u0000\u0013)0;GPTkx\u0081\u008f\u0097\u0099"+
		"\u00a3\u00ab\u00b2\u00bb\u00c4\u00c8\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}