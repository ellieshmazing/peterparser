# Generated from peterParser.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,41,80,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,4,
        0,14,8,0,11,0,12,0,15,1,0,1,0,1,1,4,1,21,8,1,11,1,12,1,22,1,1,1,
        1,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,41,
        8,3,1,4,1,4,1,4,1,4,1,4,1,4,3,4,49,8,4,1,5,1,5,1,5,4,5,54,8,5,11,
        5,12,5,55,1,5,1,5,1,5,1,5,1,5,4,5,63,8,5,11,5,12,5,64,1,5,1,5,1,
        5,1,5,1,5,4,5,72,8,5,11,5,12,5,73,1,5,1,5,3,5,78,8,5,1,5,0,0,6,0,
        2,4,6,8,10,0,4,1,1,41,41,1,0,22,26,2,0,11,12,15,15,1,0,17,21,91,
        0,13,1,0,0,0,2,20,1,0,0,0,4,26,1,0,0,0,6,29,1,0,0,0,8,42,1,0,0,0,
        10,77,1,0,0,0,12,14,3,2,1,0,13,12,1,0,0,0,14,15,1,0,0,0,15,13,1,
        0,0,0,15,16,1,0,0,0,16,17,1,0,0,0,17,18,5,0,0,1,18,1,1,0,0,0,19,
        21,3,4,2,0,20,19,1,0,0,0,21,22,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,
        0,23,24,1,0,0,0,24,25,7,0,0,0,25,3,1,0,0,0,26,27,3,6,3,0,27,28,7,
        0,0,0,28,5,1,0,0,0,29,30,5,15,0,0,30,40,7,1,0,0,31,41,5,15,0,0,32,
        41,5,14,0,0,33,41,5,16,0,0,34,41,5,11,0,0,35,41,5,12,0,0,36,41,5,
        1,0,0,37,41,5,2,0,0,38,41,3,10,5,0,39,41,3,8,4,0,40,31,1,0,0,0,40,
        32,1,0,0,0,40,33,1,0,0,0,40,34,1,0,0,0,40,35,1,0,0,0,40,36,1,0,0,
        0,40,37,1,0,0,0,40,38,1,0,0,0,40,39,1,0,0,0,41,7,1,0,0,0,42,43,7,
        2,0,0,43,48,7,3,0,0,44,49,5,15,0,0,45,49,5,11,0,0,46,49,5,12,0,0,
        47,49,3,8,4,0,48,44,1,0,0,0,48,45,1,0,0,0,48,46,1,0,0,0,48,47,1,
        0,0,0,49,9,1,0,0,0,50,53,5,33,0,0,51,52,5,11,0,0,52,54,5,13,0,0,
        53,51,1,0,0,0,54,55,1,0,0,0,55,53,1,0,0,0,55,56,1,0,0,0,56,57,1,
        0,0,0,57,58,5,11,0,0,58,78,5,34,0,0,59,62,5,33,0,0,60,61,5,12,0,
        0,61,63,5,13,0,0,62,60,1,0,0,0,63,64,1,0,0,0,64,62,1,0,0,0,64,65,
        1,0,0,0,65,66,1,0,0,0,66,67,5,12,0,0,67,78,5,34,0,0,68,71,5,33,0,
        0,69,70,5,14,0,0,70,72,5,13,0,0,71,69,1,0,0,0,72,73,1,0,0,0,73,71,
        1,0,0,0,73,74,1,0,0,0,74,75,1,0,0,0,75,76,5,14,0,0,76,78,5,34,0,
        0,77,50,1,0,0,0,77,59,1,0,0,0,77,68,1,0,0,0,78,11,1,0,0,0,8,15,22,
        40,48,55,64,73,77
    ]

