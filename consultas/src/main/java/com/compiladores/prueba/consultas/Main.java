
package com.compiladores.prueba.consultas;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "txt";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		SQLLexer lexer = new SQLLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLParser parser = new SQLParser(tokens);

		SQLParser.QueryContext tree = parser.query();

		SQLCustomVisitor visitor = new SQLCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
