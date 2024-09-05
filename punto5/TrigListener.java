// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigParser}.
 */
public interface TrigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TrigParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TrigParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(TrigParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(TrigParser.FuncContext ctx);
}