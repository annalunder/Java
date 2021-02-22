/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmethods;

/**
 *
 * @author Anna
 */
public class MathMethods
{
    /**
    Nedanstående är några av de vanligaste
    metoderna i klassen Math.
    1) Math.pow = "upphöjt till" på svenska
    2) Math.sqrt = "roten ur x" på svenska
     */
    public static void main(String[] args)
    {
       /*
       1)Tre exempel på hur metoden
       Math.pow kan användas. Metoden
       tar argumenten (double, double)*/
       
       double result;
       result = Math.pow(8.0, 2.0);
       System.out.println(result);
       
       double x;
       x = 3 * (Math.pow(4.0, 3.0));
       System.out.println(x);
       
       System.out.println(Math.pow(5.0, 4.0));
       
       /*
       2) Tre exempel på hur metoden Math.sqrt
       kan användas. Metoden tar argumentet
       (double)*/
       
       result = Math.sqrt(9.0);
       System.out.println(result);
       
       double y;
       y = (Math.sqrt(16.0));
       System.out.println(y);
       
       System.out.println(Math.sqrt(12.0));
    }
    
}