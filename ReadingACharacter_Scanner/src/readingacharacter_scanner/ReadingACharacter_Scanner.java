/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingacharacter_scanner;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class ReadingACharacter_Scanner
{
    /**
    Obs! Scanner-klassen har ingen metod för att läsa in en char
    från tangentbordet. I stället kan man använda Scanner-klassens
    nextLine-metod, för att läsa in en String, och sedan använda
    String-klassens charAt-metod,för att komma åt första bokstaven.
     */
    public static void main(String[] args)
    {
        String input;       //to hold a line of input
        char answer;        //to hod a single character
        
        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Ask the user a question
        System.out.print("Are you having fun? (Y = yes, N = no) ");
        
        input = keyboard.nextLine();    //to get a line of input
        answer = input.charAt(0);       //to get the first character
    }
    
}
