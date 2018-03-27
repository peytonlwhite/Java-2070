/*
 * Peyton White
 * CS2070 - 08
 * 1/30/18
 *
*/
package whitepeytonassignment4;

import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       final int quarterValue = 25;
       final int dimeValue = 10;
       final int nickelValue = 5;
       final int pennyValue = 1;
       
       int numberOfQuarters;
       int numberOfDimes;
       int numberOfNickels;
       int numberOfPennies;
       int userAmount;
       int total;
       
       
       System.out.println("Welcome to Peyton White's coin algorith Program");
       System.out.println("This program tells you the least amount of coins you have according to your total");    
       System.out.println("");
       System.out.print("What is the amount of money you have: ");
       total = keyboard.nextInt();
       //keyboard.nextLine();
      
       
       numberOfQuarters = total/quarterValue;
       total = total % quarterValue;
       
       numberOfDimes = total/dimeValue;
       total = total % dimeValue;
       
       numberOfNickels = total/nickelValue;
       total = total % nickelValue;
       
       numberOfPennies = total/pennyValue;
       total = total % pennyValue;
       
       System.out.println("the amount of Quarters you have is: "+ numberOfQuarters);
       System.out.println("the amount of Dimes you have is: "+ numberOfDimes);
       System.out.println("the amount of Nickels you have is: "+ numberOfNickels);
       System.out.println("the amount of Pennies you have is: "+ numberOfPennies);
       
                           
        
    }
    
}
