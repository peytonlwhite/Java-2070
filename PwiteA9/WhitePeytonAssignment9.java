/* Peyton White
 * 2070 - 08 
 * 2/26/18
 * this program is like rock paper scissors but with different names and 
 * alot of methods to grasp the concept of java methods
 */
package whitepeytonassignment9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line;
        String response;
        int CPUGuess = cpuChoice();
        int playerGuess;

        Scanner keyboard = new Scanner(System.in);

        greetUser();
        do {

            showRules();
            displayOptions();
            playerGuess = keyboard.nextInt();
            CPUPrint(CPUGuess);
            whoWon(CPUGuess, playerGuess);
            System.out.println("Type yes to play again");
            line = keyboard.nextLine();
            response = keyboard.nextLine();

        } while (response.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing");

    }
/**
 * this method prints welcome message to screen.
 * 
 * Precondition None.
 * Postcondition None.
 * 
 * 
 */
    private static void greetUser() {
        System.out.println("Hello welcome to Peyton White's PUNCH JUMP KICK game");

    }
/**
 * this method prints the rules to the screen.
 * 
 * Precondition None.
 * Postcondition None.
 * 
 * 
 */
    private static void showRules() {
        System.out.println("Punching beats Jumping!");
        System.out.println("Jumping beats Kicking!");
        System.out.println("Kicking beats Punching!");

    }
/**
 * this method calculates cpu choice with random gen.
 * 
 * Precondition None.
 * Postcondition None.
 * @return 
 */
    private static int cpuChoice() {
        int number;
        Random randomInt = new Random();
        number = randomInt.nextInt(3) + 1;
        return number;

    }
/**
 * this method displays 3 options to user to choose.
 * 
 * Precondition None.
 * Postcondition None.
 * @return 
 */
    private static void displayOptions() {

        System.out.println("Let's play! enter a guess: ");
        System.out.println("1: Punch");
        System.out.println("2: Jump");
        System.out.println("3: Kick");

    }
/**
 * this method displays which one the cpu chose.
 * 
 * Precondition None.
 * Postcondition None.
 * @param cpuguess is random num gen 
 */
    private static void CPUPrint(int cpuguess) {

        switch (cpuguess) {
            case 1:
                System.out.println("The CPU chose Punch");
                break;
            case 2:
                System.out.println("The CPU chose Jump");
                break;
            case 3:
                System.out.println("The CPU chose Kick");
                break;
            default:
                System.out.println("program crash");
                break;
        }
    }
/**
  * this method displays who won
 * 
 * Precondition None.
 * Postcondition None.
 * @param cpuGuess random number gen 1-3
 * @param playerGuess user choice 1-3
 */
    private static void whoWon(int cpuGuess, int playerGuess) {

        if (cpuGuess == 1 && playerGuess == 2 || cpuGuess == 2 && playerGuess == 3 || cpuGuess == 3 && playerGuess == 1) {
            System.out.println("You Lost!");
        } else {
            System.out.println("You Won!");
        }
        System.out.println("");

    }

}
