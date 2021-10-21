package edu.csueastbay.cs401.ggamata;

import edu.csueastbay.cs401.praupach.PaulsTruth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth GuillerTruth;

    @FXML
    private Button RevealButton;

    @FXML
    private Label displayLabel;

    @FXML
    void reveal(ActionEvent event)
    {
      displayLabel.setText(GuillerTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        GuillerTruth = new Truth("HomeTown", "Hayward,CA");
        displayLabel.setText(GuillerTruth.getQuestion());
    }
}

