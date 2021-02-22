package com.packsoft.Controllers;

import com.packsoft.MainController;
import javafx.stage.FileChooser;

import java.io.*;

public class File_Functions {
    File file;
    String FileName;
    String FileAddress;
    //MainController Object
    MainController mainController;
    public File_Functions(MainController mainController){
        this.mainController=mainController;
    }
    public void New(){
    FileName=null;
    FileAddress=null;
    mainController.getStage().setTitle("Untitled");
    mainController.textArea.setText("");
    }
    public void Open() throws IOException {
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("Open a file");
        File file=fileChooser.showOpenDialog(mainController.getStage());
        if(file!=null){
            this.file=file;
        FileName=file.getName();
        FileAddress=file.getPath();
        mainController.getStage().setTitle(FileName);
            BufferedReader br= new BufferedReader(new FileReader(file));
            String str;
            while((str=br.readLine())!=null){
                mainController.textArea.appendText(str);
            }
        }
    }
    public void Save() throws IOException {
        if(FileName==null || FileAddress==null){
            SaveAs();
        }else{
            FileWriter();
        }
    }
    public void SaveAs() throws IOException {
    FileChooser fileChooser=new FileChooser();
    fileChooser.setTitle("Save File");
    File file=fileChooser.showSaveDialog(mainController.getStage());
    if(file!=null){
        this.file=file;
        FileName=file.getName();
        FileAddress=file.getPath();
        mainController.getStage().setTitle(FileName);
        FileWriter();
    }
    }
    private void FileWriter() throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        System.out.println("hello world");
        fileWriter.append(mainController.textArea.getText());
        fileWriter.close();
    }
    public void Exit(){
        mainController.getStage().close();
    }
}
