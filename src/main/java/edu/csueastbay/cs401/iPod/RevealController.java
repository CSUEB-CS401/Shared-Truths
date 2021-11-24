package edu.csueastbay.cs401.iPod;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth iPodTruth;
    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(iPodTruth.getAnswer());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        iPodTruth = new Truth("When was I first released?", "2001");
        displayLabel.setText(iPodTruth.getQuestion());
    }
}
