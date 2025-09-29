import java.lang;
import java.util.Scanner;

public class GameLoop{

    private boolean running;

    public void run() {
        running = true;

        System.out.println("Welcome to Battleship");

        while(running) {
            //render

        }
    }

    private int[] TakeGuess(Scanner input) {
        int[] guess = new int[2];

        System.out.println("Enter a x coordinate");
        try{
            guess[0] = input.nextInt();
        } catch (Exception e) {

        }
    }

}