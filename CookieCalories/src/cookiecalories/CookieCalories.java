/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookiecalories;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class CookieCalories
{

    public static void main(String[] args)
    {
        //Challenge Nr.8
        int cookie = 40;
        int numberOfServings = 10;
        int caloriesPerServing = 300;
        int caloriesPerCookie;
        //int totalCaloriesInTheBag;
        int caloriesConsumed;
                
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user how many cookies they ate
        System.out.print("How many cookies did you eat? ");
        cookie = keyboard.nextInt();
        
        //Calculations
        caloriesPerCookie = caloriesPerServing / numberOfServings;
        caloriesConsumed = cookie * caloriesPerCookie;
        
        //Display answers
        System.out.print("You consumed " + caloriesConsumed + " calories.");
    }
    
}
