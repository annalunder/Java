/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class Exercise5
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        double milesDriven;
        double gallonsOfGasUsed;
        double milesPerGallon;
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for miles driven
        System.out.print("How many miles did you drive? ");
        milesDriven = keyboard.nextDouble();
        
        //Ask the user for gallons of gas used
        System.out.print("How many gallons of gas did you use? ");
        gallonsOfGasUsed = keyboard.nextDouble();
        
        //Calculate the miles per gallon (MPG)
        milesPerGallon = milesDriven / gallonsOfGasUsed;
        
        //Display the miles per gallon
        System.out.printf("The miles per gallon is %.2f\n", milesPerGallon);
        
    }
    
}
