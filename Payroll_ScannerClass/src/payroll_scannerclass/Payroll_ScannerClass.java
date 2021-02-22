/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll_scannerclass;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Payroll_ScannerClass
{

    public static void main(String[] args)
    {
       
       String name;     //The user's name
       int hours;       //Hours worked
       double payRate;  //Timlön
       double grossPay; //Total lön
       
       //Create a Scanner object to read input
       Scanner keyboard = new Scanner(System.in);
       
       //Ask for the user's name
       System.out.print("What is your name? ");
       name = keyboard.nextLine();
       
       //Ask for number of hours worked this week
       System.out.print("How many hours did you work this week? ");
       hours = keyboard.nextInt();
       
       //Ask for the user's hourly pay rate
       System.out.print("What is your hourly pay rate? ");
       payRate = keyboard.nextDouble();
       
       //Calculate the gross pay
       grossPay = hours * payRate;
       
       //Display the results
       System.out.println("Hello, " + name + "!" + " Your gross pay is $" +
                            grossPay + ".");
       
       /*Alla Scanner-klassens metoder väntar på att användaren ska trycka
       på Enter innan värdet återges. Efter att man har tryckt på Enter
       förflyttar sig pekaren automatiskt till nästa rad.*/
    }
    
}
