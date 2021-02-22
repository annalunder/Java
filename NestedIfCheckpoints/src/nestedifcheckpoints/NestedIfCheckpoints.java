/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifcheckpoints;
import javax.swing.JOptionPane;
/**
 *
 * @author Anna
 */
public class NestedIfCheckpoints
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Checkpoint 3.12 (står i facit som 3.14)
        
        //Flags
        int amount1 = 0, amount2 = 0;
        
        //The logic
        if (amount1 > 10)
        {
            if (amount2 < 100)
            {
                if (amount1 > amount2)
                {
                    System.out.print(amount1);
                }
                else
                {
                    System.out.print(amount2);
                }
            }
        }
        
        //Checkpoint 3.13 (står i facit som 3.15)
        
        int x = 0, y = 0, z;
        
        if (x > 0)
        {
            if (y < 20)
            {
                z = 1;
            }
            else
            {
                z = 0;
            }
        }
    }
    
}
