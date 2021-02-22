/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableinitialization;

/**
 * @author Anna
 * 
 * Variable declaration + assignment of value = initialization
 */
public class VariableInitialization
{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        int month = 8, days = 31;
        
        System.out.println("Month " + month + " has " +
                            days + " days.");
        
        /*Java allows you to declare several variables and only
        initialize some of them:
        int flightNumber = 89, travelTime, departure = 10, distance;
        */
        
        /* Obs! A variable can hold only one value at a time. The new
        value (6) overwrites the value 5. */
        int x = 5;
        System.out.println(x);
        x = 6;
        System.out.println(x);
    }
    
}
