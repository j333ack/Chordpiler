// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//YOU ARE NOT REQUIRED TO MODIFY THIS CLASS

public class Driver {
	
	public static void main(String[] args) throws Exception 
	{

		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);

		// create a lexer that feeds off of input CharStream
		guitartabLexer lexer = new guitartabLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		guitartabParser parser = new guitartabParser(tokens);

		ParseTree tree = parser.song(); // begin parsing at prog rule

		// Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

		//create a symbol table object stb
		SimpleSongBuilder ssb = new SimpleSongBuilder();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(ssb, tree);
		
		// print the symbol table entries
		ssb.prettyPrint();

		//YOU ARE NOT REQUIRED TO ADD ANY CODE HERE
	}
}
