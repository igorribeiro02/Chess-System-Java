package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	//retorna a chamada para a superclasse
	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override // converter uma torre para string, ou seja, para a letra R
	public String toString() {
		return "R"; //vai entrar na hora de imprimir o tabuleiro, ou seja, quando for imprimir a torre, vai imprimir a letra R
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; // cria uma matriz de booleanos com o mesmo tamanho do tabuleiro
		
		 return mat;
	}
	

}
