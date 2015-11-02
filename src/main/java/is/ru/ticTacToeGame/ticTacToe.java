package is.ru.ticTacToeGame;

public class TicTacToe{
	public Boolean whosTurn;
	public String[][] board;

	TicTacToe(){
		whosTurn = true;
		board = new String[3][3];

		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){

				board[i][j] = " ";

			}
		}
	}

}
		
