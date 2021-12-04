package edu.csueastbay.cs401.rravi2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth rahulsTruth;
    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(rahulsTruth.getAnswer());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rahulsTruth = new Truth("Favorite food" , "Wings");
        displayLabel.setText(rahulsTruth.getQuestion());
    }
}

