/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseinsensitivestringcomparisons;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class CaseInsensitiveStringComparisonsInfo
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       /*
          A shorter String is considered less
          (i.e. smaller) than a longer String.
       
          String methods: equalsIgnoreCase()
                   and compareToIgnoreCase()
        
          These methods work like the equals()
          and compareTo() methods, except the
          case of the characters in the strings
          is ignored.
       */
        
       //Checkpoint 3.20
        
       String name = "";
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("What is your name? ");
       name = keyboard.nextLine();
       
        if (name.contains("Timothy"))
        {
            System.out.print("Do I know you? ");
        }
        else if (name.equals("Anna"))
        {
            System.out.print("I know you! \n");
        }
        
       //Checkpoint 3.21
       
       String name1 = "Simon", name2 = "Louise";
       
       //Compare "Simon and "Louise"
        if (name1.compareTo(name2) < 0)
        {
            System.out.print(name1 + " is less than " + name2);
        }
        else if (name1.compareTo(name2) == 0)
        {
            System.out.print(name1 + " is equal to " + name2);
        }
        else if (name1.compareTo(name2) > 0)
        {
            System.out.print(name1 + " is greater than " + name2);
        }
        
        //Checkpoint 3.22
        
        String name3 = "";
        
        if (name3.equalsIgnoreCase("Timothy"))
        {
            System.out.print("Do I know you?");
        }
    }
    
}
