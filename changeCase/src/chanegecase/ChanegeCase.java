/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanegecase;

/**
 *
 * @author BINNY ERBYNN
 */
public class ChanegeCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Tut 6 - Sring change case and lenght of String
        String name = "john kwesi bin erbynn";      //tho String is NOT a special character, it serves as a Data_type to declare strings
        String lowCase = name.toLowerCase();        //fxn under name
        String uppCase = name.toUpperCase();
        System.out.println("lower case : " + lowCase);
        System.out.println("upper case : " + uppCase);
        
        int nameLenght = name.length();         //we curn determine the lenght of a name. Thus, lenght is fxn under Strings, name in this case
        System.out.println("Lenght of name :  " + nameLenght);
    }
    
}
