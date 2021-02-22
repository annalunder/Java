/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixingcalls_scanner;
import java.util.Scanner;
/**
 *Det kan bli problem när man vill kalla på metoden nextLine
 *i samband med att man kallar på andra Scanner-metoder såsom
 *nextInt eller nextDouble. The nextLine method is not designed
 *to skip over an initial newline character, so if a newline
 *character is the first character that the nextLine method
 *encounters, like in this case, nothing will be read. If, for
 *example, the nextDouble or nextInt method is just before the
 *nextLine method,then the nextLine method will not read any
 *input. This is beause the nextDouble or nextInt method leaft
 *a newline character in the keyboard buffer. In this case the
 *nextLine method will immediately terminate and the user will
 *not be given a chance to enter his or her name.
 *
 *Trots att detaljerna kring det här problemet låter förvirrande
 *så är problemet enkelt att lösa.
 */
public class MixingCalls_Scanner
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*The program correctly reads both
        numeric and string input.*/
        String name;    //to hold the user's name
        int age;        //to hold the user's age
        double income;  //to hold the user's income
        
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask for the user's age
        System.out.print("What is your age? ");
        age = keyboard.nextInt();
        
        //Ask for the user's income
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble();
        
        /*Obs! Obs! Obs! Consume/remove the remaining
                  newline character from the buffer*/
        keyboard.nextLine();
        
        //Ask for the user's name
        System.out.print("What is your name? ");
        name = keyboard.nextLine();
        
        //Display all the information
        System.out.println("Hello, " + name + "! Your"
                + " age is " + age + " and your annual"
                + " income is $" + income + ".");
    }
    
}

