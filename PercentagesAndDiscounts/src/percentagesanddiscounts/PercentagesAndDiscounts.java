/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentagesanddiscounts;

/**
 *
 * @author Anna
 */
public class PercentagesAndDiscounts
{
    /**
     * Symbolen % används inte i syfte att räkna ut procent
     * i Java. Man måste i stället konvertera procent till
     * ett floating point number, ex. 0.5 (50%) eller 0.04
     * (4%).
     */
    public static void main(String[] args)
    {
        // Avsättning av pengar för pension
        double monthlyPay = 6000.0;
        double pensionMoney;
        
        //Hur mycket 5% blir
        pensionMoney = monthlyPay * 0.05;
        System.out.println("5% blir $" + pensionMoney + " per månad.");
        
        //Hur mycket 8% blir
        pensionMoney = monthlyPay * 0.08;
        System.out.println("8% blir $" + pensionMoney + " per månad.");
        
        //Hur mycket 10% blir
        pensionMoney = monthlyPay * 0.10;
        System.out.println("10% blir $" + pensionMoney + " per månad.");
    }
    
}
