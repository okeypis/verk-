package is.ru.ticTacToeGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Scanner;

import org.junit.Test;

public class gameTest{
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.gameTest");
    }

    @Test
    public void testConstructor(){
        Game game1 = new Game();
        assertTrue(game1.whosTurn);
    }

    @Test
    public void testPlayGame(){
        Game game1 = new Game();
        //Make player 1 win
        String data1 = "1 4 2 9 3";
        Scanner in1 = new Scanner(data1);
        game1.MockPlayGame(in1);
        //Check if Player1 won
        assertEquals(1,game1.Player1.wins);
        assertEquals(0,game1.Player2.wins);

        Game game2 = new Game();
        //Make player 1 win and then player 2:
        String data2 = "1 4 2 9 3 1 3 4 5 9 7";
        Scanner in2 = new Scanner(data2);
        game2.MockPlayGame(in2);
        //Check if Player1 won
        assertEquals(1,game2.Player1.wins);
        assertEquals(1,game2.Player2.wins);

        Game game3 = new Game();
        //Make a tie:
        String data3 = "1 2 5 9 6 4 3 7 8";
        Scanner in3 = new Scanner(data3);
        game3.MockPlayGame(in3);
        assertEquals(0,game3.Player1.wins);
        assertEquals(0,game3.Player2.wins);

        //Test with invalid unput. Make player 1 win:
        Game game4 = new Game();
        //Make player 1 win
        String data4 = "1 4 4 10 2 33 9 -1 3";
        Scanner in4 = new Scanner(data4);
        game4.MockPlayGame(in4);
        //Check if Player1 won
        assertEquals(1,game4.Player1.wins);
        assertEquals(0,game4.Player2.wins);
    }

}