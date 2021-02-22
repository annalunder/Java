/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitboardprofit;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class CircuitBoardProfit
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Challenge Nr.11
        double retailPriceOfACircuitBoard;
        String str;
        double profit;

        //Ask the user for the retail price
        str = JOptionPane.showInputDialog("What is the retail price? ");
        
        //Convert the String input to a number
        retailPriceOfACircuitBoard = Double.parseDouble(str);
        
        //Calcute the profit
        profit = retailPriceOfACircuitBoard * 0.4;
        
        //Show the results
        System.out.print("The retail price is $" + retailPriceOfACircuitBoard
        + " and the amount of profit is $" + profit + ".");
    }
}
        