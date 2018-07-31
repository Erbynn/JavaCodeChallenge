/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilargestnumb;


import javafx.application.Application;
//import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author BINNY ERBYNN
 */
public class GuiLargestNumb extends Application{    //extend this whole class app 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        TextField tf = new TextField();
        Text tx = new Text();
        HBox hb = new HBox(tf,tx);
        
        TextField tf1 = new TextField();
        Label lb = new Label();
        HBox hb1 = new HBox(tf1,lb);
        
        TextField tf2 = new TextField();
        Button bt = new Button("Conput");
        
        HBox hb2 = new HBox(10, bt,tf2);
        
        
        VBox vb = new VBox(70, hb, hb1, hb2);
        vb.setPadding(new Insets(10));
        
        Scene sc = new Scene(vb, 300, 300);
        primaryStage.setScene(sc);
        primaryStage.show();
        
        
        
        bt.setOnAction(e ->{
            largestNumb ln = new largestNumb();
            
            int firstUserInput = Integer.parseInt(tf.getText());
            int secondUserInput = Integer.parseInt(tf1.getText());
            
            
            
            int finalAnswer = ln.largestNum(firstUserInput, secondUserInput);
            
           
            // put the final answer into the last textField to show the answer to the user
//            tf2.setText(""+finalAnswer);
            
            tf2.setText(""+finalAnswer);
        
        });
    }
    
}
