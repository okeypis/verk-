//game class
package is.ru.ticTacToeGame;
import java.util.Scanner;

public class Game {
    public Player Player1;
    public Player Player2;
    public TicTacToe theGame;
    boolean whosTurn; //True for Player1, false for Player2.
    //Start
    Game(){
        Player1 = new Player("X");
        Player2 = new Player("O");
        theGame = new TicTacToe();
        whosTurn = true;
    }

    public boolean inputOK(int number){
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
        while(!theGame.hasWon() && !theGame.isFull()){
            int number;
            Scanner in = new Scanner(System.in);
            //while (!in.hasNext) {}
            number = in.nextInt();
            
            if(inputOK(number) && !theGame.isSeatTaken(number)){
                
                if(theGame.whosTurn){
                    theGame.move(number,Player1.mark);
                }
                else{
                    theGame.move(number,Player2.mark);
                }

                if(theGame.hasWon() && theGame.whosTurn){
                    theGame.print();
                    System.out.println("Player 2 wins");
                    theGame.clearAll();
                    Player2.wins++;
                    theGame.whosTurn=true;
                    printWins();
                }
                else if(theGame.hasWon() && !theGame.whosTurn){
                    theGame.print();
                    System.out.println("Player 1 wins");
                    theGame.clearAll();
                    Player1.wins++;
                    theGame.whosTurn=true;
                    printWins();
                    
                }
                else if(theGame.isFull()){
                    theGame.print();
                    System.out.println("It's a tie");
                    theGame.whosTurn=true;
                    theGame.clearAll();
                    printWins();
                    
                }
            }
            //theGame.print();
        } 
    }


    //mock function to test playGame!
    public void MockPlayGame(Scanner in){

            while(!theGame.hasWon() && !theGame.isFull() && in.hasNext())
            {
                int number;
                number = in.nextInt();
                
                if(inputOK(number) && !theGame.isSeatTaken(number))
                {
                    
                    if(theGame.whosTurn){
                        theGame.move(number, Player1.mark);
                    }
                    else{
                        theGame.move(number, Player2.mark);
                    }

                    if(theGame.hasWon() && theGame.whosTurn){
                        System.out.println("Player 2 wins!");

                        theGame.clearAll();
                        Player2.wins++;
                        theGame.whosTurn = true;
                        printWins();
                    }
                    else if(theGame.hasWon() && !theGame.whosTurn){
                        System.out.println("Player 1 wins!");

                        theGame.clearAll();
                        Player1.wins++;
                        theGame.whosTurn = true;
                        printWins();
                        
                    }
                    else if(theGame.isFull()){
                        System.out.println("It's a tie.");
                        theGame.whosTurn = true;
                        theGame.clearAll();
                        printWins();
                        
                    }
                }
                theGame.print();
            }
        }
    }

