/*
 * Peyton White
 * CS 2070 - 08
 * Jan 28 2018
 * this program shoes what an imaginary apsu is and translates the sqaure feet 
 * of user input into my apsu's
 */
package peytonwhitea2;

import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class PeytonWhiteA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to Peyton White's sqaure feet to apsu "
                + "conversion software");
        Scanner keyboard = new Scanner(System.in);
        int user_length = 0;
        int user_width = 0;
        int apsu = 47859;
        System.out.println("1 apsu: " + apsu + "is equal to 1 sqaure feet");
        System.out.print("Please enter in a length of the land in feet: ");
        user_length = keyboard.nextInt();
        System.out.print("Please enter in a width of the land in feet: ");
        user_width = keyboard.nextInt();
        System.out.println("The area in Square feet of the land is " + user_length * user_width);
        System.out.print("The area in apsus is: " + (user_length * user_width) / apsu);

    }

}
