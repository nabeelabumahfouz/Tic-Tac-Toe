package tictactoe;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        //Instances and Scanner(s):  DO I NEED PRIVATE INFRONT OF THEMMMMMM?!!!!??
        Boolean Winner = false;
        String PlayerToken = "X"; 
        Scanner myScanner = new Scanner(System.in);
        

        //Creating Arraylists to Keep knowledge positions on boards is taken and to hold the tictactoe board:
        ArrayList<String> StringList =  new ArrayList<>();
        ArrayList<Integer> PlayerMovements = new ArrayList<>();

        //Method Calls:
        Board gameboard = new Board();
        EndGame Check = new EndGame();
          
        //Initializing the Numbers to the board
        gameboard.initializeStringList(StringList);
        
        
        //Drawing Board
        gameboard.DrawBoard(StringList);
        
        
        
        //Where Game Begins:
        while (Winner != true){

            Check.Welcome(PlayerToken);
            System.out.println("Please enter a number between 1-9 for your Position: ");
            int playerTurn = myScanner.nextInt();

            //Checking to see if position is already taken or move entered is illegal: (DO I NEED TO CHECK FOR LETTERS?)
            while( playerTurn > 9 || playerTurn < 1 || PlayerMovements.contains(playerTurn) ){
                System.out.println("\n\nSorry that position is taken or out of bounds! Please Choose an Open Valid Position: ");
                playerTurn = myScanner.nextInt();
            }
            //Appending most recent player turn into positions that are taken:
            PlayerMovements.add(playerTurn);

            //
            gameboard.PlacementOnBoard(playerTurn, StringList, PlayerToken);
            //
            gameboard.DrawBoard(StringList);
            //
            gameboard.setTurn(PlayerToken);
            PlayerToken = gameboard.getTurn();

            //Checking Vertical Win
            Check.VerticalWinner(StringList, Winner);

            //Checking Horizontal Win
            Check.HorizontalWinner(StringList, Winner);

            //Checking Diagonal Win
            Check.DiagonalWinner(StringList, Winner);
            
            //Checking If It's a Tie:
            Check.setTieGame(PlayerMovements, Winner);
            Winner = Check.getTieGame();            
            
        }

    }
}





