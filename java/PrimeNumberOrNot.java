/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberornot;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class PrimeNumberOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int num;
        int count = 0;          // counter
        
        System.out.print("Enter a number to determine whether Prime or Not: " );
        num = console.nextInt();
        
        for (int i = 1; i <= num; i++){         // taking all numbers less than the input starting from 1;
            if ( num%i == 0 ){                   // i being divisible
                count = count + 1;              //  count and store the number of times a number is divisible
            }
        }
        
        
        if( count == 2){                        // if the number has only 2 factors then it implies the number is Prime
                System.out.println("The number: " + num + " is a Prime Number. ");
        }
        
        
        else{
                System.out.println("The number: " + num + " is NOT a Prime Number cus has the following factors: ");
                for(int i=1; i<=num; i++){      
                    if( num%i == 0){                // printing the factors or divisibilities of the number
                        System.out.println(i);
                    }          
        }
        }
      }
 }
    

