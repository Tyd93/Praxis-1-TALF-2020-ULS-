
package com.compiladores.prueba.praxis;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "pas";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/promedio." + EXTENSION;

		System.out.println("Interpreting file " + program);

		LexicoLexer lexer = new LexicoLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LexicoParser parser = new LexicoParser(tokens);

		LexicoParser.ProgramContext tree = parser.program();

		LexicoCustomVisitor visitor = new LexicoCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
