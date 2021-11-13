package edu.csueastbay.cs401.psinha2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private PyushTruth truth;

    @FXML
    private Label displayLabel;
    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(truth.getAnswer());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth = new PyushTruth("Are you allergic to cats?", "lil bit :[ ...");
        displayLabel.setText(truth.getQuestion());
    }
}
