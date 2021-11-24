package edu.csueastbay.cs401.kdhillon2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth kabirsTruth2;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(kabirsTruth2.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        kabirsTruth2 = new Truth("Favorite artist", "Taylor Swift");
        displayLabel.setText(kabirsTruth2.getQuestion());
    }
}