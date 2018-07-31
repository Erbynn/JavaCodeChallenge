/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppattern4;

/**
 *
 * @author BINNY ERBYNN
 */
public class LoopPattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for( int i=1; i<=5; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for( int i=4; i>0; i--){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        
         System.out.println();
          System.out.println();
        
          
        for( int i=1; i<=5; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for( int i=5; i>0; i--){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
    }
    
}
