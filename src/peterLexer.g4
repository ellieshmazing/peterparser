lexer grammar peterLexer;

fragment COMMA : ',';
SERIAL : COMMA SPACE;

fragment DIGIT : [0-9];
INTEGER : DIGIT+;
FLOAT : DIGIT* '.' DIGIT+;

fragment LETTER : [a-z] | [A-Z];
CHAR : '\'' LETTER '\'';
ID : (LETTER | DIGIT | '_')+;
STRING : '"' ~["]* '"';

ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
MOD : '%';

ASN : '=';
ADDASN  : '+=';
SUBASN  : '-=';
MULTASN : '*=';
DIVASN : '/=';

LT : '<';
LTE : '<=';
GT : '>';
GTE : '>+';
EQUIV : '==';
NEQUIV : '!=';

IF : 'if';
ELSE : 'else';
ELIF : 'elif';
WHILE : 'while';
FOR : 'for';
AND : 'and';
OR : 'or';
NOT : 'not';

OPENBRACK : '[';
CLOSEBRACK : ']';
OPENPAREN : '(';
CLOSEPAREN : ')';

LINECMT : '#';
BLCKCMT : '\'\'\'';

SPACE : ' ';
WHITESPACE : '\t';
NEWLINE : '\n';