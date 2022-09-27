package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Board { 
    private ArrayList <Character> positions; //why is it suggesting that I remove positions here?
    private static int PosToIndex[] = { 2, 6, 10,}; //12, 14, 16, 24, 26, 28 }; EDIT REST
    private static Scanner input = new Scanner(System.in); //should the scanner go in here or static main (i.e. App class)
    
    public static void instrucboard() {
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("|———+———+———|");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("|———+———+———|");
        System.out.println("| 7 | 8 | 9 |");
    }    

    
}
