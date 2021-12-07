package edu.csueastbay.cs401.ggamata2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController implements Initializable {

    private Truth GuillerSecondTruth1;
    private Truth GuillerSecondTruth2;

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
      displayLabel.setText(GuillerSecondTruth1.getAnswer());
    }

    @FXML
    void reveal_second_truth(ActionEvent event) { displayLabel2.setText(GuillerSecondTruth2.getAnswer());}


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

        GuillerSecondTruth1 = new Truth("Fav Anime", "DBZ");
        GuillerSecondTruth2 = new Truth("Height","5'8");
        displayLabel.setText( GuillerSecondTruth1.getQuestion());
        displayLabel2.setText(GuillerSecondTruth2.getQuestion());
    }
}

