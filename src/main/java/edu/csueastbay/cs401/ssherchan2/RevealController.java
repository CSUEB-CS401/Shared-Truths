package edu.csueastbay.cs401.ssherchan2;

import edu.csueastbay.cs401.ssherchan.Truth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth surajTruth;
    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButon;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(surajTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        surajTruth = new Truth("Favorite activity", "Hiking");
        displayLabel.setText(surajTruth.getQuestion());
    }

}