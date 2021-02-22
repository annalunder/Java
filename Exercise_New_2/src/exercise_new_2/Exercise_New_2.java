/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_new_2;
import java.util.Scanner;


public class Exercise_New_2
{

    public static void main(String[] args)
    {
        String inputCountry;
        
        String country1;        //To hold the user's input
        String country2;        //To hold the user's input
        String country3;        //To hold the user's input
        
        //String sortedString;
        
        //Create a Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);        
        
        //Ask the user to enter three countries
        System.out.print("Please enter three countries: ");
        inputCountry = keyboard.nextLine();
        
        
        country1 = keyboard.nextLine();
        country2 = keyboard.nextLine();
        country3 = keyboard.nextLine();
        
        /*
        Ask the user for country #1
        System.out.print("Please enter country #1 ");
        country1 = keyboard.nextLine();
        
        //Ask the user for country #2
        System.out.print("Please enter country #2 ");
        country2 = keyboard.nextLine();
        
        //Ask the user for country #3
        System.out.print("Please enter country #3 ");
        country3 = keyboard.nextLine();
        
        
        if (country1.compareTo(country2) < 0)
        {
            System.out.println(country1 + " is less than " + country2);
        }
        else if (country1.compareTo(country2) == 0)
        {
            System.out.println(country1 + " is equal to " + country2);
        }
        else if (country1.compareTo(country2) > 0)
        {
            System.out.println(country1 + " is greater than " + country2);
        }
        
        
        Använder man nästade if-satser när man har tre inmatningar att
        jämföra i stället för två? Den vill dock inte skriva ut några
        jämförelser alls som det är nu.
        
        */
        
        //Display the countries in alphabetical order
        if (country1.compareTo(country2) < 0)
        {
            if (country1.compareTo(country3) < 0)
            {
                System.out.println(country1 + " is less than both " +
                        country2 + " and " + country3 + ".");
            }
            
        }
        else if (country1.compareTo(country2) == 0)
        {
            if (country1.compareTo(country3) == 0)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("");
            }
        }
        else if (country1.compareTo(country2) > 0)
        {
            if (country1.compareTo(country3) > 0)
            {
                System.out.println(country1 + " is greater than both "
                        + country2 + " and " + country3 + ".");
            }
        }
        
    }
}