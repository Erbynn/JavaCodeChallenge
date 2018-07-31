/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base;
        double height;
        double area;
        Scanner console = new Scanner(System.in);
        
//        System.out.print("Enter Height: ");
//        height = console.nextDouble();
//        System.out.print("Enter Base: ");
//        base = console.nextDouble();
//        System.out.println();
//        
//        area = (1/2) * base * height;
//        System.out.println("Area of Triangle: " + area);
//        
        
        
        
        double side1, side2, side3, s;
        System.out.print("Enter length of Side1: ");
        side1 = console.nextDouble();
        System.out.print("Enter length of Side2: ");
        side2 = console.nextDouble();
        System.out.print("Enter length of Side3: ");
        side3 = console.nextDouble();
        
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt( s * (s-side1) * (s-side2) * (s-side3) );
        
        System.out.println();
        System.out.println(" Area of Triangle: " + area + "m" );
    }
    
}
