/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment14;

/**
 *
 * @author Peyton
 */
public class SpaceCraft {
     public final String name;
    private final int seats;
    
    
    
    
    public SpaceCraft(String name,int seats){
        this.name = name;
        this.seats = seats;
    }
    public String getName(){
        return name;
    }
    public int getSeats(){
        return seats;
    }
    
    @Override
    public String toString(){
        
        String spaceCraft = name + "has" +String.valueOf(seats);
        
        return spaceCraft;
    }
    
}
