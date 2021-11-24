package edu.csueastbay.cs401.nly;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth ngonsTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(ngonsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ngonsTruth = new Truth("Home town", "Wylie, TX");
        displayLabel.setText(ngonsTruth.getQuestion());
    }
}

