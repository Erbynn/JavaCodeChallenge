/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppattern1;

/**
 *
 * @author BINNY ERBYNN
 */
public class LoopPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=0; i<5; i++){
            
            for(int j=5; j>i; j--){     // since j--  means that the sign gonna be 5,4,3 downwards
                System.out.print("#");
            }
            
            System.out.println();  // normally the println comes out
        }
    }
    
}
