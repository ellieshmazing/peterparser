# Generated from peterParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .peterParser import peterParser
else:
    from peterParser import peterParser

# This class defines a complete listener for a parse tree produced by peterParser.
class peterParserListener(ParseTreeListener):

    # Enter a parse tree produced by peterParser#start_.
    def enterStart_(self, ctx:peterParser.Start_Context):
        pass

    # Exit a parse tree produced by peterParser#start_.
    def exitStart_(self, ctx:peterParser.Start_Context):
        pass


    # Enter a parse tree produced by peterParser#block.
    def enterBlock(self, ctx:peterParser.BlockContext):
        pass

    # Exit a parse tree produced by peterParser#block.
    def exitBlock(self, ctx:peterParser.BlockContext):
        pass


    # Enter a parse tree produced by peterParser#statement.
    def enterStatement(self, ctx:peterParser.StatementContext):
        pass

    # Exit a parse tree produced by peterParser#statement.
    def exitStatement(self, ctx:peterParser.StatementContext):
        pass


    # Enter a parse tree produced by peterParser#assignment.
    def enterAssignment(self, ctx:peterParser.AssignmentContext):
        pass

    # Exit a parse tree produced by peterParser#assignment.
    def exitAssignment(self, ctx:peterParser.AssignmentContext):
        pass


    # Enter a parse tree produced by peterParser#expr.
    def enterExpr(self, ctx:peterParser.ExprContext):
        pass

    # Exit a parse tree produced by peterParser#expr.
    def exitExpr(self, ctx:peterParser.ExprContext):
        pass


    # Enter a parse tree produced by peterParser#list.
    def enterList(self, ctx:peterParser.ListContext):
        pass

    # Exit a parse tree produced by peterParser#list.
    def exitList(self, ctx:peterParser.ListContext):
        pass



del peterParser