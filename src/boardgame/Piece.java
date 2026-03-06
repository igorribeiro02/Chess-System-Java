package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}


	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		//retorna o metodo comleto que utiliza o metodo abstrato
		//este metodo pode ser concreta, ou seja, ele pode ser implementado na classe abstrata, pois ele utiliza o metodo abstrato possibleMoves(), que é implementado nas classes concretas, ou seja, nas classes que herdam a classe Piece
		return possibleMoves()[position.getRow()][position.getColumn()]; // retorna a matriz de movimentos possíveis, ou seja, a matriz de movimentos possíveis da peça, e verifica se a posição é um movimento possível
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i =0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) { // se houver um movimento possível, ou seja, se houver um movimento possível na matriz de movimentos possíveis, retorna true
					return true;
				}
			}
		}
		return false; // se não houver nenhum movimento possível, retorna false
	}
	

	
	

}
