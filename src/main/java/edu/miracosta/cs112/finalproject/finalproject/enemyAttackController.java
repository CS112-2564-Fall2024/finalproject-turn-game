package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class enemyAttackController {
    @FXML
    ImageView enemyAttackImage = new ImageView();
    @FXML
    Label attackYouText = new Label();
    Button Next = new Button();
    public void initialize(){

        URL Imo = mainApplication.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/enemyAttacj.jpg");
        System.out.println("Image URL: " + Imo);
        assert Imo != null;
        enemyAttackImage.setImage(new Image(Imo.toString()));
    }

    public void transition() throws IOException {
        //wait 3 seconds, then transition back to mainSceneController
        System.out.println("ENEMY ATTACK YOU NOW");
        Game.getPlayer().setHP(Game.getPlayer().getHP()-Game.getEnemy().attackStat);
        System.out.println("YO HP IS NOW: " + Game.getPlayer().getHP());
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("mainScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) attackYouText.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("FIGHT");
        stage.show();

    }



}
