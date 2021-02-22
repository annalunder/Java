/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milespergallon;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class MilesPerGallon
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Challenge Nr.9
        
        double milesDriven;
        double gallonsOfGasUsed;
        double milesPerGallon;
        
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for miles
        System.out.print("How many miles did you drive? ");
        milesDriven = keyboard.nextDouble();
        
        //Ask the user for gas
        System.out.print("How many gallons of gas did you use? ");
        gallonsOfGasUsed = keyboard.nextDouble();
        
        //Calculate MPG (milesPerGallon)
        milesPerGallon = milesDriven / gallonsOfGasUsed;
        
        //Display the results
        System.out.print("The miles per gallon is " + milesPerGallon);
        
        
    }
    
}
