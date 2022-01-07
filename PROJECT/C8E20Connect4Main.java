//Connect Four Game
//Chetan Goyal - CWID: 20005334
//Group name - CS 501 - Connect 4 Simulation
import java.util.*;
public class C8E20Connect4Main {
    //Main method to play the game and run it
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        boolean toExit = false;
        while (toExit == false) {
            System.out.println("This is a Connect 4 game simulation, wherein Red and Yellow make moves alternatively, beginning with red, in a 7 column x 6 row board.");
            System.out.println("The first one to get four of their colour together, either vertically, horizontally or diagonally, wins the game while each of them try to block each other from winning.");
            System.out.println("\nIf you wish to exit the ongoing game, press -1 when asked to enter the column number for disk to drop.");
            BackendForC4Connect b = new BackendForC4Connect();
            b.playGame();

            //see if the players wish to play the game again
            System.out.print("\nIf you wish to play again, press 1, else press 0: ");
            if (inp1.nextInt() == 0)
                toExit = true;
            System.out.println();   
            
        }

        //closing the scanner
        inp1.close(); 
    }
}