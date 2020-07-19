grammar Lexico;

/* Gramaticas */
program: PROGRAM ID PABIERTO INPUT COMA OUTPUT PCERRADO
		SEMICOLON
		VAR
		declaracion*
		BEGIN 
		sentencia* 
		ENDP comentario*;
declaracion: variable+ COLON tipo SEMICOLON;
variable: COMA? ID;
tipo: REAL | INT;
sentencia: asignacion |funcion|mientras|si|encambio;
funcion: leer | escribir;
leer: READ PABIERTO ID PCERRADO SEMICOLON;
escribir: WRITELN PABIERTO ID PCERRADO SEMICOLON|
			WRITELN PABIERTO ID? COMA? string  COMA? ID? PCERRADO SEMICOLON;
mientras: WHILE NOT? FIN DO 
			BEGIN
			sentencia*
			END SEMICOLON comentario*;
si: IF condicion THEN BEGIN sentencia* END;
encambio: ELSE funcion SEMICOLON?;
condicion: ID NOT? comparacion ID | ID NOT? comparacion NUMERO;
comparacion: MAQ|MEQ|MAI|MEI;
asignacion: ID ASIGN NUMERO SEMICOLON | suma |division;
suma: ID ASIGN ID SUMA ID SEMICOLON |
		ID ASIGN ID SUMA NUMERO SEMICOLON;
division:ID ASIGN ID DIV ID SEMICOLON;
comentario: LLABIERTO WHILE LLACERRADO | LLABIERTO ID* LLACERRADO;
string: SABCERR  ID* COMA* ID* IGUAL? SABCERR;

/* Tokens de Pascal */
PROGRAM:'program';
INPUT:'input';
OUTPUT:'output';
BEGIN:'begin';
END:'end';
ENDP:'end.';
VAR:'var';

/* Tipos de datos */
REAL: 'real';
INT: 'integer';

/*Operaciones */
IF:'if';
ELSE:'else';
THEN:'then';
WHILE:'while';
ASIGN:':=';
SUMA:'+';
RESTA:'-';
MULT:'*';
DIV:'/';
MAQ:'>';
MEQ:'<';
MAI:'>=';
MEI:'<=';
FIN:'eof';
NOT:'not';
DO:'do';
IGUAL: '=';

/* Misc */
PABIERTO:'(';
PCERRADO:')';
LLABIERTO:'{';
LLACERRADO:'}';
SEMICOLON:';';
COMA:',';
COLON:':';
SABCERR: '\'';


/* Funciones */
READ:'read';
WRITELN:'writeln';

/* Exp. regulares */
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMERO: [0-9]+;

/* Ignorar espacios en blanco */
WS:[ \t\r\n]+ -> skip;