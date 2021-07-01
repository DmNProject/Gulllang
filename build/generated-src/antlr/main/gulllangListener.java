// Generated from gulllang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gulllangParser}.
 */
public interface gulllangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gulllangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gulllangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gulllangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gulllangParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(gulllangParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(gulllangParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gulllangParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(gulllangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(gulllangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gulllangParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(gulllangParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(gulllangParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gulllangParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(gulllangParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(gulllangParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link gulllangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(gulllangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gulllangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(gulllangParser.ArgsContext ctx);
}