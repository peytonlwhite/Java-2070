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
public class SpaceStation extends SpaceCraft {
      private final int ports;
    
    
    
    public SpaceStation(String name,int seats,int ports){
        super(name,seats);
        this.ports = ports;
    }
    public int getPorts(){
        return ports;
    }
    
     @Override
    public String toString(){
        
        String spaceCraft = "Space Station " + name + " has " + String.valueOf(ports) + " ports";
        
        return spaceCraft;
    }
    
}
