package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public  class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override // converter um rei para string, ou seja, para a letra K
	public String toString() {
		return "K"; //vai entrar na hora de imprimir o tabuleiro, ou seja, quando for imprimir o rei, vai imprimir a letra K
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; // cria uma matriz de booleanos com o mesmo tamanho do tabuleiro
		 // TODO Auto-generated method stub
		 return mat; // retorna a matriz de movimentos possíveis do rei, ou seja, a matriz de movimentos possíveis do rei é a matriz de booleanos criada acima
		// TODO Auto-generated method stub

	} 

}
