package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); // vai receber a matriz de peças do chessmatch e imprimir o tabuleiro
		

	}

}
