package edu.csueastbay.cs401.rravi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth rahulsTruth;
    private Truth secondTruth;
    @FXML
    private Label displayLabel;
    @FXML
    private Label displayLabel2;

    @FXML
    private Button revealButton;
    @FXML
    private Button revealButton2;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(rahulsTruth.getAnswer());
    }
    @FXML
    void reveal2(ActionEvent event) {
        displayLabel2.setText(secondTruth.getAnswer());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rahulsTruth = new Truth("Cereal or milk First?" , "Ew nah I don't eat cereal");
        displayLabel.setText(rahulsTruth.getQuestion());
        secondTruth = new Truth("Favorite color?" , "Black");
        displayLabel2.setText(secondTruth.getQuestion());
    }
}

