/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ButtonClass extends Application{       //extension of the app is vey important

    public static void main(String[] args) {
        launch();               //this function helps u to run and test your code bit bit by bit
    }

    @Override               //this implies that we are using already predefined classes
    public void start(Stage primaryStage)  {        //this whole stage plateform .....that is our primary stage
        
//        3 main things to consider are the Stage, Scene and Actors ...................... it is better to tackle dem from the smallest element the largest(Stage)
        
        Button button = new Button("Erbynn");       //invoking the button class and creating an object for it
        button.setStyle("-fx-color: maroon");           //below are the features or methods associated with the Button called
        button.setMaxSize(20, 30);                       // this does not take effect since the button is the only actor on the stage
        button.setFont(Font.font(50));                    // the font is a class on it own
        button.setOnAction(e -> {                         // the arrow means that 
            if( button.getStyle().equals("-fx-color: maroon")){     // the .equals is used when u wanna compare two functions
                button.setStyle("-fx-color: ash");                     // when clicked action is done, color changes
            }
            else{
                button.setStyle("-fx-color: maroon");               // the color code is set in a quotation mark
            }
        });
        
        Scene scene = new Scene(button, 400, 300);          // the scene dimension is set 
        
        primaryStage.setScene(scene);                              // the scene is put on the Primary Stage 
        primaryStage.setTitle("Name");                             // scene name is set
        primaryStage.show();                                          // after the stage is set.....it need to be shown
        
    }
    
}
