/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxes2;
import javax.swing.JOptionPane;

//Import måste vara nedanför package/s

/**
 *
 * @author Anna
 */
public class DialogBoxes2
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;
        
        /*The showInputDialog method always returns the user's input as a
        String, even if the user enters numeric data. If you wish to use the
        user's input in a math operation, you must convert the input to a
        numeric value. T ex Double.parseDouble för att konvertera en string
        till en double. Parse-metoderna är en del av Java's wrapper classes.*/
        
        firstName = JOptionPane.showInputDialog("Vad heter du i förnamn?");
        middleName = JOptionPane.showInputDialog("Vad heter du i mellannamn?");
        lastName = JOptionPane.showInputDialog("Vad heter du i efternamn?");
        
        JOptionPane.showMessageDialog(null, "God kväll, " + firstName + " " +
                middleName + " " + lastName + "!");
        
        System.exit(0);
    }
    
}
