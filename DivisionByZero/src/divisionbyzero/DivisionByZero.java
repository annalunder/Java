/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionbyzero;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class DivisionByZero
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*Chapter 3.2 The if - else statement
        
        In Java, a program crashes when it divides an
        integer by 0. When a floating-point value is
        divided by 0, the program doesn’t crash. Instead,
        the special value Infinity is produced as the
        result of the division.
        */
        double num1, num2;      //The two division operands
        double quotient;        //The result of the division (kvot)
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user for a number
        System.out.print("Please enter a number: ");
        num1 = keyboard.nextDouble();
        
        //Ask the user for another number
        System.out.print("Please enter another number: ");
        num2 = keyboard.nextDouble();
        
        if (num2 == 0)
        {
            System.out.print("Division by zero is not possible."
                    + " Please run the program again and enter a"
                    + " number other than zero.");
        }
        else
        {
            quotient = num1 / num2;
            System.out.print("The quotient of " + num1 + " divided"
                    + " by " + num2 + " is " + quotient);
        }
        
        //Checkpoint 3.8
        
        int x = 0, y;
        
        if (x > 100)
        {
            y = 20;
        }
        else
        {
            y = 0;
        }
        
        //Checkpoint 3.9
        
        int x2 = 0, y2 = 1;
        
        if (y2 == 100)
        {
            x2 = 1;
        }
        else
        {
            x2 = 0;
        }
        
        //Checkpoint 3.10
        
        long sales;
        double commission;
        
        //Create a Scanner object to hold keyboard input
        Scanner keyboard2 = new Scanner(System.in);
        
        //Ask the user for how much the sales is
        System.out.print("\nHow much is the sales ");
        sales = keyboard2.nextLong();
        
        if (sales >= 50000.0)
        {
            commission = 0.2;
            System.out.print("Your commission is: " +
                    sales * 0.2);
        }
        else
        {
            commission = 0.1;
            System.out.print("Your commission is: " +
                    sales * 0.1);
        }
    }
}
