package edu.csueastbay.cs401.share;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShareApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ShareApplication.class.getResource("mainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sharing is caring!");
        stage.setScene(scene);
         stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}