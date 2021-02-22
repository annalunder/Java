/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class StringManipulator
{
    public static void main(String[] args)
    {
        //Challenge Nr.12
        String name;        //To hold the user's input
        int stringSize = name.length();
        //String bigName = name.toUpperCase();
        //String smallName = name.toLowerCase();
        //char firstLetter = name.charAt(0);
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for his or her favourite city
        System.out.print("What is your favourite city? ");
        name = keyboard.nextLine();
        
        //Remove the remaining newline character from the buffer
        keyboard.nextLine();
        
        
        System.out.println("Your favourite city, " + name +
                "has " + stringSize + " characters.");
       
        //Display the result
        //System.out.println(name);
        //System.out.println(stringSize);
        //System.out.println(bigName);
        //System.out.println(smallName);
        //System.out.println(firstLetter);
    }
    
}