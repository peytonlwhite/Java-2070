/*
 * Peyton White
 * april 16th 2018
 * book libray java 2070
 */
package whitepeytonassignment13;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Peyton
 */
public class WhitePeytonAssignment13 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
      
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       ArrayList<Book> bookList = new ArrayList<Book>();
       
       VBox mainVbox = new VBox(20);
       
       // this is the title box 
       HBox titleBox = new HBox(20);
       Label titleLabel = new Label("Title: ");
       TextField title = new TextField();
       titleBox.getChildren().addAll(titleLabel,title);
       titleBox.setAlignment(Pos.CENTER);
       
       // this is the author box
       HBox authorBox = new HBox(20);
       Label authorLabel = new Label("Author: ");
       TextField author = new TextField();
       authorBox.getChildren().addAll(authorLabel,author);
       authorBox.setAlignment(Pos.CENTER);
       
       // this is the Publisher box 
       HBox pubBox = new HBox(20);
       Label pubLabel = new Label("Publisher: ");
       TextField publisher = new TextField();
       pubBox.getChildren().addAll(pubLabel,publisher);
       pubBox.setAlignment(Pos.CENTER);

       // this is the year box 
       HBox yearBox = new HBox(20);
       Label yearLabel = new Label("Year: ");
       TextField year = new TextField();
       yearBox.getChildren().addAll(yearLabel,year);
       yearBox.setAlignment(Pos.CENTER);
       
       // this is the button box 
       HBox addBookBox = new HBox(20);
       Button addBook = new Button("Add Book");
       addBookBox.getChildren().addAll(addBook);
       addBookBox.setAlignment(Pos.CENTER);
       
       // sets a text feild up
       HBox textField = new HBox(20);
       TextArea field = new TextArea();
       textField.getChildren().addAll(field);
       textField.setAlignment(Pos.CENTER);
       
        EventHandler<ActionEvent> handler = event -> {
          try {
          
          // puts all the data into string so it can be passed through array list
          String temp = year.getText();
          int yearOfBook = Integer.parseInt(temp);
          
     
          
          String titleOfBook = title.getText().trim();
          String authorOfBook = author.getText().trim();
          String pubOfBook = publisher.getText().trim();
          
          Book book = new Book(titleOfBook,authorOfBook,pubOfBook,yearOfBook);
          bookList.add(book);
          
          StringBuilder strB = new StringBuilder();
          for(int i = 0; i < bookList.size();i++){
              
            strB.append(bookList.get(i).getDescription());
            strB.append("\n");
            String bookLine = strB.toString();
            System.out.println(bookLine);
            field.setText(bookLine);
            
         
          }
         
          title.setText("");
          author.setText("");
          publisher.setText("");
          year.setText("");
          
          }
           catch (NumberFormatException e){
               
               JOptionPane.showMessageDialog(null,"invalid number input. ");
           } 
            
        };
       
       
       
       
       
       
        addBook.setOnAction(handler);
       
        mainVbox.getChildren().addAll(titleBox,authorBox,pubBox,yearBox,addBookBox,textField);
       
        Scene scene = new Scene(mainVbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Peyton White Book Library");
        primaryStage.show();
    }
    
}
