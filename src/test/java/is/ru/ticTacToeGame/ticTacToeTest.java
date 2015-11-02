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
        TicTacToe game = new TicTacToe();
        game.move(3, "X");
        assertEquals("X",game.board[0][2]);

        game.move(1, "O");
        assertEquals("O",game.board[0][0]);

        game.move(9, "X");
        assertEquals("X",game.board[2][2]);
    }

    @Test
    public void testisFull(){
        TicTacToe game = new TicTacToe();
        assertFalse(game.isFull());
        game.move(1, "O");
        game.move(3, "X");
        assertFalse(game.isFull());
        game.move(2, "X");
        game.move(4, "X");
        game.move(5, "X");
        game.move(6, "X");
        game.move(7, "X");
        game.move(8, "X");
        game.move(9, "X");
        assertTrue(game.isFull());
    }

    @Test
    public void testHasWon(){
        TicTacToe game1 = new TicTacToe();
        assertFalse(game1.hasWon());
        game1.move(1, "X");
        game1.move(3, "O");
        game1.move(5, "X");
        
        assertFalse(game1.hasWon());
        game1.move(6, "O");
        game1.move(9, "X");
        
        assertTrue(game1.hasWon());
        game1.move(2, "X");
        game1.move(3, "O");
        game1.move(5, "X");

        TicTacToe game2 = new TicTacToe();
        assertFalse(game2.hasWon());
        game2.move(2, "X");
        game2.move(4, "O");
        game2.move(1, "X");
        game2.move(6, "O");
        game2.move(3, "X");
        assertTrue(game2.hasWon());

        TicTacToe game3 = new TicTacToe();
        assertFalse(game3.hasWon());
        game3.move(2, "X");
        game3.move(1, "O");
        game3.move(5, "X");
        game3.move(4, "O");
        game3.move(3, "X");
        game3.move(7, "O");
        assertTrue(game3.hasWon());

        TicTacToe game4 = new TicTacToe();
        assertFalse(game4.hasWon());
        game4.move(9, "X");
        game4.move(8, "O");
        game4.move(5, "X");
        assertFalse(game4.hasWon());
        game4.move(1, "O");
        game4.move(3, "X");
        game4.move(2, "O");
        game4.move(7, "X");
        assertTrue(game4.hasWon());

    } //3,5,7

    //testclear
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
        TicTacToe game = new TicTacToe();
        game.move(1, "X");
        assertTrue(game.isSeatTaken(1));
        assertFalse(game.isSeatTaken(2));
    }   

    
}