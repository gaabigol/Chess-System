package chess.pieces;

import boardgame.Board;
import chass.Color;
import chess.ChessPiece;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
