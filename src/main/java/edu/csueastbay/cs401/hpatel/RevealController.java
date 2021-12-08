package edu.csueastbay.cs401.hpatel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

        private Truth hanishsTruth;

        @FXML
        private Label displayLabel;

        @FXML
        private Button revealButton;

        @FXML
        void reveal(ActionEvent event) {
            displayLabel.setText(hanishsTruth.getAnswer());
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            hanishsTruth=new Truth("Where I was born:","Mountain View");
            displayLabel.setText(hanishsTruth.getQuestion());

    }
}
