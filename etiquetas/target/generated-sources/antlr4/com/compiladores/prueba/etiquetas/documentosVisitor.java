// Generated from com\compiladores\prueba\etiquetas\documentos.g4 by ANTLR 4.5.1
package com.compiladores.prueba.etiquetas;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link documentosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface documentosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link documentosParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(documentosParser.XmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link documentosParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(documentosParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link documentosParser#etiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas(documentosParser.EtiquetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link documentosParser#etiqueta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiqueta(documentosParser.EtiquetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link documentosParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(documentosParser.AtributoContext ctx);
}