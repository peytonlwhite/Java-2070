/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Peyton
 */
public class WhitePeytonAssignment14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        ArrayList<SpaceCraft> spaceObj = new ArrayList<>();
        
        
  
        String wordInput;
        String trashtest;
 
        int choice = 0;
        do {
            
            System.out.println("1. Add a new space station.");
            System.out.println("2. Add a new space shuttle.");
            System.out.println("3. Display count of all space craft(s).");
            System.out.println("4. Display count of number of seats.");
            System.out.println("5. Description of all space craft(s).");
            System.out.println("6. Quit");
            System.out.print("Enter an option from 1 to 6: ");
            choice = keyboard.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    {
                        String nameInput;
                        int seats;
                        int ports;
                        System.out.println("Enter a new space station");
                        System.out.print("Enter the name: ");
                        trashtest = keyboard.nextLine();
                        wordInput = keyboard.nextLine();
                        System.out.print("Enter the number of seats: ");
                        seats = keyboard.nextInt();
                        System.out.print("Enter the number of ports: ");
                        ports = keyboard.nextInt();
                        SpaceStation e = new SpaceStation(wordInput, seats, ports);
                        spaceObj.add(e);
                        break;
                    }
                case 2:
                    {
                        int seats;
                        int engines;
                        System.out.println("Enter a new space shuttle");
                        System.out.print("Enter a name: ");
                        trashtest = keyboard.nextLine();
                        wordInput = keyboard.nextLine();
                        System.out.print("Enter the number of seats: ");
                        seats = keyboard.nextInt();
                        System.out.print("Enter the number of engines: ");
                        engines = keyboard.nextInt();
                        SpaceShuttle e = new SpaceShuttle(wordInput, seats, engines);
                        spaceObj.add(e);
                        break;
                    }
                case 3:
                    System.out.println("There are " + spaceObj.size()+ " space craft(s)");
                    System.out.println("");
                    break;
                case 4:
                    int totalSeats = 0;
                    for(int i = 0; i < spaceObj.size();i++){
                        
                        totalSeats = totalSeats + spaceObj.get(i).getSeats();
                        
                    }   
                    System.out.println("There are " + totalSeats + " seats across all spaceScraft(s)");
                            System.out.println("");
                    break;
                case 5:
                    for(int i = 0; i < spaceObj.size();i++){
                        String craftname = spaceObj.get(i).getName();
                        String toString = spaceObj.get(i).toString();
                        System.out.println(toString);
                        
                    }   break;
                default:
                     System.out.println("");
                     System.out.println("Thanks for using Peytons Space craft program");
                    break;
            }
            
   
            
            
            
        } while (choice != 6);

        
       
        
        
        
        
        
        
    }
    
    
    
   
    
}
