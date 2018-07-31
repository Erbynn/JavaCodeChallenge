/*
 body mass index programe
 */
package bmi;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double weight = 0;
        double height = 0 ;
        double bmi;
         Scanner console = new Scanner(System.in);
         
        System.out.print("Kindly enter your weight in kilograms:  ");
        weight = console.nextDouble();
        System.out.print("Kindly enter your height in meters :  ");
        height = console.nextDouble();
        
        bmi = weight / (height * height);
        
        System.out.println();       //leaving a line space
        
        if(bmi>0 && bmi < 18.5) {
            System.out.println("BMI is " + bmi + ":" + " UnderWeight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is " + bmi + ":" + " Normal");
        }
        else if(bmi >= 2.5 && bmi <= 29.9) {
            System.out.println("Overwieght");
        }
        else if(bmi > 30){
            System.out.println("Obesity");
        }
        else{
            System.out.println("Invalid");
    }
    
}
}
