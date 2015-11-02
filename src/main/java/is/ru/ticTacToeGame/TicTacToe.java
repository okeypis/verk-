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
	
	public void clearAll(){
		//clear the table
		for (int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					board[i][j] = " ";
				}
		}
	}
	
	public boolean hasWon(){
		//Check if player has won
		if 		(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") return true;
		else if (board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") return true;
    	else if (board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") return true;
    	else if (board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") return true;
    	else if (board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") return true;
    	else if (board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") return true;
    	else if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") return true;
    	else if (board[2][0] == "X" && board[1][1] == "X" && board[0][2] == "X") return true;
    	else if (board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O") return true;
    	else if (board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O") return true;
    	else if (board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O") return true;
    	else if (board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O") return true;
    	else if (board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O") return true;
    	else if (board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O") return true;
    	else if (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") return true;
    	else if (board[2][0] == "O" && board[1][1] == "O" && board[0][2] == "O") return true;
    	else return false;
	}
	
		public Boolean isFull(){
		 //check if board is full
			for(int i = 0; i <3; i++){
				for(int j = 0; j < 3; j++){
					if(board [i][j] == " "){
						return false;
					}

				}
			}
			return true;
	}
	
	public void print(){
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-----");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-----");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("_____________");
	}
	
	public void move(int number, String xOrO){
		if(number==1){
				board[0][0]=xOrO;
			}

		else if(number==2){
			board[0][1]=xOrO;
		}

		else if(number==3){
			board[0][2]=xOrO;
		}

		else if(number==4){
			board[1][0]=xOrO;
		}

		else if(number==5){
			board[1][1]=xOrO;
		}

		else if(number==6){
			board[1][2]=xOrO;
		}

		else if(number==7){
			board[2][0]=xOrO;
		}

		else if(number==8){
			board[2][1]=xOrO;
		}

		else if(number==9){
			board[2][2]=xOrO;
		}
		whosTurn = !whosTurn;
        print();
	}
	
	public boolean isSeatTaken(int number){
		if(number==1){
			if(board[0][0] == "X" || board[0][0] == "O"){
				return true;
			}
		}

		else if(number==2){
			if(board[0][1] == "X" || board[0][1] == "O"){
				return true;
			}
		}

		else if(number==3){
			if(board[0][2] == "X" || board[0][2] == "O"){
				return true;
			}
		}

		else if(number==4){
			if(board[1][0] == "X" || board[1][0] == "O"){
				return true;
			}
		}

		else if(number==5){
			if(board[1][1] == "X" || board[1][1] == "O"){
				return true;
			}
		}

		else if(number==6){
			if(board[1][2] == "X" || board[1][2] == "O"){
				return true;
			}
		}

		else if(number==7){
			if(board[2][0] == "X" || board[2][0] == "O"){
				return true;
			}
		}

		else if(number==8){
			if(board[2][1] == "X" || board[2][1] == "O"){
				return true;
			}
		}

		else if(number==9){
			if(board[2][2] == "X" || board[2][2] == "O"){
				return true;
			}
		}
			return false;
		
	}

}
		
