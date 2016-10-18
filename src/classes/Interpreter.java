package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {

	public static void main(String[] args) throws Exception {
		int can_numeros = 1;
		//for (can_numeros = 1; can_numeros <= 5; can_numeros++){
			String letter = "A";
			String name = "L_P2_"+ letter+ can_numeros + ".in";
			//System.setIn(new FileInputStream(new File("L_P2_B4.in"))); //"input.txt"
			FileInputStream file = new FileInputStream(new File(name));
			
		    File file1 = new File(name);
		    
		    BufferedReader in = (new BufferedReader(new FileReader(file1)));
		    String out = "";
		    
		    int ch;
		    while ((ch = in.read()) != -1) {
		    	if (Character.isUpperCase(ch)) {
		            ch = Character.toLowerCase(ch);
		        }
		        out += Character.toChars(ch)[0];
		    }
		    in.close();
		    //out.close();		    
		    //File file2 = new File(name);
		    //PrintWriter out1 = (new PrintWriter(out));
		    //FileInputStream file5 = new FileInputStream(new File("out.txt"));
			//System.setIn(file5); //"input.txt"
			
			ANTLRInputStream input = new ANTLRInputStream(out);
			MyLanguageLexer lexer = new MyLanguageLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			MyLanguageParser parser = new MyLanguageParser(tokens);
			ParseTree tree = parser.commands();
			
			MyVisitor<Object> loader = new MyVisitor<Object>();

				loader.visit(tree);
	
			System.out.println("Ejercicio numero " + letter + can_numeros+
					" El analisis sintactico ha finalizado exitosamente... Quitar esta frase");
		//}

	}
}
