package edu.csueastbay.cs401.lbernard;

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

    private LucasTruth truth1;
    private LucasTruth truth2;

    @FXML
    private Label displayLabel;

    @FXML
    private Label displayLabel2;

    @FXML
    private Button revealButton;

    @FXML
    private Button revealButton2;

    @FXML
    void reveal(ActionEvent event) {
        displayLabel.setText(truth1.getAnswer());
    }

    @FXML
    void reveal2(ActionEvent event) {
        displayLabel2.setText(truth2.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth1 = new LucasTruth("Sport practiced?", "Judo");
        displayLabel.setText(truth1.getQuestion());

        truth2 = new LucasTruth("Favorite food?", "Lasagna");
        displayLabel2.setText(truth2.getQuestion());
    }

}

