// Generated from c://Users//ellie//OneDrive//Desktop//Fall 2023//POPL//Parser Project//src//peter.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link peterParser}.
 */
public interface peterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link peterParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(peterParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link peterParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(peterParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link peterParser#peter}.
	 * @param ctx the parse tree
	 */
	void enterPeter(peterParser.PeterContext ctx);
	/**
	 * Exit a parse tree produced by {@link peterParser#peter}.
	 * @param ctx the parse tree
	 */
	void exitPeter(peterParser.PeterContext ctx);
	/**
	 * Enter a parse tree produced by {@link peterParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(peterParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link peterParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(peterParser.AtomContext ctx);
}