/***********************************************
 * Title: Program3_6.java   Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Descrpition: Prints out the amount of zeros
 *  even, and odd number in a sting.
 */
import java.util.Scanner;

public class Program3_6
{
    public static void main()
    {
        System.out.println("Please enter a ONE large number in one line.");
        Scanner keyboard = new Scanner(System.in);
        String largeNumber = keyboard.nextLine();
        int odd = 0, even = 0, zero = 0;
        for(int a = 0; a < largeNumber.length(); a++)
        {
            if(largeNumber.charAt(a) == '0')
                zero++;
            else if(largeNumber.charAt(a) % 2 == 1)
                odd++;
            else if(largeNumber.charAt(a) % 2 == 0)
                even++;
        }
                
        System.out.println("Odd: " + odd + "\t Even: " + even + "\t Zero: " + zero);
    }
}