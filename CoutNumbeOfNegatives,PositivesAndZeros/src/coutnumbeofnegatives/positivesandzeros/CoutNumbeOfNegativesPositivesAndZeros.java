/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coutnumbeofnegatives.positivesandzeros;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class CoutNumbeOfNegativesPositivesAndZeros {

    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        
        int numPositives = 0;           //for any counter, make sure that they are first initialized to zero b4. And use counter++ to collect them
        int numNegatives = 0;
        int numZeros = 0;
        
//        Accepting the five interger numbers
        System.out.print("Enter first number: ");
        num1 = console.nextInt();
        System.out.print("Enter Second number: ");
        num2 = console.nextInt();
        System.out.print("Enter third number: ");
        num3 = console.nextInt();
        System.out.print("Enter forth number: ");
        num4 = console.nextInt();
        System.out.print("Enter fift number: ");
        num5 = console.nextInt();
        
//        do all the countings first for each of the cases
        
//        counting number of positive numbers
        if(num1 > 0)
            numPositives = numPositives + 1;
        if(num2 > 0)
            numPositives = numPositives++;
        if(num3 > 0)
            numPositives = numPositives ++ ;
        if(num4 > 0)
            numPositives = numPositives ++;
        if(num5 > 0)
            numPositives = numPositives ++;
        
//        counting the number of negatives
        if(num1 < 0)
            numNegatives = numNegatives + 1;
        if(num2 < 0)
            numNegatives = numNegatives + 1;
        if(num3 < 0)
            numNegatives = numNegatives + 1;
        if(num4 < 0)
            numNegatives = numNegatives + 1;
        if(num5 < 0)
            numNegatives = numNegatives + 1;
        
//        counting the number of zeros
        if(num1==0)
            numZeros ++;
        if(num2==0)
            numZeros ++;
        if(num3==0)
            numZeros ++;
        if(num4==0)
            numZeros ++;
        if(num5==0)
            numZeros ++;
        
        System.out.print("\n");     //leaving a line space
        
//        now printing the counters 
        System.out.println("Number of Positive integers: " + numPositives);
        System.out.println("Number of Negative integers: " + numNegatives);
        System.out.println("Number of Zero integers: " + numZeros);
        
    }
    
}
