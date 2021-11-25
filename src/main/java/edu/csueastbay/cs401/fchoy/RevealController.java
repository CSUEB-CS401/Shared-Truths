package edu.csueastbay.cs401.fchoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private FelixsTruth felixsTruth;
    private FelixsTruth secondTruth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) { //first button
        displayLabel.setText(felixsTruth.getAnswer()); //replaces label text w/ answer after button press
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        felixsTruth = new FelixsTruth("Hometown?", "Sunnyvale");
        displayLabel.setText(felixsTruth.getQuestion());

    }
}
