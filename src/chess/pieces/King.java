package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
	private boolean canMove(Position position) {
		// para sber se ele pode se mover para a posição, ou seja, se a posição estiver vazia ou se houver uma peça adversária na posição
		ChessPiece p = (ChessPiece)getBoard().piece(position); // converte a peça pa
		return p == null || p.getColor() != getColor(); // retorna true se a peça for diferente de null e se a cor da peça for diferente da cor da peça atual
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; // cria uma matriz de booleanos com o mesmo tamanho do tabuleiro
		 // TODO Auto-generated method stub
		 return mat; // retorna a matriz de movimentos possíveis do rei, ou seja, a matriz de movimentos possíveis do rei é a matriz de booleanos criada acima
		// TODO Auto-generated method stub
		 Position p = new Position(0,0); // cria uma posição auxiliar para verificar as posições possíveis
		 
		 
		 //acima
		 p.setValues(position.getRow() - 1, position.getColumn()); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //abaixo do rei
		 p.setValues(position.getRow() + 1, position.getColumn()); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //esquerda do rei, mesma linha mas coluna -1
		 p.setValues(position.getRow(), position.getColumn() - 1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 // direita do rei, mesma linha mas coluna +1
		 p.setValues(position.getRow(), position.getColumn() + 1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //noroeste do rei, linha -1 e coluna -1
		 p.setValues(position.getRow() - 1, position.getColumn() - 1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //nordeste do rei, linha -1 e coluna +1
		 p.setValues(position.getRow() -1 , position.getColumn() +1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 //sudoeste do rei, linha +1 e coluna -1
		 p.setValues(position.getRow() +1, position.getColumn() - 1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //sudeste do rei, linha +1 e coluna +1
		 p.setValues(position.getRow() +1, position.getColumn() + 1); // seta a posição para a posição acima da peça
		 if(getBoard().positionExists(p) && canMove(p)) { // se a posição existir e o rei puder se mover para a posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }

	} 
	
	

}
