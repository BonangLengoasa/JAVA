package com.example.demo33;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class HelloController {
//delcaration
    @FXML
    private AnchorPane CONTROLER;

    @FXML
    private TextArea textArea1;

    @FXML
    private Button DONE1;

    @FXML
    private TextArea textArea2;

    @FXML
    private Button DONE2;

    @FXML
    private Button IMG;

    @FXML
    private Button RADIONBTN;

    @FXML
    private Button CHECKBOX;

    @FXML
    private Button SUBMIT;

    @FXML
    private AnchorPane PREVIEW;

    @FXML
    private TextArea HPREVIEW;
    @FXML
    private Label IMGP;

    @FXML
    private Text body;
    @FXML
    private ImageView OOO;
    @FXML
    private ImageView logos;
    @FXML
    private VBox hbox;

    @FXML
    private VBox hbox1;
    @FXML
    private VBox LGO;
    @FXML
    private Rectangle foot;
    @FXML
    private HBox Box;

    

    // header button confirming text
    public void b1(ActionEvent event) {

        String head;
        head= textArea1.getText();
        HPREVIEW.appendText(head);

    }
    //body button confirming body text
    public void b2(ActionEvent event) {
        String textbody;
        textbody=textArea2.getText();
        body.setText(String.valueOf(textbody));
    }
    //image display
    public void b3(ActionEvent event) {
        JFileChooser browseImageFile = new JFileChooser();

        FileNameExtensionFilter fenef =new FileNameExtensionFilter("IMAGES", "png", " jpeg", "jpg");
        browseImageFile.addChoosableFileFilter(fenef);

        //browsing for an image to display
        int showOpenDialogue =browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile=browseImageFile.getSelectedFile();
            String path =selectedImageFile.getAbsolutePath();
            //setting image to the variable
           Image ii =new Image(path);
            OOO.setImage(ii);
        }

    }

    public void b5(ActionEvent event) {

    }
    //radio button
    public void b6(ActionEvent event) {
        JRadioButton male = new JRadioButton("male");
        ButtonGroup bg = new ButtonGroup();

        bg.add(male);
        male.setSelected(true);
        hbox.snappedBottomInset();
    }

    public void b7(ActionEvent event) {
    }
    //displaying exit button
    public void b8(ActionEvent event) {
        Label buttonlabel=new Label();
    //creating button
        Button button =new Button("BUTTON");
        buttonlabel.setId("SUBMIT");
        Box.getChildren().addAll(button);
    }
    @FXML
    void LGO(ActionEvent event) {
        //creating path to get image
        JFileChooser browseImageFile = new JFileChooser();
//browse for logo image
        FileNameExtensionFilter fenef =new FileNameExtensionFilter("IMAGES", "png", " jpeg", "jpg");
        browseImageFile.addChoosableFileFilter(fenef);

        int showOpenDialogue =browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile=browseImageFile.getSelectedFile();
            String path =selectedImageFile.getAbsolutePath();
            //imgae display
            Image ii =new Image(path);
            logos.setImage(ii);
        }
    }
    //exit button from the controller to the preview
    public void EXIT(ActionEvent event) {
        Label buttonlabel=new Label();

        Button button =new Button("EXIT");

        buttonlabel.setId("SUBMIT");
        hbox.getChildren().addAll(button);
        //colorise button
        buttonlabel.setTextFill(Color.RED);
    }
    public void handleMouseDragged(MouseDragEvent){

    }
}