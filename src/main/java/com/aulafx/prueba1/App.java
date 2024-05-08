package com.aulafx.prueba1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// este es el inicio se la aplicación (tiene el main)
public class App extends Application { // no se toca
    private static Scene scene; // declaro una scene estática que pueda utilizarse en todos los métodos de la clase
    @Override
    public void start(Stage stage) throws IOException { // esto no se cambia
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml")); // aquí apuntamos al nombre del fichero fxml que queramos
        Scene scene = new Scene(fxmlLoader.load(), 640, 480); // definimos el tamaño de la escena, lo demás no cambia


        stage.setTitle("Aplicación!");
        stage.setScene(scene); // no se toca
        stage.show(); // no se toca
    }

    // si temenos diferentes ficheros fxml, añadimos este método, pero vamos a utilizar solo el fichero primary.fxml
    static void setRoot(String fxml){

    }

    public static void main(String[] args) { // esto no se cambia
        launch();
    }
}