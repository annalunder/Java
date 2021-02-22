/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingchallengechapter2;

/**
 *
 * @author Anna
 */
public class ProgrammingChallengeChapter2
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Nr 1. Name, Age and Annual Income
        String name = "Anna";
        int age = 30;
        double annualPay = 400000.5;
        
        System.out.println("My name is " + name + ", my age is " + age +
                           ", and I hope to earn $" + annualPay +
                            " per year.");
        
        //Nr 2. Name and Initials
        String firstName = "Anna", middleName = "Marie", lastName = "Lunder";
        char firstInitial = 'A', middleInitial = 'M', lastInitial = 'L';
        
        System.out.println("My first name is " + firstName + ", my middle name"
                            + " is " + middleName + " and my last name is " +
                            lastName + ".");
        System.out.println("My initials are: " + firstInitial + " " + 
                           middleInitial + " " + lastInitial);
        
        //Nr 3. Personal Information
        String name2 = "Louise";
        String address = "Johannebergsvägen 7", city = "Floda",
                    län = "Västra Götaland", collegeMajor = "Social science";
        int postalNumber = 40000;
        int riktNumber = +725, telephoneNumber = 474978;
        
        System.out.println("My name is " + name2 + "\n" + "My address is " +
                address + ", " + postalNumber + " " + city
                + ", " + län + "\n" + "My telephone number is 0" + riktNumber +
                " " + telephoneNumber + "\n" + "My college major is " +
                collegeMajor);
    }
    
}
