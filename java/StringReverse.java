/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;
import java.util.Scanner;
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tut 8- String reverse
//        String name = "John Pk Erbynn";
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();       // the nextLine() take a string up to one whole line whilst the next() takes only a word
        System.out.println("Original name :  " + name);
        
        name = new StringBuffer(name).reverse().toString();     //creating new portion of memory dynamically for the name but in reverse and in same lenght sequence
        System.out.println("Reverse name :  " + name);
    }
    
}
