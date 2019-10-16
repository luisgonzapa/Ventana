/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.pkg434;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class T1434 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creo los componentes
        Text texto = new Text(100, 100, "Programming is fun");
        
      //Evento
      texto.setOnMouseDragged( event -> {
          texto.setX(event.getX());
          texto.setY(event.getY());
      }
      );
      
        //Layout
        Pane panel = new Pane();

        //añadimo componentes
       panel.getChildren().add(texto);
       
        //Creamos la escena
        Scene scene = new Scene(panel, 370, 220);
        
       
        primaryStage.setTitle("Ejercicio 4.3.4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }//Fin Main
    
}//Fin clase
