/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class Seasons
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /**This program translates the English
           names of the seasons into Spanish.
        */
        String input;
        
        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for a season
        System.out.print("Please enter a season: ");
        input = keyboard.nextLine();
        
        //Translate the season to Spanish
        switch (input)
        {    
            case "Spring":
            case "spring":
                System.out.println("la primavera");
                break;
            case "Summer":
            case "summer":
                System.out.println("el verano");
                break;
            case "Autumn":
            case "autumn":
            case "Fall":
            case "fall":
                System.out.println("el otono");
                break;
            case "Winter":
            case "winter":
                System.out.println("el invierno");
                break;
            default:
                System.out.println("Please enter one of these words:\n"
                           + "Spring, Summer, Autumn, Fall or Winter.");
        }
        
    }
    
}
