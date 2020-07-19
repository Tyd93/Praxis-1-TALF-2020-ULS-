grammar SQL;

/* Gramaticas */
/*	 	Seleccionar
 * 		Borrar
 * 		Actualizar
 * 		Crear
 */	
query: seleccionar|borrar|actualizar|crear;

/*
 * SELECT columnas FROM tablas
 * WHERE condicion (opcional)
 * GROUP BY condicion (opcional)
 * ORDER
 */
seleccionar:	SELECT columna+ FROM tabla+
				where? order? SEMICOLON;
				
borrar: DELETE FROM tabla+ 
		where? SEMICOLON;

actualizar: UPDATE tabla SET (columna IGUAL (STRING|ID) COMA?)+
			where SEMICOLON; 
			
crear: CREATE TABLE tabla PAROPEN (declarar COMA?)+ PARCLOSE SEMICOLON;

columna: ALL | ID COMA?;
tabla: ID | ID COMA?;

/* Argumentos */
/* Mas de una condicion(?) */
where: WHERE (columna logico (STRING|ID) COMA?)+;
order: ORDER (columna orden COMA?)+;
logico: IGUAL|MENOR|MAYOR|MEIGUAL|MAIGUAL;
/* var: CHAR|VARCHAR|INT; */
declarar: ID ID;
orden: ASC|DESC;

/* Tokens */
SELECT: 'SELECT';
FROM: 'FROM';
DELETE: 'DELETE';
WHERE: 'WHERE';
CREATE: 'CREATE';
ORDER:'ORDER_BY';
UPDATE: 'UPDATE';
TABLE:'TABLE';
SET: 'SET';
ASC:'ASC';
DESC:'DESC';

/* MISC */
ID:[a-zA-Z0-9_]+;
COMA:',';
ALL:'*';
PAROPEN: '(';
PARCLOSE: ')';
SEMICOLON:';';
STRING: ('\'')(.*?)('\'');

/* LOGICOS */
IGUAL: '=';
MENOR: '<';
MAYOR: '>';
MEIGUAL: '<=';
MAIGUAL: '>=';

/* TIPO VARIABLE */
/* CHAR: 'CHAR';
VARCHAR: 'VARCHAR';
INT: 'INT'; */

WS: [ \t\r\n]+ -> skip;