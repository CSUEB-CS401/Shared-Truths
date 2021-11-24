package edu.csueastbay.cs401.vnguyen;

import edu.csueastbay.cs401.bsmith.BobsTruth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth viTruth;
    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(viTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viTruth = new Truth("Hometown", "Vietnam");
        displayLabel.setText(viTruth.getQuestion());
    }
}
