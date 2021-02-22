/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifelseifcheckpoints;
/**
 *
 * @author Anna
 */
public class NestedIfElseIfCheckpoints
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Checkpoint 3.14 (står i facit som 3.12)
        
        int funny = 7, serious = 15;
        funny = serious % 2;        //The result is 1.
        
        if (funny != 1)
        {
            funny = 0;
            serious = 0;
        }
        else if (funny == 2)
        {
            funny = 10;
            serious = 10;
        }
        else
        {
            funny = 1;
            serious = 1;
        }
        
        System.out.print(funny + " " + serious);
    }
    
}
