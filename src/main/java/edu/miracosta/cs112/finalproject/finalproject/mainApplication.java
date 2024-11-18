package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainApplication {
    enemy enemy = new enemy();
    player player = new player();

    public static class mainApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(edu.miracosta.cs112.finalproject.finalproject.HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
