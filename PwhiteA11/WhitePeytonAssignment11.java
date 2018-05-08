/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment11;

import java.util.Scanner;

/**
 *
 * @author Peyton
 */

public class WhitePeytonAssignment11 {

    /**
     * @param args the command line arguments
     */
    
    
    static final int SIZE = 5;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] lotteryTicket = new int[SIZE];
        int[] winningLotteryTicket = new int[SIZE];

        System.out.println("Welcome to Peyton White's ticket matching software");

        System.out.println("Enter the five numbers from 1 to 50 of the winning draw.");
        for (int i = 0; i < SIZE; i++) {

            System.out.print("Enter the winning draw number " + (i + 1) + ":");
            winningLotteryTicket[i] = keyboard.nextInt();
        }
        
         System.out.println("Enter the five numbers from 1 to 50 for a ticket.");
        for (int i = 0; i < SIZE; i++) {

            System.out.print("Enter the ticket number " + (i + 1) + ":");
            lotteryTicket[i] = keyboard.nextInt();
        }
 
        boolean exactCompare = isPerfectMatch(winningLotteryTicket,lotteryTicket);
        int numOfSame = countingMatchingNumbers(winningLotteryTicket,lotteryTicket);
        System.out.println("");
        
        if(exactCompare){
            System.out.println("These tickets are a perfect match");
        }
        else System.out.println("These tickets aren't a perfect match. They have "
                + (numOfSame) + " number(s) in common.");

        
    }
    
    /**
     * This method returns true if arrays equal each other, otherwise false.
     * @param wlt 
     * @param rlt
     * Preconditions: both arrays have to be 5 elements along.
     * Postconditions: NONE.
     * @return 
     */
    public static boolean isPerfectMatch(int[] wlt,int[] rlt ){
       
        boolean arraysEqual = true;
        int index = 0;
     while(arraysEqual && index < SIZE){
         if(wlt[index] != rlt[index]){
             arraysEqual = false;
         }
          index++;
     }
   
return arraysEqual;
}
     /**
     * This method returns the count of the mathching numbers anywhere in the arrays.
     * @param count
     * @param wlt 
     * @param rlt
     * Preconditions: both arrays have to be 5 elements along.
     * Postconditions: NONE.
     * @return 
     */
    public static int countingMatchingNumbers(int[] wlt, int[] rlt){
        int count = 0;
        for(int i = 0; i < SIZE;i++){
            
            for(int j = 0; j<SIZE;j++){ 
                
                if(wlt[i] == rlt[j]){
                count++;
            }
            
          }
      }
      
        return count;
  
    }
    
    
    
    
    
    
    
    
}