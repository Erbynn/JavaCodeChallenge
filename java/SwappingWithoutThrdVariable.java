/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swappingwithoutthrdvariable;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class SwappingWithoutThrdVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        num1 = console.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = console.nextInt();
        
        num1 = num1 + num2;     //if you ever forget, use address diagrams and take do then bab
        num2 = num1 - num2;     //num2 computed first cuz if num1 is done first u gonna reach the same result, thus numbers arent gonna swap
        num1 = num1 - num2;
        
        System.out.println("\nAfter swapping");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        
        
    }
    
}
