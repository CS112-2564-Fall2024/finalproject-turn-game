package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
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
import java.util.Objects;

public class mainSceneController {
    //start by initilizing all variables.
    //Anything that has "value" in the name will be changed overtime.
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
    ImageView enemyImage = new ImageView();

    @FXML
    Button attackButton = new Button();
    @FXML
    Button magicButton = new Button();


    //Each time the scene is loaded, the user needs to see how the enemy's HP, how the player's HP, and how the player's mana has changed.
    public void initialize() throws IOException {
        valuePlayerHP.setText(" " + Game.getPlayer().getHP());
        valueMP.setText(" " + Game.getPlayer().getMP());
        valueEnemyHP.setText(" " + Game.getEnemy().getHP());
        //this sets the image. Rather jank, I dislike it, but it's pretty much the fastest way to update the image.
        //Ima will hold the URL of the image.
        URL Ima = mainApplication.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/enemy.png");
        System.out.println("Image URL: " + Ima);
        //Have to remind the program that the Ima is not null.
        //Ima then gives the URL to enemyImage, allowing the ImageView to properly display the image.
        assert Ima != null;
        enemyImage.setImage(new Image(Ima.toString()));

    }
    @FXML
            // if the player clicks on the magic button, this method is run.
    private void magicScene() throws IOException, wrongSceneException {
        //checkCondition will check to see if the player's or the enemy's HP is zero, then transition to the proper scenes.
        //Funnily enough, this can be used in initilize.
        checkCondition();

        //checks the MP value of Player.
        //MP is used as a "currency" for magic. the player can decrease their MP value, and in exchange, use "spells" that will affect Player and Enemy values, and change the User experience.
        if(Game.getPlayer().getMP() > 0){
            FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("magicScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) magicButton.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("MAGIC");
            stage.show();

        }
        else{
            System.out.println("NOT ENOGUH MAIGCO POITMNS");
            playerAttack();
        }

    }
    @FXML
    //this is run if the player presses the attack button.
    private void playerAttack() throws IOException, wrongSceneException {
        //checkCondition will check to see if the player's or the enemy's HP is zero, then transition to the proper scenes.
        //Funnily enough, this can be used in initilize.
        checkCondition();
        //this changes the HP variable of the Enemy object. Enemy HP is decreased by the Player's attackStat.
        Game.getEnemy().setHP(Game.getEnemy().getHP() - Game.getPlayer().getAttackStat());
        //Afterwords, transition to the enemyAttackScene.
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("enemyAttackScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) enemyImage.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("ENEMY ATTACK");
        stage.show();

    }
    //each time the magicScene or playerAttack method is run, checkCondition method is run.
    //this checks for two conditons in this order: if the Enemy's HP is zero or below, or if the Player's HP is zero.
    //the reason for this order is to provide favor for the player.

    public void checkCondition() throws wrongSceneException, IOException {
        //if the Enemy's HP is zero, then transition to the win screen.
        if (Game.getEnemy().getHP() <= 0) {
            System.out.println("YOU WIN SMARTFACE");
            //break(0);
            FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("winScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) stringPlayerHP.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("WIN");
            stage.show();
            stage.setMaximized(false);
            stage.setMaximized(true);

        }
        //if the Player's HP is zero, then transition to the lose screen.
        if (Game.getPlayer().getHP() <= 0) {
            if(Game.getEnemy().getHP() <= 0){
                //custom exception.
                //The enemy object having zero HP SHOULD be prioritized.
                throw new wrongSceneException("Should be win screen");
            }
            System.out.println("YOU SUCK, LOSE");
            FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("loseScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) stringPlayerHP.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("LOSE");
            stage.show();
            stage.setMaximized(false);
            stage.setMaximized(true);

        }
    }


}
