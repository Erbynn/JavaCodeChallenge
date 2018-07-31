/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop2;

/**
 *
 * @author BINNY ERBYNN
 */
public class NestedForLoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
for (int j = 1; j <= i; j++){
System.out.print (i*j);
}
System.out.println ( );
}
    }
    
}
