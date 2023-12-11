parser grammar peterParser;

options {
    tokenVocab = peterLexer;
}

start_
    : block+
    ;

block
    : statement+ (NEWLINE | EOF)
    ;

statement
    : assignment (NEWLINE | EOF)
    ;

assignment
    : ID SPACE (ASN | ADDASN | SUBASN | MULTASN | DIVASN) SPACE (ID | CHAR | STRING | INTEGER | FLOAT | list | expr)
    ;

expr
    : (ID | INTEGER | FLOAT) SPACE (ADD | SUB | MULT | DIV | MOD) SPACE (ID | INTEGER | FLOAT | expr)
    ;

list
    : OPENBRACK (INTEGER SERIAL)+ INTEGER CLOSEBRACK
    | OPENBRACK (FLOAT SERIAL)+ FLOAT CLOSEBRACK
    | OPENBRACK (CHAR SERIAL)+ CHAR CLOSEBRACK
    ;