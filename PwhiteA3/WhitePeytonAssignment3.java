/*
 * Peyton White
 * CS 2070 - 08
 * 1/30/2018   
 * this program calculates the users bill and gives them a reasonable tip amount
 */
package whitepeytonassignment3;

import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double tnSalesTax = .07;
        final double lowTip = .15;
        final double mediumTip = .18;
        final double highTip = .20;
        double mealPrice;
        String nameOfServer;
        
        
        System.out.println("Welcome to Peyton White's restaurant bill tool");
        System.out.println("");
        System.out.print("What was the price of your meal: ");
        mealPrice = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("What was the name of your server: ");
        nameOfServer = keyboard.nextLine();
        System.out.println("");
        System.out.println("Total before tax is:" + mealPrice);
        System.out.println("sales tax is "+ (mealPrice*tnSalesTax));
        double salesTax = mealPrice*tnSalesTax;
        double subTotal = salesTax + mealPrice;
        System.out.println("Subtotal:"+ subTotal);
        System.out.println("15.0%:  " + (subTotal*lowTip));
        System.out.println("18.0%:  " + (subTotal*mediumTip));
        System.out.println("20.0%:  " + (subTotal*highTip));
        System.out.println("");
        System.out.println("your sever is " + nameOfServer);
        
    }
    
}
