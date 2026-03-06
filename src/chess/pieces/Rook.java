package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
		
		Position p = new Position(0,0); // cria uma posição auxiliar para verificar as posições possíveis
		
		//acima 
		p.setValues(position.getRow() - 1, position.getColumn()); // seta a posição para a posição acima da peça
		 while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // enquanto a posição existir e não houver uma peça na posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
			 p.setRow(p.getRow() - 1); // move a posição para cima
		 }
		 //marca em verddadeiro as posicções acima da peça
		 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) { // se a posição existir e houver uma peça adversária na posição
			 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
		 }
		 
		 //esquerda
		 
		//acima 
			p.setValues(position.getRow() - 1, position.getColumn()); // seta a posição para a posição acima da peça
			 while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // enquanto a posição existir e não houver uma peça na posição
				 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
				 p.setRow(p.getColumn() - 1); // move a posição para cima
			 }
			 //marca em verddadeiro as posicções acima da peça
			 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) { // se a posição existir e houver uma peça adversária na posição
				 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
			 }
			 
			 // direita
			//acima 
				p.setValues(position.getRow() , position.getColumn() + 1); // seta a posição para a posição acima da peça
				 while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // enquanto a posição existir e não houver uma peça na posição
					 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
					 p.setRow(p.getRow() + 1); // move a posição para cima
				 }
				 //marca em verddadeiro as posicções acima da peça
				 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) { // se a posição existir e houver uma peça adversária na posição
					 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
				 }
				 
				 //baixo 
					p.setValues(position.getRow() + 1, position.getColumn()); // seta a posição para a posição acima da peça
					 while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // enquanto a posição existir e não houver uma peça na posição
						 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
						 p.setRow(p.getRow() + 1); // move a posição para cima
					 }
					 //marca em verddadeiro as posicções acima da peça
					 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) { // se a posição existir e houver uma peça adversária na posição
						 mat[p.getRow()][p.getColumn()] = true; // marca a posição como possível
					 }
		
		return mat;
		 
		 
	}
	

}
