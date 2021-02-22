/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchpetfood;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class SwitchPetFood
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*Sometimes you want to display all the
        alternatives. Look at this example:
        
        The switch statement will recognize either
        uppercase or lowercase letters in this example:
        */
        
        String input;           //To hold the user's input
        char foodAlternatives;  //Food alternatives
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user what kind of pet food he or she wants
        System.out.print("Our pet food comes in three alternatives: ");
        System.out.print("A, B and C. For which one do you want to know"
                + " the price? ");
        input = keyboard.nextLine();
        foodAlternatives = input.charAt(0);
        
        //Display prices for all the food alternatives
        switch(foodAlternatives)
        {
            case 'A':
            case 'a':
                System.out.println("35 kr per kilo.");
                break;
            case 'B':
            case 'b':
                System.out.println("40 kr per kilo.");
                break;
            case 'C':
            case 'c':
                System.out.println("25 kr per kilo.");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        
        
        }
    }
    
}
