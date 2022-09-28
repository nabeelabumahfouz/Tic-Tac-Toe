package tictactoe;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        String userInput = 0;
        private String playerToken = "X";

        ArrayList<String> stringList =  new ArrayList<>(); // make arraylist with positions; make a string builder string

        stringList.add("|1|2|3|");
        stringList.add("|—+—+—|");
        stringList.add("|4|5|6|");
        stringList.add("|—+—+—|");
        stringList.add("|7|8|9|");

        for (String someString: stringList){ //Can I do What I am trying to do here or would it be easier to just use a 2d array and replace the position of a certain spot?
            for(int i = 0; i < stringList.length(); i++){
                if (stringList.charAt(i) == userInput){
                    stringList.replace("1", playerToken);
                }
            }
        }
    }

 }






