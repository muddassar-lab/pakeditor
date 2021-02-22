package com.packsoft;

import com.packsoft.Controllers.File_Functions;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public TextArea textArea;
    //Main Stage Variable
     Stage stage;
    //File Function Object
    File_Functions File_Controller;
    //Function to set The Main Stage Variable
    public void setStage(Stage stage){
    this.stage=stage;
    }
    public MainController(){
    File_Controller=new File_Functions(this);
    }
    public Stage getStage(){
        return stage;
    }

    public void NewFile(ActionEvent actionEvent) {
        File_Controller.New();
    }

    public void Exit(ActionEvent actionEvent) {
        File_Controller.Exit();
    }

    public void OpenFile(ActionEvent actionEvent) throws IOException {
        File_Controller.Open();
    }

    public void SaveFileAs(ActionEvent actionEvent) throws IOException {
        File_Controller.SaveAs();
    }

    public void SaveFile(ActionEvent actionEvent) throws IOException {
        File_Controller.Save();
    }
}
