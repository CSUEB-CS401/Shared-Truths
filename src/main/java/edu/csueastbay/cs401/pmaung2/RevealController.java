package edu.csueastbay.cs401.pmaung2;

master
import edu.csueastbay.cs401.pmaung.Truth;
master
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

master
    private Truth pyaeTruth;
    private edu.csueastbay.cs401.pmaung.Truth pyaeTruth;
master

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(pyaeTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pyaeTruth = new Truth("Favorite activity?", "Playing game!!!");
        displayLabel.setText(pyaeTruth.getQuestion());
    }
}