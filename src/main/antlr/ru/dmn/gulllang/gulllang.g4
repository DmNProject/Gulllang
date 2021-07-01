grammar gulllang;

@header {
 package ru.dmn.gulllang;
}

/*
*/

expression
 : OPEN expression CLOSE
 | OB expression CB
 | OB state CB
 ;

state
 : OPEN state CLOSE
 | OB state ret CB
 | call
 | VALUE
 ;

/*
*/

call
 : IDENTIFIER args
 ;

fun
 : FUN IDENTIFIER ASSIGN expression
 | FUN IDENTIFIER ASSIGN state
 | FUN IDENTIFIER COLON IDENTIFIER ASSIGN expression
 | FUN IDENTIFIER COLON IDENTIFIER ASSIGN state
 | FUN IDENTIFIER args ASSIGN expression
 | FUN IDENTIFIER args ASSIGN state
 | FUN IDENTIFIER args COLON IDENTIFIER ASSIGN expression
 | FUN IDENTIFIER args COLON IDENTIFIER ASSIGN state
 ;

ret
 : RETURN
 | RETURN state
 ;

args
 : (state (state) *)
 | OPEN (state (state) *) CLOSE
 ;

/*
ОБОБЩЕНИЯ
*/

VALUE
 : IDENTIFIER
 | NULL
 | BOOL
 | INT
 | DOUBLE
 | STRING
 ;

/*
ОПЕРАЦИИ
*/

FUN
 : 'fun'
 | 'function'
 ;

RETURN
 : 'return'
 ;

/*
МАТ/ЛОГ ОПЕРАЦИИ
*/

ASSIGN
 : '='
 ;
PLUS
 : '+'
 ;
MINUS
 : '-'
 ;
MUL
 : '*'
 ;
DIV
 : '/'
 ;
NOT
 : '!'
 ;
AND
 : '&&'
 ;
OR
 : '||'
 ;
EQ
 : '=='
 ;
NE
 : '!='
 ;
DIFFERENT
 : '<>'
 ;
LESS_SIGN
 : '<'
 ;
LESS_EQUALS_SIGN
 : '<='
 ;
GREATER_SIGN
 : '>'
 ;
GREATER_EQUALS_SIGN
 : '>='
 ;

/*
ВСЯКАЯ ХРЕНЬ
*/

PP
 : '#'
 ;
NSD
 : '\\'
 ;
REF
 : '->'
 ;
ANNOTATION
 : '@'
 ;
ACCESS
 : '.'
 ;
COMPANION_ACCESS
 : '::'
 ;
COLON
 : ':'
 ;
OPEN
 : '('
 ;
CLOSE
 : ')'
 ;
SEMI
 : ';'
 ;
COMMA
 : ','
 ;
OSB
 : '['
 ;
CSB
 : ']'
 ;
OB
 : '{'
 | 'then'
 | 'do'
 ;
CB
 : '}'
 | 'end'
 ;

/*
ЗНАЧЕНИЯ
*/

IDENTIFIER
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

NULL
 : 'null'
 | 'nil'
 ;

BOOL
 : 'true'
 | 'false'
 ;

INT
 : [0-9]+
 ;

DOUBLE
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '\\"')* '"'
 ;

/*
ПРОЧАЯ ХРЕНЬ
*/

COMMENT0
 : '//' ~[\t\r\n] -> skip
 ;

COMMENT1
 : '/*' (~["\r\n] | '\\"')* '*/'
 ;

SPACE
 : [\t\r\n] -> skip
 ;

OTHER
 :
 .
 ;