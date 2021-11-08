package edu.csueastbay.cs401.dlin;

import edu.csueastbay.cs401.praupach.PaulsTruth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private DillonsTruth truth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button reveal;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(truth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth = new DillonsTruth("Favorite Color?", "Black");
        displayLabel.setText(truth.getQuestion());
    }
}

