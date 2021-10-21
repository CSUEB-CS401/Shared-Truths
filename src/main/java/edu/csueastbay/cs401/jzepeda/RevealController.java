package edu.csueastbay.cs401.jzepeda;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth jonathansTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(jonathansTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        jonathansTruth = new Truth("Home Town", "Martinez, CA");
        displayLabel.setText(jonathansTruth.getQuestion());
    }
}

