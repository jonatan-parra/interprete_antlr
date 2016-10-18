// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#subproceso1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproceso1(MyLanguageParser.Subproceso1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#proceso1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceso1(MyLanguageParser.Proceso1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(MyLanguageParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(MyLanguageParser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(MyLanguageParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#varios_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarios_id(MyLanguageParser.Varios_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#asignacion1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion1(MyLanguageParser.Asignacion1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(MyLanguageParser.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#contenido_escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido_escribir(MyLanguageParser.Contenido_escribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#def_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arreglo(MyLanguageParser.Def_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#varios_valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarios_valores(MyLanguageParser.Varios_valoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(MyLanguageParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ciclo_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_para(MyLanguageParser.Ciclo_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_mientras(MyLanguageParser.Ciclo_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(MyLanguageParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MyLanguageParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#segun1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegun1(MyLanguageParser.Segun1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ciclo_repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_repetir(MyLanguageParser.Ciclo_repetirContext ctx);
}