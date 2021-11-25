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
            case "Paul Raupach":
                System.out.println("p clicked");
                loadStudentPane("/edu/csueastbay/cs401/praupach/reveal.fxml");
                break;
                case "Chan Saeteurn":
                loadStudentPane("/edu/csueastbay/cs401/csaeteurn/reveal.fxml");
                break;
            case "Bob Smith":
                System.out.println("b clicked");
                loadStudentPane("/edu/csueastbay/cs401/bsmith/reveal.fxml");
                break;
            case "Martin Le":
                loadStudentPane("/edu/csueastbay/cs401/mle/reveal.fxml");
                break;
            case "Anthony Garcia":
                loadStudentPane("/edu/csueastbay/cs401/agarcia/reveal.fxml");
                break;
            case "Malik Eddy":
                System.out.println("m clicked");
                loadStudentPane("/edu/csueastbay/cs401/mEddy/reveal.fxml");
                break;
            case "Sasha Eddy":
                System.out.println("s clicked");
                loadStudentPane("/edu/csueastbay/cs401/sEddy/reveal.fxml");
                break;
            case "Vi Nguyen":
                loadStudentPane("/edu/csueastbay/cs401/vnguyen/reveal.fxml");
                break;
            case "Pyae Maung":
                loadStudentPane("/edu/csueastbay/cs401/pmaung/reveal.fxml");
                break;
            case "Pyae Maung 2":
                loadStudentPane("/edu/csueastbay/cs401/pmaung/reveal2.fxml");
                break;
            case "Katherine Hettick-Leir":
                loadStudentPane("/edu/csueastbay/cs401/khettickleir/reveal.fxml");
                break;
            case "Katherine Hettick-Leir 2":
                loadStudentPane("/edu/csueastbay/cs401/khettickleir2/reveal.fxml");
                break;
            case "Paul Sander":
                loadStudentPane("/edu/csueastbay/cs401/psander/reveal.fxml");
                break;
            case "Paul Sander 2":
                loadStudentPane("/edu/csueastbay/cs401/psander2/reveal.fxml");
                break;
            case "Hanish Patel":
                loadStudentPane("/edu/csueastbay/cs401/hpatel/reveal.fxml");
                break;
            case "Ronan Lepee":
                loadStudentPane("/edu/csueastbay/cs401/rlepee/reveal.fxml");
                break;
            case "Jonathan Zepeda":
                loadStudentPane("/edu/csueastbay/cs401/jzepeda/reveal.fxml");
                break;
            case "Jonathan Zepeda 2":
                loadStudentPane("/edu/csueastbay/cs401/jzepeda2/reveal.fxml");
                break;
            case "Taylor Hansen":
                loadStudentPane("/edu/csueastbay/cs401/thansen/reveal.fxml");
                break;
            case "Taylor Hansen 2":
                loadStudentPane("/edu/csueastbay/cs401/thansen2/reveal.fxml");
                break;
            case "Matthew Jelonek":
                loadStudentPane("/edu/csueastbay/cs401/mjelonek/reveal.fxml");
                break;
            case "Matthew Jelonek-2":
                loadStudentPane("/edu/csueastbay/cs401/mjelonek2/reveal.fxml");
                break;
            case "Lovejit Singh":
                loadStudentPane("/edu/csueastbay/cs401/LSingh/reveal.fxml");
                break;
            case "Kabir Dhillon":
                loadStudentPane("/edu/csueastbay/cs401/kdhillon/reveal.fxml");
                break;
            case "Kabir Dhillon 2":
                loadStudentPane("/edu/csueastbay/cs401/kdhillon2/reveal2.fxml");
                break;
            case "Sam Celli":
                loadStudentPane("/edu/csueastbay/cs401/scelli/reveal.fxml");
                break;
            case "Sam Celli Again":
                loadStudentPane("/edu/csueastbay/cs401/scelli2/reveal.fxml");
                break;
            case "Ngon Ly" :
                loadStudentPane("/edu/csueastbay/cs401/nly/reveal.fxml");
                break;
            case "Ngon Lyy":
                loadStudentPane("/edu/csueastbay/cs401/nlyy/reveal2.fxml");
                break;
            case "Eshaq Jamdar":
                loadStudentPane("/edu/csueastbay/cs401/ejamdar/reveal.fxml");
                break;
            case "Fnu Srishti":
                loadStudentPane("/edu/csueastbay/cs401/fsrishti/reveal.fxml");
                break;
            case "Srishti2":
                loadStudentPane("/edu/csueastbay/cs401/fsrishti/reveal2.fxml");
                break;
            case "Dillon Lin":
                loadStudentPane("/edu/csueastbay/cs401/dlin/reveal.fxml");
                break;
            case "Dillon Lin2":
                loadStudentPane("/edu/csueastbay/cs401/dlin2/reveal2.fxml");
                break;
            case "Guiller Gamata":
                loadStudentPane("/edu/csueastbay/cs401/ggamata/reveal.fxml");
                break;
            case "Lucas Bernard":
                loadStudentPane("/edu/csueastbay/cs401/lbernard/reveal.fxml");
                break;
            case "Paul Raye":
                loadStudentPane("/edu/csueastbay/cs401/praye/reveal.fxml");
                break;
            case "Ethan Ketell":
                loadStudentPane("/edu/csueastbay/cs401/eketell/reveal.fxml");
                break;
            case "Hanish Patel 2":
                loadStudentPane("/edu/csueastbay/cs401/hpatel2/reveal.fxml");
            case "Lovejit Singh - Button 2":
                loadStudentPane("/edu/csueastbay/cs401/singhLovejit/reveal.fxml");
                break;
            case "Ethan Ketell 2":
                loadStudentPane("/edu/csueastbay/cs401/eketell/reveal2.fxml");
                break;
            case "Pyush Sinha":
                loadStudentPane("/edu/csueastbay/cs401/psinha/reveal.fxml");
                break;
            case "Pyush Sinha 2":
                loadStudentPane("/edu/csueastbay/cs401/psinha2/reveal.fxml");
                break;
            case "iPod":
                loadStudentPane("/edu/csueastbay/cs401/iPod/reveal.fxml");
                break;
            case "Tiffany Truong":
                loadStudentPane("/edu/csueastbay/cs401/ttruong/reveal.fxml");
                break;
            case "Tiffany Truong 2":
                loadStudentPane("/edu/csueastbay/cs401/ttruong2/reveal.fxml");
                break;
            case "Rahul Ravi":
                loadStudentPane("/edu/csueastbay/cs401/rravi/reveal.fxml");
                break;
            case "Felix Choy":
                loadStudentPane("/edu/csueastbay/cs401/fchoy/reveal.fxml");
                break;
            case "Felix Choy2":
                loadStudentPane("/edu/csueastbay/cs401/fchoy2/reveal2.fxml");
                break;
            case "Joshua Rodriguez":
              loadStudentPane("/edu/csueastbay/cs401/jrodriguez/reveal.fxml");
              break;
            case "Joshua Rodriguez 2":
              loadStudentPane("/edu/csueastbay/cs401/jrodriguez2/reveal.fxml");
              break;
            default:
                 System.out.println("huh?");

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
