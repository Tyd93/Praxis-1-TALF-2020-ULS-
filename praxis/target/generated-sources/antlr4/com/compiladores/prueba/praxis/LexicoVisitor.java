// Generated from com\compiladores\prueba\praxis\Lexico.g4 by ANTLR 4.5.1
package com.compiladores.prueba.praxis;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexicoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexicoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexicoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LexicoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LexicoParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LexicoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LexicoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(LexicoParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(LexicoParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(LexicoParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(LexicoParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LexicoParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LexicoParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#encambio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncambio(LexicoParser.EncambioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LexicoParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(LexicoParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LexicoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(LexicoParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LexicoParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LexicoParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexicoParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LexicoParser.StringContext ctx);
}