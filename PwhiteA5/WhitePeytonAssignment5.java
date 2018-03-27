/*
 *Peyton White
 *CS 2070-08
 *1/30/18
 *
 */
package whitepeytonassignment5;

import javax.swing.JOptionPane;

/**
 *
 * @author Peyto
 */
public class WhitePeytonAssignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input;
        double testScore1;
        double testScore2;
        double testScore3;
        double average;
        int totalScores = 0;
        JOptionPane.showMessageDialog(null, " Welcome to Peyton White's test score average," +
                                "This Program will average three test scores");

        input = JOptionPane.showInputDialog(null, "Enter test score 1");
        testScore1 = Double.parseDouble(input);
        totalScores++;
        
        input = JOptionPane.showInputDialog(null, "Enter test score 2");
        testScore2 = Double.parseDouble(input);
        totalScores++;
        
        input = JOptionPane.showInputDialog(null, "Enter test score 3");
        testScore3 = Double.parseDouble(input);
        totalScores++;
        
        average = (testScore1 +testScore2 + testScore3) / totalScores;
        
        JOptionPane.showMessageDialog(null, "Your total average for all " +totalScores+
                                        " testscores is " + average);
        
    }

}
