// Generated from guitartab.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link guitartabParser}.
 */
public interface guitartabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link guitartabParser#song}.
	 * @param ctx the parse tree
	 */
	void enterSong(guitartabParser.SongContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#song}.
	 * @param ctx the parse tree
	 */
	void exitSong(guitartabParser.SongContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#bpm}.
	 * @param ctx the parse tree
	 */
	void enterBpm(guitartabParser.BpmContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#bpm}.
	 * @param ctx the parse tree
	 */
	void exitBpm(guitartabParser.BpmContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(guitartabParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(guitartabParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#num_strums}.
	 * @param ctx the parse tree
	 */
	void enterNum_strums(guitartabParser.Num_strumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#num_strums}.
	 * @param ctx the parse tree
	 */
	void exitNum_strums(guitartabParser.Num_strumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(guitartabParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(guitartabParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(guitartabParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(guitartabParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link guitartabParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(guitartabParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link guitartabParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(guitartabParser.NoteContext ctx);
}