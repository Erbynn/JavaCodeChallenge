
package sumoftwonumbers;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class SumOfTwoNumbers {

    public static void main(String[] args) {
       // Tut 1 - addition of two numbers
        int num1=0, num2=0, sum=0;  //all the variables should be assigned 0's to make pc reserve memory for them 
        Scanner console = new Scanner(System.in);   //creates object for the scanner class which was imported + new for dynamic mem allocation
        
        System.out.println("Enter two numbers: ");  //println makes next line of output go to the next line
        num1 = console.nextInt();   //assign variable to scanner object dot its next_datatype() fxn
        num2 = console.nextInt();
        
        sum = num1 + num2;
        System.out.println("The sum is : " + sum);  // + to add string and intValue
    }
    
}
