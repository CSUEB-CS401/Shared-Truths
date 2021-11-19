package edu.csueastbay.cs401.vnguyen1;

import edu.csueastbay.cs401.vnguyen.Truth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {
    private Truth viTruth1;

    @FXML
    private Label displayLabel1;

    @FXML
    void reveal1(ActionEvent event) {
        displayLabel1.setText(viTruth1.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viTruth1 = new Truth("Favorite color?", "blue");
        displayLabel1.setText(viTruth1.getQuestion());
    }
}
