/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppatterntrial;

/**
 *
 * @author BINNY ERBYNN
 */
public class LoopPatternTrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      for ( int i = 1; i <= 5; i++){
            
            for ( int k = 5; k >= i; k--){
                System.out.print("-");
            }
            for ( int j =1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
//        bottom pyriamid
        for ( int i = 1; i <= 5; i++){
            
            for ( int k =0; k <= i; k++){       //all intinitializations reduced by one
                System.out.print("-");          // if space come before the loop aa then e go be a priamid else hapf a pyrmid
            }
             for ( int j =4; j >= i; j-- ){
                System.out.print("*");
            }
            
             System.out.println();
        }
    }
    
    
    
}
