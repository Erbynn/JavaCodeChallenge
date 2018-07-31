/*
sum of even and odd numbers less that a certain integer
 */
package evenandoddsum;
import java.util.Scanner;
/**
 *
 * @author BINNY ERBYNN
 */
public class EvenAndOddSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sumEven=0;
        int sumOdd=0;
        int num;
        
        System.out.println("Enter a number for its Even and Odd numbers up to that to be computed: ");
        num = console.nextInt();
        
        for(int i=1; i<=num; i++){
            
            if(i%2 == 0){
                sumEven = sumEven + i;
            }
            else{
                sumOdd = sumOdd + i;
            }
        }
        
        System.out.println("Sum of Even Numbers up to " + num + " is: " + sumEven);
        System.out.println("Sum of Odd Numbers up to " + num + " is: " + sumOdd);
        
    }
    
}
