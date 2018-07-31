/*
loop for right angled triangle
 */
package looppattern;

public class LoopPattern {

    public static void main(String[] args) {
        
        for( int i=0; i<5; i++){
            
            for( int j=0; j<=i; j++){       // j<=i shows the number of line being equal to number of asterisks
                System.out.print("*");   
            }
            
            System.out.println();
        }
    }
    
}
