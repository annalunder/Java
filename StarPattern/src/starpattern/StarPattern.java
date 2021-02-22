/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern;

/**
 *
 * @author Anna
 */
public class StarPattern
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Number 4. Star Pattern
        char star;
        star = '*';
        String threeStars = "***";
        String fiveStars = "*****";
        String sevenStars = "*******";
        
        System.out.println("   " + star);
        System.out.println("  " + threeStars);
        System.out.println(" " + fiveStars);
        System.out.println(sevenStars);
        System.out.println(" " + fiveStars);
        System.out.println("  " + threeStars);
        System.out.println("   " + star);
    }
    
}
