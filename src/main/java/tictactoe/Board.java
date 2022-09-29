package tictactoe;

import java.util.ArrayList;

public class Board {
    

    private String PlayerTurn = "X";

    //Initializing String Board
    public void initializeStringList(ArrayList<String> myString){

        for (int i = 0; i < 9; i++){
            myString.add( Integer.toString(i+1) ); 
        }

    }



    //Drawing Board:
    public void DrawBoard(ArrayList<String> myString) {

        System.out.println( myString.get(0) + "|" + myString.get(1) + "|" + myString.get(2) + "\n" );
        System.out.println( myString.get(3) + "|" + myString.get(4) + "|" + myString.get(5) + "\n" );
        System.out.println( myString.get(6) + "|" + myString.get(7) + "|" + myString.get(8) + "\n" );

    }
    
    //Placing things on gameboard (i.e. swapping Numbers with Tokens)
    public void PlacementOnBoard(Integer UserInput, ArrayList<String> myString, String PlayerToken) {
        myString.set(UserInput - 1,  PlayerToken); 
    }


    //Find out which players turn it is (Purpose of knowing which token)
    //Note: could have also just called in PlacementonBoard as well!
    public void setTurn(String turn){

        if (turn == "X") {
            turn = "O";
        } else {
            turn = "X";
          }
        this.PlayerTurn = turn;

    }

    public String getTurn(){
        return PlayerTurn;
    }


    
    


    //Switch case to switch token with #'s (is there a more clean code way of doing this?)
    
 
    //Horiontal win conditions
    //123, 456, 789


    //Vertical win conditions
    //147,258,369

    //Diagnoal win conditions
    //159, 357
}
    



///// HOW DO I PROPERLY pass through an arraylist function arguement???

