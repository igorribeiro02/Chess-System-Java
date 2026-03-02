package boardgame;

public class BoardException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	//construtor que recebe a mensagem de erro
	public BoardException(String msg) {
		super(msg);
	}

}
