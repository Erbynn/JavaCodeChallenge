/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoutput;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextOutput extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage primaryStage)  {
        
        Button button = new Button();
        button.setMinSize(200, 80);
        button.setText("Button");
        button.setTranslateX(120);      //shifting of element on the x-axis ......... +ve moves element to the right
        
        TextArea textArea = new TextArea();
        textArea.setMaxHeight(150);
        textArea.setTranslateY(60);     // shifting of element on thr y-axis ....... -ve moves element to the bottom
        
        
        
        Text text = new Text();
        
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(text);
        borderPane.setCenter(textArea);
        borderPane.setBottom(button);
        borderPane.setPadding(new Insets(20));
        
        Scene scene = new Scene(borderPane, 500, 500);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
