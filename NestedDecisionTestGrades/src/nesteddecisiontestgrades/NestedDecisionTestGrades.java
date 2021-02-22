/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesteddecisiontestgrades;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class NestedDecisionTestGrades
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Chapter 3.3 In the spotlight:
           Code for: Test grades*/
        
        int testScore;      //A numeric test score
        String input;       //To hold the user's input
        
        //Ask the user for his or her numeric test score
        input = JOptionPane.showInputDialog("Enter a numeric"
                + " test score and I will tell you the grade. ");
        
        //Convert the String to an int
        testScore = Integer.parseInt(input);
        
        //Display the grade
        if (testScore < 60)
        {
            JOptionPane.showMessageDialog(null, "Your grade is F.");
        }
        else
        {
            if (testScore < 70)
            {
                JOptionPane.showMessageDialog(null, "Your grade is D.");
            }
            else
            {
                if (testScore < 80)
                {
                    JOptionPane.showMessageDialog(null, "Your grade is C.");
                }
                else
                {
                    if (testScore < 90)
                    {
                        JOptionPane.showMessageDialog(null, "Your grade is B.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your grade is A.");
                    }
                    
                }
            }
            
        }
         
        System.exit(0);
    }
    
}
