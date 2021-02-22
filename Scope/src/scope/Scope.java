/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope;

/**
 *
 * @author Anna
 */
public class Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*A variable's scope is the part of the program that has
        access to the variable (by its name).
        
        Variables that are declared inside a method are called local 
        variables. A local variable's scope begins at the variable's
        declaration and ends at the end of the method in which the
        variable is declared. 1) Dvs a local variable can't be accessed
        by code that is outside the method, or inside the method but
        before the variable's declaration. 2) You can't declare two local
        variable's with the same name in the same scope. The compiler
        reads the program from top to bottom.*/
        
        int number = 8;
        int number2 = 10;
        //Exempel
        System.out.println(number + number2);
    }
    
}
