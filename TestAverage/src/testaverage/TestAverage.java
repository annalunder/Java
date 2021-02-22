/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaverage;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class TestAverage
{
    /**
     Kanske inte så snygg kod, men uppgiften är löst
     och programmet fungerar. :)
     */
    public static void main(String[] args)
    {
        //Challenge Nr.10
        
        double testScore1;
        double testScore2;
        double testScore3;
        String str1;
        String str2;
        String str3;
        double testAverage;
        
        /*OBS! The showInputDialog method always returns the user's
        input as a String, even if the user enters numeric data.*/
        
        //Ask the user for test scores
        str1 = JOptionPane.showInputDialog("Enter test score nr 1 ");
        
        //Convert the String input to a number
        testScore1 = Double.parseDouble(str1);
        
        //Ask the user for test scores
        str2 = JOptionPane.showInputDialog("Enter test score nr 2 ");
        
        //Convert the String input to a number
        testScore2 = Double.parseDouble(str2);
        
        //Ask the user for test scores
        str3 = JOptionPane.showInputDialog("Enter test score nr 3 ");
        
        //Convert the String input to a number
        testScore3 = Double.parseDouble(str3);
        
        //Calculate the test average
        testAverage = (testScore1 + testScore2 + testScore3) / 3;
        
        System.out.print("Your test scores are: " + testScore1 + ", "
        + testScore2 + " and " + testScore3 + ". Your average is " +
                        testAverage + ".");
        
        System.exit(0);
    }
}