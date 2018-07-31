
package rootofquadraticequation;
import java.util.Scanner;

public class RootOfQuadraticEquation {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double determinant;
        double root1;
        double root2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Given quadratic equation -> ax^2 + bx + c");
        System.out.print("Enter value a: ");
        a = keyboard.nextInt();
        System.out.print("Enter value b: ");
        b = keyboard.nextInt();
        System.out.print("Enter value c: ");
        c = keyboard.nextInt();
        
        System.out.println();
        
        System.out.println("Your Quadratic Equation is: " + a + "x^2 + " + b + "x + " + c + "\n");
        
        determinant = b*b - 4*a*c;      
//due to the square root, the determinant needs to be tested on 3 solid conditions
//and for each state, find root1 and root2
        
        if(determinant > 0){
            System.out.println("Real and Unequal Roots");       // 2 roots for determinant > 0
            root1 = (-b + Math.sqrt(determinant)) / (2*a);
            root2 = (-b - Math.sqrt(determinant)) / (2*a);
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
        else if(determinant == 0){
            System.out.println("Real and Equal Roots");     //  1 root for determinant = 0
            root1 = (-b + Math.sqrt(determinant)) / (2*a);
            System.out.println("Root is: " + root1);
        }
        else{
            System.out.println("Imaginary Root");       // No root for determinant < 0
        }
        
        
    }
    
}
