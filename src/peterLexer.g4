lexer grammar peterLexer;


// Keywords
TRUE : 'True';
FALSE : 'False';
IF : 'if';
ELSE : 'else';
ELIF : 'elif';
WHILE : 'while';
FOR : 'for';
AND : 'and';
OR : 'or';
NOT : 'not';
IN : 'in';
RANGE: 'range';

// Numbers
fragment DIGIT : [0-9];
INTEGER : '-'? DIGIT+;
FLOAT : '-'? DIGIT* '.' DIGIT+;

// Characters, identifiers, and strings
fragment LETTER : [a-z] | [A-Z];
COMMA : ',';
CHAR : '\'' LETTER '\'';
ID : (LETTER | DIGIT | '_')+;
STRING : '"' ~["]* '"';

// Arithmatic operators
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
MOD : '%';

// Assignment operators
ASN : '=';
ADDASN  : '+=';
SUBASN  : '-=';
MULTASN : '*=';
DIVASN : '/=';

// Logical operators
LT : '<';
LTE : '<=';
GT : '>';
GTE : '>=';
EQUIV : '==';
NEQUIV : '!=';

// Flow control symbols
OPENBRACK : '[';
CLOSEBRACK : ']';
OPENPAREN : '(';
CLOSEPAREN : ')';
COLON : ':';

// Comments
LINECMT : '#' ~[\n]*;
BLCKCMT : '\'\'\'' (~['] | '\'')*? '\'\'\'';

// Whitespace
NL : '\n';
WHITESPACE :  [ \t\r]+ -> skip;