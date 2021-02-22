/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchexamplemonths;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class SwitchExampleMonths
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int month = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter a number from"
                + " 1 to 4 to choose a month: ");
        month = keyboard.nextInt();
        
        //Determine month
        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
                
            case 2:
                System.out.println("February");
                break;
                
            case 3:
                System.out.println("March");
                break;
                
            case 4:
                System.out.println("April");
                break;
                
            default:
                System.out.println("Invalid month!");
        }
        
        /**
        The default section (or the last case section
        if there is no default) does not need a break
        statement, but some programmers prefer to put
        one there anyway for consistency.
        */
    }
    
}
