/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaandcircumofcircle;

import java.util.Scanner;

/**
 *
 * @author BINNY ERBYNN
 */
public class AreaAndCircumOfCircle {

    /**
     * @param args the command line arguments
     */
//    final static double PI = 3.14159;   // this is done if u wanna declare your own constant variable outside the main method
    public static void main(String[] args) {
         Scanner console = new Scanner(System.in); // create pbject by using new
       
       double circumference = 0.0;
       double raduis = 0.0 ;  // to create mem allocation 
       double area = 0.0;
       
       System.out.print("Enter raduis :  ");  // n0 need for next line
       raduis = console.nextDouble();   //obj to call the double fxn
       
//       double pi= Math.PI; can be used.....buh i have rather created my own constant PI
        final double PI = 3.14159;  // final in java implies const in c++
        area = PI*raduis * raduis;
       circumference = 2*PI*raduis;
       
       System.out.println("Area of Circle =  " + area);
       System.out.println("The Circumference =  " + circumference);
       
       msg = "YES!! I have coded the program";      //msg declared outside
       System.out.println(msg);
    }
    
     static String msg; //strings must not have the final keyword
}
