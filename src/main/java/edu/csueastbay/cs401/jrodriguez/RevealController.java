package edu.csueastbay.cs401.jrodriguez;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth JoshuasTruth;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(JoshuasTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        JoshuasTruth = new Truth("Favorite League of Legends Champion?","Jhin");
        displayLabel.setText(JoshuasTruth.getQuestion());
    }

}
