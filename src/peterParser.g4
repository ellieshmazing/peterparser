parser grammar peterParser;

options {
    tokenVocab = peterLexer;
}

// Root of file parsing, breaking into contiguous blocks of code
start_
    : block+ EOF
    ;

// Code "paragraph" comprised of statements
block
    : statement+ (NL | EOF)
    ;

// Individual lines, either variable modification or a control structure
statement
    : assignment (NL | EOF)
    | comment
    | ifblock
    | whileblock
    | forblock
    ;

// Assignment requires an identifier, assignment operator, and a right value (which can be a wide variety of things)
assignment
    : ID asnop rval
    ;

// Mathematical expression, combining two values with an arithmatic operator
expr
    : (ID | INTEGER | FLOAT) arithop (ID | INTEGER | FLOAT | expr)
    ;

// Head of if block
ifblock
    : IF conditional COLON body elifblock* elseblock?
    ;

// Else block (These are separated from if mostly for readability)
elseblock
    : ELSE COLON body
    ;

// Elif block
elifblock
    : ELIF conditional COLON body
    ;

// While block, with parentheses and not
whileblock
    : WHILE conditional COLON body
    | WHILE OPENPAREN conditional CLOSEPAREN COLON body
    ;

// For block
forblock
    : FOR ID IN (ID | list | RANGE OPENPAREN INTEGER COMMA INTEGER CLOSEPAREN) COLON body
    ;

// Body for all control structures, comprised of at least one statement
body
    : NL statement+ 
    ;

// Conditional statements within control structure
conditional
    : TRUE 
    | FALSE 
    | ID
    | OPENPAREN conditionalval CLOSEPAREN
    | conditionalval conditionalop conditionalval 
    | conditional AND conditional
    | conditional OR conditional
    ;

// Atomic values of conditional statements
conditionalval
    : ID
    | INTEGER
    | FLOAT
    | TRUE
    | FALSE
    | NOT conditionalval
    ;

// Conditional operators
conditionalop
    : LT
    | LTE
    | GT
    | GTE
    | EQUIV
    | NEQUIV
    ;

// Line and block comments
comment
    : LINECMT NL
    | BLCKCMT NL
    ;

// Type-exclusive lists
list
    : OPENBRACK (INTEGER COMMA)+ INTEGER CLOSEBRACK
    | OPENBRACK (FLOAT COMMA)+ FLOAT CLOSEBRACK
    | OPENBRACK (CHAR COMMA)+ CHAR CLOSEBRACK
    ;

// Rightvalues
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

// Arithmatic operators
arithop
    : ADD
    | SUB
    | MULT
    | DIV
    | MOD
    ;

// Assignment operators
asnop
    : ASN
    | ADDASN
    | SUBASN
    | MULTASN
    | DIVASN
    ;