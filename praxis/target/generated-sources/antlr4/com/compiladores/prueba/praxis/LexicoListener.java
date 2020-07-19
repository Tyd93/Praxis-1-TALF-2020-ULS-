// Generated from Lexico.g4 by ANTLR 4.4
package com.compiladores.prueba.praxis;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexicoParser}.
 */
public interface LexicoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexicoParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(@NotNull LexicoParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(@NotNull LexicoParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull LexicoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull LexicoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LexicoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LexicoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull LexicoParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull LexicoParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull LexicoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull LexicoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LexicoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LexicoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(@NotNull LexicoParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(@NotNull LexicoParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(@NotNull LexicoParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(@NotNull LexicoParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull LexicoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull LexicoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull LexicoParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull LexicoParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(@NotNull LexicoParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(@NotNull LexicoParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(@NotNull LexicoParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(@NotNull LexicoParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull LexicoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull LexicoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LexicoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LexicoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull LexicoParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull LexicoParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull LexicoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull LexicoParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(@NotNull LexicoParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(@NotNull LexicoParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexicoParser#encambio}.
	 * @param ctx the parse tree
	 */
	void enterEncambio(@NotNull LexicoParser.EncambioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexicoParser#encambio}.
	 * @param ctx the parse tree
	 */
	void exitEncambio(@NotNull LexicoParser.EncambioContext ctx);
}