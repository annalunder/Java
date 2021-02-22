/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Exercise4
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Behöver jag göra om int till double?
        int baseFee = 15;
        int amountOfChecks;       
        
        //double serviceFee1 = 1;
        //double serviceFee2 = 1;
        //double serviceFee3 = 1;
        //double serviceFee4 = 1;
        
        double totalFee1;
        double totalFee2;
        double totalFee3;
        double totalFee4;
        
        //Create a Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user how many checks they wrote
        System.out.print("How many checks did you write this month? ");   
        amountOfChecks = keyboard.nextInt();
        
        totalFee1 = baseFee + (0.10 * amountOfChecks);
        totalFee2 = baseFee + (0.10 * 14) + (0.08 * (amountOfChecks - 14));
        totalFee3 = baseFee + (0.10 * 14) + (0.08 * 14) + 
                (0.06 * (amountOfChecks - 29));
        totalFee4 = baseFee + (0.10 * 14) + (0.08 * 14) +
            (0.06 * 20) + (0.04 * (amountOfChecks - 49));
        
        
        //För varje mängd checkar
        for (int i = 0; i < amountOfChecks; i++)
        {
            
            if (amountOfChecks < 15)
            {
                    //totalFee1 = baseFee + (0.10 * amountOfChecks);
                    System.out.println("The fees are $" + totalFee1);
                    //break;  
            }
            else if (amountOfChecks <= 15 && amountOfChecks <= 29)
            {
                    //totalFee2 = baseFee + (0.10 * 14) + 
                    //        (0.08 * (amountOfChecks - 14));
                    System.out.println("The fees are $" + totalFee2);
                    //break; 
            }
            else if (amountOfChecks >= 30 && amountOfChecks <= 49)
            {
                    //totalFee3 = baseFee + (0.10 * 14) + (0.08 * 14) +
                    //        (0.06 * (amountOfChecks - 29));
                    System.out.println("The fees are $" + totalFee3);
                    //break;
            }
            else if (amountOfChecks >= 50)
            {
                    
                    //totalFee4 = baseFee + (0.10 * 14) + (0.08 * 14) +
                    //        (0.06 * 20) + (0.04 * (amountOfChecks - 49));
                    System.out.println("The fees are $" + totalFee4);
                    //break;   
            }
            else;
            
        }
        
    }
    
}
