// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#subproceso1}.
	 * @param ctx the parse tree
	 */
	void enterSubproceso1(MyLanguageParser.Subproceso1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#subproceso1}.
	 * @param ctx the parse tree
	 */
	void exitSubproceso1(MyLanguageParser.Subproceso1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#proceso1}.
	 * @param ctx the parse tree
	 */
	void enterProceso1(MyLanguageParser.Proceso1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#proceso1}.
	 * @param ctx the parse tree
	 */
	void exitProceso1(MyLanguageParser.Proceso1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(MyLanguageParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(MyLanguageParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(MyLanguageParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(MyLanguageParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#varios_id}.
	 * @param ctx the parse tree
	 */
	void enterVarios_id(MyLanguageParser.Varios_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#varios_id}.
	 * @param ctx the parse tree
	 */
	void exitVarios_id(MyLanguageParser.Varios_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#asignacion1}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion1(MyLanguageParser.Asignacion1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#asignacion1}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion1(MyLanguageParser.Asignacion1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(MyLanguageParser.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(MyLanguageParser.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#contenido_escribir}.
	 * @param ctx the parse tree
	 */
	void enterContenido_escribir(MyLanguageParser.Contenido_escribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#contenido_escribir}.
	 * @param ctx the parse tree
	 */
	void exitContenido_escribir(MyLanguageParser.Contenido_escribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#def_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterDef_arreglo(MyLanguageParser.Def_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#def_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitDef_arreglo(MyLanguageParser.Def_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#varios_valores}.
	 * @param ctx the parse tree
	 */
	void enterVarios_valores(MyLanguageParser.Varios_valoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#varios_valores}.
	 * @param ctx the parse tree
	 */
	void exitVarios_valores(MyLanguageParser.Varios_valoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(MyLanguageParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(MyLanguageParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_para(MyLanguageParser.Ciclo_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_para(MyLanguageParser.Ciclo_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras(MyLanguageParser.Ciclo_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras(MyLanguageParser.Ciclo_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MyLanguageParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MyLanguageParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MyLanguageParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MyLanguageParser.BooleanExprContext ctx);
}