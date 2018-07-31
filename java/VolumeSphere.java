
package volumesphere;

import java.util.Scanner;
public class VolumeSphere {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double v = 0.0, r = 0.0;
        
        System.out.print("enter radius : ");
        r = console.nextDouble();
        
        double pi = Math.PI;
        v = (4.0/3)*pi*Math.pow(r, 3);
        
        System.out.println("volume : " + v);
        
        
        
        
        
       
    }
    
}
