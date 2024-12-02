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
import java.util.Objects;

public class mainSceneController {

    @FXML
    Label stringPlayerHP = new Label("Player.java HP:");
    @FXML
    Label stringEnemyHP = new Label("Enemy HP:");
    @FXML
    Label valuePlayerHP = new Label();

    @FXML
    Label valueEnemyHP = new Label();
    @FXML
    Label stringPlayerMP = new Label("MP: ");
    @FXML
    Label valueMP = new Label();
    Image enemyIm = new Image("file:./src/main/java/resources/enemy.jpg");
    @FXML
    ImageView enemyImage = new ImageView(enemyIm);

    @FXML
    Button attackButton = new Button();
    @FXML
    Button magicButton = new Button();

    @FXML
    private void magicScene() throws IOException {
        System.out.println("AWAAAGGGGAAA WBBHAHBAHBA");
        //alpha stuff
        if(Game.getPlayer().getMP() > 0){
            Game.getPlayer().setAttackStat(Game.getPlayer().getAttackStat() +5);
            Game.getPlayer().setMP(Game.getPlayer().getMP() -10);
            System.out.println("YA MP: " + Game.getPlayer().getHP());
            System.out.println("ATTACK UP");
            System.out.println("ENEM<Y ATTACKD");
            Game.getPlayer().setHP(Game.getPlayer().getHP()-Game.getEnemy().attackStat);
            System.out.println("YOUR HP" + Game.getPlayer().getHP());
        }
        else{
            System.out.println("NOT ENOGUH MAIGCO POITMNS");
            playerAttack();
        }
        //end alpha stuff

        //TODO: transition to magic scene here.
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("magicScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) magicButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("MAGIC");
        stage.show();
        //this transitions to the magic scene proper :D
    }
    @FXML
    private void playerAttack(){
        Game.getEnemy().setHP(Game.getEnemy().getHP() - Game.getPlayer().getAttackStat());
        System.out.println("AAATAACKKOOOOO");
        System.out.println("Enemy HP: " + Game.getEnemy().getHP());
        if(Game.getEnemy().getHP() <= 0){
            //TODO: transition to victoryScene
            System.out.println("YOU WIN SMARTFACE");
            //break(0);
        }
        //this is alpha stuff.
        System.out.println("ENEMY ATTACK YOU NOW");
        Game.getPlayer().setHP(Game.getPlayer().getHP()-Game.getEnemy().attackStat);
        System.out.println("YO HP IS NOW: " + Game.getPlayer().getHP());
        //TODO: transition to enemyAttackScene method call here.
    }

    //TODO: enemyAttackScene transition here.
}
