module edu.csueastbay.cs401.shareprep {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.csueastbay.cs401.share to javafx.fxml;
    opens edu.csueastbay.cs401.praupach to javafx.fxml;
    opens edu.csueastbay.cs401.bsmith to javafx.fxml;

    opens edu.csueastbay.cs401.kdhillon to javafx.fxml;

    opens edu.csueastbay.cs401.scelli to javafx.fxml;
    opens edu.csueastbay.cs401.nly to javafx.fxml;
    opens edu.csueastbay.cs401.ejamdar to javafx.fxml;
    opens edu.csueastbay.cs401.fsrishti to javafx.fxml;
    opens edu.csueastbay.cs401.dlin to javafx.fxml;
    opens edu.csueastbay.cs401.ggamata to javafx.fxml;
    opens edu.csueastbay.cs401.lbernard to javafx.fxml;
    opens edu.csueastbay.cs401.praye to javafx.fxml;
    opens edu.csueastbay.cs401.eketell to javafx.fxml;

    exports edu.csueastbay.cs401.share;
}