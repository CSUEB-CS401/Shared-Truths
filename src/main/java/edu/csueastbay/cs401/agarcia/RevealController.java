package edu.csueastbay.cs401.agarcia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    // truth objects
    private Truth truth;
    private Truth truth2;

    // display labels variables
    @FXML
    private Label displayLable;

    @FXML
    private Label displayLable1;

    // when pressing these buttons it reveals an answer to the question
    @FXML
    void reveal1(ActionEvent event) {
        displayLable.setText(truth.getAnswer());
    }

    @FXML
    void reveal2(ActionEvent event) {
        displayLable1.setText(truth2.getAnswer());
    }

    // set truth object string values question / answers and display question in lable
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth = new Truth("One of my favorite shows?", "The Simpsons");
        displayLable.setText(truth.getQuestion());

        truth2 = new Truth("One of my favorite old PC games?", "The Oregon Trail");
        displayLable1.setText(truth2.getQuestion());
    }
}


