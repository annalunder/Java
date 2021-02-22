/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingkeyboardinput;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class ReadingKeyboardInput
{
    /**
    You can use the System.in object to read keystrokes
    that have been typed at the keyboard. The System.in
    object is not as simple to use as System.out because
    it reads input only as byte values.
    
    För att komma runt detta kan man använda System.in
    tillsammans med ett objekt av klassen Scanner. The
    Scanner class can read input from System.in and it
    provides methods to use to retrieve the input
    formatted as primitive values (int, byte etc) and
    strings.
    
    Variabeln keyboardInput är en class type variable.
    Det innebär att denna variabel håller adressen till
    ett Scanner-objekt.
     
    Man måste använda import java.util.Scanner;
    
    */
    public static void main(String[] args)
    {
       /*First, create  a Scanner object and connect it
       to the System.in object. The data type of the
       variable keyboardInput is Scanner.
       
       Några av Scanner-klassens metoder:
       nextInt, nextByte, nextDouble, nextFloat,
       nextLine, nextLong och nextShort.
       */
       
       int num;
       Scanner keyboardInput = new Scanner(System.in);
       System.out.print("Enter an integer value: ");
       num = keyboardInput.nextInt();
       
       byte x;
       Scanner keyboardInput2 = new Scanner(System.in);
       System.out.print("Enter a byte value: ");
       x = keyboardInput2.nextByte();
       
       double num2;
       Scanner keyboardInput3 = new Scanner(System.in);
       System.out.print("Enter a double value: ");
       num2 = keyboardInput3.nextDouble();
       
       float num3;
       Scanner keyboardInput4 = new Scanner(System.in);
       System.out.print("Enter a float value: ");
       num3 = keyboardInput4.nextFloat();
       
       String name;
       Scanner keyboardInput5 = new Scanner(System.in);
       System.out.print("Enter your name: ");
       name = keyboardInput5.nextLine();
       
       long num4;
       Scanner keyboardInput6 = new Scanner(System.in);
       System.out.print("Enter a long value: ");
       num4 = keyboardInput6.nextLong();
       
       short num5;
       Scanner keyboardInput7 = new Scanner(System.in);
       System.out.print("Enter a short value: ");
       num5 = keyboardInput7.nextShort();
    }
    
}