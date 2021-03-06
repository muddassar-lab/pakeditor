package com.packsoft;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/MainWindow.fxml"));
        Parent root=(Parent) loader.load();
        stage.setTitle("PakEditor");
        stage.setScene(new Scene(root,800,600));
        stage.show();
        MainController controller= loader.getController();
        controller.setStage(stage);

    }

    public static void main(String[] args) {
        launch();
    }

}