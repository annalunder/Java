/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagescore_3.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class AverageScore_31
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //AverageScore.java, Code Listing 3_1
        double score1;
        double score2;
        double score3;
        double score4;
        double average;
        String input;
        
        //Ask the user for the first test score
        input = JOptionPane.showInputDialog("Enter test score #1: ");
        //Convert to a double
        score1 = Double.parseDouble(input);
        
        //Ask the user for the second test score
        input = JOptionPane.showInputDialog("Enter test score #2: ");
        //Convert to a double
        score2 = Double.parseDouble(input);
        
        //Ask the user for the third test score
        input = JOptionPane.showInputDialog("Enter test score #3: ");
        //Convert to a double
        score3 = Double.parseDouble(input);
        
        //Ask the user for the fourth test score
        input = JOptionPane.showInputDialog("Enter test score #4: ");
        //Convert to a double
        score4 = Double.parseDouble(input);
        
        //Calculate the average score
        average = (score1 + score2 + score3 + score4) / 4.0;
        
        //Display the average score
        JOptionPane.showMessageDialog(null, "The average score is " + average);
        
        /* If the score is greater than 95, let the user know that
          it's a great score. */
        
        if (average > 95)
        {
            JOptionPane.showMessageDialog(null, "That's a great score!");
        }
        
        //To end the program        
        System.exit(0);
            
    }
    
}
