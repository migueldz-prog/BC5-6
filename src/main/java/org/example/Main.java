package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {


        Button northButton = new Button("Norte"); //creamos botones
        Button southButton = new Button("Sur");
        Button eastButton = new Button("Este");
        Button westButton = new Button("Oeste");
        Button centerButton = new Button("Centro");
        //se crean los botones

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(northButton);
        borderPane.setBottom(southButton); //colocamos los botones usando borderPane
        borderPane.setRight(eastButton);
        borderPane.setLeft(westButton);
        borderPane.setCenter(centerButton);

        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setTitle("Ejercicio 6 - BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();//se crea la escena, se pone titulo, se asigna a la ventana y se hace visible
    }
    public static void main(String[] args) {
        launch(args);
    }//metodo de la clase application para arrancar el programa
}
