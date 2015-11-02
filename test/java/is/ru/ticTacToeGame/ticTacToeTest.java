package is.ru.ticTacToeGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class TicTacToeTest{
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.TicTacToeTest");
	}

	@Test
	public void testConstructor(){
		TicTacToe game = new TicTacToe();
		assertTrue(game.whosTurn);
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				assertEquals(" ",game.board[i][j]);
			}
		}

	}

	@Test
	public void testMove(){
		
	}

	@Test
	public void testisFull(){
		
	}

	@Test
	public void testHasWon(){
		



	} 

	@Test
	public void testClearAll(){
	TicTacToe game = new TicTacToe();
	game.move(1, "X");
	game.move(3, "O");
	game.move(5, "X");	
	game.clearAll();
	for (int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			assertEquals(" ",game.board[i][j]);
		}
	}
	}

	@Test
	public void testIsSeatTaken(){
		
	}	

	
}
