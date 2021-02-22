/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class SalesTax
{

    public static void main(String[] args)
    {
        //Challenge Nr.7
        double amountOfPurchase;
        double stateSalesTax = 0.04;
        double countySalesTax = 0.02;
        double totalSalesTax = 0.06;
        double totalAmount;
        
        //Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Ask for the amount of the purchase
        System.out.print("What is the amount of the purchase? ");
        amountOfPurchase = keyboard.nextDouble();
        
        //Calculations
        stateSalesTax = 0.04 * amountOfPurchase;
        countySalesTax = 0.02 * amountOfPurchase;
        totalSalesTax = 0.06 * amountOfPurchase;
        totalAmount = amountOfPurchase + totalSalesTax;
        
        System.out.print("The amount of the purchase is $" + amountOfPurchase
                        + ", the state sales tax is $" + stateSalesTax +
                        ", the county sales tax is $" + countySalesTax +
                        ", the total sales tax is $" + totalSalesTax +
                        " and the total amount of the sale is $" +
                        totalAmount + ".");
    }
    
}
