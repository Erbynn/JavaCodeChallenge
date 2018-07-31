/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class Arithmetic {

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       double input1;
       double input2;
       System.out.println("Enter first number: ");
       input1 = console.nextDouble();
       System.out.println("Enter second number: ");
       input2 = console.nextDouble();
       
       double sum = input1 + input2;
       double difference = input1 - input2;
       double product = input1 * input2;
       double quotient = input1 / input2; 
       
       System.out.println("ARITHMETIC \n");
       System.out.println(input1 + " + " + input2 + " = " + sum);
       System.out.println(input1 + " - " + input2 + " = " + difference);
       System.out.println(input1 + " * " + input2 + " = " + product);
       System.out.println(input1 + " / " + input2 + " = " + quotient);
        
    }
    
}
