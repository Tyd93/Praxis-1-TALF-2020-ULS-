/* 
* Analizador lexico para una sentencia de DELETE
* basica en conjunto con BISON.
* Por Sebastian Urrutia
*/

%{
	#include "sql.tab.h"
	void yyerror(char *s);
	int yylex();
%}

ID 			[a-zA-Z_]+

%%
"DELETE"		{return DELETE;}
"FROM"			{return FROM;}
"WHERE"			{return WHERE;}
"exit"			{return exit_command;}
{ID}			{yylval.id=strdup(yytext);return DATO;} 
[ \t\r\n]		;
[=;']			{return yytext[0];}
.				{ECHO; yyerror("Caracter invalido\n");}
	
%%
int yywrap(void) {return 1;}