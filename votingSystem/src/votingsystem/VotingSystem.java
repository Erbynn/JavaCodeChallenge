
package votingsystem;
import java.util.Scanner;
public class VotingSystem {

    public static void main(String[] args) {
         int age;
     Scanner console = new Scanner(System.in);
    
     System.out.print("kindle enter your ege : ");
      age = console.nextInt();
      

        if (age >= 18 && age <=120){    //dont forget your boundaries
            System.out.println("you are authorized to vote");
        }
        else{
            System.out.println("you are NOT authorized to vote");
        }
        
       
    }
    
}
