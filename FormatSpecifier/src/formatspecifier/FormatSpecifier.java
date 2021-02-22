/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatspecifier;
/**
 *
 * @author Anna
 */
public class FormatSpecifier
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Double variables in nice looking columns.
        
        //Declaration of different double variables
        double num1 = 127.834;
        double num2 = 3465.769;
        double num3 = 246.332;
        double num4 = 88.491;
        double num5 = 210.668;
        double num6 = 743.233;
        
        /*
        Display each variable in a field of 10 spaces,
        with two decimals each.
        */
        System.out.printf("%10.2f\n", num1);
        System.out.printf("%10.2f\n", num2);
        System.out.printf("%10.2f\n", num3);
        System.out.printf("%10.2f\n", num4);
        System.out.printf("%10.2f\n", num5);
        System.out.printf("%10.2f\n", num6);
        
        double sales = 28756.89;
        
        //Insert a comma and use two decimals
        System.out.printf("Sales for the month are %,.2f\n", sales);
    }
    
}
