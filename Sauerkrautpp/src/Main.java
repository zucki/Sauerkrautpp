package src;

import java.io.File;
import java.io.FileWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
	
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			SauerkrautppLexer lexer = new SauerkrautppLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SauerkrautppParser parser = new SauerkrautppParser(tokens);
			ParseTree tree = parser.start();
			SauerkrautppMyVisitor visitor =  new SauerkrautppMyVisitor();
			String output = visitor.visit(tree);
			System.out.print(output);
		} else {
			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			SauerkrautppLexer lexer = new SauerkrautppLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SauerkrautppParser parser = new SauerkrautppParser(tokens);
			ParseTree tree = parser.start();
			SauerkrautppMyVisitor visitor =  new SauerkrautppMyVisitor();
			String output = visitor.visit(tree);
			File file = new File(args[1]);
			FileWriter writer = new FileWriter(file);
			try {
				writer.write(output);
			} finally {
				writer.close();
			}
		}
	}
}
