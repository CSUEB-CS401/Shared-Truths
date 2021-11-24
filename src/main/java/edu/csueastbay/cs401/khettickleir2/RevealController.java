package edu.csueastbay.cs401.khettickleir2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth katsTruth;

    @FXML
    private Label displayLabel;
    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(katsTruth.getAnswer());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        katsTruth = new Truth("Favorite Show", "Firefly!");
        displayLabel.setText(katsTruth.getQuestion());
    }
}