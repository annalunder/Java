/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author Anna
 */
public class Discount
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*För att kunna arbeta med decimaltal
        sätts datatyperna till double*/
        double regularPrice = 59.0;
        double discount = 0.2;
        double salePrice;
        
        //Calculate the discount, which is 20%
        discount = regularPrice * 0.2;
        
        //Calculate the sale price
        salePrice = regularPrice - discount;
        
        System.out.println("The regular price is $"
                + regularPrice + ", the discount is $"
                + discount + " and the salePrice is $"
                + salePrice + ".");
    }
    
}
