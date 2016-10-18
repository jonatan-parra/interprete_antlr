// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FINALGORITMO=2, PROCESO=3, FINPROCESO=4, ESCRIBIR=5, COMO=6, 
		LEER=7, DIMENSION=8, SI=9, SINO=10, FINSI=11, SEGUN=12, HACER=13, VERDADERO=14, 
		FALSO=15, FINSEGUN=16, MIENTRAS=17, FINMIENTRAS=18, REPETIR=19, PARA=20, 
		FINPARA=21, DEFINIR=22, ENTONCES=23, RESERVADAS=24, SUBPROCESO=25, FINSUBPROCESO=26, 
		HASTA=27, FINFUNCION=28, CASO=29, DE=30, OTRO=31, MODO=32, QUE=33, CON=34, 
		PASO=35, COMMENT=36, LINE_COMMENT=37, WS=38, VAR=39, A=40, B=41, C=42, 
		D=43, E=44, F=45, G=46, H=47, I=48, J=49, K=50, L=51, M=52, N=53, O=54, 
		P=55, Q=56, R=57, S=58, T=59, U=60, V=61, W=62, X=63, Y=64, Z=65, PAR_IZQ=66, 
		PAR_DER=67, COR_IZQ=68, COR_DER=69, MULOP=70, SUMOP=71, MODOP=72, MODULO=73, 
		POTENCIA=74, AND_OP=75, OR_OP=76, ASIGNACION=77, NEGACION=78, NO_ID=79, 
		ROP=80, DOS_PUNTOS=81, SMCOLON=82, COMMA=83, ENTERO=84, REAL=85, ID=86, 
		MENSAJE=87;
	public static final int
		RULE_commands = 0, RULE_subproceso1 = 1, RULE_proceso1 = 2, RULE_instrucciones = 3, 
		RULE_llamar_funcion = 4, RULE_definicion = 5, RULE_varios_id = 6, RULE_asignacion1 = 7, 
		RULE_escribir = 8, RULE_contenido_escribir = 9, RULE_def_arreglo = 10, 
		RULE_varios_valores = 11, RULE_leer = 12, RULE_expr = 13, RULE_ciclo_para = 14, 
		RULE_ciclo_mientras = 15, RULE_condicional = 16, RULE_booleanExpr = 17, 
		RULE_segun1 = 18, RULE_ciclo_repetir = 19;
	public static final String[] ruleNames = {
		"commands", "subproceso1", "proceso1", "instrucciones", "llamar_funcion", 
		"definicion", "varios_id", "asignacion1", "escribir", "contenido_escribir", 
		"def_arreglo", "varios_valores", "leer", "expr", "ciclo_para", "ciclo_mientras", 
		"condicional", "booleanExpr", "segun1", "ciclo_repetir"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'('", "')'", "'['", "']'", null, 
		null, "'%'", null, "'^'", null, null, "'<-'", "'~'", null, null, null, 
		"';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALGORITMO", "FINALGORITMO", "PROCESO", "FINPROCESO", "ESCRIBIR", 
		"COMO", "LEER", "DIMENSION", "SI", "SINO", "FINSI", "SEGUN", "HACER", 
		"VERDADERO", "FALSO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", 
		"PARA", "FINPARA", "DEFINIR", "ENTONCES", "RESERVADAS", "SUBPROCESO", 
		"FINSUBPROCESO", "HASTA", "FINFUNCION", "CASO", "DE", "OTRO", "MODO", 
		"QUE", "CON", "PASO", "COMMENT", "LINE_COMMENT", "WS", "VAR", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "PAR_IZQ", "PAR_DER", 
		"COR_IZQ", "COR_DER", "MULOP", "SUMOP", "MODOP", "MODULO", "POTENCIA", 
		"AND_OP", "OR_OP", "ASIGNACION", "NEGACION", "NO_ID", "ROP", "DOS_PUNTOS", 
		"SMCOLON", "COMMA", "ENTERO", "REAL", "ID", "MENSAJE"
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
	public String getGrammarFileName() { return "MyLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandsContext extends ParserRuleContext {
		public Subproceso1Context subproceso1() {
			return getRuleContext(Subproceso1Context.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			subproceso1();
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

	public static class Subproceso1Context extends ParserRuleContext {
		public TerminalNode SUBPROCESO() { return getToken(MyLanguageParser.SUBPROCESO, 0); }
		public List<TerminalNode> ID() { return getTokens(MyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParser.ID, i);
		}
		public Subproceso1Context subproceso1() {
			return getRuleContext(Subproceso1Context.class,0);
		}
		public TerminalNode FINSUBPROCESO() { return getToken(MyLanguageParser.FINSUBPROCESO, 0); }
		public TerminalNode FINFUNCION() { return getToken(MyLanguageParser.FINFUNCION, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode ASIGNACION() { return getToken(MyLanguageParser.ASIGNACION, 0); }
		public List<TerminalNode> PAR_IZQ() { return getTokens(MyLanguageParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(MyLanguageParser.PAR_IZQ, i);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(MyLanguageParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(MyLanguageParser.PAR_DER, i);
		}
		public Varios_idContext varios_id() {
			return getRuleContext(Varios_idContext.class,0);
		}
		public Proceso1Context proceso1() {
			return getRuleContext(Proceso1Context.class,0);
		}
		public Subproceso1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproceso1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSubproceso1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSubproceso1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSubproceso1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subproceso1Context subproceso1() throws RecognitionException {
		Subproceso1Context _localctx = new Subproceso1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_subproceso1);
		int _la;
		try {
			int _alt;
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(SUBPROCESO);
				setState(43);
				match(ID);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(44);
					instrucciones();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(51);
				subproceso1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(SUBPROCESO);
				setState(53);
				match(ID);
				setState(54);
				match(ASIGNACION);
				setState(55);
				match(ID);
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(56);
						match(PAR_IZQ);
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(57);
							match(ID);
							}
							}
							setState(62);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(63);
						match(PAR_DER);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(69);
					instrucciones();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(76);
				subproceso1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(SUBPROCESO);
				setState(78);
				match(ID);
				setState(79);
				match(PAR_IZQ);
				setState(80);
				varios_id();
				setState(81);
				match(PAR_DER);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(82);
					instrucciones();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(89);
				subproceso1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				proceso1();
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

	public static class Proceso1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode PROCESO() { return getToken(MyLanguageParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(MyLanguageParser.ALGORITMO, 0); }
		public TerminalNode FINPROCESO() { return getToken(MyLanguageParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(MyLanguageParser.FINALGORITMO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MyLanguageParser.EOF, 0); }
		public Proceso1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterProceso1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitProceso1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitProceso1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proceso1Context proceso1() throws RecognitionException {
		Proceso1Context _localctx = new Proceso1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_proceso1);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==ALGORITMO || _la==PROCESO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(95);
				match(ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(96);
					instrucciones();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==FINALGORITMO || _la==FINPROCESO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class InstruccionesContext extends ParserRuleContext {
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public Asignacion1Context asignacion1() {
			return getRuleContext(Asignacion1Context.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public Def_arregloContext def_arreglo() {
			return getRuleContext(Def_arregloContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public Ciclo_paraContext ciclo_para() {
			return getRuleContext(Ciclo_paraContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Segun1Context segun1() {
			return getRuleContext(Segun1Context.class,0);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public Ciclo_repetirContext ciclo_repetir() {
			return getRuleContext(Ciclo_repetirContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				definicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				asignacion1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				escribir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				def_arreglo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				leer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				ciclo_para();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				ciclo_mientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				condicional();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				segun1();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				llamar_funcion();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(117);
				ciclo_repetir();
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

	public static class Llamar_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyLanguageParser.PAR_IZQ, 0); }
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyLanguageParser.PAR_DER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Llamar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLlamar_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLlamar_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLlamar_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamar_funcionContext llamar_funcion() throws RecognitionException {
		Llamar_funcionContext _localctx = new Llamar_funcionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_llamar_funcion);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				setState(121);
				match(PAR_IZQ);
				setState(122);
				llamar_funcion();
				setState(123);
				match(PAR_DER);
				setState(125);
				_la = _input.LA(1);
				if (_la==SMCOLON) {
					{
					setState(124);
					match(SMCOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(ID);
				setState(129);
				match(SMCOLON);
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(MyLanguageParser.DEFINIR, 0); }
		public Varios_idContext varios_id() {
			return getRuleContext(Varios_idContext.class,0);
		}
		public TerminalNode COMO() { return getToken(MyLanguageParser.COMO, 0); }
		public TerminalNode VAR() { return getToken(MyLanguageParser.VAR, 0); }
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DEFINIR);
			setState(133);
			varios_id();
			setState(134);
			match(COMO);
			setState(135);
			match(VAR);
			setState(136);
			match(SMCOLON);
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

	public static class Varios_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public Varios_idContext varios_id() {
			return getRuleContext(Varios_idContext.class,0);
		}
		public Varios_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varios_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterVarios_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitVarios_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitVarios_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varios_idContext varios_id() throws RecognitionException {
		Varios_idContext _localctx = new Varios_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varios_id);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				setState(139);
				match(COMMA);
				setState(140);
				varios_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
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

	public static class Asignacion1Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(MyLanguageParser.ASIGNACION, 0); }
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public TerminalNode SUMOP() { return getToken(MyLanguageParser.SUMOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COR_IZQ() { return getToken(MyLanguageParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(MyLanguageParser.COR_DER, 0); }
		public Contenido_escribirContext contenido_escribir() {
			return getRuleContext(Contenido_escribirContext.class,0);
		}
		public TerminalNode MENSAJE() { return getToken(MyLanguageParser.MENSAJE, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public Asignacion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAsignacion1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAsignacion1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAsignacion1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion1Context asignacion1() throws RecognitionException {
		Asignacion1Context _localctx = new Asignacion1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion1);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ID);
				setState(145);
				match(ASIGNACION);
				setState(147);
				_la = _input.LA(1);
				if (_la==SUMOP) {
					{
					setState(146);
					match(SUMOP);
					}
				}

				setState(149);
				match(ID);
				setState(150);
				match(SMCOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				setState(152);
				match(ASIGNACION);
				setState(153);
				expr(0);
				setState(154);
				match(SMCOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(ID);
				setState(157);
				match(COR_IZQ);
				setState(158);
				expr(0);
				setState(159);
				match(COR_DER);
				setState(160);
				match(ASIGNACION);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(161);
					expr(0);
					}
					break;
				case 2:
					{
					setState(162);
					contenido_escribir();
					}
					break;
				}
				setState(165);
				match(SMCOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(ID);
				setState(168);
				match(ASIGNACION);
				setState(169);
				match(MENSAJE);
				setState(170);
				match(SMCOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(ID);
				setState(172);
				match(ASIGNACION);
				setState(173);
				booleanExpr();
				setState(174);
				match(SMCOLON);
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(MyLanguageParser.ESCRIBIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public Contenido_escribirContext contenido_escribir() {
			return getRuleContext(Contenido_escribirContext.class,0);
		}
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escribir);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ESCRIBIR);
				setState(179);
				expr(0);
				setState(180);
				match(SMCOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(ESCRIBIR);
				setState(183);
				match(ID);
				setState(184);
				expr(0);
				setState(185);
				match(SMCOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(ESCRIBIR);
				setState(188);
				contenido_escribir();
				setState(189);
				match(SMCOLON);
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

	public static class Contenido_escribirContext extends ParserRuleContext {
		public TerminalNode MENSAJE() { return getToken(MyLanguageParser.MENSAJE, 0); }
		public Contenido_escribirContext contenido_escribir() {
			return getRuleContext(Contenido_escribirContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Contenido_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterContenido_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitContenido_escribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitContenido_escribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contenido_escribirContext contenido_escribir() throws RecognitionException {
		Contenido_escribirContext _localctx = new Contenido_escribirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contenido_escribir);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(MENSAJE);
				setState(195);
				_la = _input.LA(1);
				if (_la==VERDADERO || _la==FALSO || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)) | (1L << (MENSAJE - 66)))) != 0)) {
					{
					setState(194);
					contenido_escribir();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(MENSAJE);
				setState(198);
				match(COMMA);
				setState(199);
				contenido_escribir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				expr(0);
				setState(202);
				_la = _input.LA(1);
				if (_la==VERDADERO || _la==FALSO || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)) | (1L << (MENSAJE - 66)))) != 0)) {
					{
					setState(201);
					contenido_escribir();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				expr(0);
				setState(205);
				match(COMMA);
				setState(206);
				contenido_escribir();
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

	public static class Def_arregloContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(MyLanguageParser.DIMENSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public Def_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDef_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDef_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDef_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_arregloContext def_arreglo() throws RecognitionException {
		Def_arregloContext _localctx = new Def_arregloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DIMENSION);
			setState(211);
			expr(0);
			setState(212);
			match(SMCOLON);
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

	public static class Varios_valoresContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(MyLanguageParser.ENTERO, 0); }
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public Varios_valoresContext varios_valores() {
			return getRuleContext(Varios_valoresContext.class,0);
		}
		public TerminalNode REAL() { return getToken(MyLanguageParser.REAL, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public Varios_valoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varios_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterVarios_valores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitVarios_valores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitVarios_valores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varios_valoresContext varios_valores() throws RecognitionException {
		Varios_valoresContext _localctx = new Varios_valoresContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varios_valores);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ENTERO);
				setState(215);
				match(COMMA);
				setState(216);
				varios_valores();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(REAL);
				setState(219);
				match(COMMA);
				setState(220);
				varios_valores();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(ID);
				setState(223);
				match(COMMA);
				setState(224);
				varios_valores();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(ID);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(MyLanguageParser.LEER, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(MyLanguageParser.COR_IZQ, 0); }
		public Varios_valoresContext varios_valores() {
			return getRuleContext(Varios_valoresContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(MyLanguageParser.COR_DER, 0); }
		public TerminalNode SMCOLON() { return getToken(MyLanguageParser.SMCOLON, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leer);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(LEER);
				setState(229);
				match(ID);
				setState(230);
				match(COR_IZQ);
				setState(231);
				varios_valores();
				setState(232);
				match(COR_DER);
				setState(233);
				match(SMCOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(LEER);
				setState(236);
				match(ID);
				setState(237);
				match(SMCOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NO_ID() { return getToken(MyLanguageParser.NO_ID, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode SUMOP() { return getToken(MyLanguageParser.SUMOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COR_IZQ() { return getToken(MyLanguageParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(MyLanguageParser.COR_DER, 0); }
		public TerminalNode REAL() { return getToken(MyLanguageParser.REAL, 0); }
		public TerminalNode ENTERO() { return getToken(MyLanguageParser.ENTERO, 0); }
		public TerminalNode VERDADERO() { return getToken(MyLanguageParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(MyLanguageParser.FALSO, 0); }
		public TerminalNode ROP() { return getToken(MyLanguageParser.ROP, 0); }
		public TerminalNode COMMA() { return getToken(MyLanguageParser.COMMA, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyLanguageParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyLanguageParser.PAR_DER, 0); }
		public TerminalNode NEGACION() { return getToken(MyLanguageParser.NEGACION, 0); }
		public TerminalNode MULOP() { return getToken(MyLanguageParser.MULOP, 0); }
		public TerminalNode POTENCIA() { return getToken(MyLanguageParser.POTENCIA, 0); }
		public TerminalNode MODOP() { return getToken(MyLanguageParser.MODOP, 0); }
		public TerminalNode MODULO() { return getToken(MyLanguageParser.MODULO, 0); }
		public TerminalNode AND_OP() { return getToken(MyLanguageParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(MyLanguageParser.OR_OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(241);
				match(NO_ID);
				setState(242);
				match(ID);
				}
				break;
			case 2:
				{
				setState(243);
				match(SUMOP);
				setState(244);
				expr(20);
				}
				break;
			case 3:
				{
				setState(245);
				match(ID);
				setState(246);
				match(COR_IZQ);
				setState(247);
				expr(0);
				setState(248);
				match(COR_DER);
				}
				break;
			case 4:
				{
				setState(250);
				match(COR_IZQ);
				setState(251);
				expr(0);
				setState(252);
				match(COR_DER);
				}
				break;
			case 5:
				{
				setState(254);
				match(REAL);
				}
				break;
			case 6:
				{
				setState(255);
				match(ENTERO);
				}
				break;
			case 7:
				{
				setState(256);
				match(VERDADERO);
				}
				break;
			case 8:
				{
				setState(257);
				match(FALSO);
				}
				break;
			case 9:
				{
				setState(258);
				match(ROP);
				}
				break;
			case 10:
				{
				setState(259);
				match(ID);
				setState(260);
				match(COMMA);
				setState(261);
				expr(7);
				}
				break;
			case 11:
				{
				setState(262);
				match(ID);
				}
				break;
			case 12:
				{
				setState(263);
				match(PAR_IZQ);
				setState(264);
				expr(0);
				setState(265);
				match(PAR_DER);
				}
				break;
			case 13:
				{
				setState(267);
				match(ID);
				setState(268);
				match(PAR_IZQ);
				setState(269);
				expr(0);
				setState(270);
				match(PAR_DER);
				}
				break;
			case 14:
				{
				setState(272);
				match(ID);
				setState(273);
				match(PAR_IZQ);
				setState(274);
				match(PAR_DER);
				}
				break;
			case 15:
				{
				setState(275);
				match(NEGACION);
				setState(276);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(280);
						match(MULOP);
						setState(281);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(283);
						match(SUMOP);
						setState(284);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(286);
						match(POTENCIA);
						setState(287);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(289);
						match(MODOP);
						setState(290);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(292);
						match(MODULO);
						setState(293);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(295);
						_la = _input.LA(1);
						if ( !(_la==AND_OP || _la==OR_OP) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(296);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						match(COMMA);
						setState(299);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Ciclo_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MyLanguageParser.PARA, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(MyLanguageParser.ASIGNACION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(MyLanguageParser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(MyLanguageParser.HACER, 0); }
		public TerminalNode FINPARA() { return getToken(MyLanguageParser.FINPARA, 0); }
		public TerminalNode CON() { return getToken(MyLanguageParser.CON, 0); }
		public TerminalNode PASO() { return getToken(MyLanguageParser.PASO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public Ciclo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCiclo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCiclo_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCiclo_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_paraContext ciclo_para() throws RecognitionException {
		Ciclo_paraContext _localctx = new Ciclo_paraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ciclo_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(PARA);
			setState(306);
			match(ID);
			setState(307);
			match(ASIGNACION);
			setState(308);
			expr(0);
			setState(309);
			match(HASTA);
			setState(310);
			expr(0);
			setState(314);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(311);
				match(CON);
				setState(312);
				match(PASO);
				setState(313);
				expr(0);
				}
			}

			setState(316);
			match(HACER);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(317);
				instrucciones();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(FINPARA);
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

	public static class Ciclo_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(MyLanguageParser.MIENTRAS, 0); }
		public TerminalNode HACER() { return getToken(MyLanguageParser.HACER, 0); }
		public TerminalNode FINMIENTRAS() { return getToken(MyLanguageParser.FINMIENTRAS, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyLanguageParser.PAR_IZQ, 0); }
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(MyLanguageParser.PAR_DER, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public Ciclo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCiclo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCiclo_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCiclo_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ciclo_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(MIENTRAS);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(326);
				match(PAR_IZQ);
				}
				break;
			}
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				booleanExpr();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VERDADERO || _la==FALSO || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0) );
			setState(335);
			_la = _input.LA(1);
			if (_la==PAR_DER) {
				{
				setState(334);
				match(PAR_DER);
				}
			}

			setState(337);
			match(HACER);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(338);
				instrucciones();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(FINMIENTRAS);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MyLanguageParser.SI, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(MyLanguageParser.ENTONCES, 0); }
		public TerminalNode FINSI() { return getToken(MyLanguageParser.FINSI, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode SINO() { return getToken(MyLanguageParser.SINO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(SI);
			setState(347);
			booleanExpr();
			setState(348);
			match(ENTONCES);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(349);
				instrucciones();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(355);
				match(SINO);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(356);
					instrucciones();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(364);
			match(FINSI);
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

	public static class BooleanExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROP() { return getToken(MyLanguageParser.ROP, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpr);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				expr(0);
				setState(367);
				match(ROP);
				setState(368);
				booleanExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				expr(0);
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

	public static class Segun1Context extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(MyLanguageParser.SEGUN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HACER() { return getToken(MyLanguageParser.HACER, 0); }
		public TerminalNode FINSEGUN() { return getToken(MyLanguageParser.FINSEGUN, 0); }
		public List<TerminalNode> CASO() { return getTokens(MyLanguageParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(MyLanguageParser.CASO, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(MyLanguageParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(MyLanguageParser.DOS_PUNTOS, i);
		}
		public TerminalNode DE() { return getToken(MyLanguageParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(MyLanguageParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(MyLanguageParser.MODO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public Segun1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSegun1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSegun1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSegun1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Segun1Context segun1() throws RecognitionException {
		Segun1Context _localctx = new Segun1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_segun1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(SEGUN);
			setState(374);
			expr(0);
			setState(375);
			match(HACER);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(376);
				match(CASO);
				setState(377);
				expr(0);
				setState(378);
				match(DOS_PUNTOS);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(379);
					instrucciones();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(390);
				match(DE);
				setState(391);
				match(OTRO);
				setState(392);
				match(MODO);
				setState(393);
				match(DOS_PUNTOS);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					{
					setState(394);
					instrucciones();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(402);
			match(FINSEGUN);
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

	public static class Ciclo_repetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(MyLanguageParser.REPETIR, 0); }
		public TerminalNode HASTA() { return getToken(MyLanguageParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(MyLanguageParser.QUE, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode ROP() { return getToken(MyLanguageParser.ROP, 0); }
		public TerminalNode ENTERO() { return getToken(MyLanguageParser.ENTERO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public Ciclo_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCiclo_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCiclo_repetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCiclo_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_repetirContext ciclo_repetir() throws RecognitionException {
		Ciclo_repetirContext _localctx = new Ciclo_repetirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ciclo_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(REPETIR);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << LEER) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << VERDADERO) | (1L << FALSO) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << DEFINIR))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PAR_IZQ - 66)) | (1L << (COR_IZQ - 66)) | (1L << (SUMOP - 66)) | (1L << (NEGACION - 66)) | (1L << (NO_ID - 66)) | (1L << (ROP - 66)) | (1L << (ENTERO - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(405);
				instrucciones();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(HASTA);
			setState(412);
			match(QUE);
			setState(413);
			match(ID);
			setState(414);
			match(ROP);
			setState(415);
			match(ENTERO);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\7"+
		"\3C\n\3\f\3\16\3F\13\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4"+
		"\3\4\7\4d\n\4\f\4\16\4g\13\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3"+
		"\6\3\6\3\6\5\6\u0085\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0091"+
		"\n\b\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00c2\n\n\3\13\3\13\5\13\u00c6\n\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00cd\n\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e5\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0118\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u012f\n\17\f\17\16\17\u0132\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u013d\n\20\3\20\3\20\7\20\u0141\n\20\f\20\16"+
		"\20\u0144\13\20\3\20\3\20\3\21\3\21\5\21\u014a\n\21\3\21\6\21\u014d\n"+
		"\21\r\21\16\21\u014e\3\21\5\21\u0152\n\21\3\21\3\21\7\21\u0156\n\21\f"+
		"\21\16\21\u0159\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0161\n\22\f"+
		"\22\16\22\u0164\13\22\3\22\3\22\7\22\u0168\n\22\f\22\16\22\u016b\13\22"+
		"\5\22\u016d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0176\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u017f\n\24\f\24\16\24\u0182\13"+
		"\24\7\24\u0184\n\24\f\24\16\24\u0187\13\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u018e\n\24\f\24\16\24\u0191\13\24\5\24\u0193\n\24\3\24\3\24\3\25\3"+
		"\25\7\25\u0199\n\25\f\25\16\25\u019c\13\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\2\3\34\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\4"+
		"\2\34\34\36\36\4\2\3\3\5\5\4\2\4\4\6\6\3\2MN\u01df\2*\3\2\2\2\4^\3\2\2"+
		"\2\6k\3\2\2\2\bx\3\2\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16\u0090\3\2"+
		"\2\2\20\u00b2\3\2\2\2\22\u00c1\3\2\2\2\24\u00d2\3\2\2\2\26\u00d4\3\2\2"+
		"\2\30\u00e4\3\2\2\2\32\u00f0\3\2\2\2\34\u0117\3\2\2\2\36\u0133\3\2\2\2"+
		" \u0147\3\2\2\2\"\u015c\3\2\2\2$\u0175\3\2\2\2&\u0177\3\2\2\2(\u0196\3"+
		"\2\2\2*+\5\4\3\2+\3\3\2\2\2,-\7\33\2\2-\61\7X\2\2.\60\5\b\5\2/.\3\2\2"+
		"\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2"+
		"\64\65\t\2\2\2\65_\5\4\3\2\66\67\7\33\2\2\678\7X\2\289\7O\2\29D\7X\2\2"+
		":>\7D\2\2;=\7X\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@"+
		">\3\2\2\2AC\7E\2\2B:\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EJ\3\2\2\2F"+
		"D\3\2\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2"+
		"LJ\3\2\2\2MN\t\2\2\2N_\5\4\3\2OP\7\33\2\2PQ\7X\2\2QR\7D\2\2RS\5\16\b\2"+
		"SW\7E\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\t\2\2\2[\\\5\4\3\2\\_\3\2\2\2]_\5\6\4\2^,\3\2\2\2^\66\3\2"+
		"\2\2^O\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`a\t\3\2\2ae\7X\2\2bd\5\b\5\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hl\t\4\2\2il\7\2"+
		"\2\3jl\3\2\2\2k`\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\7\3\2\2\2my\5\f\7\2ny\5"+
		"\20\t\2oy\5\22\n\2py\5\26\f\2qy\5\32\16\2ry\5\36\20\2sy\5 \21\2ty\5\""+
		"\22\2uy\5&\24\2vy\5\n\6\2wy\5(\25\2xm\3\2\2\2xn\3\2\2\2xo\3\2\2\2xp\3"+
		"\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3"+
		"\2\2\2y\t\3\2\2\2z{\7X\2\2{|\7D\2\2|}\5\n\6\2}\177\7E\2\2~\u0080\7T\2"+
		"\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085\3\2\2\2\u0081\u0085\5\34"+
		"\17\2\u0082\u0083\7X\2\2\u0083\u0085\7T\2\2\u0084z\3\2\2\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\13\3\2\2\2\u0086\u0087\7\30\2\2\u0087"+
		"\u0088\5\16\b\2\u0088\u0089\7\b\2\2\u0089\u008a\7)\2\2\u008a\u008b\7T"+
		"\2\2\u008b\r\3\2\2\2\u008c\u008d\7X\2\2\u008d\u008e\7U\2\2\u008e\u0091"+
		"\5\16\b\2\u008f\u0091\7X\2\2\u0090\u008c\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\17\3\2\2\2\u0092\u0093\7X\2\2\u0093\u0095\7O\2\2\u0094\u0096\7I\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7X"+
		"\2\2\u0098\u00b3\7T\2\2\u0099\u009a\7X\2\2\u009a\u009b\7O\2\2\u009b\u009c"+
		"\5\34\17\2\u009c\u009d\7T\2\2\u009d\u00b3\3\2\2\2\u009e\u009f\7X\2\2\u009f"+
		"\u00a0\7F\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7G\2\2\u00a2\u00a5\7O"+
		"\2\2\u00a3\u00a6\5\34\17\2\u00a4\u00a6\5\24\13\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7T\2\2\u00a8\u00b3\3\2"+
		"\2\2\u00a9\u00aa\7X\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac\7Y\2\2\u00ac\u00b3"+
		"\7T\2\2\u00ad\u00ae\7X\2\2\u00ae\u00af\7O\2\2\u00af\u00b0\5$\23\2\u00b0"+
		"\u00b1\7T\2\2\u00b1\u00b3\3\2\2\2\u00b2\u0092\3\2\2\2\u00b2\u0099\3\2"+
		"\2\2\u00b2\u009e\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3"+
		"\21\3\2\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7T\2"+
		"\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\7X\2\2\u00ba\u00bb"+
		"\5\34\17\2\u00bb\u00bc\7T\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\7\7\2\2"+
		"\u00be\u00bf\5\24\13\2\u00bf\u00c0\7T\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b4"+
		"\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\23\3\2\2\2\u00c3"+
		"\u00c5\7Y\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\7Y\2\2\u00c8\u00c9\7U\2\2\u00c9"+
		"\u00d3\5\24\13\2\u00ca\u00cc\5\34\17\2\u00cb\u00cd\5\24\13\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\5\34\17\2"+
		"\u00cf\u00d0\7U\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d3\3\2\2\2\u00d2\u00c3"+
		"\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3"+
		"\25\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\7T\2"+
		"\2\u00d7\27\3\2\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7U\2\2\u00da\u00e5"+
		"\5\30\r\2\u00db\u00e5\7V\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de\7U\2\2\u00de"+
		"\u00e5\5\30\r\2\u00df\u00e5\7W\2\2\u00e0\u00e1\7X\2\2\u00e1\u00e2\7U\2"+
		"\2\u00e2\u00e5\5\30\r\2\u00e3\u00e5\7X\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00db"+
		"\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\7X\2\2"+
		"\u00e8\u00e9\7F\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\7G\2\2\u00eb\u00ec"+
		"\7T\2\2\u00ec\u00f1\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee\u00ef\7X\2\2\u00ef"+
		"\u00f1\7T\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\33\3\2\2\2"+
		"\u00f2\u00f3\b\17\1\2\u00f3\u00f4\7Q\2\2\u00f4\u0118\7X\2\2\u00f5\u00f6"+
		"\7I\2\2\u00f6\u0118\5\34\17\26\u00f7\u00f8\7X\2\2\u00f8\u00f9\7F\2\2\u00f9"+
		"\u00fa\5\34\17\2\u00fa\u00fb\7G\2\2\u00fb\u0118\3\2\2\2\u00fc\u00fd\7"+
		"F\2\2\u00fd\u00fe\5\34\17\2\u00fe\u00ff\7G\2\2\u00ff\u0118\3\2\2\2\u0100"+
		"\u0118\7W\2\2\u0101\u0118\7V\2\2\u0102\u0118\7\20\2\2\u0103\u0118\7\21"+
		"\2\2\u0104\u0118\7R\2\2\u0105\u0106\7X\2\2\u0106\u0107\7U\2\2\u0107\u0118"+
		"\5\34\17\t\u0108\u0118\7X\2\2\u0109\u010a\7D\2\2\u010a\u010b\5\34\17\2"+
		"\u010b\u010c\7E\2\2\u010c\u0118\3\2\2\2\u010d\u010e\7X\2\2\u010e\u010f"+
		"\7D\2\2\u010f\u0110\5\34\17\2\u0110\u0111\7E\2\2\u0111\u0118\3\2\2\2\u0112"+
		"\u0113\7X\2\2\u0113\u0114\7D\2\2\u0114\u0118\7E\2\2\u0115\u0116\7P\2\2"+
		"\u0116\u0118\5\34\17\3\u0117\u00f2\3\2\2\2\u0117\u00f5\3\2\2\2\u0117\u00f7"+
		"\3\2\2\2\u0117\u00fc\3\2\2\2\u0117\u0100\3\2\2\2\u0117\u0101\3\2\2\2\u0117"+
		"\u0102\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0104\3\2\2\2\u0117\u0105\3\2"+
		"\2\2\u0117\u0108\3\2\2\2\u0117\u0109\3\2\2\2\u0117\u010d\3\2\2\2\u0117"+
		"\u0112\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0130\3\2\2\2\u0119\u011a\f\30"+
		"\2\2\u011a\u011b\7H\2\2\u011b\u012f\5\34\17\31\u011c\u011d\f\23\2\2\u011d"+
		"\u011e\7I\2\2\u011e\u012f\5\34\17\24\u011f\u0120\f\22\2\2\u0120\u0121"+
		"\7L\2\2\u0121\u012f\5\34\17\23\u0122\u0123\f\21\2\2\u0123\u0124\7J\2\2"+
		"\u0124\u012f\5\34\17\22\u0125\u0126\f\20\2\2\u0126\u0127\7K\2\2\u0127"+
		"\u012f\5\34\17\21\u0128\u0129\f\17\2\2\u0129\u012a\t\5\2\2\u012a\u012f"+
		"\5\34\17\20\u012b\u012c\f\5\2\2\u012c\u012d\7U\2\2\u012d\u012f\5\34\17"+
		"\6\u012e\u0119\3\2\2\2\u012e\u011c\3\2\2\2\u012e\u011f\3\2\2\2\u012e\u0122"+
		"\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\35\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0133\u0134\7\26\2\2\u0134\u0135\7X\2\2\u0135\u0136"+
		"\7O\2\2\u0136\u0137\5\34\17\2\u0137\u0138\7\35\2\2\u0138\u013c\5\34\17"+
		"\2\u0139\u013a\7$\2\2\u013a\u013b\7%\2\2\u013b\u013d\5\34\17\2\u013c\u0139"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\7\17\2\2"+
		"\u013f\u0141\5\b\5\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7\27\2\2\u0146\37\3\2\2\2\u0147\u0149\7\23\2\2\u0148\u014a\7D\2"+
		"\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d"+
		"\5$\23\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0152\7E\2\2\u0151\u0150\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\7\17\2\2\u0154"+
		"\u0156\5\b\5\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\7\24\2\2\u015b!\3\2\2\2\u015c\u015d\7\13\2\2\u015d\u015e\5$\23"+
		"\2\u015e\u0162\7\31\2\2\u015f\u0161\5\b\5\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016c\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0169\7\f\2\2\u0166\u0168\5\b\5\2\u0167"+
		"\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0165\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\r\2\2\u016f#\3\2\2\2"+
		"\u0170\u0171\5\34\17\2\u0171\u0172\7R\2\2\u0172\u0173\5$\23\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0176\5\34\17\2\u0175\u0170\3\2\2\2\u0175\u0174\3\2\2\2"+
		"\u0176%\3\2\2\2\u0177\u0178\7\16\2\2\u0178\u0179\5\34\17\2\u0179\u0185"+
		"\7\17\2\2\u017a\u017b\7\37\2\2\u017b\u017c\5\34\17\2\u017c\u0180\7S\2"+
		"\2\u017d\u017f\5\b\5\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u017a\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0192\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7 \2\2\u0189"+
		"\u018a\7!\2\2\u018a\u018b\7\"\2\2\u018b\u018f\7S\2\2\u018c\u018e\5\b\5"+
		"\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0188\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\22\2\2\u0195\'\3\2\2"+
		"\2\u0196\u019a\7\25\2\2\u0197\u0199\5\b\5\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\35\2\2\u019e\u019f\7#\2\2\u019f"+
		"\u01a0\7X\2\2\u01a0\u01a1\7R\2\2\u01a1\u01a2\7V\2\2\u01a2)\3\2\2\2)\61"+
		">DJW^ekx\177\u0084\u0090\u0095\u00a5\u00b2\u00c1\u00c5\u00cc\u00d2\u00e4"+
		"\u00f0\u0117\u012e\u0130\u013c\u0142\u0149\u014e\u0151\u0157\u0162\u0169"+
		"\u016c\u0175\u0180\u0185\u018f\u0192\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}