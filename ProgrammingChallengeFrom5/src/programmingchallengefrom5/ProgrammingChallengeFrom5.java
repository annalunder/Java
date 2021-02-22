/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingchallengefrom5;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class ProgrammingChallengeFrom5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Nr. 5 Sales prediction
        double totalSales = 4.6;
        double eastCoastSales;
        
        eastCoastSales = totalSales * 0.62;
        
        System.out.println("The east coast sales is $" + eastCoastSales
        + " million.");
        
       //Nr 14 Male and female percentages
       
       String inputStringF;
       String inputStringM;
       String inputStringTot;
       int totalRegistered;
       int femalesRegistered;
       int malesRegistered;
       double fPercentage;
       double mPercentage;
       
       //The number of registered in the class
       inputStringTot = JOptionPane.showInputDialog(null, "How many persons "
               + "are registered in class?");
       //Convert to int
       totalRegistered = Integer.parseInt(inputStringTot);
       
       //The number of registered females in the class
       inputStringF = JOptionPane.showInputDialog("How many females "
               + "are registered in class?");

       //Convert to int
       femalesRegistered = Integer.parseInt(inputStringF);
       fPercentage = 100 * (femalesRegistered / totalRegistered);
       
       //The number of registered males in the class
       inputStringM = JOptionPane.showInputDialog("How many males "
               + "are registered in class?");
       //Convert to int
       malesRegistered = Integer.parseInt(inputStringM);
       mPercentage = 100 * (malesRegistered / totalRegistered);
       
       //Show a messageDialog of the results
       JOptionPane.showMessageDialog(null, "The percentage of females in class"
               + " is " + fPercentage + " and the percentage of men in class"
                       + " is " + mPercentage + ".");
       
       //End the program
       System.exit(0);
    }
    
}