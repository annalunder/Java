/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import javax.swing.JOptionPane;
import java.math.*;
import java.lang.*;
/**
 *
 * @author Anna
 */
public class Exercise1
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        /*Programmet räknar ut BMI med amerikanska mått,
        tror jag. Hur konverterar jag till kg och cm? */
        
        int weight;
        int weight2;
        int height;
        double BM;
        int heightInMeters;
        String input1;
        String input2;
        
        double MetricConverter;       // ???
        
        //Ask for the user's weight in kg
        input1 = JOptionPane.showInputDialog("What is your weight, in kg? ");
        //weight = Double.parseDouble(s);
        
        //Ask for the user's height in cm
        input2 = JOptionPane.showInputDialog("What is your height, in cm? ");
        
        
        //Convert to a number
        weight = Integer.parseInt(input1);
        height = Integer.parseInt(input2);
        
        //final double KgPerPound = 0.4535;
        
        //Height in meters instead of in centimeters, cast to an int
        heightInMeters = (int)(0.01 * height);
        
        // The formula for BMI = weight / (height * height),
        // where height shall be in meters.
        
        //Use Math.pow to calculate the BMI
        
        //double nämnare = Math.pow(heightInMeters, 2.0);
        
        //The formula to calculate the user's BMI
        BM = weight/Math.pow(heightInMeters, 2.0);
        
        JOptionPane.showMessageDialog(null, "Your BMI is " + BM);
        
        //Display the result and a message
        if (BM < 18.5)
        {
            String output = String.format("Underweight %.2f\n", BM);
            JOptionPane.showMessageDialog(null, output);
        }
        else if (BM >= 18.5 && BM < 25)
        {
            String output = String.format("Normal weight %.2f\n", BM);
            JOptionPane.showMessageDialog(null, output);
        }
        else if (BM > 25.0 && BM < 30)
        {
            String output = String.format("Overweight %.2f\n", BM);
            JOptionPane.showMessageDialog(null, output);
        }
        else if (BM > 30)
        {
            String output = String.format("Obesity %.2f\n", BM);
            JOptionPane.showMessageDialog(null, output);
        }
        
        System.exit(0);
        
    }
    
}
