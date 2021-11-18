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
    private Truth GuillerTruth2;

    @FXML
    private Button RevealButton;

    @FXML
    private Button RevealButton2;

    @FXML
    private Label displayLabel;

    @FXML
    private Label displayLabel2;

    @FXML
    void reveal(ActionEvent event)
    {
      displayLabel.setText(GuillerTruth.getAnswer());
    }

    @FXML
    void reveal_second_truth(ActionEvent event) { displayLabel2.setText(GuillerTruth2.getAnswer());}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        GuillerTruth = new Truth("HomeTown", "Hayward,CA");
        GuillerTruth2 = new Truth("Fav Food","Sushi");
        displayLabel.setText(GuillerTruth.getQuestion());
        displayLabel2.setText(GuillerTruth2.getQuestion());
    }
}

