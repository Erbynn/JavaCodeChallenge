/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumupto;

/**
 *
 * @author BINNY ERBYNN
 */
public class EvenNumUpto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 10;
        for(int i=0; i<=num; i++){
            
            if(i%2 == 0){           // can be done for odd as
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        System.out.println();
    }
    
}
