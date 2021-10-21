package edu.csueastbay.cs401.thansen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth taylorsTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(taylorsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        taylorsTruth = new Truth("Favorite number", "108");
        displayLabel.setText(taylorsTruth.getQuestion());
    }
}
