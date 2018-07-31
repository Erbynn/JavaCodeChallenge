/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancebtnpoints;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class DistanceBtnPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1;
        int x2;
        int y1;
        int y2;
        double distance;
        double subDis;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter your distance points in terms of x1, x2,  y1, y2 \n");
        System.out.print("value of x1: ");
        x1 = console.nextInt();
        System.out.print("value of x2: ");
        x2 = console.nextInt();
        System.out.print("value of y1: ");
        y1 = console.nextInt();
        System.out.print("value of y2: ");
        y2 = console.nextInt();
        
        double subAns = ( Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2) ) ;
        distance = Math.sqrt(subAns);
        
        System.out.println("\nThe Distance between " + "(" + x1 + "," + x2 + ")" + " and " + "(" + y1 + "," + y2 + ") is: " + distance);
        
    }
    
}
