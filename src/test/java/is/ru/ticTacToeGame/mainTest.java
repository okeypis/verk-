package is.ru.ticTacToeGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTest{
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.mainTest");
    }

    @Test
    public void testInput(){
        Main game = new Main();
        assertTrue(game.mainGame.inputOK(1));
        assertFalse(game.mainGame.inputOK(20));
    }

}