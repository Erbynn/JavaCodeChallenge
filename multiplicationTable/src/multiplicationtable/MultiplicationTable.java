/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        
        int num;
        int ans;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter a number for its multiplication table: ");
        num = console.nextInt();
        
        System.out.println("Multiplication Table for " + num);
        for(int i=1; i<=12; i++){
            ans = num * i;
            System.out.println(num + " x " + i + " = " + ans);
    }
    }
    
}
