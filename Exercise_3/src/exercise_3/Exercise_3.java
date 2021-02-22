/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_3;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author Anna
 */
public class Exercise_3
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       int int1;            //To hold the converted input
       int int2;            //To hold the converted input
       int int3;            //To hold the converted input
       int int4;            //To hold the converted input
       
       double double1;      //To hold the converted input
       double double2;      //To hold the converted input
       double double3;      //To hold the converted input
       double double4;      //To hold the converted input
       
       String str1;         //To hold the input
       String str2;         //To hold the input
       String str3;         //To hold the input
       String str4;         //To hold the input
       
       int sum;
       double average;
       int product;
       double smallest1;
       double smallest2;
       double smallestTotal;
       double largest1;
       double largest2;
       double largestTotal;
       
       //Ask the user for an integer
       str1 = JOptionPane.showInputDialog("Please enter the first"
               + " integer ");
       
       //Convert the input to an int resp. a double
       int1 = Integer.parseInt(str1);
       double1 = Double.parseDouble(str1);
       
       //Ask the user for an integer
       str2 = JOptionPane.showInputDialog("Please enter the second"
               + " integer ");
       
       //Convert the input to an int resp. a double
       int2 = Integer.parseInt(str2);
       double2 = Double.parseDouble(str2);
       
       //Ask the user for an integer
       str3 = JOptionPane.showInputDialog("Please enter the third"
               + " integer ");
       
       //Convert the input to an int resp. a double
       int3 = Integer.parseInt(str3);
       double3 = Double.parseDouble(str3);
       
       //Ask the user for an integer
       str4 = JOptionPane.showInputDialog("Please enter the fourth"
               + " integer ");
       
       //Convert the input to an int resp. a double
       int4 = Integer.parseInt(str4);
       double4 = Double.parseDouble(str4);
       
       //Calculate the sum
       sum = int1 + int2 + int3 + int4;
       
       
       //Calculate the average.
       average = (double1 + double2 + double3 + double4) / 4;
       
       
       //Calculate the product. Must convert to doubles? double2
       product = int1 * int2 * int3 * int4;
       
       //Calculate the smallest number
       smallest1 = Math.min(double1, double2);
       smallest2 = Math.min(double3, double4);
       smallestTotal = Math.min(smallest1, smallest2);
       
       //Calculate the largest number
       largest1 = Math.max(double1, double2);
       largest2 = Math.max(double3, double4);
       largestTotal = Math.max(largest1, largest2);
       
       //Display the results
       System.out.println("The sum is " + sum + ", the average is " + average +
               ", the product is " + product + ".");
       
       System.out.println("The smallest number of the three numbers is " +
               smallestTotal + " and the largest number of the three numbers "
                       + "is " + largestTotal);
       
       //To end the program
       System.exit(0);
    }
    
}
