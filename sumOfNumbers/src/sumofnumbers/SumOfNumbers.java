/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnumbers;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input;
        int sum=0;
        System.out.println("enter 5 numbers to sum: ");
        for( int a=0; a<5; a++){
            input = console.nextInt
         ();
            sum += input;
        }
        System.out.println("Sum is: " + sum);
    }
    
}
