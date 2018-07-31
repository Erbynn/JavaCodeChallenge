/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input;
        int fact=1;     // container to store eact step calculated........if fact=0, since we are multiplying the final ans gonna be zero.......if equal 0 den do addition
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number to print its factorial: ");
        input = keyboard.nextInt();
                
        for(int i = 1; i <= input; i++){        //int i = 1 cuz factorial is multiplied down to 1.... i<=input cuz the number itself is part of the multiplication
             fact = fact * i;
        }
        
   /*      for(int i = input; i >= 1; i--){        //int i = 1 cuz factorial is multiplied down to 1.... i<=input cuz the number itself is part of the multiplication
             fact = fact * i;
        }
    */    
        System.out.println("The factorial of " + input + " is: " + fact);
    }
    
}
