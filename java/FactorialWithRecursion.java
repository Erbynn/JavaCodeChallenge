
package factorialwithrecursion;
import java.util.Scanner;
public class FactorialWithRecursion {
    
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer to comput its Factorial: " );
        num = keyboard.nextInt();
        System.out.println("The factorial for "+num+" is: " + factorial(num));
        
    }
    
}
