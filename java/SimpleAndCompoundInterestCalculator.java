/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleandcompoundinterestcalculator;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class SimpleAndCompoundInterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double p;
        double r;
        double t;
        double si;
        double ci;
        Scanner console = new Scanner(System.in);
        
        System.out.print("******* Welcom the Simple and Compound Interest Calculator ********* \n\n");
        System.out.print("Enter Principal Amout: ");
        p = console.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        r = console.nextDouble();
        System.out.print("Enter Number of Years: ");
        t = console.nextDouble();
        
        si = (p*r*t)/100.0;
        ci = p * ( Math.pow( (1.0 + (r/100.0) ), t) - 1 );
        
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
    
}
