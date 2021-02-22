/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Anna
 */
public class Exercise_2
{
    public static void main(String[] args)
    {
        String country1;        //To hold the user's input
        String country2;        //To hold the user's input
        String country3;        //To hold the user's input
        
        //String sortedString;
        
        //Create a Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);        
        country1 = keyboard.nextLine();
        country2 = keyboard.nextLine();
        country3 = keyboard.nextLine();
        
        //Ask the user to enter three countries
        System.out.print("Please enter three countries: ");
        
        if (country1.compareTo(country2) < 0)
        {
            if (country1.compareTo(country3) < 0)
            {
                System.out.print(country1 + " is less than the others.");
                
                if (country2.compareTo(country3) < 0)
                {
                    System.out.print("Ordningen är " + country1 +
                            ", " + country2 + ", " + ", " + country3);
                }
                else if (country3.compareTo(country2) < 0)
                {
                    System.out.print("Ordningen är " + country1 +
                            ", " + country3 + ", " + country2);
                }
            }
        
        //Fortsätta med logiken nedanför
            
        }
        else if (country2.compareTo(country1) < 0)
        {
            if (country2.compareTo(country3) < 0)
            {
                System.out.print(country2 + " is less than the others.");
            }
            
            
            
        }
        else if (country3.compareTo(country1) < 0)
        {
            if (country3.compareTo(country2) < 0)
            {
                System.out.print(country3 + " is less than the others.");
            }
            
            
        }
        
        
        
        //Remove the newline
        //keyboard.nextLine();
        
    }    
}