class peterParser ( Parser ):

    grammarFileName = "peterParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'True'", "'False'", "'if'", "'else'", 
                     "'elif'", "'while'", "'for'", "'and'", "'or'", "'not'", 
                     "<INVALID>", "<INVALID>", "','", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
                     "'+='", "'-='", "'*='", "'/='", "'<'", "'<='", "'>'", 
                     "'>+'", "'=='", "'!='", "'['", "']'", "'('", "')'", 
                     "'#'", "'''''", "' '", "'\\t'", "'\\n'" ]

    symbolicNames = [ "<INVALID>", "TRUE", "FALSE", "IF", "ELSE", "ELIF", 
                      "WHILE", "FOR", "AND", "OR", "NOT", "INTEGER", "FLOAT", 
                      "COMMA", "CHAR", "ID", "STRING", "ADD", "SUB", "MULT", 
                      "DIV", "MOD", "ASN", "ADDASN", "SUBASN", "MULTASN", 
                      "DIVASN", "LT", "LTE", "GT", "GTE", "EQUIV", "NEQUIV", 
                      "OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", 
                      "LINECMT", "BLCKCMT", "SPACE", "WHITESPACE", "NEWLINE" ]

    RULE_start_ = 0
    RULE_block = 1
    RULE_statement = 2
    RULE_assignment = 3
    RULE_expr = 4
    RULE_list = 5

    ruleNames =  [ "start_", "block", "statement", "assignment", "expr", 
                   "list" ]

    EOF = Token.EOF
    TRUE=1
    FALSE=2
    IF=3
    ELSE=4
    ELIF=5
    WHILE=6
    FOR=7
    AND=8
    OR=9
    NOT=10
    INTEGER=11
    FLOAT=12
    COMMA=13
    CHAR=14
    ID=15
    STRING=16
    ADD=17
    SUB=18
    MULT=19
    DIV=20
    MOD=21
    ASN=22
    ADDASN=23
    SUBASN=24
    MULTASN=25
    DIVASN=26
    LT=27
    LTE=28
    GT=29
    GTE=30
    EQUIV=31
    NEQUIV=32
    OPENBRACK=33
    CLOSEBRACK=34
    OPENPAREN=35
    CLOSEPAREN=36
    LINECMT=37
    BLCKCMT=38
    SPACE=39
    WHITESPACE=40
    NEWLINE=41

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Start_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(peterParser.EOF, 0)

        def block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(peterParser.BlockContext)
            else:
                return self.getTypedRuleContext(peterParser.BlockContext,i)


        def getRuleIndex(self):
            return peterParser.RULE_start_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart_" ):
                listener.enterStart_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart_" ):
                listener.exitStart_(self)




    def start_(self):

        localctx = peterParser.Start_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start_)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 12
                self.block()
                self.state = 15 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==15):
                    break

            self.state = 17
            self.match(peterParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEWLINE(self):
            return self.getToken(peterParser.NEWLINE, 0)

        def EOF(self):
            return self.getToken(peterParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(peterParser.StatementContext)
            else:
                return self.getTypedRuleContext(peterParser.StatementContext,i)


        def getRuleIndex(self):
            return peterParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)




    def block(self):

        localctx = peterParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 19
                self.statement()
                self.state = 22 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==15):
                    break

            self.state = 24
            _la = self._input.LA(1)
            if not(_la==-1 or _la==41):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(peterParser.AssignmentContext,0)


        def NEWLINE(self):
            return self.getToken(peterParser.NEWLINE, 0)

        def EOF(self):
            return self.getToken(peterParser.EOF, 0)

        def getRuleIndex(self):
            return peterParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = peterParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.assignment()
            self.state = 27
            _la = self._input.LA(1)
            if not(_la==-1 or _la==41):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.ID)
            else:
                return self.getToken(peterParser.ID, i)

        def ASN(self):
            return self.getToken(peterParser.ASN, 0)

        def ADDASN(self):
            return self.getToken(peterParser.ADDASN, 0)

        def SUBASN(self):
            return self.getToken(peterParser.SUBASN, 0)

        def MULTASN(self):
            return self.getToken(peterParser.MULTASN, 0)

        def DIVASN(self):
            return self.getToken(peterParser.DIVASN, 0)

        def CHAR(self):
            return self.getToken(peterParser.CHAR, 0)

        def STRING(self):
            return self.getToken(peterParser.STRING, 0)

        def INTEGER(self):
            return self.getToken(peterParser.INTEGER, 0)

        def FLOAT(self):
            return self.getToken(peterParser.FLOAT, 0)

        def TRUE(self):
            return self.getToken(peterParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(peterParser.FALSE, 0)

        def list_(self):
            return self.getTypedRuleContext(peterParser.ListContext,0)


        def expr(self):
            return self.getTypedRuleContext(peterParser.ExprContext,0)


        def getRuleIndex(self):
            return peterParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = peterParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_assignment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(peterParser.ID)
            self.state = 30
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 130023424) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 40
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 31
                self.match(peterParser.ID)
                pass

            elif la_ == 2:
                self.state = 32
                self.match(peterParser.CHAR)
                pass

            elif la_ == 3:
                self.state = 33
                self.match(peterParser.STRING)
                pass

            elif la_ == 4:
                self.state = 34
                self.match(peterParser.INTEGER)
                pass

            elif la_ == 5:
                self.state = 35
                self.match(peterParser.FLOAT)
                pass

            elif la_ == 6:
                self.state = 36
                self.match(peterParser.TRUE)
                pass

            elif la_ == 7:
                self.state = 37
                self.match(peterParser.FALSE)
                pass

            elif la_ == 8:
                self.state = 38
                self.list_()
                pass

            elif la_ == 9:
                self.state = 39
                self.expr()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.ID)
            else:
                return self.getToken(peterParser.ID, i)

        def INTEGER(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.INTEGER)
            else:
                return self.getToken(peterParser.INTEGER, i)

        def FLOAT(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.FLOAT)
            else:
                return self.getToken(peterParser.FLOAT, i)

        def ADD(self):
            return self.getToken(peterParser.ADD, 0)

        def SUB(self):
            return self.getToken(peterParser.SUB, 0)

        def MULT(self):
            return self.getToken(peterParser.MULT, 0)

        def DIV(self):
            return self.getToken(peterParser.DIV, 0)

        def MOD(self):
            return self.getToken(peterParser.MOD, 0)

        def expr(self):
            return self.getTypedRuleContext(peterParser.ExprContext,0)


        def getRuleIndex(self):
            return peterParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = peterParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 38912) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 43
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4063232) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 48
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 44
                self.match(peterParser.ID)
                pass

            elif la_ == 2:
                self.state = 45
                self.match(peterParser.INTEGER)
                pass

            elif la_ == 3:
                self.state = 46
                self.match(peterParser.FLOAT)
                pass

            elif la_ == 4:
                self.state = 47
                self.expr()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPENBRACK(self):
            return self.getToken(peterParser.OPENBRACK, 0)

        def INTEGER(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.INTEGER)
            else:
                return self.getToken(peterParser.INTEGER, i)

        def CLOSEBRACK(self):
            return self.getToken(peterParser.CLOSEBRACK, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.COMMA)
            else:
                return self.getToken(peterParser.COMMA, i)

        def FLOAT(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.FLOAT)
            else:
                return self.getToken(peterParser.FLOAT, i)

        def CHAR(self, i:int=None):
            if i is None:
                return self.getTokens(peterParser.CHAR)
            else:
                return self.getToken(peterParser.CHAR, i)

        def getRuleIndex(self):
            return peterParser.RULE_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList" ):
                listener.enterList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList" ):
                listener.exitList(self)




    def list_(self):

        localctx = peterParser.ListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_list)
        try:
            self.state = 77
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 50
                self.match(peterParser.OPENBRACK)
                self.state = 53 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 51
                        self.match(peterParser.INTEGER)
                        self.state = 52
                        self.match(peterParser.COMMA)

                    else:
                        raise NoViableAltException(self)
                    self.state = 55 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

                self.state = 57
                self.match(peterParser.INTEGER)
                self.state = 58
                self.match(peterParser.CLOSEBRACK)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 59
                self.match(peterParser.OPENBRACK)
                self.state = 62 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 60
                        self.match(peterParser.FLOAT)
                        self.state = 61
                        self.match(peterParser.COMMA)

                    else:
                        raise NoViableAltException(self)
                    self.state = 64 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

                self.state = 66
                self.match(peterParser.FLOAT)
                self.state = 67
                self.match(peterParser.CLOSEBRACK)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 68
                self.match(peterParser.OPENBRACK)
                self.state = 71 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 69
                        self.match(peterParser.CHAR)
                        self.state = 70
                        self.match(peterParser.COMMA)

                    else:
                        raise NoViableAltException(self)
                    self.state = 73 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

                self.state = 75
                self.match(peterParser.CHAR)
                self.state = 76
                self.match(peterParser.CLOSEBRACK)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





