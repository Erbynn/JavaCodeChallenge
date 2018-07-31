/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meancaculator;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class MeanCaculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int input1;
       int input2;
        Scanner sc= new Scanner(System.in);
 
        System.out.println("Enter the number of integers u want to input:  " );
         input1 = sc.nextInt();
        System.out.println("Enter " + input1 + " intergers: ");
        for(int i =1; i<=input1; i++){
            input2 = sc.nextInt();      //another container to collect the input for the sum
            sum += input2;
        }
        average = sum/input1;
        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Sum of numbers is: " + average);
    }
    
}
int[] numbers = new int[10];
   System.out.print("Please enter " + numbers.length + " values:");
   for(int index = 0; index < numbers.length; index++)
      numbers[index] = input.nextInt(); 
    System.out.println(numbers[index]);