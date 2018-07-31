/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofintegers;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class SumOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //sum of integer and 0 to end prog
        int input, sum=0;
        Scanner console = new Scanner( System.in);
        System.out.println("Enter integers to be sum until zero(0) is read: ");
        
        do{
        input = console.nextInt();
        sum+=input;                                 //the summation must fall part of the loop to calculate each number input 
        }
        while(input != 0);
        
        System.out.println("sum: " + sum);
      
    }
    
}
