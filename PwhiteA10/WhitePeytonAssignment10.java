/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment10;

import java.util.Scanner;

/**
 *
 * @author Peyton
 */
public class WhitePeytonAssignment10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       System.out.println("Hello, welcome to Peyton White's car simulator");
       
       Scanner keyboard = new Scanner(System.in);
       double gas;
       double mpg;
       
       System.out.print("How much gas is in the tank of the car?: ");
       gas = keyboard.nextDouble();
       System.out.print("How many MPG does the car get?: ");
       mpg = keyboard.nextDouble();
       
       Car userCar = new Car(gas,mpg);
       
       System.out.printf("A car object has been created with the gas at %.1f "+
                           " and the MPG is at %.1f \n", gas, mpg);
       System.out.printf("%s", "We will loop while there is gas in the tank \n");
       
       while(userCar.getFuel() > 0){
           double speed;
           double time;
           System.out.print("Enter the speed (in miles per hour) the car will drive: ");
           speed = keyboard.nextDouble();
           System.out.print("Enter the time (in hours) that you drove car: ");
           time = keyboard.nextDouble();
           double distanceNow = speed * time;
           double distanceTraveled = userCar.drive(speed, time);
     
           System.out.printf("The car drove a distance of %.1f miles. \n",distanceNow);
           System.out.printf("The cars odometer is at %.1f miles. \n",userCar.getOdometer());
           System.out.printf("There is %.1f left in the gas tank. \n",userCar.getFuel());
       }
       
      
      
      
      
    }
            
}
