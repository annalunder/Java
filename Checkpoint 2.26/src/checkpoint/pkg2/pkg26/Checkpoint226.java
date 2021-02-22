/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint.pkg2.pkg26;

/**
 *
 * @author Anna
 */
public class Checkpoint226
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Lösningen finns överst på sid. 66
        float a = 1.2F;
        double b;
        
        b = a;
        
        //Checkpoint 2.25:
        short totalPay, basePay = 500, bonus = 1000;
        totalPay = (short)(basePay + bonus);
        
        /*Man måste använda en cast operator (som ovan)eller deklarera totalPay
        som en int för att detta ska kompilera. (Eftersom short + short = int) */    
    }
    
}
