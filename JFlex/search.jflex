%%
%class search /* Nombre que tendra el archivo JAVA */
%standalone /* Significa que el MAIN se implementara aca */
%line
%column

/*TOKENS*/
WS= [ \t\r\n]+
%%
(a|b)*abb	{System.out.printf("Se encontro [%s] en la linea %d, columna %d \n", yytext()
			,yyline,yycolumn);}
			
{WS}		{/* Ignorar */}
.			{/* Ignorar */}