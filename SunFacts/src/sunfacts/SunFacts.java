/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunfacts;

/**
 *
 * @author Anna
 */
//This program uses E notation (dvs. exempelvis 10 upphöjt i 2, som skrivs E2)

public class SunFacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double distance, mass;
        
        distance = 1.495979E11;
        mass = 1.989E30;
        
        System.out.println("The sun is " + distance +
                            " meters away.");
        System.out.println("The sun's mass is " + mass +
                            " kilograms.");
    }
    
}
