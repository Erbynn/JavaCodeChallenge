/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw;

import static java.lang.System.console;

/**
 *
 * @author BINNY ERBYNN
 */
public class JavaHw {
import java.util.Scanner;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //QUESTION 2        
        
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
