package src;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		SauerkrautppLexer lexer = new SauerkrautppLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SauerkrautppParser parser = new SauerkrautppParser(tokens);
		ParseTree tree = parser.start();
		SauerkrautppMyVisitor visitor =  new SauerkrautppMyVisitor();
		System.out.print(visitor.visit(tree));
	}
}
