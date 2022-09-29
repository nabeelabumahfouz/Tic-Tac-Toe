package tictactoe;

import java.util.ArrayList;



public class PlayerActions {

    private String player1Token;

    //using 2 arrays to fill the player positions to make sure they dont overlap and just have the board as a 2d array

    //Player 1's Turn (X)
    public void player1Turn(Integer UserInput, ArrayList<String> myString, String Player1) {
        //Place move on board:
        myString.set(UserInput - 1,  Player1); 
    }

    
}
