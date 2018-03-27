/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment6;

import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String secondName;
        String thirdName;
        String temp;
        Boolean flag = false;
        System.out.println("Hello welcome to Peyton White's name sorter");
        System.out.println("All games must be unique");
        System.out.print("Enter the first name: ");
        firstName = keyboard.nextLine();
        System.out.print("Enter the second name: ");
        secondName = keyboard.nextLine();
        System.out.print("Enter the third name: ");
        thirdName = keyboard.nextLine();

        //first name comparisons
        if (firstName.equals(secondName) && (firstName.equals(thirdName))) {
            System.out.println("The first name is the same as the second and the third name");
            flag = true;
        } else if (firstName.equals(secondName)) {
            System.out.println("The first name is the same as the second name");
            flag = true;
        } else if (firstName.equals(thirdName)) {
            System.out.println("The first name is the same as the third name");
            flag = true;
        } 
        // second name comparsions'
        else if (secondName.equals(firstName) && (secondName.equals(thirdName))) {
            System.out.println("The second name is the same as the first name and the third name");
            flag = true;
        } else if (secondName.equals(thirdName)) {
            System.out.println("The second name is the same as the third name");
            flag = true;
        } 
        //third name comparisons
        else if (thirdName.equals(secondName) && (thirdName.equals(firstName))) {
            System.out.println("The third name is the same as the first name and the third name");
            flag = true;
        }

        
        
        // puts the names in order A-Z
        if (firstName.compareTo(secondName) > 0) {
            temp = firstName;
            firstName = secondName;
            secondName = temp;
        }
        if (firstName.compareTo(thirdName) > 0) {
            temp = firstName;
            firstName = thirdName;
            thirdName = temp;
        }

        if (secondName.compareTo(thirdName) > 0) {
            temp = secondName;
            secondName = thirdName;
            thirdName = temp;
        }
        
      // results is 
      while(flag == false)
      {
          System.out.println(firstName);
          System.out.println(secondName);
          System.out.println(thirdName);
          flag = true;
      }
        
        
        
        
        
        
           
   
        
        
        

    
    
    }
    
}
