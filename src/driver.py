import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from peterLexer import peterLexer
from peterParser import peterParser

def main(argv):
    fs = FileStream(argv[1])
    lexer = peterLexer(fs)
    stream = CommonTokenStream(lexer)
    parser = peterParser(stream)
    tree = parser.start_()
    
    print(Trees.toStringTree(tree, None, parser))

    

if __name__ == '__main__':
    main(sys.argv)