grammar MyLanguage;		

commands 	: subproceso1 //proceso1 subproceso1
//			| EOF
	//		|
			;

subproceso1	: SUBPROCESO ID instrucciones* (FINSUBPROCESO|FINFUNCION) subproceso1
			| SUBPROCESO ID ASIGNACION ID (PAR_IZQ ID* PAR_DER)* instrucciones* (FINSUBPROCESO|FINFUNCION) subproceso1
			| SUBPROCESO ID PAR_IZQ varios_id PAR_DER instrucciones* (FINSUBPROCESO|FINFUNCION) subproceso1
		//	|  // Funcion que no recibe parametros
	//		| EOF  // Esta linea  la puse para que no me marcara error,
			| proceso1 
			;
	
proceso1	: (PROCESO|ALGORITMO) ID instrucciones* (FINPROCESO|FINALGORITMO)
			| EOF
			|
			;
	
instrucciones 	: definicion 
			| asignacion1
			| escribir
			| def_arreglo
			| leer
			| ciclo_para
			| ciclo_mientras
			| condicional
			| segun1
			| llamar_funcion
			| ciclo_repetir
			//| ID PAR_IZQ expr PAR_DER SMCOLON // Una funcion que es llamada pero no se guarda su valor de retorno
			;
			
llamar_funcion : ID PAR_IZQ llamar_funcion PAR_DER (SMCOLON)?
			//| llamar_funcion expr
			| expr
			| ID SMCOLON // LLama un funcion sin usar parametros: hola;
			;
			
			

definicion  : DEFINIR varios_id COMO VAR SMCOLON;

varios_id   : ID COMMA varios_id  // Esta gramatica se usa para definir varias variables a la  vez
			| ID 
			;
			
asignacion1 : ID ASIGNACION (SUMOP)? ID SMCOLON
			| ID ASIGNACION expr SMCOLON // Asignacion de funciones
			| ID COR_IZQ expr COR_DER ASIGNACION (expr |contenido_escribir ) SMCOLON  // Asignacion para matrices
			| ID ASIGNACION MENSAJE SMCOLON// Se asigna una cadena ans <- "Hola";
			| ID ASIGNACION booleanExpr SMCOLON
			;

escribir	: ESCRIBIR expr SMCOLON
			| ESCRIBIR ID expr SMCOLON
			| ESCRIBIR contenido_escribir SMCOLON
			;

contenido_escribir : MENSAJE (contenido_escribir)?
			| MENSAJE COMMA contenido_escribir
			| expr (contenido_escribir)?
			| expr COMMA contenido_escribir
			;			

		
def_arreglo : DIMENSION expr SMCOLON;

varios_valores : ENTERO COMMA varios_valores  // Esta gramatica se usa para definir los valores internos de una matriz, como no cuales son posibles puse todos los tipos de datos
			| ENTERO
			| REAL COMMA varios_valores
			| REAL
			| ID COMMA varios_valores
			| ID
			;		

leer 		: LEER ID COR_IZQ varios_valores COR_DER SMCOLON
			| LEER ID SMCOLON
			;

expr 		:   expr MULOP expr
			|   NO_ID ID
			|   SUMOP expr
			|   ID COR_IZQ expr COR_DER
			|   COR_IZQ expr COR_DER
		    |	expr SUMOP expr
		    |	expr POTENCIA expr
		    |	expr MODOP expr
		    |	expr MODULO expr
		   // |   expr ('&'|'|'| Y | O) expr //Corregir
		    |   expr (AND_OP | OR_OP) expr
		    |	REAL
		    |   ENTERO
		    |   VERDADERO
		    |   FALSO
		    |   ROP
		    |   ID COMMA expr
		    |   ID 
		    |	PAR_IZQ expr PAR_DER
		    |   ID PAR_IZQ expr PAR_DER
		    |   expr COMMA expr
		    |   ID PAR_IZQ PAR_DER  // Funcion sin argumentos
		    |   NEGACION expr
			;
			
ciclo_para  : PARA  ID ASIGNACION expr HASTA expr (CON PASO expr)? HACER instrucciones* FINPARA; 		

ciclo_mientras : MIENTRAS (PAR_IZQ)? booleanExpr+ (PAR_DER)? HACER instrucciones* FINMIENTRAS;	

