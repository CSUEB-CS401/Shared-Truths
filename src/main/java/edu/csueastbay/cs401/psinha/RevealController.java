package edu.csueastbay.cs401.psinha;

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
        truth = new PyushTruth("dogs or cats?", "both");
        displayLabel.setText(truth.getQuestion());
    }
}
