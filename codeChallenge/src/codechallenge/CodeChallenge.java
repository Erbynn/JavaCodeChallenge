
package codechallenge;      //every single one of the code is found in the package
import java.util.Scanner;   //java scanner class is called for input

import java.net.InetAddress;    //for tut10
import java.net.UnknownHostException;   //for tut10


public class CodeChallenge {    // class name is always in caps

       public static void main(String[] args) throws UnknownHostException/*for tuts 10*/ {    //psv main(string arguments)
        
 /*       
*/    
        



/*        // Tut 3 - Area of circle 
        Scanner sc = new Scanner(System.in);
        double r=0;
        double area = 0;
        System.out.print(" Enter radius :  ");  //input inline with the prompt
    
        r=sc.nextDouble();
        area = Math.PI *(r*r);  //pi is found in Math fxn
        System.out.print("Area :  " + area );
*/
        

/*        
*/
        

 /*      // Tut 4 - Binary to Decimal and vise versa
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary :  ");
        String bin = sc.nextLine();      // since binary is considered String, use String dataType and nextLine() for string too
        System.out.println("Your integer is : " + Integer.parseInt(bin, 2));      //under Integer there is a fxn to change all bin to in....read from right to left...bin to int
         System.out.print("\n");     // allow you go next line 
         
        System.out.print("Enter your integer : ");
        int num = sc.nextInt();
        System.out.print("Your string is : " + Integer.toBinaryString(num));    //integer to binary.....use "toHexString(num) for from Decimal to Hex "
        System.out.print("\n");     // allow you go next line
*/
        
 
 /*      // Tut 5 - Decimal to Hexadecimal and vise versa
        Scanner console = new Scanner(System.in);
        System.out.print("Decimal input :  ");
        int num = console.nextInt();
        System.out.println("Hexadecimal equivalent : " + Integer.toHexString(num));
        
       System.out.print("Hexadecimal input :  ");
        String hexnum = console.nextLine();
        System.out.println("Decimal equivalent : " + Integer.parseInt(hexnum, 16));
*/
        
 
 /*      
 */       
        
 
 /*    // Tut 7 - Strings conpare and String concat
        String Fname = "john";
        String Lname = "erbynn";
        String name = " erbynn";
        System.out.println(Fname.equals(Lname));    //comparison 
        System.out.println(Lname.equals(name));

        String join = Fname.concat(name);   //using the + operator can do same
        System.out.println("Concat gives : " + join);
*/
        
 
 /*       
*/
 
 
 /*       // Tut 9 - Array average
        int[] papa = {1,2,3,4,5};   //Square bracket attached to the dataType
        double sum=0.0;     //o.o since set to double
        double average=0.0;
        
        System.out.println("Array members: " );
        for( int i =1 ; i < papa.length ; i++){     //papa.length is very important
                System.out.println(papa[i]);    //whatever done here makes use of the "i" 
                sum += papa[i];         // operator b4 equal to and makes use of  the "i"
                average = sum / papa.length;        
        }
        System.out.println("Sum of array memebers: " + sum);
        System.out.println("Average of numbers is: " + average);
*/
 
 
 /*       // Tut 10 - my IP address Display
        System.out.println("My IP Address :  " + InetAddress.getLocalHost());
 */
 



/*      //Tut 12 - Prime or Not
        int num, count = 0;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        num = console.nextInt();
        
        for ( int i=2; i<num; i++){     //since when a num is div by 1 doesnt mean anything,.....we start from 2....so from 2 to the number preceding the input number
            if(num%i == 0){     //we take the numbers starting from 2 to number b4 the exact number and use it to divide the exact input
                count ++;   //count the number of times the exact number was devided
                break;
            }
        }
        if(count == 0){
            System.out.print("This number is prime");   //if wasnt devided,,,then it's a prime
        }
        else{
            System.out.println("this numer is non-prime");
        }
  */



 
        //java questions in eliot slides
        //simple interest and compound interest
        //all in java basic and deep software
        //26 Area of Triangle
        //code 23
        //code 6
        //Compare two Strings
        //chect whether character vowel or not
        //printing a to z
        //code 54
        
        
        
        //Tut 14 - 
      
           
        }
}


