package tictactoe;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
 
        Boolean Winner = false;
        String PlayerToken = "X"; 
        Scanner myScanner = new Scanner(System.in);
        

        //Creating arraylists to keep knowledge positions on boards is taken and to hold the tictactoe board:
        ArrayList<String> StringList =  new ArrayList<>();
        ArrayList<Integer> PlayerMovements = new ArrayList<>();

        //Creating an Object for Specified classes:
        Board gameboard = new Board();
        EndGame Check = new EndGame();
          
        //Initializing the Numbers to the board:
        gameboard.initializeStringList(StringList);
        
        
        //Drawing board:
        gameboard.DrawBoard(StringList);
        
        
        
        //Where game begins:
        while (Winner != true){

            Check.Welcome(PlayerToken);
            System.out.println("Please enter a number between 1-9 for your Position: ");
             
            String play = myScanner.next();
            int playerTurn = gameboard.checkPlayerTurn(play);
            

            //Checking to see if position is already taken or move entered is illegal:
            while( playerTurn > 9 || playerTurn < 1 || PlayerMovements.contains(playerTurn) ){

                System.out.println("\n\nSorry that position is taken or out of bounds! Please Choose an Open Valid Position: ");
                play = myScanner.next();
                playerTurn = gameboard.checkPlayerTurn(play);

            }

            //Appending most recent player turn into positions that are taken:
            PlayerMovements.add(playerTurn);

            //Updating board with new player position:
            gameboard.PlacementOnBoard(playerTurn, StringList, PlayerToken);

            //Redrawing board with new player position:
            gameboard.DrawBoard(StringList);

            //Using () to switch player token:
            gameboard.setTurn(PlayerToken);
            PlayerToken = gameboard.getTurn();

            //Checking vertical win:
            Check.VerticalWinner(StringList, Winner);

            //Checking horizontal win:
            Check.HorizontalWinner(StringList, Winner);

            //Checking diagonal win:
            Check.DiagonalWinner(StringList, Winner);

            //Checking if it's a tie:
            Check.setTieGame(PlayerMovements, Winner);
            Winner = Check.getTieGame();            
            
        }

    }
}
