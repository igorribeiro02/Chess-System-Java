package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChesException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	// matrix_row = 8 - chess_row
	protected Position toPosition() {
		// a posição do xadrez é diferente da posição do tabuleiro, ou seja, a posição do xadrez é representada por uma letra e um número, enquanto a posição do tabuleiro é representada por um número e um número
		return new Position(8 - row, column - 'a'); // converte a posição do xadrez para a posição do tabuleiro
	}
	
	protected static ChessPosition fromPosition(Position position) {
		// converte a posição do tabuleiro para a posição do xadrez
		// faz o casting da coluna para char, ou seja, converte a coluna para a letra correspondente, e faz a conversão da linha para o número correspondente
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override 
	public String toString() {
		return "" + column + row; // converte a posição do xadrez para string, ou seja, converte a letra e o número para uma string	
	}
	

}
