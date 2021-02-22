/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstringobjects;
/**
 *
 * @author Anna
 */
public class ComparingStringObjects
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Comparing String objects
        
        /*
        To compare the contents of two String objects
        correctly, you should use the String class’s
        equals method. The general form of the method:
        
            StringReference1.equals(StringReference2)
        */
        
        String name1 = "Anna",
               name2 = "Anna",
               name3 = "Louise";
        
        //Compare name1 and name2, i.e. "Anna" and "Anna"
        
        if (name1.equals(name2))
        {
            System.out.println(name1 + " and " + name2 +
                                    " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name2 +
                                   " are not the same.");
        }
        
        //Compare name2 and name3, i.e. "Anna" and "Louise"
        
        if (name1.equals(name3))
        {
            System.out.println(name1 + " and " + name3 +
                                       " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name3 +
                                   " are not the same.");
        }
    }
    
}
