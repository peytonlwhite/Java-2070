/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment7j;

import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment7j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        final double tnSalesTax = .07;
        final double lowTip;
        final double mediumTip;
        final double highTip;
        double mealPrice;
        double entreePrice;
        double drinkPrice;
        double dessPrice;
        String nameOfServer;
        String entree = "Entree";
        String drink = "Drink";
        String dessert = "Dessert";
        String total = "Total";
        String tax = "Tax";
        String totaltax = "Total w/ Tax";
        String lowtip = "Low Tip";
        String mediumtip = "Medium Tip";
        String hightip = "High Tip";
        String serverline = "Your server";
        String ds = "$";
        
        
        System.out.println("Welcome to Peyton White's restaurant bill tool. Part 2");
        System.out.println("");
        
        System.out.print("What was the price of your entree: ");
        entreePrice = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("What was the price of your drink: ");
        drinkPrice = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("What was the price of your dessert: ");
        dessPrice = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.print("What was the name of your server: ");
        nameOfServer = keyboard.nextLine();
        System.out.println("");
        
        mealPrice = entreePrice + drinkPrice + dessPrice;
        double salesTax = mealPrice*tnSalesTax;
        double subTotal = salesTax + mealPrice;
        lowTip = .15 * subTotal;
        mediumTip = .18 * subTotal;
        highTip = .20 * subTotal;
        
        
        System.out.printf("%20s%2s %6.2f \n",entree,ds,entreePrice);
        System.out.printf("%20s%2s %6.2f \n",drink,ds,drinkPrice);
        System.out.printf("%20s%2s %6.2f \n",dessert,ds,dessPrice);
        System.out.printf("%20s%2s %6.2f \n",total,ds,mealPrice);
        System.out.printf("%20s%2s %6.2f \n",tax,ds,salesTax);
        System.out.printf("%20s%2s %6.2f \n",totaltax,ds,subTotal);
        System.out.printf("%20s%2s %6.2f \n",lowtip,ds,lowTip);
        System.out.printf("%20s%2s %6.2f \n",mediumtip,ds,mediumTip);
        System.out.printf("%20s%2s %6.2f \n",hightip,ds,highTip);
        System.out.printf("%20s %6s \n",serverline,nameOfServer);
        
    }
    
}
