parser grammar peterParser;

root
    : block+
    ;

block
    : statement+ (NEWLINE | EOF)
    ;

statement
    : expr NEWLINE
    ;

