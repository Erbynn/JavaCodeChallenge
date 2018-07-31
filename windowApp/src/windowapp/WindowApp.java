
package windowapp;

import java.awt.*;
//public class CodeChallenge {    // class name is always in caps
    public class WindowApp extends Frame{
        Label lblCount;
        
        public WindowApp(){
            setLayout(new FlowLayout());
            
            lblCount = new Label("Label Example");
            
            add(lblCount);
            
            setTitle("AWT Elements");
            setSize(400, 450);
            setVisible(true);
        }
        
        public static void main(String[] args){
            WindowApp app = new WindowApp();
        }
        
    }
