/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingnumericrangeswithlogicaloperators;
/**
 *
 * @author Anna
 */
public class CheckingNumericRangesWithLogicalOperators
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Checking numeric ranges with logical operators
        
        /*
        Sometimes you will need to write code that determines
        whether a numeric value is within a specific range of
        values or outside a specific range of values.
        */
        
        int x = 0;
                
        if (x >= 20 && x <= 40)
        {
            System.out.println(x + " is in the acceptable range.");
        }
        
        /*
        When determining whether a number is outside a range,
        it’s better to use the || operator. The following
        statement determines whether x is outside the range
        of 20 through 40.
        
        */
        
        if (x < 20 && x > 40)
        {
            System.out.println(x + " is outside the acceptable range.");
        }
        
        /*
        Blanda inte ihop detta med nedanstående boolean
        expression, som aldrig kan vara sant eftersom x
        inte samtidigt kan ha två olika värden.
        */
        
        if (x < 20 && x > 40)
        {
            //Impossible!
        }
    }
    
}
