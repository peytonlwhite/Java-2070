/*
 * Peyton White
 * cs 2070-08
 * 2/20/18
 * the program reads a file and writes to a different file the words and word 
 * length by each line 
 */
package whitepeytonassignment8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Hello welcome to Peyton White's file reader program");
       System.out.println("Enter a file to read EX:gettysburg.txt");
       String readfilename = keyboard.nextLine();
       File file = new File(readfilename);
       Scanner filereader = new Scanner(file);
       System.out.println("That file has been opened!");
       System.out.println("Enter a file to write to EX:out.txt");  
       String writefilename = keyboard.nextLine();    
       
       FileWriter fw = new FileWriter(writefilename,true);    
       PrintWriter pw = new PrintWriter(fw);  
      
       while(filereader.hasNext()){
           String word = filereader.next();
           pw.print(word + " ");
           pw.println(word.length());
       }
       filereader.close();
       fw.close();
      
       
        
        
        
        
      
    }
    
}
