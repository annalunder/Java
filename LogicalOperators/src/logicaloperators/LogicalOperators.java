/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperators;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class LogicalOperators
{ 
    public static void main(String[] args)
    {
        /*
                        Logical operators:
          &&    AND, connects two boolean expressions into one
          ||    OR,  connects two boolean expressions into one
           !    NOT, reverses the truth of a boolean expression
        
                           Precedence:
                                !
                                &&
                                ||
        
        
          Another version of NestedIfStatements, now with logical 
          operators instead.
          
          Så här hade jag i första hand löst uppgiften, i stället
          för med nästade if statements.
        
        */
        
        double salary;
        double yearsOnJob;
        String input;
        
        //Ask the user for his or her annual salary
        input = JOptionPane.showInputDialog("Enter your annual salary: ");
        salary = Double.parseDouble(input);
        
        //Ask the user for number of years at the current job
        input = JOptionPane.showInputDialog("Enter the number of year"
                                            + " at your current job: " );
        yearsOnJob = Double.parseDouble(input);
        
        //Determine whether the user qualifies for the loan
        if (salary >= 30000 && yearsOnJob >= 2)
        {
            JOptionPane.showMessageDialog(null, "You qualify for the loan.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "You do not qualify for the"
                                                    + " loan.");
        }
        
        System.exit(0);
        
        
        //Ett annat exempel
        boolean isValid = true;
        int x = 0;
        
        if (isValid && x > 10)
        {
            JOptionPane.showMessageDialog(null, "Hej hej!");
        }
        
        
    }
    
}
