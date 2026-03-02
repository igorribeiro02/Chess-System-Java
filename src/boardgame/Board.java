package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	//minha matriz é instanciada com o número de linhas e colunas que eu passar no construtor, ou seja, o número de linhas e colunas do tabuleiro
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column]; // retorna a peça que está na posição da matriz
	}
	//retorno a peça pela posição, ou seja, eu passo a posição e retorno a peça que está na posição da matriz
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; // retorna a peça que está na posição da matriz
	}

	public void placePiece(Piece piece, Position position) {
		// matriz de peças do tabuleiro, ou seja, a matriz de peças do tabuleiro é preenchida com as peças do chesspiece, ou seja, a matriz de peças do chesspiece é preenchida com as peças do tabuleiro
		pieces[position.getRow()][position.getColumn()] = piece; // coloca a peça na posição da matriz
		piece.position = position; // coloca a posição da peça
		
	}
}
