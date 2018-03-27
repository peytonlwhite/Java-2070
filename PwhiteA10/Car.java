/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment10;

/**
 *
 * @author Peyton
 */
public class Car {

    private double odometer;
    private double fuel;
    private double MPG;
    /**
     * This method is the constructor and initializes fuel and mpg.
     * Precondition fuel and MPG can't be negative.
     * Postcondition fuel and MPG are set.
     * @param gas 
     * @param mpg 
     */
    public Car(double gas, double mpg) {
        fuel = gas;
        MPG = mpg;
        odometer = 0;
    }
    public void setFuel(double gas){
        fuel = gas;
        
    }
    /**
     * this method returns fuel.
     * Precondition None.
     * Postcondition None.
     * @return the fuel amount 
     */
    public double getFuel(){
        return fuel;
    }
    /**
     * this method returns odometer.
     * Precondition None.
     * Postcondition None.
     * @return the odometer amount 
     */
    public double getOdometer(){
       return odometer;
   }
    /**
     * this method will drive the car at certain speed and see if there is enough 
     * gas in the tank for the distance.
     * Precondition: speed and time must be positive.
     * Postcondition: none.
     * @param speed
     * @param time
     * @return distance which is speed * time.
     */
    public double drive(double speed, double time){
        
        double distance = speed * time;
        double maxDistance = MPG * fuel;
        double reqGas = distance / MPG;
        if(reqGas < fuel){
            fuel = fuel - reqGas;
        }
        else {
            distance = maxDistance;
            fuel = 0;
        } 
        odometer = odometer + distance;
        
            
        
        return distance;
    }
    
    
}
