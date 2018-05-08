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
public class SpaceShuttle extends SpaceCraft {
      private final int engines;
    
    
    SpaceShuttle(String name,int seats,int engines){
        super(name,seats);
        this.engines = engines;
        
    }
    public int getEngines(){
        return engines;
    }
    
     @Override
    public String toString(){
        
        String spaceCraft = "Space Shuttle " + name + " has " + String.valueOf(engines) + " engines";
        
        return spaceCraft;
    }
    
}
