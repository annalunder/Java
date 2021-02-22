/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class Exercise3
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;
        
        //Create an array of five numbers
        int array[] = new int[5];
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user to enter five numbers
        System.out.print("Please enter five numbers: ");
        
        //Read the keyboard input for all the five numbers
        for (int i = 0; i < 5; i++)
        {
            array[i] = keyboard.nextInt();
        }
        
        //Result for every given number
        for (int i = 0; i < 5; i++)
        {
            if (array[i] < 0)
            {
                /*
                For a number that is less than
                zero, add one to the count.
                */
                negativeNumbers++;
            }
            else if (array[i] == 0)
            {
                //For every zero, add one to the count
                zeros++;
            }
            else if (array[i] > 0)
            {
                /*
                For a number that is greater than
                zero, add one to the count.
                */
                positiveNumbers++;
            }        
        }
        
        //Display the results
        System.out.print("\n Positive numbers: " + positiveNumbers);
        System.out.print("\n Zeros: " + zeros);
        System.out.print(" \n Negative numbers: " + negativeNumbers);
    }
    
}
