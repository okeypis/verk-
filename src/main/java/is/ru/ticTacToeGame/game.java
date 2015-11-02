//game class
package is.ru.ticTacToeGame;
import java.util.Scanner;

public class Game {
    public Player Player1;
    public Player Player2;
    public TicTacToe theGame;
    boolean whosTurn; //True for Player1, false for Player2.
    
    Game(){
        Player1 = new Player("X");
        Player2 = new Player("O");
        theGame = new TicTacToe();
        whosTurn=true;
    }

    private boolean inputOK(int number){
        if(number>9 || number<1){
            return false;
        }
        return true;
    }

    public void printWins(){
        System.out.println("Player 1 points: "+ Player1.wins);
        System.out.println("Player 2 points: "+ Player2.wins);
    }

    public void playGame(){
        
        
    }



    //mock function to test playGame!
    public void MockPlayGame(Scanner in){
        
        }
    }

