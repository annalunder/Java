/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_1;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class Exercise_1
{
    public static void main(String[] args)
    {
        String inputMonth;
        String inputDay;
        String inputYear;
        int month;
        int day;
        int year;
        
        //Ask the user for a month
        inputMonth = JOptionPane.showInputDialog("Please enter a month ");
        
        /*The showInputDialog method always returns the user's
        input as a String, even if the user enters numeric data.*/
        
        //Convert the String input to a number
        month = Integer.parseInt(inputMonth);
        
        //Ask the user for a day
        inputDay = JOptionPane.showInputDialog("Please enter a day ");
        
        //Convert the String input to a number
        day = Integer.parseInt(inputDay);
        
        //Ask the user for a year
        inputYear = JOptionPane.showInputDialog("Please enter a day, using two"
                + " digits ");
        
        //Convert the String input to a number
        year = Integer.parseInt(inputYear);
        
        
        //Check if the date is magic or not
        if(month * day == year)
        {
            JOptionPane.showMessageDialog(null, "The date is magic");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "The date is not magic");
        }
        
        //To end the program
        System.exit(0);
        
    }
    
}
