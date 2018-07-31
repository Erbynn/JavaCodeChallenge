/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleinput;
import java.io.*;
/**
 *
 * @author BINNY ERBYNN
 */
public class ConsoleInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Console cn = System.console();
//        int number;
//        System.out.println("Enter a number: ");
//        number = Integer.parseInt(cn.readLine());
//        System.out.println("Your number was " + number);
    
            int a = 10;
            System.out.println("before return");
            if (a == 1)
                return ;         // this makes it not to go to the next prompt ...... the System.exit(0) can also do same
                                   // the break and continue keywords are only associated with staments in the if condition...whilst return for the outside statements
            System.out.println(a++ + "\n" + a++ + "\n" + ++a + " one " + "two "+ (++a) + " nex " + a++);
            System.out.println(++a);
            
            

        
    }
    
}
