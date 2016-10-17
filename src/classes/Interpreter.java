package classes;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

	public static void main(String[] args) throws Exception {
		int can_numeros = 5;
		for (can_numeros = 1; can_numeros <= 5; can_numeros++){
			String letter = "D";
			String name = "L_P2_"+ letter+ can_numeros + ".in";
			//System.setIn(new FileInputStream(new File("L_P2_B4.in"))); //"input.txt"
			System.setIn(new FileInputStream(new File(name))); //"input.txt"
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			MyLanguageLexer lexer = new MyLanguageLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MyLanguageParser parser = new MyLanguageParser(tokens);
			ParseTree tree = parser.commands();
			
			MyVisitor<Object> loader = new MyVisitor<Object>();
			loader.visit(tree);
			System.out.println("Ejercicio numero " + letter + can_numeros+
					" El analisis sintactico ha finalizado exitosamente... Quitar esta frase");
		}

	}
}
