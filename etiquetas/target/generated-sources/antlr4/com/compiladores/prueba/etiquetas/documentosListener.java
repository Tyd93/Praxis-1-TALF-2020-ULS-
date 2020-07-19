// Generated from documentos.g4 by ANTLR 4.4
package com.compiladores.prueba.etiquetas;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link documentosParser}.
 */
public interface documentosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link documentosParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta(@NotNull documentosParser.EtiquetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link documentosParser#etiqueta}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta(@NotNull documentosParser.EtiquetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link documentosParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(@NotNull documentosParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link documentosParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(@NotNull documentosParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link documentosParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(@NotNull documentosParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link documentosParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(@NotNull documentosParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link documentosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull documentosParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link documentosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull documentosParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link documentosParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(@NotNull documentosParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link documentosParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(@NotNull documentosParser.AtributoContext ctx);
}