package edu.csueastbay.cs401.nlyy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth ngonsTruth;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(ngonsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ngonsTruth = new Truth("Favorite Quote", "It's About Drive. It's About Power. We Stay Hungry. We Devour.");
        displayLabel.setText(ngonsTruth.getQuestion());
    }

}

