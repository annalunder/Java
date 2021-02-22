/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_4;
import java.util.Scanner;
/**
 * Jag glömde lösa uppgiften med
 * IndexOf i själva inlämningen.
 * @author Anna
 */
public class Exercise_4
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Programmet visar nu en plats för den angivna
        bokstaven men platsen är FEL!!! */
        
        
        //To hold the user's input
        String favouriteCity;
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        

        System.out.print("What is your favourite city? ");
        favouriteCity = keyboard.nextLine();
        
        
        String upper = favouriteCity.toUpperCase();
        char firstLetter = favouriteCity.charAt(0);
        char secondLetter = favouriteCity.charAt(1);
        char thirdLetter = favouriteCity.charAt(2);
        char lastLetter = favouriteCity.charAt(favouriteCity.length() - 1);
        
        String input;
        char answer;
        int position = 1;
        
        boolean containOrNot = true;
        int numberOfCharacters = favouriteCity.length();
        
        //Display the results
        System.out.print("In uppercases: " + upper);
        
        //To remove newline
        keyboard.nextLine();
        
        //Display the first three letters in the city
        System.out.println("The first three letters are: " + firstLetter
        + secondLetter + thirdLetter + ".");
        
        //Display the last letter in the city
        System.out.print("The last letter is: " + lastLetter);
        
        //Ask the user to enter a character
        System.out.print("\nEnter a character ");
        input = keyboard.nextLine();
        
        //Get the first letter, which is the user's answer
        answer = input.charAt(0);
        
        //Check if the character is or is not in the city
        if(favouriteCity.contains(input) == true)
        {
            System.out.print("The character is in the city name.\n");   
            
            int atWhatPosition = 1;
            
            atWhatPosition = favouriteCity.indexOf(input, position);
            
            System.out.print("The character is at position "
                        + atWhatPosition);
        }
        else
        {
            System.out.print("The character is not in the city name."); 
        }
        
        System.out.print("\nThe number of characters in the city is " +
                numberOfCharacters);
        
    }
    
}
