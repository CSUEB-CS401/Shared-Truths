package edu.csueastbay.cs401.LSingh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class revealController implements Initializable {

    private Truth LovejitsTruth;

    @FXML
    private AnchorPane displayLabel;

    @FXML
    private Label displaylabel;

    @FXML
    void reveal(ActionEvent event) {
          displaylabel.setText(LovejitsTruth.getAnswer());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LovejitsTruth = new Truth("Favorite Pet: ","A Dog");
        displaylabel.setText(LovejitsTruth.getQuestion());
    }
}
