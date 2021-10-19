package edu.csueastbay.cs401.praupach;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private PaulsTruth truth;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(truth.getAnswer());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth = new PaulsTruth("Favorite Color?", "Green");
        displayLabel.setText(truth.getQuestion());
    }
}
