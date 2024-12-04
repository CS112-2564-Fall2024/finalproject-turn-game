package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class magicSceneController {
    @FXML
    Button fireButton = new Button();
    @FXML
    Button boostButton = new Button();
    @FXML
    Button healButton = new Button();
    @FXML
    Button loseButton = new Button();
    @FXML
    ImageView magicPhoto = new ImageView();

    public void handleFire() throws IOException {
        Game.getEnemy().setHP(Game.getEnemy().getHP() - Game.getPlayer().magi.handleMagic(1));
        System.out.println("ENEMY HP: " + Game.getEnemy().getHP());
        transition();
    }
    public void handleAttackUp() throws IOException {
        Game.getPlayer().setAttackStat(Game.getPlayer().getAttackStat() + Game.getPlayer().magi.handleMagic(2));
        transition();
    }
    public void handleHeal() throws IOException {
        Game.getPlayer().setHP(Game.getPlayer().getHP() + Game.getPlayer().magi.handleMagic(3));
        transition();
    }
    public void handleLose() throws IOException {
        Game.getPlayer().setHP(Game.getPlayer().magi.handleMagic(4));
        transition();
    }
    //TODO: once any method is run, transition to enemy attack.
    public void transition() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("enemyAttackScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) magicPhoto.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("ENEMY ATTACK");
        stage.show();
    }
}

