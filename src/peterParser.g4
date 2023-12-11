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
    | ifblock
    ;

assignment
    : ID  asnop rval
    ;

expr
    : (ID | INTEGER | FLOAT) arithop (ID | INTEGER | FLOAT | expr)
    ;

ifblock
    : IF conditional COLON NEWLINE body (ELIF conditional COLON NEWLINE body)* (ELSE COLON NEWLINE body)? (NEWLINE | EOF)
    ;

body
    : (WHITESPACE statement)+
    ;

conditional
    : TRUE 
    | FALSE 
    | ID
    | OPENPAREN conditionalval CLOSEPAREN
    | conditionalval conditionalop conditionalval 
    | conditional AND conditional
    | conditional OR conditional
    ;

conditionalval
    : ID
    | INTEGER
    | FLOAT
    | TRUE
    | FALSE
    | NOT conditionalval
    ;

conditionalop
    : LT
    | LTE
    | GT
    | GTE
    | EQUIV
    | NEQUIV
    ;

list
    : OPENBRACK (INTEGER COMMA)+ INTEGER CLOSEBRACK
    | OPENBRACK (FLOAT COMMA)+ FLOAT CLOSEBRACK
    | OPENBRACK (CHAR COMMA)+ CHAR CLOSEBRACK
    ;

rval
    : ID
    | CHAR
    | STRING
    | INTEGER
    | FLOAT
    | TRUE
    | FALSE
    | list
    | expr
    ;

arithop
    : ADD
    | SUB
    | MULT
    | DIV
    | MOD
    ;

asnop
    : ASN
    | ADDASN
    | SUBASN
    | MULTASN
    | DIVASN
    ;