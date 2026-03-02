package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	//minha matriz é instanciada com o número de linhas e colunas que eu passar no construtor, ou seja, o número de linhas e colunas do tabuleiro
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) { // testa se a posicao esta no tabuleiro
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column]; // retorna a peça que está na posição da matriz
	}
	//retorno a peça pela posição, ou seja, eu passo a posição e retorno a peça que está na posição da matriz
	public Piece piece(Position position) {
		if(!positionExists(position)) { // testa se a posicao esta no tabuleiro
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()]; // retorna a peça que está na posição da matriz
	}

	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position) ) { // testa se a posicao esta ocupada por uma peça
			throw new BoardException("There is already a piece on position " + position); // se a posição estiver ocupada por uma peça, lança uma exceção
		}
		// matriz de peças do tabuleiro, ou seja, a matriz de peças do tabuleiro é preenchida com as peças do chesspiece, ou seja, a matriz de peças do chesspiece é preenchida com as peças do tabuleiro
		pieces[position.getRow()][position.getColumn()] = piece; // coloca a peça na posição da matriz
		piece.position = position; // coloca a posição da peça
	}
	private boolean positionExists(int row, int column) {
		// verifica se a posição existe, ou seja, se a posição está dentro do tabuleiro, ou seja, se a posição é válida
		return row >= 0 && row < rows && column >= 0 && column < columns; // verifica se a posição existe, ou seja, se a posição está dentro do tabuleiro
	}
	
	public boolean positionExists(Position position) {
		//reaproveito o metodo acima
		return positionExists(position.getRow(), position.getColumn()); // verifica se a posição existe, ou seja, se a posição está dentro do tabuleiro
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) { // testa se a posicao esta no tabuleiro
			throw new BoardException("Position not on the board");
		}
		//verificar se existe uma peça na posição, ou seja, se a posição está ocupada por uma peça
		return piece(position) != null; // verifica se existe uma peça na posição, ou seja, se a posição está ocupada por uma peça
	}
}
