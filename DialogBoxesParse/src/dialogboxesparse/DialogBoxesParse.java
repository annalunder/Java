/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogboxesparse;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class DialogBoxesParse
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int number;
        String str;
        str = JOptionPane.showInputDialog("Enter a number");
        number = Integer.parseInt(str);
        
        double price;
        String str2;
        str2 = JOptionPane.showInputDialog("Enter the retail price");
        price = Double.parseDouble(str2);
        
        //Ett helt program för att räkna ut total lön
        String inputString;         //For reading input
        String name;                //The user's name
        int hours;                  //The number of hours worked
        double payRate;             //The user's hourly payRate (timlön)
        double grossPay;            //The user's gross pay (total lön)
        int age;                    //För Checkpoint 2.36
        
        //The user's name
        name = JOptionPane.showInputDialog("What is your name?");
        //Hours worked
        inputString = JOptionPane.showInputDialog("How many hours"
                + " did you work this week?");
        //Convert the input to an int
        hours = Integer.parseInt(inputString);
        
        //The hourly pay rate
        inputString = JOptionPane.showInputDialog("What is your "
                + "hourly pay rate?");
        //Convert the input to a double
        payRate = Double.parseDouble(inputString);
        //Calculate the gross pay
        grossPay = hours * payRate;
        
        //Display the results
        JOptionPane.showMessageDialog(null, "Good evening, " + name +
                                ". Your gross pay is $" + grossPay);
        
        //Checkpoint 2.36
        inputString = JOptionPane.showInputDialog(null, "What is your age?");
        age = Integer.parseInt(inputString);
        
        //End the program
        System.exit(0);
    }
    
}
