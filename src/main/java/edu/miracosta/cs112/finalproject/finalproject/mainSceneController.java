package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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

    @FXML
    ImageView enemyImage = new ImageView("file:.src/main/resources/edu/miracosta/cs112/finalproject/finalproject/enemy.png");
    @FXML
    Button attackButton = new Button();
    @FXML
    Button magicButton = new Button();

    @FXML
    private void magicScene(){
        System.out.println("AWAAAGGGGAAA WBBHAHBAHBA");
        //TODO: transition to magic scene here.
    }
    @FXML
    private void playerAttack(){
        Game.getEnemy().setHP(Game.getEnemy().getHP() - Game.getPlayer().getAttackStat());
        System.out.println("AAATAACKKOOOOO");
        //TODO: transition to enemyAttackScene here.
    }
}
