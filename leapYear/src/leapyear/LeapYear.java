/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int year;
        
        System.out.print("Enter a year: ");
        year = console.nextInt();
        
        if(year%400 == 0){
            System.out.println(year + " is a leap year");
        }
         else if(year%100 == 0){
            System.out.println(year + " is NOT a leap year");
        }
        else if(year%4 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
             System.out.println(year + " is NOT a leap year");
        }
        //    tip: test for 400, 100, 4, and other numbers  in that order for remembrancennbbbv  bbhvgvvvnn
        
        
        int b;
        int c=0;
        while(year > 0){
            b = year%10;
            year = year / 10;
            c = (c*10) + b;
        }
         System.out.println(c);
    }

}
