# peterparser

This is my implementation of the parser project for the Fall '23 semester of POPL.

The only group member is me, Ellie Nash :)
My grade for myself is 30/30 :)

This repository is a rudimentary Python parser, which can handle most of its 
basic functions and structures. It takes a .py file as input and generates 
a parse tree in accordance with Python's syntactical rules. The bulk of my work 
was in creating the lexer and parser, which are titled "peterLexer.g4" and "peterParser.g4,"
respectively. Most of the rest of the files in /src were automatically generated by
the antlr4 library. The visualization is accomplished with the "ANTLR4 grammar syntax support" 
extension for VSCode. It is technically for debugging, but it had the prettiest formatting 
I could find so ¯\_(ツ)_/¯
The parser implements all expected features and passes every test case for each deliverable.

REQUIREMENTS:
-VSCode with the Antlr4 grammar syntax support extension
-Python3 with antlr4 (the necessary modules can be installed by running build.sh)

USAGE:
-Modify launch.json to the desired input file (by default, it's set to the third deliverable file)
-Click Run -> Start Debugging
-A new window should open displaying the parse tree (the cluster option is most easily deciphered)