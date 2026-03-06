package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

    // CORREÇÃO: O tipo de retorno deve ser ChessPiece (a peça capturada)
    // Os parâmetros devem ser ChessPosition
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition(); 
		Position target = targetPosition.toPosition();
		validateSourcePosition(source); // Nome do método corrigido
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece) capturedPiece; 
	}
	
	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source); 
		Piece capturedPiece = board.removePiece(target); 
		board.placePiece(p, target); 
		return capturedPiece; 
	}
	
    // CORREÇÃO: Nome ajustado para validateSourcePosition (estava validadete...)
	private void validateSourcePosition(Position position) {
		if(!board.thereIsAPiece(position)) {
			throw new ChessException("Não existe peça na posição de origem.");
		}
        // Este método 'possibleMoves' deve estar implementado na classe Piece
		//se nao tiver nenhum movimento possível, ou seja, se a peça não tiver nenhum movimento possível, lança uma exceção
		if(!board.piece(position).isThereAnyPossibleMove()) {
			//lanço uma excessão, ou seja, se a peça não tiver nenhum movimento possível, lança uma exceção
			throw new ChessException("Não existem movimentos possíveis para a peça escolhida.");
		}
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition()); 
	}

	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}