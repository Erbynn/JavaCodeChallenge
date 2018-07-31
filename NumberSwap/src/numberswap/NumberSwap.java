/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberswap;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class NumberSwap {
public static void main(String[] args) {
        // Tut 4 - Two number swapp
        int x, y, temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number x :  ");
        x = sc.nextInt();
        System.out.print("Enter number y :  ");
        y = sc.nextInt();
        
        temp = x;
        x = y;
        y = temp;   // in that order ......start at temp, ends at temp....w@ is @ the right continues at the left....and ends with the start var
        
        System.out.println("After swapping");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
    
}
