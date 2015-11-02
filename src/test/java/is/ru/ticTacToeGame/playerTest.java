package is.ru.ticTacToeGame; 

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 


public class playerTest
{ 
    public static void main(String args[]) 
    { 
        org.junit.runner.JUnitCore.main("is.ru.ticTacToeGame.playerTest"); 
    } 
    @Test public void testPlayer()
    { 
        Player player = new Player("X"); 
        assertEquals("X",player.mark); 
    } 
}