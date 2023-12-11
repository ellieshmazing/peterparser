parser grammar peterParser;

options {
    tokenVocab = peterLexer;
}

start_
    : block+ EOF
    ;

block
    : statement+ (NEWLINE | EOF)
    ;

statement
    : assignment (NEWLINE | EOF)
    ;

assignment
    : ID  (ASN | ADDASN | SUBASN | MULTASN | DIVASN) (ID | CHAR | STRING | INTEGER | FLOAT | TRUE | FALSE | list | expr)
    ;

expr
    : (ID | INTEGER | FLOAT) (ADD | SUB | MULT | DIV | MOD) (ID | INTEGER | FLOAT | expr)
    ;

list
    : OPENBRACK (INTEGER COMMA)+ INTEGER CLOSEBRACK
    | OPENBRACK (FLOAT COMMA)+ FLOAT CLOSEBRACK
    | OPENBRACK (CHAR COMMA)+ CHAR CLOSEBRACK
    ;