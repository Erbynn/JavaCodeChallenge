
package pythagorean;

import java.util.Scanner;
public class Pythagorean {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = 0.0, b = 0.0 , c = 0.0, val = 0.0;
        
        System.out.print("enter a : ");
        a = console.nextDouble();
        
        System.out.print("enter b : ");
        b = console.nextDouble();
        
        val = (a*a) + (b*b);
        c = Math.sqrt(val);     //visit bucky tut number 25 for more Math methods
        
        System.out.println(" c : " + c);
        
        int x = 1 + 2 -3 * 4/5;
        System.out.println(x);
                
    }
    
}
