package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	} // o get para nao interfrir 


	protected boolean isThereOpponentPiece(Position position) { // metodo para verificar se existe uma peça adversaria na posição
		ChessPiece p = (ChessPiece)getBoard().piece(position); // converte a peça para chesspiece, ou seja, para a peça de xadrez
		return p != null && p.getColor() != getColor(); // retorna true se a peça for diferente de null e se a cor da peça for diferente da cor da peça atual
	}
	
	

}
