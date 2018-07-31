
package gradingsystem;
import java.util.Scanner;
public class GradingSystem {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade=0;
       
        do {
        System.out.print("kindly enter your score :  ");
        grade = console.nextDouble();
        
        if( grade >=80 && grade<=100){
            System.out.println("grade A");
        }
        else if (grade >= 70 && grade<=80){
            System.out.println("grade B");
        }
        else if (grade >= 60 && grade<=70){
            System.out.println("grade C");
        }
        else if (grade >= 50 && grade<=60){
            System.out.println("grade D");
        }
        else{
            System.out.println("grade E");
        }
    }
        while(grade != 0);  // UNTIL zer0 NUMBER IS ENTERED TO QUIT THE PROGRAM
}
}
