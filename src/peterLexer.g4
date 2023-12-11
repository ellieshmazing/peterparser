lexer grammar peterLexer;

fragment DIGIT : [0-9];
INTEGER : DIGIT+;
FLOAT : DIGIT* '.' DIGIT+;

fragment LETTER : [a-z] | [A-Z];
ID : (LETTER | DIGIT | '_')+;

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

LINECMT : '#';
BLCKCMT : '\'\'\'';

WHITESPACE : '\t';
NEWLINE : '\n';