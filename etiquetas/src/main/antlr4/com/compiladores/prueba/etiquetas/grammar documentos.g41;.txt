grammar documentos;

/* Gramaticas */
xml: inicio etiquetas*;

/* inicio: EOPEN QRAIZ XML VERSION ASIGN  INISTRING real INISTRING 
		atributo* QRAIZ ECLOSE; */
inicio:	EOPEN QRAIZ XML VERSION ASIGN STRING 
		atributo* QRAIZ ECLOSE;
		
/* Etiquetas: <> poisbles otras etiquetas, posible texto </> */
etiquetas: 	etiqueta|
            etiqueta STRING
		;

/*
 * etiquetas: 	etiunica|
			etiabierta STRING? eticerrada|
			etiabierta etiquetas eticerrada;   
 */
			
/* Probando etiqueta */
etiqueta:EOPEN CORTE? ID atributo* CORTE? ECLOSE;


/*
 * etiunica: EOPEN ID atributo* CORTE ECLOSE;
	etiabierta: EOPEN ID atributo* ECLOSE;
	eticerrada: EOPEN CORTE ID ECLOSE; 
 */

/* DEFINIR strings */
/* PODRIA REESCRIBIR ATRIBUTO */
atributo: ID ASIGN STRING;

/* string: '"'(.*)'"'; */
/* real: NUMBER decimal?; */
/* decimal: DOT NUMBER; */

/* Tokens */


/* MISC */
INISTRING: '"';
ASIGN: '=';
EOPEN: '<';
ECLOSE: '>';
CORTE: '/';
QRAIZ: '?';
DOT:'.';
XML: ('xml');
VERSION: ('version');
/* Probar PARRAFO; no funcionaaa */
/* PARRAFO: (~'<')+; */
STRING: ('"'(.*?)'"');
NUMBER: [0-9]+;
ID: [a-zA-Z0-9]+;

WS:	[ \t\r\n]+ -> skip;