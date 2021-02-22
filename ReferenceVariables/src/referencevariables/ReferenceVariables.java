/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencevariables;

/**
 *
 * @author Anna
 */
public class ReferenceVariables
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*When a class type variable holds the address of an object, it is said
        that the variable references the object. Därför kallas class type varia-
        bles vanligtvis för reference variables.
        
        Detta är en demonstration av metoden length */
        String name = "Simon";
        int stringSize;
        
        stringSize = name.length();
        System.out.println(name + " has " + stringSize + " characters.");
        
        /*Obs! The String class's length method returns the number of characters
       including spaces (mellanslag)*/
        
       //Detta är en demonstration av metoden charAt
       char letter;
       String name2 = "Cecilia";
       letter = name2.charAt(2);
       System.out.println(letter);
       
       //Obs! Positionerna börjar på 0.
       
       //Detta är en demonstration av metoden toLowerCase()
       String bigName = "ANNA";
       String littleName = bigName.toLowerCase();
       System.out.println(littleName);
       
       //Detta är en demonstration av metoden toUpperCase()
       String littleName2 = "louise";
       String bigName2 = littleName2.toUpperCase();
       System.out.println(bigName2);
       
       /*Mellanslag räknas som sagt med, men naturligtvis räknas inte
       citationstecknen, (""), som står omkring vår string literal*/
       
       //Checkpoint 2.27
       String city = "San Fransisco";
       //Checkpoint 2.28
       int stringSize2;
       stringSize2 = city.length();
       System.out.println(stringSize2);
       //Checkpoint 2.29
       char oneChar;
       oneChar = city.charAt(0);
       System.out.println(oneChar);
       //Checkpoint 2.30
       String upperCity;
       upperCity = city.toUpperCase();
       System.out.println(upperCity);
       //Checkpoint 2.31
       String lowerCity;
       lowerCity = city.toLowerCase();
       System.out.println(lowerCity);
    }    
}
