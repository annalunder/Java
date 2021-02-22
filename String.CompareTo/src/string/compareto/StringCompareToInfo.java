/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.compareto;
/**
 *
 * @author Anna
 */
public class StringCompareToInfo
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String name1 = "";
        
        /*
        You can compare String objects to
        string literals. Simply pass the
        string literal as the argument to
        the equals method, as follows:
        */
        
        if (name1.equals("Mark"))
        {}
        
        /*
        To determine whether two strings
        are not equal, simply apply the !
        operator to the equals method’s
        return value. Here is an example:
        */
        
        if (!name1.equals("Mark"))
        {}
        
        /*
        The String  class  also  provides
        the compareTo  method,  which  can
        be  used  to  determine whether one
        String is greater than, equal to,
        or less than another string. The
        general form of the method is as
        follows:
        
        StringReference.compareTo(OtherString)
        
        
        StringReference is a variable that
        references a String object, and
        OtherString  is  either another
        variable that references a String
        object or a string literal. The
        method returns an integer value
        that can be used in the following
        manner:
        
        If the method’s return value is negative,
        the String referenced by StringReference
        (the calling object) is less than the
        OtherString argument.
          
        If the method’s return value is 0, the two
        Strings are equal.

        If the method’s return value is positive,
        the String referenced by StringReference
        (the calling object) is greater than the
        OtherString argument.
        */
        
        String name3 = "", name4 = "";
        
        if (name3.compareTo(name4) == 0)
        {
            System.out.println("The names are the same.");
        }
    }  
}
