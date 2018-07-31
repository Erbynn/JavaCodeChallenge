
package maxiandminiofanyfiveintegernmbers;

import java.util.Scanner;
public class MaxiAndMiniOfAnyFiveIntegerNmbers {

    public static void main(String[] args) {
        int numb1;
        int numb2;
        int numb3;
        int numb4;
        int numb5;
        int largest = 0;
        int smallest = 0;
        
        System.out.print("Enter five interger numbers: \n");
        Scanner console = new Scanner(System.in);
        numb1 = console.nextInt();
        numb2 = console.nextInt();
        numb3 = console.nextInt();
        numb4 = console.nextInt();
        numb5 = console.nextInt();
        
        largest = numb1;
        if(numb2>numb1)         //numb1 curn be replaced by largest and numb2,3,4 and 5;
            largest = numb2;
        if(numb3>numb2)
            largest = numb3;
        if(numb4>numb3)
            largest = numb4;
        if(numb5>numb4)
        
        smallest = numb1;
        if(numb2 < smallest)
            smallest = numb2;
        if(numb3 < smallest)
            smallest = numb3;
        if(numb4 < smallest)
            smallest = numb4;
        if(numb5 < smallest)
            smallest = numb5;
        
        System.out.println("Smallest number is:  " +  smallest);
        System.out.println("Largest number is:  " + largest);
    }
    
}
