/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingcharacters;
/**
 *
 * @author Anna
 */
public class ComparingCharacters
{

    public static void main(String[] args)
    {
        //Chapter 3.1 The if statement
        
        char letter = 'C';
       
       
        if (letter == 'C')
        {
            System.out.print("The letter is " + letter);
        }
        if (letter == 'A')
        {
            System.out.print("Wrong letter! Try again!");
        }
        else
        {
            System.out.print("Wrong letter! Try again!");
        }
        
        /*Java uses Unicode so the letter 'A' comes before 'B'.
          Stora bokstäver kommer före små och mellanslag kommer
          först av alla,*/
        
        //A few examples
        if ('A' < 'B')
        {
            System.out.print("True!");
        }
        if ('M' < 'D')
        {
            System.out.print("False!");
        }
        if ('a' < 'A')
        {
            System.out.print("False!");
        }
        if ('a' < 'P')
        {
            System.out.print("False!");
        }
        
        //Checkpoint 3.1
        int y = 0, x;
        
        if (y == 20)
        {
            x = 0;
        }
        
        //Checkpoint 3.2
        int hours = 1;
        double payRate = 100.0;
        
        if (hours > 40)
        {
            payRate = payRate * 1.5;
        }
        
        //Checkpoint 3.3
        long sales = 1;
        double commission = 0.0;
        
        if (sales >= 10000)
        {
            commission = commission * 0.2;
        }
        
        //Checkpoint 3.4
        int fees;
        boolean max = true;
        
        if (max == true)
        {
            fees = 50;
        }
        
        //Checkpoint 3.5
        int x1 = 1, y1, z1;
        
        if (x1 > 100)
        {
            y1 = 20;
            z1 = 40;
        }
        
        //Checkpoint 3.6
        int a = 0, b, c;
        
        if (a < 10)
        {
            b = 0;
            c = 1;
        }
        
        //Checkpoint 3.7
        char myCharacter = 'a';
        
        if (myCharacter == 'D')
        {
            System.out.print("Goodbye!");
        }
        
    }
    
}