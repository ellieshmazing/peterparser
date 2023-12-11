lexer grammar peterLexer;

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

fragment DIGIT : [0-9];
INTEGER : '-'? DIGIT+;
FLOAT : '-'? DIGIT* '.' DIGIT+;

fragment LETTER : [a-z] | [A-Z];
COMMA : ',';
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
GTE : '>=';
EQUIV : '==';
NEQUIV : '!=';

OPENBRACK : '[';
CLOSEBRACK : ']';
OPENPAREN : '(';
CLOSEPAREN : ')';

LINECMT : '#';
BLCKCMT : '\'\'\'';

SPACE : ' ' -> skip;
COLON : ':';
WHITESPACE : '\t';
NEWLINE : '\n';