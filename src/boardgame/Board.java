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
	

}
