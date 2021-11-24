package edu.csueastbay.cs401.dlin2;

import edu.csueastbay.cs401.dlin2.DillonsTruth2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RevealController2 implements Initializable {

    private DillonsTruth2 truth2;

    @FXML
    private Label displayLabel2;

    @FXML
    private Button reveal2;

    @FXML
    void reveal2(ActionEvent event) {
        displayLabel2.setText(truth2.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        truth2 = new DillonsTruth2("Favorite Animal?", "Tiger");
        displayLabel2.setText(truth2.getQuestion());
    }
}
