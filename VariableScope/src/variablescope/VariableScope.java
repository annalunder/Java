/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablescope;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class VariableScope
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /**
        This program demonstrates how variables
        may be declared in various locations
        throughout a program.
        
        
        A local variable’s scope always starts at
        the variable’s declaration, and ends at the
        closing brace of the block of code in which
        it is declared. 
        */
        
        //Ask for the user's first name
        String firstName;
        firstName = JOptionPane.showInputDialog("What is your first name? ");
        
        //Ask for the user's last name
        String lastName;
        lastName = JOptionPane.showInputDialog("What is your last name? ");
        
        JOptionPane.showMessageDialog(null, "Hello, " + firstName + " " +
                                                lastName + "!");
        System.exit(0);
        
        /**
        It is a common practice to declare all of a method’s local variables
        at the beginning of the method, but it's possible to declare them at
        later points. Sometimes programmers declare certain variables near the
        part of the program where they are used in order to make their purpose
        more evident.
        */
    }
    
}
