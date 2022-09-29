package tictactoe;

import java.util.ArrayList;

public class EndGame {

    private Boolean Winner = false;

    //Welcome message:
    public void Welcome(String PlayerToken){

        if(PlayerToken == "X"){
            System.out.println("Player One (X)! ");
        }
        else{
            System.out.println("Player Two (O)! ");
        }

    }

    //Horizontal Win Conditions:
    public Boolean HorizontalWinner(ArrayList<String> myString, Boolean Winner){ //better way??????????

        for (int i = 0; i < myString.size(); i = i + 3){
            if (myString.get(i) == "X" && myString.get(i+1) == "X" && myString.get(i+2) == "X"){ 
                System.out.println("PLAYER 1 WINS!");
                this.Winner = true;
            }
            else if (myString.get(i) == "O" && myString.get(i+1) == "O" && myString.get(i+2) == "O"){ 
                System.out.println("PLAYER 2 WINS!");
                this.Winner = true;
            }
        }

        return Winner;
    }

    //Vertical Win Conditions:
    public Boolean VerticalWinner(ArrayList<String> myString, Boolean Winner){

        for (int i = 0; i < 3; i++){
            if (myString.get(i) == "X" && myString.get(i+3) == "X" && myString.get(i+6) == "X"){ 
                System.out.println("PLAYER 1 WINS!");
                this.Winner = true;
            }
            else if (myString.get(i) == "O" && myString.get(i+3) == "O" && myString.get(i+6) == "O"){ 
                System.out.println("PLAYER 2 WINS!");
                this.Winner = true;
            }
        }

        return Winner;
    }


    //Diagonal Win Conditions
    public Boolean DiagonalWinner(ArrayList<String> myString, Boolean Winner){

        if (myString.get(0) == "X" && myString.get(4) == "X" && myString.get(8) == "X"){ 
            System.out.println("PLAYER 1 WINS!");
            this.Winner = true;
        }
        else if (myString.get(2) == "X" && myString.get(4) == "X" && myString.get(6) == "X"){ 
            System.out.println("PLAYER 1 WINS!");
            this.Winner = true;
        }
        else if (myString.get(0) == "O" && myString.get(4) == "O" && myString.get(8) == "O"){ 
            System.out.println("PLAYER 2 WINS!");
            this.Winner = true;
        }
        else if (myString.get(2) == "O" && myString.get(4) == "O" && myString.get(6) == "O"){ 
            System.out.println("PLAYER 2 WINS!");
            this.Winner = true;
        }

        return Winner;
    }



    //Checking to see if its a Tie:
    public void setTieGame(ArrayList<Integer> PlayerMovements, Boolean Winner){
        if(PlayerMovements.size() == 9){
        System.out.println("GAME OVER: FINISHED IN A TIE!");
        this.Winner = true;
        }
    }
    public Boolean getTieGame(){
        return Winner;
    }


}
