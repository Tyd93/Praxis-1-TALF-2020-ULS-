// Generated from documentos.g4 by ANTLR 4.4
package com.compiladores.prueba.etiquetas;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class documentosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INISTRING=1, ASIGN=2, EOPEN=3, ECLOSE=4, CORTE=5, QRAIZ=6, DOT=7, XML=8, 
		VERSION=9, STRING=10, NUMBER=11, ID=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'\"'", "'='", "'<'", "'>'", "'/'", "'?'", "'.'", "XML", 
		"VERSION", "STRING", "NUMBER", "ID", "WS"
	};
	public static final int
		RULE_xml = 0, RULE_inicio = 1, RULE_etiquetas = 2, RULE_etiqueta = 3, 
		RULE_atributo = 4;
	public static final String[] ruleNames = {
		"xml", "inicio", "etiquetas", "etiqueta", "atributo"
	};

	@Override
	public String getGrammarFileName() { return "documentos.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public documentosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XmlContext extends ParserRuleContext {
		public List<EtiquetasContext> etiquetas() {
			return getRuleContexts(EtiquetasContext.class);
		}
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public EtiquetasContext etiquetas(int i) {
			return getRuleContext(EtiquetasContext.class,i);
		}
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).exitXml(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); inicio();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOPEN) {
				{
				{
				setState(11); etiquetas();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(documentosParser.VERSION, 0); }
		public TerminalNode EOPEN() { return getToken(documentosParser.EOPEN, 0); }
		public TerminalNode ECLOSE() { return getToken(documentosParser.ECLOSE, 0); }
		public TerminalNode QRAIZ(int i) {
			return getToken(documentosParser.QRAIZ, i);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<TerminalNode> QRAIZ() { return getTokens(documentosParser.QRAIZ); }
		public TerminalNode STRING() { return getToken(documentosParser.STRING, 0); }
		public TerminalNode ASIGN() { return getToken(documentosParser.ASIGN, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public TerminalNode XML() { return getToken(documentosParser.XML, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(EOPEN);
			setState(18); match(QRAIZ);
			setState(19); match(XML);
			setState(20); match(VERSION);
			setState(21); match(ASIGN);
			setState(22); match(STRING);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(23); atributo();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); match(QRAIZ);
			setState(30); match(ECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtiquetasContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(documentosParser.STRING, 0); }
		public EtiquetaContext etiqueta() {
			return getRuleContext(EtiquetaContext.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_etiquetas);
		try {
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); etiqueta();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); etiqueta();
				setState(34); match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EtiquetaContext extends ParserRuleContext {
		public TerminalNode CORTE(int i) {
			return getToken(documentosParser.CORTE, i);
		}
		public TerminalNode ID() { return getToken(documentosParser.ID, 0); }
		public TerminalNode EOPEN() { return getToken(documentosParser.EOPEN, 0); }
		public TerminalNode ECLOSE() { return getToken(documentosParser.ECLOSE, 0); }
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public List<TerminalNode> CORTE() { return getTokens(documentosParser.CORTE); }
		public EtiquetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiqueta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).enterEtiqueta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).exitEtiqueta(this);
		}
	}

	public final EtiquetaContext etiqueta() throws RecognitionException {
		EtiquetaContext _localctx = new EtiquetaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_etiqueta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(EOPEN);
			setState(40);
			_la = _input.LA(1);
			if (_la==CORTE) {
				{
				setState(39); match(CORTE);
				}
			}

			setState(42); match(ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(43); atributo();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_la = _input.LA(1);
			if (_la==CORTE) {
				{
				setState(49); match(CORTE);
				}
			}

			setState(52); match(ECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(documentosParser.ID, 0); }
		public TerminalNode STRING() { return getToken(documentosParser.STRING, 0); }
		public TerminalNode ASIGN() { return getToken(documentosParser.ASIGN, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof documentosListener ) ((documentosListener)listener).exitAtributo(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(ID);
			setState(55); match(ASIGN);
			setState(56); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4\'\n\4\3\5\3\5\5\5+\n\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3"+
		"\5\5\5\65\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2=\2\f\3\2"+
		"\2\2\4\23\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n8\3\2\2\2\f\20\5\4\3\2\r\17\5"+
		"\6\4\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2"+
		"\2\2\22\20\3\2\2\2\23\24\7\5\2\2\24\25\7\b\2\2\25\26\7\n\2\2\26\27\7\13"+
		"\2\2\27\30\7\4\2\2\30\34\7\f\2\2\31\33\5\n\6\2\32\31\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\b\2"+
		"\2 !\7\6\2\2!\5\3\2\2\2\"\'\5\b\5\2#$\5\b\5\2$%\7\f\2\2%\'\3\2\2\2&\""+
		"\3\2\2\2&#\3\2\2\2\'\7\3\2\2\2(*\7\5\2\2)+\7\7\2\2*)\3\2\2\2*+\3\2\2\2"+
		"+,\3\2\2\2,\60\7\16\2\2-/\5\n\6\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63\65\7\7\2\2\64\63\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\3\2\2\2\66\67\7\6\2\2\67\t\3\2\2\289\7\16\2\29:\7\4"+
		"\2\2:;\7\f\2\2;\13\3\2\2\2\b\20\34&*\60\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}