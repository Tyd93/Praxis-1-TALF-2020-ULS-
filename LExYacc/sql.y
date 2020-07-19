%{
#include<stdio.h>
#include<stdlib.h>
int yylex();
void yyerror(char *s);
%}

%union {char *id;}
%start query
%token DELETE
%token FROM
%token WHERE
%token exit_command
%token <id> DATO


%%
query	: delete ';'			{printf("Borrando. Ahora escondete\n");}
		| delete where ';'		{printf("Borrando.\n");}
		| exit_command	';'		{exit(EXIT_SUCCESS);}
		| query delete ';'		{printf("Borrando. Ahora escondete\n");}
		| query delete where ';'{printf("Borrando.\n");}
		| query exit_command';' {exit(EXIT_SUCCESS);}
		;
delete	: DELETE FROM DATO
		;
where	: WHERE DATO '=' '\''DATO'\''
		;
%%

int main(void) {

	return yyparse();
}

void yyerror (char *s) {fprintf (stderr, "%s\n", s);} 