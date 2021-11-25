package edu.csueastbay.cs401.mjelonek2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth mattsTruth;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event)  {
        displayLabel.setText(mattsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mattsTruth = new Truth("Favorite activity?", "Swimming");
        displayLabel.setText(mattsTruth.getQuestion());
    }
}
