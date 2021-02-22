/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretwordstringcomparison;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class SecretWordStringComparison
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       /*
       This program demonstrates a case
       insensitive string comparison.
       */
       
       //To hold the user's input
       String input;
       
       //Create a Scanner object for keyboard input
       Scanner keyboard = new Scanner(System.in);
       
       //Ask the user to enter the secret word
       System.out.print("Enter the secret word: ");
       input = keyboard.nextLine();
       
       //Determine whether the user entered the right secret word or not
        if (input.equalsIgnoreCase("PROSPERO"))
        {
            System.out.println("Congrats! You entered the secret word!");
        }
        else
        {
            System.out.println("Sorry! That is not the secret word!");
        }
    }
    
}
