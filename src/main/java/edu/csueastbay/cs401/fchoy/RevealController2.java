package edu.csueastbay.cs401.fchoy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController2 implements Initializable {

    private FelixsTruth secondTruth;

    @FXML
    private Label displayLabel2;

    @FXML
    private Button revealButton2;

    @FXML
    public void reveal2(ActionEvent actionEvent) { //second button
        displayLabel2.setText(secondTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        secondTruth = new FelixsTruth("Favorite Color?", "Orange");
        displayLabel2.setText(secondTruth.getQuestion());
    }

}
