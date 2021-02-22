/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation2;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class StringManipulation2
{
    /**
    Här måste man använda JOptionPane!!
    */
    public static void main(String[] args)
    {
        String name;        //To hold the user's input
        
        //Ask the user for his or her favourite city
        name = JOptionPane.showInputDialog("What is your favourite city? ");
        
        
        int stringSize = name.length();     //To hold the city's length
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        char firstLetter = name.charAt(0);
        
        //Display the results
        JOptionPane.showMessageDialog(null, "Your favourite city is " +
                name + ", it has " + stringSize + " characters. " +
                upper + ", " + lower + " and the first character is " +
                firstLetter + ".");
        
        System.exit(0);
    }
}
