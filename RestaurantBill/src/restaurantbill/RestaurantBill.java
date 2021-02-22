/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantbill;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class RestaurantBill
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Challenge Nr.13
        double mealCharge;
        String str;
        double taxAmount = 0.0675;
        double tipAmount = 0.2;
        double taxAndMealPrice;
        double totalBill;
        
        //Ask the user for the charge of the meal
        str = JOptionPane.showInputDialog("How much was the charge of"
                + " the meal? ");
        
        //Convert to a number
        mealCharge = Double.parseDouble(str);
        
        //Calculate
        taxAmount = mealCharge * 0.0675;
        taxAndMealPrice = mealCharge * 1.0675;
        tipAmount = taxAndMealPrice * 0.2;
        totalBill = taxAndMealPrice + tipAmount;
        
        JOptionPane.showMessageDialog(null, "The meal charge is $" + mealCharge
        + ", the tax amount is $" + taxAmount + ", the tip amount is $" +
        tipAmount + " and the total amount of the bill is $" + totalBill + ".");
        
    }
    
}
