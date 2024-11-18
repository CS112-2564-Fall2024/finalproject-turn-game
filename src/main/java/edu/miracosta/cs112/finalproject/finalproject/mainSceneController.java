package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class mainSceneController {

    Label stringPlayerHP = new Label("Player HP:");
    Label stringEnemyHP = new Label("Enemy HP:");
    Label valuePlayerHP = new Label();

    Label valueEnemyHP = new Label();
    Label stringPlayerMP = new Label("MP: ");
    Label valueMP = new Label();

    ImageView enemyImage = new ImageView();
    Button attackButton = new Button();
    Button magicButton = new Button();

    private void magicScene(){
        System.out.println("AWAAAGGGGAAA WBBHAHBAHBA");
        //TODO: transition to magic scene here.
    }
    private void playerAttack(){
        enemy.setHP(enemy.getHP() - player.getAttackStat());
        System.out.println("AAATAACKKOOOOO");
        //TODO: transition to enemyAttackScene here.
    }
}
