/**
 * 
 */
package occ.cs272.ic01;

import java.util.Scanner;

/**
 * @author azemariam
 *
 */
public class Flipper
{
    public static void main(String[] args)
    {
       Scanner cin = new Scanner (System.in);
        
       
       System.out.print("How many coins do you want to flip? ");
       int times = cin.nextInt();
       int a = 0;
       
       while (a < times)
           {
           
           if(Math.random() < .5)
       
       {
           System.out.println("Heads");
           a++;
       }
       else 
       {
           System.out.println("Tails");
           a++;
       }
       
       
       
       
    }

}
}