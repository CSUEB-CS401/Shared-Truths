package edu.csueastbay.cs401.vnguyen2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth viTruth2;
    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(viTruth2.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viTruth2 = new Truth("Favorite color?", "Blue");
        displayLabel.setText(viTruth2.getQuestion());
    }
}
