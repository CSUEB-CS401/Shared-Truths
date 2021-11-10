package edu.csueastbay.cs401.share;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class MainMenuController {

    @FXML
    private BorderPane baseBorderPane;
    @FXML
    private Label titleLabel;

    @FXML
    void studentButtonClick(ActionEvent event) {
        Button button = (Button)event.getTarget();
        titleLabel.setText(button.getText() + " is sharing");
        switch (button.getText()) {
            case "Paul Raupach" -> loadStudentPane("/edu/csueastbay/cs401/praupach/reveal.fxml");
            case "Bob Smith" -> loadStudentPane("/edu/csueastbay/cs401/bsmith/reveal.fxml");
            case "Vi Nguyen" -> loadStudentPane("/edu/csueastbay/cs401/vnguyen/reveal.fxml");
            case "Pyae Maung" -> loadStudentPane("/edu/csueastbay/cs401/pmaung/reveal.fxml");
            case "Katherine Hettick-Leir" -> loadStudentPane("/edu/csueastbay/cs401/khettickleir/reveal.fxml");
            case "Paul Sander" -> loadStudentPane("/edu/csueastbay/cs401/psander/reveal.fxml");
            case "Paul Sander 2" -> loadStudentPane("/edu/csueastbay/cs401/psander2/reveal.fxml");
            case "Joshua Rodriguez" -> loadStudentPane("/edu/csueastbay/cs401/jrodriguez/reveal.fxml");
            case "Joshua Rodriguez 2" -> loadStudentPane("/edu/csueastbay/cs401/jrodriguez2/reveal.fxml");
            case "Hanish Patel" -> loadStudentPane("/edu/csueastbay/cs401/hpatel/reveal.fxml");
            case "Ronan Lepee" -> loadStudentPane("/edu/csueastbay/cs401/rlepee/reveal.fxml");
            case "Jonathan Zepeda" -> loadStudentPane("/edu/csueastbay/cs401/jzepeda/reveal.fxml");
            case "Taylor Hansen" -> loadStudentPane("/edu/csueastbay/cs401/thansen/reveal.fxml");
            case "Matthew Jelonek" -> loadStudentPane("/edu/csueastbay/cs401/mjelonek/reveal.fxml");
            case "Lovejit Singh" -> loadStudentPane("/edu/csueastbay/cs401/LSingh/reveal.fxml");
            case "Kabir Dhillon" -> loadStudentPane("/edu/csueastbay/cs401/kdhillon/reveal.fxml");
            case "Sam Celli" -> loadStudentPane("/edu/csueastbay/cs401/scelli/reveal.fxml");
            case "Ngon Ly" -> loadStudentPane("/edu/csueastbay/cs401/nly/reveal.fxml");
            case "Eshaq Jamdar" -> loadStudentPane("/edu/csueastbay/cs401/ejamdar/reveal.fxml");
            case "Fnu Srishti" -> loadStudentPane("/edu/csueastbay/cs401/fsrishti/reveal.fxml");
            case "Dillon Lin" -> loadStudentPane("/edu/csueastbay/cs401/dlin/reveal.fxml");
            case "Guiller Gamata" -> loadStudentPane("/edu/csueastbay/cs401/ggamata/reveal.fxml");
            case "Lucas Bernard" -> loadStudentPane("/edu/csueastbay/cs401/lbernard/reveal.fxml");
            case "Paul Raye" -> loadStudentPane("/edu/csueastbay/cs401/praye/reveal.fxml");
            case "Ethan Ketell" -> loadStudentPane("/edu/csueastbay/cs401/eketell/reveal.fxml");
            case "Pyush Sinha" -> loadStudentPane("/edu/csueastbay/cs401/psinha/reveal.fxml");
            case "iPod" -> loadStudentPane("/edu/csueastbay/cs401/iPod/reveal.fxml");
            default -> System.out.println("huh?");
        }
    }

    private void loadStudentPane(String template) {

        try {
            Parent root;
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(template)));
            baseBorderPane.setCenter(root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
