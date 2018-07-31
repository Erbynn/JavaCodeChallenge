/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // every DataType is a class on its own that is y its object needs to be created and normally called Declaration
        int a = 0;      //since every fib start from zero, 0
        int b = 1;      //....and the second fixed number is one, 1
        int c;      // value for next number by adding prev two numbers together
        int numOfSeries;
        Scanner console = new Scanner(System.in);
      
        System.out.print("Enter a number to obtain its Fibonacci Series: ");
        numOfSeries = console.nextInt();
        
        System.out.println();       //  line space
        
        System.out.print("Fibonacci Series: " + a + "     " + b);       // the prev two numbers is displayed b4 the next on same line
        
        for ( int i = 2; i < numOfSeries; i++){     // computation needs to be done before printing the c, next var
        c = a+b;                // for this easy to remember, after this calculation, a,b are reassigned to the next num
        System.out.print( "      " + c );       // the number, "c" is now displayed wif a space in front of it since in loop
        a = b;                  // "a" assigned to next number in front of it
        b = c;                  // "b" assigned to next number in front of it, c, which computed for. 
        }                          // never forget that the loop must start from 2 since two number has already been shown already 
                                   // loop <(the number) since fib starts from 0
        System.out.println();
    }
    
    
    /*main concept
    display initial numbers
    add prev two numbers to get next
    step eat number value forward in*/
    
    
}
