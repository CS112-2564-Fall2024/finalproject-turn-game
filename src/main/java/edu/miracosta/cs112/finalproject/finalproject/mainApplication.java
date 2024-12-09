package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainApplication {
    Enemy enemy = new Enemy();
    Player player = new Player();

    public static class mainMethod extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("mainScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();

        }

        public static void main(String[] args) {
            launch();
        }
    }
}
