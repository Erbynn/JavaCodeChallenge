/*
ASSIGNMENT 1
PS/CSC/15/0006
10th APRIL, 2018
 */
package javaassignment;

import java.util.Scanner;
public class JavaAssignment {

    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
        int sum=0;
        int size = console.nextInt();
        int[] numArray = new int[size];
        
        //user input
        System.out.println("Please enter " + numArray.length + " integers:  " );
        for(int i =0; i<size; i++){
            System.out.print("Number " + (i+1) + ": " );
            numArray[i] = console.nextInt();      
            sum += numArray[i];
        }
        
        int minValue = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] < minValue) {
                minValue = numArray[i];
        }
    }
        
        //input display
        System.out.print("Your inputs were: ");
        for(int i=0; i<numArray.length; i++){
            System.out.print(numArray[i] + ", ");
        }
        
        //display output in reverse 
        
        System.out.println();
        System.out.println("Sum of values: " + sum);
        System.out.println("Minimum value: " + minValue );
        System.out.println("Number of values: " + numArray.length );
        System.out.println();
        
        
        
        // QUESTION 2
        int[] number = new int[5];
        
        System.out.println("Please enter 5 numbers: ");
        for(int i =0; i<number.length; i++){
            System.out.println("Number " + (i+1) );
            number[i] = console.nextInt();     
        }
        
         System.out.print("Input values are: ");
        for(int i=0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
}
