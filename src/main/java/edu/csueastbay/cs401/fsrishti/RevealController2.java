package edu.csueastbay.cs401.fsrishti;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController2 implements Initializable {

    private Truth SrishtisTruth;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(SrishtisTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SrishtisTruth = new Truth("Favorite food?", "Pizza");
        displayLabel.setText(SrishtisTruth.getQuestion());
    }

}
