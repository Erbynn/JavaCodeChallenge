/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectnumber;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter a number: ");
        num = console.nextInt();
        
        for ( int i = 1; i < num; i++){
//            System.out.print(i);
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(sum==num){
                System.out.println(num + " is a perfect number");
            }  
        else{
            System.out.println(num + "  is NOT a arfect number");
        }
    }
    
}
