package edu.csueastbay.cs401.ejamdar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable{

    private Truth EshaqTruth;
    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(EshaqTruth.getAnswer());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        EshaqTruth = new Truth ("What is your favorite GTA?", "GTA III");
        displayLabel.setText(EshaqTruth.getQuestion());
    }
}
