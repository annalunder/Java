/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdiscountcoupons;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class BookDiscountCoupons
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Checkpoint 3.15 (står i facit som 3.13
        
        int books, coupons;
        String input;
        
        input = JOptionPane.showInputDialog("How many books"
                                + " did the customer buy? ");
        books = Integer.parseInt(input);
        
        if (books < 1)
        {
            coupons = 0;
        }
        else if (books < 3)
        {
            coupons = 1;
        }
        else if (books < 5)
        {
            coupons = 2;
        }
        else
        {
            coupons = 3;
        }
        
        JOptionPane.showMessageDialog(null, "Give the customer "
        + coupons + " coupons.");
        
        System.exit(0);
    }
    
}
