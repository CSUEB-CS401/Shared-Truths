package edu.csueastbay.cs401.ttruong;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class revealController implements Initializable {

    private Truth TiffsTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(TiffsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TiffsTruth = new Truth("Favorite drink:", "Matcha latte");
        displayLabel.setText(TiffsTruth.getQuestion());
    }
}

