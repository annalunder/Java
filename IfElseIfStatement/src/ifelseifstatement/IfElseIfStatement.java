/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseifstatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class IfElseIfStatement
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Chapter 3.4
        
        /*It is often simpler to test a series of conditions
          with the if-else-if statement than with a set of
          nested if-else statements.*/
        
        /*A version of NestedDecisionTestGrades with
        if-else-if statements instead of nested if
        statements.*/
        
        int testScore;          //A numeric test score
        String input;           //To hold the user's input
        
        //Ask the user for a numeric test score
        input = JOptionPane.showInputDialog("Please enter a"
                    + "numeric test score and I will tell you"
                    + " the grade. ");
        
        testScore = Integer.parseInt(input);
        
        //Display the grade
        if (testScore < 60)
        {
            JOptionPane.showMessageDialog(null, "Your grade is F.");
        }
        else if (testScore < 70)
        {
            JOptionPane.showMessageDialog(null, "Your grade is D.");
        }
        else if (testScore < 80)
        {
            JOptionPane.showMessageDialog(null, "Your grade is C.");
        }
        else if (testScore < 90)
        {
            JOptionPane.showMessageDialog(null, "Your grade is B.");
        }
        /*The last else clause, which does not have an if statement
          following it, is referred to as the trailing else.*/
        
        /*YOU CAN USE THE TRAILING ELSE TO CATCH ERRORS
          Let's say the max score on the test is 100.*/
        
        /*else
        {
            JOptionPane.showMessageDialog(null, "Your grade is A.");
        }
        */
        
        else if (testScore <= 100)
        {
            JOptionPane.showMessageDialog(null, "Your grade is A.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid score.");
        }
        
        System.exit(0);
    }
    
}
