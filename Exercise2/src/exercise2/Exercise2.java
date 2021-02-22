/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class Exercise2
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Comparing Strings: ( < 0, 0 or > 0 )
           Använd nästlade if-satser! */
        
        String country1 = "";        //To hold the user's input
        String country2 = "";        //To hold the user's input
        String country3 = "";        //To hold the user's input
        
        //Create a Scanner object to read keyboard input
        Scanner keyboard = new Scanner(System.in);        
        
        
        //Ask the user to enter three countries
        System.out.print("Please enter three countries: ");
        country1 = keyboard.nextLine();
        country2 = keyboard.nextLine();
        country3 = keyboard.nextLine();
        
        //Display the three countries in alphabetical order
        if (country1.compareTo(country2) < 0)
        {
            if (country1.compareTo(country3) < 0)
            {
                //System.out.print(country1 + " is less than the others.");
                
                if (country2.compareTo(country3) < 0)
                {
                    System.out.print("Ordningen är " + country1 +
                            ", " + country2 + ", " + ", " + country3);
                }
                else if (country2.compareTo(country3) == 0)
                {
                    
                }
                else if (country2.compareTo(country3) > 0)
                {
                    
                }
                
                    else if (country3.compareTo(country2) < 0)
                    {
                        System.out.print("Ordningen är " + country1 +
                            ", " + country3 + ", " + country2);
                    }
                    else if (country3.compareTo(country2) == 0)
                    {
                    
                    }
                    else if (country3.compareTo(country2) > 0)
                    {
                    
                    }
            }
            
        }
        else if (country1.compareTo(country2) == 0)
        {
            //Land 1 och 2 är lika
        }
        else if (country1.compareTo(country2) > 0)
        {
            //Land 2 är mindre än land 1
        }
        
        
         
        
        
        else if (country2.compareTo(country1) < 0)
        {
            if (country2.compareTo(country3) < 0)
            {
                System.out.print(country2 + " is less than the others.");
                 
                if (country1.compareTo(country3) < 0)
                {
                    //Ordningen 2,1,3
                    System.out.print("Ordningen är " + country2 +
                            ", " + country1 + ", " + ", " + country3);
                        
                }
                else if (country3.compareTo(country1) < 0)
                {
                    //Ordningen är 2,3,1
                    System.out.print("Ordningen är " + country2 +
                            ", " + country3 + ", " + ", " + country1);    
                }   
            } 
        }
        else if (country3.compareTo(country1) < 0)
        {
            // Först 3, sedan 1
            if (country3.compareTo(country2) < 0)
            {
                System.out.print(country3 + " is less than the others.");

                if (country1.compareTo(country2) < 0)
                {
                    //Ordningen är 3,1,2
                    System.out.print("Ordningen är " + country3 +
                            ", " + country1 + ", " + ", " + country2);
                }
                else if (country2.compareTo(country1) < 0)
                {
                    //Ordningen är 3,2,1
                    System.out.print("Ordningen är " + country3 +
                            ", " + country2 + ", " + ", " + country1);
                }   
                
            }
            else if (country3.compareTo(country2) == 0)
            {
                
            }
            else if (country3.compareTo(country2) > 0)
            {
                
            }
            
        }
        
        
        
        else if (country3.compareTo(country1) == 0)
        {
            // 3 och 1 är lika
        }
        else if (country3.compareTo(country1) > 0)
        {
            // Först 1, sedan 3
        }
         
    }
    
}
