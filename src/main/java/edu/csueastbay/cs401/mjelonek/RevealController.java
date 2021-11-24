package edu.csueastbay.cs401.mjelonek;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth mattsTruth;

    @FXML
    private TextField displayLabel;

    @FXML void reveal(ActionEvent event) {
        displayLabel.setText(mattsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mattsTruth = new Truth("Favorite genre?", "Fantasy");
        displayLabel.setText(mattsTruth.getQuestion());
    }
}
