/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashMap;



/**
 * @author Estudiante
 */
public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {

	
	/*  @Override public T visitPrintexpr(PrintexprContext ctx){
	  System.out.println("Entrando a visitor expr");
	  System.out.println(ctx.expr().getText()); return
	  super.visitPrintexpr(ctx); }*/
	 

	HashMap<String, Object> table = new HashMap<>();
/*
	@Override
	public T visitExpr(ExprContext ctx) {
		if (ctx.DOUBLE() != null) {
			Double num = new Double(ctx.DOUBLE().getText());
			// System.out.println(num);
			return (T) num;
		} else if (ctx.PIZQ() != null) {
			return visitExpr(ctx.expr(0));
		} else if (ctx.ID() != null) {
			String name = ctx.ID().getText();
			Object value;
			if ((value = table.get(name)) == null) { // No encontro valor en la
														// tabla de simbolos
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
				// Prodría ser en .out tambien.
				System.err.printf(
						"<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line,
						col);
				System.exit(-1);
				return null;
			} else {
				return (T) value;
			}
		} else {
			String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
			Double num1 = (Double) visitExpr(ctx.expr(0));
			Double num2 = (Double) visitExpr(ctx.expr(1));
			Double ans = null;

			switch (op) {
			case "+":
				ans = num1 + num2;
				break;
			case "-":
				ans = num1 - num2;
				break;
			case "*":
				ans = num1 * num2;
				break;
			case "/":
				ans = num1 / num2;
				break;
			}

			// System.out.println(ans);
			return (T) (Double) ans;
		}
	}

	@Override
	public T visitCommand(CommandContext ctx) {

		if (ctx.printexpr() != null) {
			Double ans = (Double) visitExpr(ctx.printexpr().expr());
			int aux = (int) Math.floor(ans);

			if (ans - aux < 1e-9) {
				System.out.println(aux);
			} else {
				System.out.println(ans);
			}
		} else if (ctx.VAR() != null) {
			String name = ctx.ID().getText();
			if (table.get(name) != null) {
				int line = ctx.ID().getSymbol().getLine();
				int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
				System.err.printf(
						"<%d:%d> Error semantico, la variable con nombre: \"" + name + "\" ya fue declarada.\n", line,
						col);
				System.exit(-1);
			} else {
				table.put(name, visitExpr(ctx.expr()));
			}
		} else {
			return visitChildren(ctx);
		}

		return super.visitCommand(ctx);
	}

	@Override
	public T visitSet1(MyLanguageParser.Set1Context ctx) {

		if (table.get(ctx.ID().getText()) == null) {
			System.err.printf("Error semantico");
			System.exit(-1);
		} else {
			table.remove(table.get(ctx.ID().getText()));
			table.put(ctx.ID().getText(), visitExpr(ctx.expr()));
		}

		return null;
	}

	// conditional : 'if' booleanExpr 'then' commands (ELSE commands)? 'endif';
	// repeat : 'repeat' expr 'times' commands 'endrepeat';
	// printexpr : 'print' expr SMCOLON ;
	// booleanExpr : expr ROP expr;

	@Override
	public T visitConditional(ConditionalContext ctx) {
		// TODO Auto-generated method stub

		Boolean ans = (Boolean) visitBooleanExpr(ctx.booleanExpr());

		if (ans) {
			visitCommands(ctx.commands().get(0));
		} else if (ctx.ELSE() != null) {
			visitCommands(ctx.commands().get(1));
		}
		return null;
	}

	@Override
	public T visitRepeat(RepeatContext ctx) {

		int times = (int) (double) (Double) visitExpr(ctx.expr());
		for (int i = 0; i < times; i++) {
			visitCommands(ctx.commands());
		}

		return null;
	}

	@Override
	public T visitWhile1(MyLanguageParser.While1Context ctx) {

		// TODO Auto-generated method stub
		Boolean ans = (Boolean) visitBooleanExpr(ctx.booleanExpr());
		while (ans) {
			ans = (Boolean) visitBooleanExpr(ctx.booleanExpr());

			if (ans) {
				visitCommands(ctx.commands());
			}
		}
		return null;

	}

	@Override
	public T visitBooleanExpr(MyLanguageParser.BooleanExprContext ctx) {
		Boolean ans = false;
		String op = ctx.ROP().getText();

		Double num1 = (Double) visitExpr(ctx.expr(0));
		Double num2 = (Double) visitExpr(ctx.expr(1));

		switch (op) {
		case "<":
			ans = num1 < num2;
			break;
		case "<=":
			ans = num1 <= num2;
			break;
		case ">":
			ans = num1 > num2;
			break;
		case ">=":
			ans = num1 >= num2;
			break;
		case "==":
			ans = Math.abs(num1 - num2) < 0.000000001;
			break;
		case "!=":
			ans = Math.abs(num1 - num2) > 0.000000001;
			break;
		}
		return (T) ans;
	}*/
}
