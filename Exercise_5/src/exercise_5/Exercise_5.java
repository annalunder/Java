/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_5;
import javax.swing.JOptionPane;
/**
 * Jag hann inte göra den här uppgiften
 * i själva inlämningen.
 * @author Anna
 */
public class Exercise_5
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int hours;
        double payRate;
        String str1;
        String str2;
        double payRateOver40;
        double payRateOver50;
        double payRateOver60;
        double grossPay;
        double normalPay;
        double overtimePay;
        
        
        str1 = JOptionPane.showInputDialog("How many hours did you work? ");
        
        //Convert to a number
        hours = Integer.parseInt(str1);
        
        str2 = JOptionPane.showInputDialog("What is your hourly pay rate? ");
        
        //Convert to a number
        payRate = Double.parseDouble(str2);
        
        //Calculations of the pay rate
        if (hours <= 40)
        {
            payRate = 1.0;
        }
        if (hours > 40)
        {
            payRateOver40 = 1.25;
        }
        if(hours > 50)
        {
            payRateOver50 = 1.5;
        }
        if (hours > 60)
        {
            payRateOver60 = 1.75;
        }
        
        //Convert to a number
        payRateOver40 = Double.parseDouble(str2);
        payRateOver50 = Double.parseDouble(str2);
        payRateOver60 = Double.parseDouble(str2);
        
        //Calculations
        normalPay = payRate * hours;
        overtimePay = payRate * 1.25;
        grossPay = normalPay + overtimePay;
        
        JOptionPane.showMessageDialog(null, "Your gross pay is $"
                + grossPay + ".");
    }
    
}
