/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wages;
/**
 *
 * @author Anna
 */
public class Wages
{
    /**
     * Arithmetic operators
     */
    public static void main(String[] args)
    {
        double regularWages;
        double basePay = 25;
        double regularHours = 40;
        double overtimeWages;
        double overtimePay = 37.5;
        double overtimeHours = 10;
        double totalWages;
        
        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;
        
        System.out.println("Wages for this week are $" +
                            totalWages);
        
        
        /*INTEGER DIVISION
        Integer division sker när båda operanderna är integers.
        Ex. 5 / 2 = 2 eftersom det i en integer division inte
        tas hänsyn till decimaler. För att få 5 / 2 = 2.5 måste
        en av operanderna vara en floating point data type, i
        det här fallet 5.0 i stället för 5. Det räcker inte att
        deklarera talet som en double, dvs. double number; */
        
        /*OPERATOR PRECEDENCE
        In order, from highest to lowest
        1) Unary negation (ex. -5)
        2) *, /, modus(%)
        3) +, -
        Man kan förstås även använda parenteser för att gruppera
        så att man tvingar vissa operationer att göras före andra.
       */
    }    
    
}
