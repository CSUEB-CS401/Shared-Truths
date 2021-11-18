package edu.csueastbay.cs401.ttruong2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class revealController implements Initializable {

    private Truth TiffanysTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(TiffanysTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TiffanysTruth = new Truth("First pet's name:", "Peanut");
        displayLabel.setText(TiffanysTruth.getQuestion());
    }
}

