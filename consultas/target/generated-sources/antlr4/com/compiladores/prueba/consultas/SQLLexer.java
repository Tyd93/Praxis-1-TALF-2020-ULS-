// Generated from com\compiladores\prueba\consultas\SQL.g4 by ANTLR 4.5.1
package com.compiladores.prueba.consultas;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, DELETE=3, WHERE=4, CREATE=5, ORDER=6, UPDATE=7, TABLE=8, 
		SET=9, ASC=10, DESC=11, ID=12, COMA=13, ALL=14, PAROPEN=15, PARCLOSE=16, 
		SEMICOLON=17, STRING=18, IGUAL=19, MENOR=20, MAYOR=21, MEIGUAL=22, MAIGUAL=23, 
		WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "DELETE", "WHERE", "CREATE", "ORDER", "UPDATE", "TABLE", 
		"SET", "ASC", "DESC", "ID", "COMA", "ALL", "PAROPEN", "PARCLOSE", "SEMICOLON", 
		"STRING", "IGUAL", "MENOR", "MAYOR", "MEIGUAL", "MAIGUAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'DELETE'", "'WHERE'", "'CREATE'", "'ORDER_BY'", 
		"'UPDATE'", "'TABLE'", "'SET'", "'ASC'", "'DESC'", null, "','", "'*'", 
		"'('", "')'", "';'", null, "'='", "'<'", "'>'", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "DELETE", "WHERE", "CREATE", "ORDER", "UPDATE", 
		"TABLE", "SET", "ASC", "DESC", "ID", "COMA", "ALL", "PAROPEN", "PARCLOSE", 
		"SEMICOLON", "STRING", "IGUAL", "MENOR", "MAYOR", "MEIGUAL", "MAIGUAL", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\6\rx\n\r\r\r\16\ry\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\7\23\u0088\n\23\f\23\16\23\u008b\13\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\6\31\u009c\n\31"+
		"\r\31\16\31\u009d\3\31\3\31\3\u0089\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\3\2\4\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00a3\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\5:\3\2\2\2\7?\3\2\2\2\tF\3\2\2\2\13L\3\2\2\2\rS\3\2"+
		"\2\2\17\\\3\2\2\2\21c\3\2\2\2\23i\3\2\2\2\25m\3\2\2\2\27q\3\2\2\2\31w"+
		"\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083"+
		"\3\2\2\2%\u0085\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2"+
		"-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63\64\7U\2\2\64\65\7G"+
		"\2\2\65\66\7N\2\2\66\67\7G\2\2\678\7E\2\289\7V\2\29\4\3\2\2\2:;\7H\2\2"+
		";<\7T\2\2<=\7Q\2\2=>\7O\2\2>\6\3\2\2\2?@\7F\2\2@A\7G\2\2AB\7N\2\2BC\7"+
		"G\2\2CD\7V\2\2DE\7G\2\2E\b\3\2\2\2FG\7Y\2\2GH\7J\2\2HI\7G\2\2IJ\7T\2\2"+
		"JK\7G\2\2K\n\3\2\2\2LM\7E\2\2MN\7T\2\2NO\7G\2\2OP\7C\2\2PQ\7V\2\2QR\7"+
		"G\2\2R\f\3\2\2\2ST\7Q\2\2TU\7T\2\2UV\7F\2\2VW\7G\2\2WX\7T\2\2XY\7a\2\2"+
		"YZ\7D\2\2Z[\7[\2\2[\16\3\2\2\2\\]\7W\2\2]^\7R\2\2^_\7F\2\2_`\7C\2\2`a"+
		"\7V\2\2ab\7G\2\2b\20\3\2\2\2cd\7V\2\2de\7C\2\2ef\7D\2\2fg\7N\2\2gh\7G"+
		"\2\2h\22\3\2\2\2ij\7U\2\2jk\7G\2\2kl\7V\2\2l\24\3\2\2\2mn\7C\2\2no\7U"+
		"\2\2op\7E\2\2p\26\3\2\2\2qr\7F\2\2rs\7G\2\2st\7U\2\2tu\7E\2\2u\30\3\2"+
		"\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\32\3\2\2\2{|\7"+
		".\2\2|\34\3\2\2\2}~\7,\2\2~\36\3\2\2\2\177\u0080\7*\2\2\u0080 \3\2\2\2"+
		"\u0081\u0082\7+\2\2\u0082\"\3\2\2\2\u0083\u0084\7=\2\2\u0084$\3\2\2\2"+
		"\u0085\u0089\7)\2\2\u0086\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\7)\2\2\u008d&\3\2\2\2\u008e\u008f\7?\2\2\u008f"+
		"(\3\2\2\2\u0090\u0091\7>\2\2\u0091*\3\2\2\2\u0092\u0093\7@\2\2\u0093,"+
		"\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7@\2\2\u0098\u0099\7?\2\2\u0099\60\3\2\2\2\u009a\u009c\t\3\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\31\2\2\u00a0\62\3\2\2\2\6\2y\u0089"+
		"\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}