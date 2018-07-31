/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowestcommonmultiple;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class LowestCommonMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;
        int b;
        int big;
        int small;
        int lcm;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a num1: ");
        a = console.nextInt();
        System.out.print("Enter a num2: ");
        b = console.nextInt();
        
        if(a>b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }
        
        for ( int i=1; i<=big; i++){        //since dealing with multiplication, make uno start from zero
            if(((big*i)%small) == 0){
                lcm = big * i;
             System.out.println("LCM of " + a + " and " + b + " is " + lcm );
             break;
            }
        }
       
    }
    
}