condicional : SI booleanExpr ENTONCES instrucciones* (SINO instrucciones*)? FINSI; 
booleanExpr : expr ROP booleanExpr
			| expr
			;
 
segun1 		: SEGUN expr HACER (CASO expr DOS_PUNTOS instrucciones*)* (DE OTRO MODO DOS_PUNTOS instrucciones*)? FINSEGUN;

ciclo_repetir : REPETIR instrucciones* HASTA QUE ID ROP ENTERO;      
 
 
    
// Seccion de palabras reservadas
ALGORITMO:  A L G O R I T M O;
FINALGORITMO: F I N A L G O R I T M O;
PROCESO: P R O C E S O;
FINPROCESO: F I N P R O C E S O;
ESCRIBIR: E S C R I B I R;
COMO: C O M O;
LEER: L E E R;
DIMENSION: D I M E N S I O N;
SI: S I;
SINO: S I N O;
FINSI: F I N S I;
SEGUN: S E G U N;
HACER: H A C E R;
VERDADERO: V E R D A D E R O;
FALSO: F A L S O;
FINSEGUN: F I N S E G U N;
MIENTRAS: M I E N T R A S;
FINMIENTRAS: F I N M I E N T R A S;
REPETIR: R E P E T I R;
PARA: P A R A;
FINPARA: F I N P A R A;
DEFINIR: D E F I N I R;
ENTONCES: E N T O N C E S;

RESERVADAS: (SI | SINO | FALSO);

//nuevas
SUBPROCESO: S U B P R O C E S O;
FINSUBPROCESO : F I N S U B P R O C E S O; 
HASTA	: H A S T A;
FINFUNCION : F I N F U N C I O N;
CASO : C A S O;
DE:  D E;
OTRO: O T R O;
MODO: M O D O;
QUE:  Q U E;
CON: C O N;
PASO: P A S O;
// MOD : M O D;

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;   
    
// Seccion tipos de variables
VAR   	 : ( R E A L | E N T E R O | N U M E R I C O | L O G I C O | C A R A C T E R | T E X T O | C A D E N A | N U M E R O);

   
// Seccion de caracteres
A : 'a' | 'A';
B : 'b' | 'B';
C: 'c' | 'C';
D: 'd' | 'D';
E: 'e' | 'E';
F: 'f' | 'F';
G: 'g' | 'G';
H: 'h' | 'H';
I: 'i' | 'I';
J: 'j' | 'J';
K: 'k' | 'K';
L: 'l' | 'L';
M: 'm' | 'M';
N: 'n' | 'N';
O: 'o' | 'O';
P: 'p' | 'P';
Q: 'q' | 'Q';
R: 'r' | 'R';
S: 's' | 'S';
T: 't' | 'T';
U: 'u' | 'U';
V: 'v' | 'V';
W: 'w' | 'W';
X: 'x' | 'X';
Y: 'y' | 'Y';
Z: 'z' | 'Z';

// Seccion tokens
PAR_IZQ : '(' ;
PAR_DER : ')' ;
COR_IZQ : '[';
COR_DER :']';

// Operadores
MULOP	: ( '*'|'/' );
SUMOP	: ('+'|'-');
MODOP   : '%';
MODULO  : M O D;
POTENCIA : '^';

//AMPERSAND : '&';
//OR_OP    : '|';
//COMILLAS : '"';
//COMPARADOR : '=';
AND_OP : ('&' | Y);
OR_OP : ('|' | O);

ASIGNACION : '<-';
NEGACION : '~';
NO_ID : N O;
ROP   	 :  ( '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|');
DOS_PUNTOS : ( ':' );  
SMCOLON : ';' ;  
COMMA: ',';
ENTERO : [0-9]+;  // Si no funcionan bien los tipos de datos mover ENTERO despues de REAL
REAL   : [0-9]+( | [.][0-9]+);

ID    	 : [a-zA-Z][a-zA-Z0-9_]*; // Esta es la expresion para los ID, segun veo esta bien. no se porque no funciona con caracteres individuales
//CONTENIDO_IMPRIMIBLE : ( S I | [a-zA-Z0-9_])+;
MENSAJE : ('"'| '\'' ) .*? ('"'| '\'' ); // Puede comenzar con comilla simple y terminar con comilla doble
// COMMENT 		: '"' .*? '"';




