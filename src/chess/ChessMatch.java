package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	//quem tem que saber a dimensao do tabuleiro é o chessmess
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		//percorrer a matriz de peças do chesspiece, ou seja, a matriz de peças do tabuleiro, e preencher a matriz de peças do chesspiece
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); // cast para chesspiece, ou seja, eu pego a peça do tabuleiro e transformo em chesspiece
			}
		}
		return mat;
	}
	
	//recebe as coordenadas do xadrez, ou seja, a letra e o número, e a peça que vai ser colocada no tabuleiro, e coloca a peça no tabuleiro
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition()); // converte a posição do xadrez para a posição do tabuleiro e coloca a peça no tabuleiro
	}
	//criar um método para colocar as peças no tabuleiro, ou seja, para colocar as peças do chesspiece no tabuleiro
	private void initialSetup() {
		//metodo responsavel por colocar as peças no tabuleiro, ou seja, para colocar as peças do chesspiece no tabuleiro
		placeNewPiece('6', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		
		
		
	}
	

}
