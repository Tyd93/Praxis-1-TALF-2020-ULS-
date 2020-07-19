
package com.compiladores.prueba.etiquetas;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "xml";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		documentosLexer lexer = new documentosLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		documentosParser parser = new documentosParser(tokens);

		documentosParser.XmlContext tree = parser.xml();

		documentosCustomVisitor visitor = new documentosCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
