/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment12;

import java.awt.Image;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Peyton
 */
public class WhitePeytonAssignment12 extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Image image = new Image("tape.png") {
          
        ImageView i1 = new ImageView();
        i1.setImage(image);
        
        Scene scene = new Scene();
        stage.setScene(scene);
        stage.show();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
