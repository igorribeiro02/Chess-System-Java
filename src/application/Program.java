package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		// TODO Auto-generated method stub
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces()); // vai receber a matriz de peças do chessmatch
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc); // vai ler a posição do xadrez, ou seja, a letra e o número, e retornar a posição do xadrez
			
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc); // vai ler a posição do xadrez, ou seja, a letra e o número, e retornar a posição do xadrez
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);// vai receber a peça capturada, ou seja, a peça que foi movida para a posição de destino
			}
			catch (ChessException e) { // caso ocorra alguma exceção, ou seja, caso ocorra algum erro, como por exemplo, se o usuário digitar uma posição inválida, ou se o usuário tentar mover uma peça para uma posição inválida, ou se o usuário tentar mover uma peça que não existe, ou se o usuário tentar mover uma peça que não tem movimentos possíveis, ou seja, caso ocorra algum erro, a exceção vai ser capturada e a mensagem de erro vai ser exibida para o usuário
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) { // caso ocorra alguma exceção, ou seja, caso ocorra algum erro, como por exemplo, se o usuário digitar uma posição inválida, ou se o usuário tentar mover uma peça para uma posição inválida, ou se o usuário tentar mover uma peça que não existe, ou se o usuário tentar mover uma peça que não tem movimentos possíveis, ou seja, caso ocorra algum erro, a exceção vai ser capturada e a mensagem de erro vai ser exibida para o usuário
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}

		

	}

}
