/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedintherangeof;
/**
 *
 * @author Anna
 */
public class SpeedInTheRangeOf
{
    public static void main(String[] args)
    {
        //Challenge 3.18
        int speed = 1;
        
        if (speed >= 0 && speed <= 200)
        {
            System.out.println("The number is valid!");
        }
        
        
        //Challenge 3.19
        int speed2 = 201;
        
        if (speed2 < 0 || speed2 > 200)
        {
            System.out.println("The number is not valid!");
        }
        
    }
    
}