/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifstatements;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class NestedIfStatements
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Chapter 3.3 Nested if statements:
           From the book: LoanQualifier */
        double salary;          //Annual salary
        double yearsOnJob;      //Years at current job
        String input;           //To hold a String input
        
        //Obs! Det räcker alltså med en variabel för input.
        
        //Ask the user for his or her annual salary
        input = JOptionPane.showInputDialog("Enter your annual salary: ");
        
        //Convert from a String to a double
        salary = Double.parseDouble(input);
        
        //Ask the user for number of years at the current job
        input = JOptionPane.showInputDialog("How many years have you"
                + " been at your current job? ");
        
        //Convert from a String to a double
        yearsOnJob = Double.parseDouble(input);
        
        //Determine whether the user qualifies for the loan or not
        if (salary >= 30000)
        {
            if (yearsOnJob >= 2)
            {
                JOptionPane.showMessageDialog(null, "You are"
                        + " qualified" + " for the loan.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You must"
                        + " have been at your current job at"
                        + " least two years to qualify.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You must earn"
                    + " at least $30,000 per year to qualify.");
        }
        
        System.exit(0);
    }
    
}
