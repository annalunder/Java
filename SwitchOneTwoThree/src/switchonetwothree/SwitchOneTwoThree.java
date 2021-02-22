/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchonetwothree;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class SwitchOneTwoThree
{
    public static void main(String[] args)
    {
        //Checkpoint 3.24
        int userNumber;
        
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for number 1, 2 or 3
        System.out.print("Enter one of the numbers 1, 2 or 3: ");
        userNumber = keyboard.nextInt();
        
        //Display numbers
        switch (userNumber)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Please enter 1, 2 or 3.");
        }
    }
    
}
