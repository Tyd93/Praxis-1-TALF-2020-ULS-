// Generated from com\compiladores\prueba\consultas\SQL.g4 by ANTLR 4.5.1
package com.compiladores.prueba.consultas;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, DELETE=3, WHERE=4, CREATE=5, ORDER=6, UPDATE=7, TABLE=8, 
		SET=9, ASC=10, DESC=11, ID=12, COMA=13, ALL=14, PAROPEN=15, PARCLOSE=16, 
		SEMICOLON=17, STRING=18, IGUAL=19, MENOR=20, MAYOR=21, MEIGUAL=22, MAIGUAL=23, 
		WS=24;
	public static final int
		RULE_query = 0, RULE_seleccionar = 1, RULE_borrar = 2, RULE_actualizar = 3, 
		RULE_crear = 4, RULE_columna = 5, RULE_tabla = 6, RULE_where = 7, RULE_order = 8, 
		RULE_logico = 9, RULE_declarar = 10, RULE_orden = 11;
	public static final String[] ruleNames = {
		"query", "seleccionar", "borrar", "actualizar", "crear", "columna", "tabla", 
		"where", "order", "logico", "declarar", "orden"
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

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public SeleccionarContext seleccionar() {
			return getRuleContext(SeleccionarContext.class,0);
		}
		public BorrarContext borrar() {
			return getRuleContext(BorrarContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public CrearContext crear() {
			return getRuleContext(CrearContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(28);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				seleccionar();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				borrar();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				actualizar();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				crear();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SeleccionarContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<TablaContext> tabla() {
			return getRuleContexts(TablaContext.class);
		}
		public TablaContext tabla(int i) {
			return getRuleContext(TablaContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public SeleccionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSeleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSeleccionar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSeleccionar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionarContext seleccionar() throws RecognitionException {
		SeleccionarContext _localctx = new SeleccionarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seleccionar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(SELECT);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				columna();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==ALL );
			setState(36);
			match(FROM);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				tabla();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(43);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(42);
				where();
				}
			}

			setState(46);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(45);
				order();
				}
			}

			setState(48);
			match(SEMICOLON);
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

	public static class BorrarContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public List<TablaContext> tabla() {
			return getRuleContexts(TablaContext.class);
		}
		public TablaContext tabla(int i) {
			return getRuleContext(TablaContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public BorrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBorrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBorrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBorrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorrarContext borrar() throws RecognitionException {
		BorrarContext _localctx = new BorrarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_borrar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DELETE);
			setState(51);
			match(FROM);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				tabla();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(58);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(57);
				where();
				}
			}

			setState(60);
			match(SEMICOLON);
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

	public static class ActualizarContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(SQLParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(SQLParser.IGUAL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SQLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SQLParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public ActualizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterActualizar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitActualizar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitActualizar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizarContext actualizar() throws RecognitionException {
		ActualizarContext _localctx = new ActualizarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actualizar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(UPDATE);
			setState(63);
			tabla();
			setState(64);
			match(SET);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				columna();
				setState(66);
				match(IGUAL);
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(69);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(68);
					match(COMA);
					}
				}

				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==ALL );
			setState(75);
			where();
			setState(76);
			match(SEMICOLON);
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

	public static class CrearContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TablaContext tabla() {
			return getRuleContext(TablaContext.class,0);
		}
		public TerminalNode PAROPEN() { return getToken(SQLParser.PAROPEN, 0); }
		public TerminalNode PARCLOSE() { return getToken(SQLParser.PARCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public CrearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCrear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCrear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCrear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrearContext crear() throws RecognitionException {
		CrearContext _localctx = new CrearContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crear);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CREATE);
			setState(79);
			match(TABLE);
			setState(80);
			tabla();
			setState(81);
			match(PAROPEN);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				declarar();
				setState(84);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(83);
					match(COMA);
					}
				}

				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(90);
			match(PARCLOSE);
			setState(91);
			match(SEMICOLON);
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

	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SQLParser.COMA, 0); }
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columna);
		int _la;
		try {
			setState(98);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(ALL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ID);
				setState(96);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(95);
					match(COMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TablaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SQLParser.COMA, 0); }
		public TablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablaContext tabla() throws RecognitionException {
		TablaContext _localctx = new TablaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tabla);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(103);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(102);
					match(COMA);
					}
				}

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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<LogicoContext> logico() {
			return getRuleContexts(LogicoContext.class);
		}
		public LogicoContext logico(int i) {
			return getRuleContext(LogicoContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SQLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SQLParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHERE);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				columna();
				setState(109);
				logico();
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(112);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(111);
					match(COMA);
					}
				}

				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==ALL );
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

	public static class OrderContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<OrdenContext> orden() {
			return getRuleContexts(OrdenContext.class);
		}
		public OrdenContext orden(int i) {
			return getRuleContext(OrdenContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLParser.COMA, i);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ORDER);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				columna();
				setState(120);
				orden();
				setState(122);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(121);
					match(COMA);
					}
				}

				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==ALL );
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(SQLParser.IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(SQLParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(SQLParser.MAYOR, 0); }
		public TerminalNode MEIGUAL() { return getToken(SQLParser.MEIGUAL, 0); }
		public TerminalNode MAIGUAL() { return getToken(SQLParser.MAIGUAL, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENOR) | (1L << MAYOR) | (1L << MEIGUAL) | (1L << MAIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class DeclararContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(ID);
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

	public static class OrdenContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public OrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenContext orden() throws RecognitionException {
		OrdenContext _localctx = new OrdenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\6\3#\n\3\r\3"+
		"\16\3$\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\6\48\n\4\r\4\16\49\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5H\n\5\6\5J\n\5\r\5\16\5K\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6W\n\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\6\3\7\3\7\3\7\5\7c\n\7\5\7"+
		"e\n\7\3\b\3\b\3\b\5\bj\n\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\6\tu"+
		"\n\t\r\t\16\tv\3\n\3\n\3\n\3\n\5\n}\n\n\6\n\177\n\n\r\n\16\n\u0080\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5"+
		"\4\2\16\16\24\24\3\2\25\31\3\2\f\r\u0092\2\36\3\2\2\2\4 \3\2\2\2\6\64"+
		"\3\2\2\2\b@\3\2\2\2\nP\3\2\2\2\fd\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22x"+
		"\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0087\3\2\2\2\32\37\5\4"+
		"\3\2\33\37\5\6\4\2\34\37\5\b\5\2\35\37\5\n\6\2\36\32\3\2\2\2\36\33\3\2"+
		"\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\3\3\2\2\2 \"\7\3\2\2!#\5\f\7\2\"!"+
		"\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&(\7\4\2\2\')\5\16\b"+
		"\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\5\20\t\2-,\3\2"+
		"\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\22\n\2\60/\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\7\23\2\2\63\5\3\2\2\2\64\65\7\5\2\2\65\67\7\4\2\2\668\5"+
		"\16\b\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\5\20"+
		"\t\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\23\2\2?\7\3\2\2\2@A\7\t\2\2AB\5"+
		"\16\b\2BI\7\13\2\2CD\5\f\7\2DE\7\25\2\2EG\t\2\2\2FH\7\17\2\2GF\3\2\2\2"+
		"GH\3\2\2\2HJ\3\2\2\2IC\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MN\5\20\t\2NO\7\23\2\2O\t\3\2\2\2PQ\7\7\2\2QR\7\n\2\2RS\5\16\b\2SX\7\21"+
		"\2\2TV\5\26\f\2UW\7\17\2\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XT\3\2\2\2YZ\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\22\2\2]^\7\23\2\2^\13\3\2\2"+
		"\2_e\7\20\2\2`b\7\16\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d_\3"+
		"\2\2\2d`\3\2\2\2e\r\3\2\2\2fl\7\16\2\2gi\7\16\2\2hj\7\17\2\2ih\3\2\2\2"+
		"ij\3\2\2\2jl\3\2\2\2kf\3\2\2\2kg\3\2\2\2l\17\3\2\2\2mt\7\6\2\2no\5\f\7"+
		"\2op\5\24\13\2pr\t\2\2\2qs\7\17\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tn\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2x~\7\b\2\2yz\5\f\7\2z"+
		"|\5\30\r\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~y\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083"+
		"\t\3\2\2\u0083\25\3\2\2\2\u0084\u0085\7\16\2\2\u0085\u0086\7\16\2\2\u0086"+
		"\27\3\2\2\2\u0087\u0088\t\4\2\2\u0088\31\3\2\2\2\25\36$*-\609<GKVZbdi"+
		"krv|\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}