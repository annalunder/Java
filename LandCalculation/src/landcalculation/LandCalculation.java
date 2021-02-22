/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landcalculation;

/**
 * @author Anna
 */
public class LandCalculation
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Challenge Nr.6
        double numberOfAcres;
        double oneAcre = 43.560;
        double totalLand = 389.767;
        
        numberOfAcres = totalLand / oneAcre;
        
        System.out.print("The land has " + numberOfAcres + " acres.");
        
    }
    
}
