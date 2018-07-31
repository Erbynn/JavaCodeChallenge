/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilargestnumb;

import java.util.Scanner;
import static javafx.application.Application.launch;
/**
 *
 * @author BINNY ERBYNN
 */

public class largestNumber {
    
        static int largestNum(int a, int b){
        int largest;
        if(a>b){
            largest = a;
        }
        else{
            largest = b;
        }
        return largest;         //since Returning a value ...... print int main function
    }
     
     public static void main(String[] args) {
        // TODO code application logic here
           Scanner console = new Scanner(System.in);
           System.out.println("Enter number 1: ");
           int numb1 = console.nextInt();
           System.out.println("Enter number 2: ");
           int numb2 = console.nextInt();
           
          System.out.println("The largest number is: "+largestNum(numb1,numb2));
//           largestNumb(numb1, numb2);     used when the function up there is void thus printing in the method
}
}
