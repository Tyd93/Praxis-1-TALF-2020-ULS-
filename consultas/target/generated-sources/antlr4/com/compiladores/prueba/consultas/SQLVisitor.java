// Generated from com\compiladores\prueba\consultas\SQL.g4 by ANTLR 4.5.1
package com.compiladores.prueba.consultas;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#seleccionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar(SQLParser.SeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#borrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorrar(SQLParser.BorrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#actualizar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizar(SQLParser.ActualizarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#crear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrear(SQLParser.CrearContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabla(SQLParser.TablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(SQLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(SQLParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(SQLParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(SQLParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrden(SQLParser.OrdenContext ctx);
}