/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.data.type;

/**
 *
 * @author Anna
 */
public class DoubleDataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price, tax, total;
        
        price = 29.75;
        tax = 1.76;
        total = 31.51;
        
        System.out.println("The price of the item " +
                            "is " + price);
        System.out.println("The tax is " + tax);
        System.out.println("The total is " + total);
        
        /*When you write a floating point literal, Java assumes
        that it is of the double data type. So when you assign a
        floating point literal to a float value, you will have to
        write like this:*/
        float number;
        number = 23.5F;
        System.out.println("The number is " + number);
    }
    
}