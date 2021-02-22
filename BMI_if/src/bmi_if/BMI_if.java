/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_if;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class BMI_if
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Challenge Chapter 3.
        
        double weight;
        double height;
        double BMI;
        
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask for the user's weight
        System.out.print("What is your weight? ");
        weight = keyboard.nextDouble();
        
        //Ask for the user's height
        System.out.print("What is your height? ");
        height = keyboard.nextDouble();
        
        //Calculate the user's BMI value
        
        /* Jag lade till 703 på måfå för att få resultat
        som ser ut något sånär som de svenska måtten. */
        BMI = (weight * 703) / (height * height);
        
        System.out.print("Your BMI value is " + BMI + ". ");
        
        if (BMI < 18.5 || BMI > 25)
        {
            System.out.print("Your BMI is not so good.");
        }
        else
        {
            System.out.print("You're good to go...");
        }
    }
    
}
