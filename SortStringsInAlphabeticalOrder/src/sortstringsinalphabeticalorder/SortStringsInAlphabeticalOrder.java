/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstringsinalphabeticalorder;
import java.util.Scanner;
/**
 * @author Anna
 */
public class SortStringsInAlphabeticalOrder
{
   
    public static void main(String[] args)
    {
        int n = 3;          //Number of countries to ask for
        String temp;        //To hold temporary info
        
        //Create an array of Strings
        String countries[] = new String[n];
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user to enter three countries
        System.out.println("Please enter three countries: ");
        
        //The logic
        
        for (int i = 0; i < n; i++)
        {
            countries[i] = keyboard.nextLine();
        }
        
        //For every country
        for (int i = 0; i < n; i++)
        {
            //Compare them
            for (int j = i+1; j < n; j++)
            {
                if (countries[i].compareTo(countries[j])>0)
                {
                    temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        //Print the result
        for (int i = 0; i < n; i++)
        {
            System.out.print(countries[i] + " ");
        }
       
    }
    
}
