/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseiforswitch;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class IfElseIfOrSwitch
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Checkpoint 3.25
        
        //Man kan välja antingen en "String" eller en 'char'
        String selection;
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for a selection
        System.out.println("Please select A, B, C or D: ");
        selection = keyboard.nextLine();
        
        //Display the selection
        switch (selection)
        {
            case "A":
            case "a":
                System.out.println("You selected A.");
                break;
            case "B":
            case "b":
                System.out.println("You selected B.");
                break;
            case "C":
            case "c":
                System.out.println("You selected C.");
                break;
            case "D":
            case "d":
                System.out.println("You selected D.");
                break;
            default:
                System.out.println("Please select A, B, C or D.");
        }
    }
    
}