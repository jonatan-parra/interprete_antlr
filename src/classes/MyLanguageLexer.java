// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ALGORITMO=3, FINALGORITMO=4, PROCESO=5, FINPROCESO=6, 
		ESCRIBIR=7, COMO=8, LEER=9, DIMENSION=10, SI=11, SINO=12, FINSI=13, SEGUN=14, 
		HACER=15, VERDADERO=16, FALSO=17, FINSEGUN=18, MIENTRAS=19, FINMIENTRAS=20, 
		REPETIR=21, PARA=22, FINPARA=23, DEFINIR=24, ENTONCES=25, RESERVADAS=26, 
		SUBPROCESO=27, FINSUBPROCESO=28, HASTA=29, FINFUNCION=30, CASO=31, DE=32, 
		OTRO=33, MODO=34, COMMENT=35, LINE_COMMENT=36, WS=37, VAR=38, A=39, B=40, 
		C=41, D=42, E=43, F=44, G=45, H=46, I=47, J=48, K=49, L=50, M=51, N=52, 
		O=53, P=54, Q=55, R=56, S=57, T=58, U=59, V=60, W=61, X=62, Y=63, Z=64, 
		PAR_IZQ=65, PAR_DER=66, COR_IZQ=67, COR_DER=68, MULOP=69, SUMOP=70, MODOP=71, 
		MODULO=72, POTENCIA=73, ASIGNACION=74, NEGACION=75, ROP=76, DOS_PUNTOS=77, 
		SMCOLON=78, COMMA=79, REAL=80, ENTERO=81, ID=82, MENSAJE=83;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ALGORITMO", "FINALGORITMO", "PROCESO", "FINPROCESO", 
		"ESCRIBIR", "COMO", "LEER", "DIMENSION", "SI", "SINO", "FINSI", "SEGUN", 
		"HACER", "VERDADERO", "FALSO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", 
		"REPETIR", "PARA", "FINPARA", "DEFINIR", "ENTONCES", "RESERVADAS", "SUBPROCESO", 
		"FINSUBPROCESO", "HASTA", "FINFUNCION", "CASO", "DE", "OTRO", "MODO", 
		"COMMENT", "LINE_COMMENT", "WS", "VAR", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", 
		"MULOP", "SUMOP", "MODOP", "MODULO", "POTENCIA", "ASIGNACION", "NEGACION", 
		"ROP", "DOS_PUNTOS", "SMCOLON", "COMMA", "REAL", "ENTERO", "ID", "MENSAJE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'|'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'('", "')'", "'['", "']'", null, null, 
		"'%'", null, "'^'", "'<-'", "'~'", null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ALGORITMO", "FINALGORITMO", "PROCESO", "FINPROCESO", 
		"ESCRIBIR", "COMO", "LEER", "DIMENSION", "SI", "SINO", "FINSI", "SEGUN", 
		"HACER", "VERDADERO", "FALSO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", 
		"REPETIR", "PARA", "FINPARA", "DEFINIR", "ENTONCES", "RESERVADAS", "SUBPROCESO", 
		"FINSUBPROCESO", "HASTA", "FINFUNCION", "CASO", "DE", "OTRO", "MODO", 
		"COMMENT", "LINE_COMMENT", "WS", "VAR", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", 
		"MULOP", "SUMOP", "MODOP", "MODULO", "POTENCIA", "ASIGNACION", "NEGACION", 
		"ROP", "DOS_PUNTOS", "SMCOLON", "COMMA", "REAL", "ENTERO", "ID", "MENSAJE"
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2U\u0278\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\5\33\u0166\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u01a8\n$\f$\16$\u01ab"+
		"\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u01b6\n%\f%\16%\u01b9\13%\3%\3%\3&"+
		"\6&\u01be\n&\r&\16&\u01bf\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f6\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3"+
		"I\3J\3J\3K\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u024e\nM\3N\3N\3"+
		"O\3O\3P\3P\3Q\6Q\u0257\nQ\rQ\16Q\u0258\3Q\3Q\3Q\6Q\u025e\nQ\rQ\16Q\u025f"+
		"\5Q\u0262\nQ\3R\6R\u0265\nR\rR\16R\u0266\3S\3S\7S\u026b\nS\fS\16S\u026e"+
		"\13S\3T\3T\7T\u0272\nT\fT\16T\u0275\13T\3T\3T\4\u01a9\u0273\2U\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\3\2&\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2,,\61\61\4\2--//\4"+
		"\2>>@@\4\2((~~\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|\u028d\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9"+
		"\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2\2\t\u00b7\3\2\2\2\13\u00c4\3\2"+
		"\2\2\r\u00cc\3\2\2\2\17\u00d7\3\2\2\2\21\u00e0\3\2\2\2\23\u00e5\3\2\2"+
		"\2\25\u00ea\3\2\2\2\27\u00f4\3\2\2\2\31\u00f7\3\2\2\2\33\u00fc\3\2\2\2"+
		"\35\u0102\3\2\2\2\37\u0108\3\2\2\2!\u010e\3\2\2\2#\u0118\3\2\2\2%\u011e"+
		"\3\2\2\2\'\u0127\3\2\2\2)\u0130\3\2\2\2+\u013c\3\2\2\2-\u0144\3\2\2\2"+
		"/\u0149\3\2\2\2\61\u0151\3\2\2\2\63\u0159\3\2\2\2\65\u0165\3\2\2\2\67"+
		"\u0167\3\2\2\29\u0172\3\2\2\2;\u0180\3\2\2\2=\u0186\3\2\2\2?\u0191\3\2"+
		"\2\2A\u0196\3\2\2\2C\u0199\3\2\2\2E\u019e\3\2\2\2G\u01a3\3\2\2\2I\u01b1"+
		"\3\2\2\2K\u01bd\3\2\2\2M\u01f5\3\2\2\2O\u01f7\3\2\2\2Q\u01f9\3\2\2\2S"+
		"\u01fb\3\2\2\2U\u01fd\3\2\2\2W\u01ff\3\2\2\2Y\u0201\3\2\2\2[\u0203\3\2"+
		"\2\2]\u0205\3\2\2\2_\u0207\3\2\2\2a\u0209\3\2\2\2c\u020b\3\2\2\2e\u020d"+
		"\3\2\2\2g\u020f\3\2\2\2i\u0211\3\2\2\2k\u0213\3\2\2\2m\u0215\3\2\2\2o"+
		"\u0217\3\2\2\2q\u0219\3\2\2\2s\u021b\3\2\2\2u\u021d\3\2\2\2w\u021f\3\2"+
		"\2\2y\u0221\3\2\2\2{\u0223\3\2\2\2}\u0225\3\2\2\2\177\u0227\3\2\2\2\u0081"+
		"\u0229\3\2\2\2\u0083\u022b\3\2\2\2\u0085\u022d\3\2\2\2\u0087\u022f\3\2"+
		"\2\2\u0089\u0231\3\2\2\2\u008b\u0233\3\2\2\2\u008d\u0235\3\2\2\2\u008f"+
		"\u0237\3\2\2\2\u0091\u0239\3\2\2\2\u0093\u023d\3\2\2\2\u0095\u023f\3\2"+
		"\2\2\u0097\u0242\3\2\2\2\u0099\u024d\3\2\2\2\u009b\u024f\3\2\2\2\u009d"+
		"\u0251\3\2\2\2\u009f\u0253\3\2\2\2\u00a1\u0256\3\2\2\2\u00a3\u0264\3\2"+
		"\2\2\u00a5\u0268\3\2\2\2\u00a7\u026f\3\2\2\2\u00a9\u00aa\7(\2\2\u00aa"+
		"\4\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\5O(\2\u00ae"+
		"\u00af\5e\63\2\u00af\u00b0\5[.\2\u00b0\u00b1\5k\66\2\u00b1\u00b2\5q9\2"+
		"\u00b2\u00b3\5_\60\2\u00b3\u00b4\5u;\2\u00b4\u00b5\5g\64\2\u00b5\u00b6"+
		"\5k\66\2\u00b6\b\3\2\2\2\u00b7\u00b8\5Y-\2\u00b8\u00b9\5_\60\2\u00b9\u00ba"+
		"\5i\65\2\u00ba\u00bb\5O(\2\u00bb\u00bc\5e\63\2\u00bc\u00bd\5[.\2\u00bd"+
		"\u00be\5k\66\2\u00be\u00bf\5q9\2\u00bf\u00c0\5_\60\2\u00c0\u00c1\5u;\2"+
		"\u00c1\u00c2\5g\64\2\u00c2\u00c3\5k\66\2\u00c3\n\3\2\2\2\u00c4\u00c5\5"+
		"m\67\2\u00c5\u00c6\5q9\2\u00c6\u00c7\5k\66\2\u00c7\u00c8\5S*\2\u00c8\u00c9"+
		"\5W,\2\u00c9\u00ca\5s:\2\u00ca\u00cb\5k\66\2\u00cb\f\3\2\2\2\u00cc\u00cd"+
		"\5Y-\2\u00cd\u00ce\5_\60\2\u00ce\u00cf\5i\65\2\u00cf\u00d0\5m\67\2\u00d0"+
		"\u00d1\5q9\2\u00d1\u00d2\5k\66\2\u00d2\u00d3\5S*\2\u00d3\u00d4\5W,\2\u00d4"+
		"\u00d5\5s:\2\u00d5\u00d6\5k\66\2\u00d6\16\3\2\2\2\u00d7\u00d8\5W,\2\u00d8"+
		"\u00d9\5s:\2\u00d9\u00da\5S*\2\u00da\u00db\5q9\2\u00db\u00dc\5_\60\2\u00dc"+
		"\u00dd\5Q)\2\u00dd\u00de\5_\60\2\u00de\u00df\5q9\2\u00df\20\3\2\2\2\u00e0"+
		"\u00e1\5S*\2\u00e1\u00e2\5k\66\2\u00e2\u00e3\5g\64\2\u00e3\u00e4\5k\66"+
		"\2\u00e4\22\3\2\2\2\u00e5\u00e6\5e\63\2\u00e6\u00e7\5W,\2\u00e7\u00e8"+
		"\5W,\2\u00e8\u00e9\5q9\2\u00e9\24\3\2\2\2\u00ea\u00eb\5U+\2\u00eb\u00ec"+
		"\5_\60\2\u00ec\u00ed\5g\64\2\u00ed\u00ee\5W,\2\u00ee\u00ef\5i\65\2\u00ef"+
		"\u00f0\5s:\2\u00f0\u00f1\5_\60\2\u00f1\u00f2\5k\66\2\u00f2\u00f3\5i\65"+
		"\2\u00f3\26\3\2\2\2\u00f4\u00f5\5s:\2\u00f5\u00f6\5_\60\2\u00f6\30\3\2"+
		"\2\2\u00f7\u00f8\5s:\2\u00f8\u00f9\5_\60\2\u00f9\u00fa\5i\65\2\u00fa\u00fb"+
		"\5k\66\2\u00fb\32\3\2\2\2\u00fc\u00fd\5Y-\2\u00fd\u00fe\5_\60\2\u00fe"+
		"\u00ff\5i\65\2\u00ff\u0100\5s:\2\u0100\u0101\5_\60\2\u0101\34\3\2\2\2"+
		"\u0102\u0103\5s:\2\u0103\u0104\5W,\2\u0104\u0105\5[.\2\u0105\u0106\5w"+
		"<\2\u0106\u0107\5i\65\2\u0107\36\3\2\2\2\u0108\u0109\5]/\2\u0109\u010a"+
		"\5O(\2\u010a\u010b\5S*\2\u010b\u010c\5W,\2\u010c\u010d\5q9\2\u010d \3"+
		"\2\2\2\u010e\u010f\5y=\2\u010f\u0110\5W,\2\u0110\u0111\5q9\2\u0111\u0112"+
		"\5U+\2\u0112\u0113\5O(\2\u0113\u0114\5U+\2\u0114\u0115\5W,\2\u0115\u0116"+
		"\5q9\2\u0116\u0117\5k\66\2\u0117\"\3\2\2\2\u0118\u0119\5Y-\2\u0119\u011a"+
		"\5O(\2\u011a\u011b\5e\63\2\u011b\u011c\5s:\2\u011c\u011d\5k\66\2\u011d"+
		"$\3\2\2\2\u011e\u011f\5Y-\2\u011f\u0120\5_\60\2\u0120\u0121\5i\65\2\u0121"+
		"\u0122\5s:\2\u0122\u0123\5W,\2\u0123\u0124\5[.\2\u0124\u0125\5w<\2\u0125"+
		"\u0126\5i\65\2\u0126&\3\2\2\2\u0127\u0128\5g\64\2\u0128\u0129\5_\60\2"+
		"\u0129\u012a\5W,\2\u012a\u012b\5i\65\2\u012b\u012c\5u;\2\u012c\u012d\5"+
		"q9\2\u012d\u012e\5O(\2\u012e\u012f\5s:\2\u012f(\3\2\2\2\u0130\u0131\5"+
		"Y-\2\u0131\u0132\5_\60\2\u0132\u0133\5i\65\2\u0133\u0134\5g\64\2\u0134"+
		"\u0135\5_\60\2\u0135\u0136\5W,\2\u0136\u0137\5i\65\2\u0137\u0138\5u;\2"+
		"\u0138\u0139\5q9\2\u0139\u013a\5O(\2\u013a\u013b\5s:\2\u013b*\3\2\2\2"+
		"\u013c\u013d\5q9\2\u013d\u013e\5W,\2\u013e\u013f\5m\67\2\u013f\u0140\5"+
		"W,\2\u0140\u0141\5u;\2\u0141\u0142\5_\60\2\u0142\u0143\5q9\2\u0143,\3"+
		"\2\2\2\u0144\u0145\5m\67\2\u0145\u0146\5O(\2\u0146\u0147\5q9\2\u0147\u0148"+
		"\5O(\2\u0148.\3\2\2\2\u0149\u014a\5Y-\2\u014a\u014b\5_\60\2\u014b\u014c"+
		"\5i\65\2\u014c\u014d\5m\67\2\u014d\u014e\5O(\2\u014e\u014f\5q9\2\u014f"+
		"\u0150\5O(\2\u0150\60\3\2\2\2\u0151\u0152\5U+\2\u0152\u0153\5W,\2\u0153"+
		"\u0154\5Y-\2\u0154\u0155\5_\60\2\u0155\u0156\5i\65\2\u0156\u0157\5_\60"+
		"\2\u0157\u0158\5q9\2\u0158\62\3\2\2\2\u0159\u015a\5W,\2\u015a\u015b\5"+
		"i\65\2\u015b\u015c\5u;\2\u015c\u015d\5k\66\2\u015d\u015e\5i\65\2\u015e"+
		"\u015f\5S*\2\u015f\u0160\5W,\2\u0160\u0161\5s:\2\u0161\64\3\2\2\2\u0162"+
		"\u0166\5\27\f\2\u0163\u0166\5\31\r\2\u0164\u0166\5#\22\2\u0165\u0162\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\66\3\2\2\2\u0167"+
		"\u0168\5s:\2\u0168\u0169\5w<\2\u0169\u016a\5Q)\2\u016a\u016b\5m\67\2\u016b"+
		"\u016c\5q9\2\u016c\u016d\5k\66\2\u016d\u016e\5S*\2\u016e\u016f\5W,\2\u016f"+
		"\u0170\5s:\2\u0170\u0171\5k\66\2\u01718\3\2\2\2\u0172\u0173\5Y-\2\u0173"+
		"\u0174\5_\60\2\u0174\u0175\5i\65\2\u0175\u0176\5s:\2\u0176\u0177\5w<\2"+
		"\u0177\u0178\5Q)\2\u0178\u0179\5m\67\2\u0179\u017a\5q9\2\u017a\u017b\5"+
		"k\66\2\u017b\u017c\5S*\2\u017c\u017d\5W,\2\u017d\u017e\5s:\2\u017e\u017f"+
		"\5k\66\2\u017f:\3\2\2\2\u0180\u0181\5]/\2\u0181\u0182\5O(\2\u0182\u0183"+
		"\5s:\2\u0183\u0184\5u;\2\u0184\u0185\5O(\2\u0185<\3\2\2\2\u0186\u0187"+
		"\5Y-\2\u0187\u0188\5_\60\2\u0188\u0189\5i\65\2\u0189\u018a\5Y-\2\u018a"+
		"\u018b\5w<\2\u018b\u018c\5i\65\2\u018c\u018d\5S*\2\u018d\u018e\5_\60\2"+
		"\u018e\u018f\5k\66\2\u018f\u0190\5i\65\2\u0190>\3\2\2\2\u0191\u0192\5"+
		"S*\2\u0192\u0193\5O(\2\u0193\u0194\5s:\2\u0194\u0195\5k\66\2\u0195@\3"+
		"\2\2\2\u0196\u0197\5U+\2\u0197\u0198\5W,\2\u0198B\3\2\2\2\u0199\u019a"+
		"\5k\66\2\u019a\u019b\5u;\2\u019b\u019c\5q9\2\u019c\u019d\5k\66\2\u019d"+
		"D\3\2\2\2\u019e\u019f\5g\64\2\u019f\u01a0\5k\66\2\u01a0\u01a1\5U+\2\u01a1"+
		"\u01a2\5k\66\2\u01a2F\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7,\2\2"+
		"\u01a5\u01a9\3\2\2\2\u01a6\u01a8\13\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\b$\2\2\u01b0H\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b3"+
		"\7\61\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b6\n\2\2\2\u01b5\u01b4\3\2\2\2"+
		"\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\b%\2\2\u01bbJ\3\2\2\2\u01bc\u01be"+
		"\t\3\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\b&\2\2\u01c2L\3\2\2\2\u01c3"+
		"\u01c4\5q9\2\u01c4\u01c5\5W,\2\u01c5\u01c6\5O(\2\u01c6\u01c7\5e\63\2\u01c7"+
		"\u01f6\3\2\2\2\u01c8\u01c9\5W,\2\u01c9\u01ca\5i\65\2\u01ca\u01cb\5u;\2"+
		"\u01cb\u01cc\5W,\2\u01cc\u01cd\5q9\2\u01cd\u01ce\5k\66\2\u01ce\u01f6\3"+
		"\2\2\2\u01cf\u01d0\5i\65\2\u01d0\u01d1\5w<\2\u01d1\u01d2\5g\64\2\u01d2"+
		"\u01d3\5W,\2\u01d3\u01d4\5q9\2\u01d4\u01d5\5_\60\2\u01d5\u01d6\5S*\2\u01d6"+
		"\u01d7\5k\66\2\u01d7\u01f6\3\2\2\2\u01d8\u01d9\5e\63\2\u01d9\u01da\5k"+
		"\66\2\u01da\u01db\5[.\2\u01db\u01dc\5_\60\2\u01dc\u01dd\5S*\2\u01dd\u01de"+
		"\5k\66\2\u01de\u01f6\3\2\2\2\u01df\u01e0\5S*\2\u01e0\u01e1\5O(\2\u01e1"+
		"\u01e2\5q9\2\u01e2\u01e3\5O(\2\u01e3\u01e4\5S*\2\u01e4\u01e5\5u;\2\u01e5"+
		"\u01e6\5W,\2\u01e6\u01e7\5q9\2\u01e7\u01f6\3\2\2\2\u01e8\u01e9\5u;\2\u01e9"+
		"\u01ea\5W,\2\u01ea\u01eb\5}?\2\u01eb\u01ec\5u;\2\u01ec\u01ed\5k\66\2\u01ed"+
		"\u01f6\3\2\2\2\u01ee\u01ef\5S*\2\u01ef\u01f0\5O(\2\u01f0\u01f1\5U+\2\u01f1"+
		"\u01f2\5W,\2\u01f2\u01f3\5i\65\2\u01f3\u01f4\5O(\2\u01f4\u01f6\3\2\2\2"+
		"\u01f5\u01c3\3\2\2\2\u01f5\u01c8\3\2\2\2\u01f5\u01cf\3\2\2\2\u01f5\u01d8"+
		"\3\2\2\2\u01f5\u01df\3\2\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f6"+
		"N\3\2\2\2\u01f7\u01f8\t\4\2\2\u01f8P\3\2\2\2\u01f9\u01fa\t\5\2\2\u01fa"+
		"R\3\2\2\2\u01fb\u01fc\t\6\2\2\u01fcT\3\2\2\2\u01fd\u01fe\t\7\2\2\u01fe"+
		"V\3\2\2\2\u01ff\u0200\t\b\2\2\u0200X\3\2\2\2\u0201\u0202\t\t\2\2\u0202"+
		"Z\3\2\2\2\u0203\u0204\t\n\2\2\u0204\\\3\2\2\2\u0205\u0206\t\13\2\2\u0206"+
		"^\3\2\2\2\u0207\u0208\t\f\2\2\u0208`\3\2\2\2\u0209\u020a\t\r\2\2\u020a"+
		"b\3\2\2\2\u020b\u020c\t\16\2\2\u020cd\3\2\2\2\u020d\u020e\t\17\2\2\u020e"+
		"f\3\2\2\2\u020f\u0210\t\20\2\2\u0210h\3\2\2\2\u0211\u0212\t\21\2\2\u0212"+
		"j\3\2\2\2\u0213\u0214\t\22\2\2\u0214l\3\2\2\2\u0215\u0216\t\23\2\2\u0216"+
		"n\3\2\2\2\u0217\u0218\t\24\2\2\u0218p\3\2\2\2\u0219\u021a\t\25\2\2\u021a"+
		"r\3\2\2\2\u021b\u021c\t\26\2\2\u021ct\3\2\2\2\u021d\u021e\t\27\2\2\u021e"+
		"v\3\2\2\2\u021f\u0220\t\30\2\2\u0220x\3\2\2\2\u0221\u0222\t\31\2\2\u0222"+
		"z\3\2\2\2\u0223\u0224\t\32\2\2\u0224|\3\2\2\2\u0225\u0226\t\33\2\2\u0226"+
		"~\3\2\2\2\u0227\u0228\t\34\2\2\u0228\u0080\3\2\2\2\u0229\u022a\t\35\2"+
		"\2\u022a\u0082\3\2\2\2\u022b\u022c\7*\2\2\u022c\u0084\3\2\2\2\u022d\u022e"+
		"\7+\2\2\u022e\u0086\3\2\2\2\u022f\u0230\7]\2\2\u0230\u0088\3\2\2\2\u0231"+
		"\u0232\7_\2\2\u0232\u008a\3\2\2\2\u0233\u0234\t\36\2\2\u0234\u008c\3\2"+
		"\2\2\u0235\u0236\t\37\2\2\u0236\u008e\3\2\2\2\u0237\u0238\7\'\2\2\u0238"+
		"\u0090\3\2\2\2\u0239\u023a\5g\64\2\u023a\u023b\5k\66\2\u023b\u023c\5U"+
		"+\2\u023c\u0092\3\2\2\2\u023d\u023e\7`\2\2\u023e\u0094\3\2\2\2\u023f\u0240"+
		"\7>\2\2\u0240\u0241\7/\2\2\u0241\u0096\3\2\2\2\u0242\u0243\7\u0080\2\2"+
		"\u0243\u0098\3\2\2\2\u0244\u024e\7?\2\2\u0245\u0246\7>\2\2\u0246\u024e"+
		"\7@\2\2\u0247\u024e\t \2\2\u0248\u0249\7>\2\2\u0249\u024e\7?\2\2\u024a"+
		"\u024b\7@\2\2\u024b\u024e\7?\2\2\u024c\u024e\t!\2\2\u024d\u0244\3\2\2"+
		"\2\u024d\u0245\3\2\2\2\u024d\u0247\3\2\2\2\u024d\u0248\3\2\2\2\u024d\u024a"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u009a\3\2\2\2\u024f\u0250\7<\2\2\u0250"+
		"\u009c\3\2\2\2\u0251\u0252\7=\2\2\u0252\u009e\3\2\2\2\u0253\u0254\7.\2"+
		"\2\u0254\u00a0\3\2\2\2\u0255\u0257\t\"\2\2\u0256\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0261\3\2\2\2\u025a"+
		"\u0262\3\2\2\2\u025b\u025d\t#\2\2\u025c\u025e\t\"\2\2\u025d\u025c\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u025a\3\2\2\2\u0261\u025b\3\2\2\2\u0262\u00a2\3\2"+
		"\2\2\u0263\u0265\t\"\2\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u00a4\3\2\2\2\u0268\u026c\t$"+
		"\2\2\u0269\u026b\t%\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u00a6\3\2\2\2\u026e\u026c\3\2"+
		"\2\2\u026f\u0273\7$\2\2\u0270\u0272\13\2\2\2\u0271\u0270\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7$\2\2\u0277\u00a8\3\2\2\2\17\2\u0165"+
		"\u01a9\u01b7\u01bf\u01f5\u024d\u0258\u025f\u0261\u0266\u026c\u0273\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}