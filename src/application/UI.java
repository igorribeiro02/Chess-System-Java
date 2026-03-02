package application;

import chess.ChessPiece;

public class UI {
	

	public static void printBoard(chess.ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) { // para cada linha da matriz
			System.out.println((8 - i) + "  "); // imprime o numero da linha, ou seja, o numero do tabuleiro, que é 8 - i, porque a linha 0 é a linha 8, a linha 1 é a linha 7, e assim por diante
			for (int j=0; j<pieces.length; j++) {
				// para cada coluna da matriz
				printPiece(pieces[i][j]); // imprime a peça que está na posição da matriz}
			}
			System.out.println();
		}
		System.out.println(" a b c d e f g h"); // imprime as letras das colunas, ou seja, as letras do tabuleiro
	}
	
	public static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print(" -");
		}
		else {
			System.out.print(piece);
		}
	}
}
