package is.ru.ticTacToeGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class mainTest{
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.mainTest");
	}

	@Test
	public void testInput(){
		main game = new main();
		assertTrue(game.inputOK(1));
		assertFalse(game.inputOK(20));
	}











}
