/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang.math.NumberUtils;

import objetos.Objeto;

/**
 * @author Estudiante
 */
public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {

	/*
	 * @Override public T visitPrintexpr(PrintexprContext ctx){
	 * System.out.println("Entrando a visitor expr");
	 * System.out.println(ctx.expr().getText()); return
	 * super.visitPrintexpr(ctx); }
	 */

	public static String error;

	ArrayList<Objeto> table = new ArrayList<Objeto>();

	public void error() throws Exception {
		throw new Exception(error);
	}

	public void guardar(String id, String tipo) {
		table.add(new Objeto(id, tipo));
	}

	public Objeto buscar(String id) {
		for (Objeto objeto : table) {
			if (objeto.getId().equals(id)) {
				return objeto;
			}
		}
		return null;
	}

	/*
	 * Obtiene el tipo 1: Entero 2: Real 3: Cadena 4: Boolean 5: Matriz
	 */
	public int getTipo(Objeto obj) {
		String tipo = obj.getTipo();
		switch (tipo) {
		case "real":
			return 2;
		case "entero":
			return 1;
		case "numerico":
			return 2;
		case "logico":
			return 4;
		case "caracter":
			return 3;
		case "texto":
			return 3;
		case "cadena":
			return 3;
		case "numero":
			return 2;
		default:
			return -1;
		}
	}

	public boolean isInt(Double variable) {
		if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)) {
			return true;
		}
		return false;
	}

	@Override
	public T visitProceso1(MyLanguageParser.Proceso1Context ctx) {

		ctx.instrucciones();

		return visitChildren(ctx);
	}

	@Override
	public T visitDefinicion(MyLanguageParser.DefinicionContext ctx) {
		visitVarios_id(ctx.varios_id(), ctx.VAR());
		return null;
		// return visitChildren(ctx);
	}

	@Override
	public T visitVarios_id(MyLanguageParser.Varios_idContext ctx, TerminalNode var) {

		if (ctx.varios_id() == null) {
			guardar(ctx.ID().toString(), var.toString());
			return null;
		} else {
			guardar(ctx.ID().toString(), var.toString());
			return (T) visitVarios_id(ctx.varios_id(), var);
		}

	}

	@Override
	public T visitAsignacion1(MyLanguageParser.Asignacion1Context ctx) {

		Objeto obj = buscar(ctx.ID(0).toString());
		if (obj == null) {
			// SEMANTICO
			error = "Error, variable: " + ctx.ID(0) + " no definida.";
			Exception log = new Exception(error);
			System.out.println(error);
		}
		// Camino 1, asignar ID
		if (ctx.ID(1) != null) {
			Objeto obj2 = buscar(ctx.ID(1).toString());
			if (obj2 == null) {
				// SEMANTICO
				error = "Error, variable: " + ctx.ID(1) + " no definida.";
				System.out.println(error);
			} else if (obj2.getObjeto() == null) {
				// SEMANTICO
				error = "Error, variable: " + ctx.ID(1) + " no tiene valor.";
				System.out.println(error);
			} else {
				table.remove(obj);
				obj.setObjeto(obj2.getObjeto());
			}
		}
		// Camino 2 asigna expr
		else if (ctx.expr(1) == null && ctx.contenido_escribir() == null && ctx.expr(0) != null) {
			T tipo = visitExpr(ctx.expr(0));
			boolean isNumber = NumberUtils.isNumber(tipo.toString());
			if (getTipo(obj) == 1) {
				if (isNumber) {
					Double number = Double.valueOf(tipo.toString());
					if (isInt(number)) {
						obj.setObjeto(number + "");
					} else {
						error = "se esperaba un entero";
						System.out.println(error);
					}
				} else {
					error = "se esperaba un numero";
					System.out.println(error);

				}
			} else if (getTipo(obj) == 2) {
				if (isNumber) {
					Double number = Double.valueOf(tipo.toString());
					obj.setObjeto(number + "");
				} else {
					error = "se esperaba un numero";
					System.out.println(error);
				}
			} else if (getTipo(obj) == 3) {
				obj.setObjeto(tipo + "");
			} else if (getTipo(obj) == 4) {
				if (tipo.equals("verdadero") || tipo.equals("falso")) {
					obj.setObjeto(tipo + "");
				} else {
					error = "Se esperaba verdadero o falso";
					System.out.println(error);
				}
			}
			// otro tipo
			else {
				error = "error desconocido";
				System.out.println(error);
			}

			System.out.println("case 2");
			// table.remove(obj);

		} else if (ctx.expr(1) != null) {
			System.out.println("case 3");
		} else if (ctx.MENSAJE() != null) {
			if (getTipo(obj) != 3) {
				// SEMANTICO
				error = "Se esperaba un " + obj.getTipo();
				System.out.println(error);

			}
		} else if (ctx.booleanExpr() != null) {
			if (getTipo(obj) != 4) {
				// SEMANTICO
				error = "Se esperaba un " + obj.getTipo();
				System.out.println(error);
			}
			System.out.println("case 5");
		} else {
			error = "Error desconocido";
			System.out.println(error);
		}

		// asignacion
		imprimir();
		// table.add(obj);
		return visitChildren(ctx);
	}

	@Override
	public T visitExpr(MyLanguageParser.ExprContext ctx) {
		if (ctx.expr(0) != null && ctx.MULOP() != null && ctx.expr(1) != null) {
			Double a = Double.valueOf(visitExpr(ctx.expr(0)).toString());
			Double b = Double.valueOf(visitExpr(ctx.expr(1)).toString());
			Double c = a * b;
			return (T) c;

		} else if (ctx.NO_ID() != null && ctx.ID() != null) {
			Objeto obj = buscar(ctx.ID().toString());

			String bool;
			if (getTipo(obj) != 4) {
				// SEMANTICO
				error = "Negacion se usa para cambiar el estado de variables logicas";
				System.out.println(error);
			} else if (obj.getObjeto().equals("verdadero")) {
				bool = "falso";
				return (T) bool;
			} else if (obj.getObjeto().equals("falso")) {
				bool = "verdadero";
				return (T) bool;
			}
		} else if (ctx.SUMOP() != null && ctx.expr(0) != null) {

		} else if (ctx.ID() != null && ctx.COR_IZQ() != null && ctx.expr(0) != null && ctx.COR_DER() != null) {

		} else if (ctx.COR_IZQ() != null && ctx.expr(0) != null && ctx.COR_DER() != null) {

		} else if (ctx.expr(0) != null && ctx.SUMOP() != null && ctx.expr(1) != null) {

		} else if (ctx.expr(0) != null && ctx.POTENCIA() != null && ctx.expr(1) != null) {

		} else if (ctx.expr(0) != null && ctx.MODOP() != null && ctx.expr(1) != null) {

		} else if (ctx.expr(0) != null && ctx.MODULO() != null && ctx.expr(1) != null) {

		} else if (ctx.REAL() != null) {
			Double a = Double.valueOf(ctx.REAL().toString());
			return (T) a;
		} else if (ctx.ENTERO() != null) {
			Integer a = Integer.valueOf(ctx.ENTERO().toString());
			return (T) a;
		} else if (ctx.VERDADERO() != null) {
			String bool = "verdadero";
			return (T) bool;
		} else if (ctx.FALSO() != null) {
			String bool = "falso";
			return (T) bool;
		} else if (ctx.ROP() != null) {

		} else if (ctx.ID() != null && ctx.COMMA() != null && ctx.expr(1) != null) {

		} else if (ctx.ID() != null) {

		} else if (ctx.PAR_DER() != null && ctx.expr(0) != null && ctx.PAR_DER() != null) {

		} else if (ctx.ID() != null && ctx.PAR_DER() != null && ctx.expr(0) != null && ctx.PAR_DER() != null) {

		} else if (ctx.expr(0) != null && ctx.COMMA() != null && ctx.expr(1) != null) {

		} else if (ctx.ID() != null && ctx.PAR_IZQ() != null && ctx.PAR_DER() != null) {

		} else if (ctx.NEGACION() != null && ctx.expr(0) != null) {

		}

		return visitChildren(ctx);
	}

	@Override
	public T visitContenido_escribir(MyLanguageParser.Contenido_escribirContext ctx) {
		return visitChildren(ctx);
	}
	/*
	 * @Override public T visitExpr(ExprContext ctx) { if (ctx.DOUBLE() != null)
	 * { Double num = new Double(ctx.DOUBLE().getText()); //
	 * System.out.println(num); return (T) num; } else if (ctx.PIZQ() != null) {
	 * return visitExpr(ctx.expr(0)); } else if (ctx.ID() != null) { String name
	 * = ctx.ID().getText(); Object value; if ((value = table.get(name)) ==
	 * null) { // No encontro valor en la // tabla de simbolos int line =
	 * ctx.ID().getSymbol().getLine(); int col =
	 * ctx.ID().getSymbol().getCharPositionInLine() + 1; // Prodría ser en .out
	 * tambien. System.err.printf(
	 * "<%d:%d> Error semantico, la variable con nombre \"" + name +
	 * "\" no fue declarada.\n", line, col); System.exit(-1); return null; }
	 * else { return (T) value; } } else { String op = (ctx.MULOP() != null ?
	 * ctx.MULOP().getText() : ctx.SUMOP().getText()); Double num1 = (Double)
	 * visitExpr(ctx.expr(0)); Double num2 = (Double) visitExpr(ctx.expr(1));
	 * Double ans = null;
	 * 
	 * switch (op) { case "+": ans = num1 + num2; break; case "-": ans = num1 -
	 * num2; break; case "*": ans = num1 * num2; break; case "/": ans = num1 /
	 * num2; break; }
	 * 
	 * // System.out.println(ans); return (T) (Double) ans; } }
	 * 
	 * @Override public T visitCommand(CommandContext ctx) {
	 * 
	 * if (ctx.printexpr() != null) { Double ans = (Double)
	 * visitExpr(ctx.printexpr().expr()); int aux = (int) Math.floor(ans);
	 * 
	 * if (ans - aux < 1e-9) { System.out.println(aux); } else {
	 * System.out.println(ans); } } else if (ctx.VAR() != null) { String name =
	 * ctx.ID().getText(); if (table.get(name) != null) { int line =
	 * ctx.ID().getSymbol().getLine(); int col =
	 * ctx.ID().getSymbol().getCharPositionInLine() + 1; System.err.printf(
	 * "<%d:%d> Error semantico, la variable con nombre: \"" + name +
	 * "\" ya fue declarada.\n", line, col); System.exit(-1); } else {
	 * table.put(name, visitExpr(ctx.expr())); } } else { return
	 * visitChildren(ctx); }
	 * 
	 * return super.visitCommand(ctx); }
	 * 
	 * @Override public T visitSet1(MyLanguageParser.Set1Context ctx) {
	 * 
	 * if (table.get(ctx.ID().getText()) == null) { System.err.printf(
	 * "Error semantico"); System.exit(-1); } else {
	 * table.remove(table.get(ctx.ID().getText()));
	 * table.put(ctx.ID().getText(), visitExpr(ctx.expr())); }
	 * 
	 * return null; }
	 * 
	 * // conditional : 'if' booleanExpr 'then' commands (ELSE commands)?
	 * 'endif'; // repeat : 'repeat' expr 'times' commands 'endrepeat'; //
	 * printexpr : 'print' expr SMCOLON ; // booleanExpr : expr ROP expr;
	 * 
	 * @Override public T visitConditional(ConditionalContext ctx) { // TODO
	 * Auto-generated method stub
	 * 
	 * Boolean ans = (Boolean) visitBooleanExpr(ctx.booleanExpr());
	 * 
	 * if (ans) { visitCommands(ctx.commands().get(0)); } else if (ctx.ELSE() !=
	 * null) { visitCommands(ctx.commands().get(1)); } return null; }
	 * 
	 * @Override public T visitRepeat(RepeatContext ctx) {
	 * 
	 * int times = (int) (double) (Double) visitExpr(ctx.expr()); for (int i =
	 * 0; i < times; i++) { visitCommands(ctx.commands()); }
	 * 
	 * return null; }
	 * 
	 * @Override public T visitWhile1(MyLanguageParser.While1Context ctx) {
	 * 
	 * // TODO Auto-generated method stub Boolean ans = (Boolean)
	 * visitBooleanExpr(ctx.booleanExpr()); while (ans) { ans = (Boolean)
	 * visitBooleanExpr(ctx.booleanExpr());
	 * 
	 * if (ans) { visitCommands(ctx.commands()); } } return null;
	 * 
	 * }
	 * 
	 * @Override public T visitBooleanExpr(MyLanguageParser.BooleanExprContext
	 * ctx) { Boolean ans = false; String op = ctx.ROP().getText();
	 * 
	 * Double num1 = (Double) visitExpr(ctx.expr(0)); Double num2 = (Double)
	 * visitExpr(ctx.expr(1));
	 * 
	 * switch (op) { case "<": ans = num1 < num2; break; case "<=": ans = num1
	 * <= num2; break; case ">": ans = num1 > num2; break; case ">=": ans = num1
	 * >= num2; break; case "==": ans = Math.abs(num1 - num2) < 0.000000001;
	 * break; case "!=": ans = Math.abs(num1 - num2) > 0.000000001; break; }
	 * return (T) ans; }
	 */

	public void imprimir() {
		for (Objeto objeto : table) {
			System.out.println(objeto.toString());
		}
	}
}
