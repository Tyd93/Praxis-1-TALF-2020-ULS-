// Generated from com\compiladores\prueba\consultas\SQL.g4 by ANTLR 4.5.1
package com.compiladores.prueba.consultas;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar(SQLParser.SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar(SQLParser.SeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#borrar}.
	 * @param ctx the parse tree
	 */
	void enterBorrar(SQLParser.BorrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#borrar}.
	 * @param ctx the parse tree
	 */
	void exitBorrar(SQLParser.BorrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void enterActualizar(SQLParser.ActualizarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void exitActualizar(SQLParser.ActualizarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#crear}.
	 * @param ctx the parse tree
	 */
	void enterCrear(SQLParser.CrearContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#crear}.
	 * @param ctx the parse tree
	 */
	void exitCrear(SQLParser.CrearContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tabla}.
	 * @param ctx the parse tree
	 */
	void enterTabla(SQLParser.TablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tabla}.
	 * @param ctx the parse tree
	 */
	void exitTabla(SQLParser.TablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(SQLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(SQLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(SQLParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(SQLParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(SQLParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(SQLParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(SQLParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(SQLParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orden}.
	 * @param ctx the parse tree
	 */
	void enterOrden(SQLParser.OrdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orden}.
	 * @param ctx the parse tree
	 */
	void exitOrden(SQLParser.OrdenContext ctx);
}