module edu.csueastbay.cs401.shareprep {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.csueastbay.cs401.share to javafx.fxml;
    opens edu.csueastbay.cs401.praupach to javafx.fxml;
    opens edu.csueastbay.cs401.bsmith to javafx.fxml;
    // Added to give permission to open up file
    opens edu.csueastbay.cs401.mjelonek to javafx.fxml;
    exports edu.csueastbay.cs401.share;
}