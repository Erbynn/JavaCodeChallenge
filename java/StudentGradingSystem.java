//.......... ps/csc/15/0006
package studentgradingsystem;
import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        double input;
        Scanner console = new Scanner(System.in);
        System.out.println("Kindly enter your Mark :");
        input=console.nextDouble();
        if(input>=0 && input<=100){
                if(input >= 80){
                    System.out.println("Grade A");
                }
                else if(input >= 75){
                    System.out.println("Grade B+");
                }
                else if(input >= 70){
                    System.out.println("Grade B");
                }
                else if(input >= 65){
                    System.out.println("Grade C+");
                }
                else if(input >= 60){
                    System.out.println("Grade C");
                }
                else if(input >= 55){
                    System.out.println("Grade D+");
                }
                else if(input >= 50){
                    System.out.println("Grade D");
                }
                else{
                    System.out.println("Grade E");
                }
    }
        else {
            System.out.println("Error data input");
        }
    
    }
}
