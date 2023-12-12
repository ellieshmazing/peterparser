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


    # Enter a parse tree produced by peterParser#ifblock.
    def enterIfblock(self, ctx:peterParser.IfblockContext):
        pass

    # Exit a parse tree produced by peterParser#ifblock.
    def exitIfblock(self, ctx:peterParser.IfblockContext):
        pass


    # Enter a parse tree produced by peterParser#elseblock.
    def enterElseblock(self, ctx:peterParser.ElseblockContext):
        pass

    # Exit a parse tree produced by peterParser#elseblock.
    def exitElseblock(self, ctx:peterParser.ElseblockContext):
        pass


    # Enter a parse tree produced by peterParser#elifblock.
    def enterElifblock(self, ctx:peterParser.ElifblockContext):
        pass

    # Exit a parse tree produced by peterParser#elifblock.
    def exitElifblock(self, ctx:peterParser.ElifblockContext):
        pass


    # Enter a parse tree produced by peterParser#whileblock.
    def enterWhileblock(self, ctx:peterParser.WhileblockContext):
        pass

    # Exit a parse tree produced by peterParser#whileblock.
    def exitWhileblock(self, ctx:peterParser.WhileblockContext):
        pass


    # Enter a parse tree produced by peterParser#forblock.
    def enterForblock(self, ctx:peterParser.ForblockContext):
        pass

    # Exit a parse tree produced by peterParser#forblock.
    def exitForblock(self, ctx:peterParser.ForblockContext):
        pass


    # Enter a parse tree produced by peterParser#body.
    def enterBody(self, ctx:peterParser.BodyContext):
        pass

    # Exit a parse tree produced by peterParser#body.
    def exitBody(self, ctx:peterParser.BodyContext):
        pass


    # Enter a parse tree produced by peterParser#conditional.
    def enterConditional(self, ctx:peterParser.ConditionalContext):
        pass

    # Exit a parse tree produced by peterParser#conditional.
    def exitConditional(self, ctx:peterParser.ConditionalContext):
        pass


    # Enter a parse tree produced by peterParser#conditionalval.
    def enterConditionalval(self, ctx:peterParser.ConditionalvalContext):
        pass

    # Exit a parse tree produced by peterParser#conditionalval.
    def exitConditionalval(self, ctx:peterParser.ConditionalvalContext):
        pass


    # Enter a parse tree produced by peterParser#conditionalop.
    def enterConditionalop(self, ctx:peterParser.ConditionalopContext):
        pass

    # Exit a parse tree produced by peterParser#conditionalop.
    def exitConditionalop(self, ctx:peterParser.ConditionalopContext):
        pass


    # Enter a parse tree produced by peterParser#comment.
    def enterComment(self, ctx:peterParser.CommentContext):
        pass

    # Exit a parse tree produced by peterParser#comment.
    def exitComment(self, ctx:peterParser.CommentContext):
        pass


    # Enter a parse tree produced by peterParser#list.
    def enterList(self, ctx:peterParser.ListContext):
        pass

    # Exit a parse tree produced by peterParser#list.
    def exitList(self, ctx:peterParser.ListContext):
        pass


    # Enter a parse tree produced by peterParser#rval.
    def enterRval(self, ctx:peterParser.RvalContext):
        pass

    # Exit a parse tree produced by peterParser#rval.
    def exitRval(self, ctx:peterParser.RvalContext):
        pass


    # Enter a parse tree produced by peterParser#arithop.
    def enterArithop(self, ctx:peterParser.ArithopContext):
        pass

    # Exit a parse tree produced by peterParser#arithop.
    def exitArithop(self, ctx:peterParser.ArithopContext):
        pass


    # Enter a parse tree produced by peterParser#asnop.
    def enterAsnop(self, ctx:peterParser.AsnopContext):
        pass

    # Exit a parse tree produced by peterParser#asnop.
    def exitAsnop(self, ctx:peterParser.AsnopContext):
        pass



del peterParser