/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop;

/**
 *
 * @author BINNY ERBYNN
 */
public class NestedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++){           // concerntrate on the inner for loop first.....that is where the actual code is done ....the outer is the number of times 
                System.out.print ("*");
            }
        }
 
    }
    
}
