
package even_or_odd;
import java.util.Scanner;
public class Even_or_odd {

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       int num=0;
       
       System.out.print("kindly enter your input :  ");
       num = console.nextInt();
       if (num%2==0){
           System.out.println("number is even");
       }
       else {
           System.out.println("nuber odd");
            }
    }
    
}
