package edu.csueastbay.cs401.rlepee;

import edu.csueastbay.cs401.bsmith.BobsTruth;
import edu.csueastbay.cs401.praupach.PaulsTruth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth truth;

    @FXML
    private Label displayLabel;

    @FXML
    private Button revealButton;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(truth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth = new Truth("Favourite sport club?", "Paris Saint-Germain");
        displayLabel.setText(truth.getQuestion());
    }

}