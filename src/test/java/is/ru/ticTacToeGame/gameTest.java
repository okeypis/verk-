package is.ru.ticTacToeGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Scanner;


import org.junit.Test;

public class GameTest{
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.GameTest");
	}

	@Test
	public void testConstructor(){
		Game game1 = new Game();
		assertTrue(game1.whosTurn);
	}

	@Test
	public void testPlayGame(){
	}


}

