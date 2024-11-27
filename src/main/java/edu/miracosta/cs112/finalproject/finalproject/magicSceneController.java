package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

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

    public void handleFire(){
        Game.getEnemy().setHP(Game.getEnemy().getHP() - Game.getPlayer().magi.handleMagic(1));
    }
    public void handleAttackUp(){
        Game.getPlayer().setAttackStat(Game.getPlayer().magi.handleMagic(2));
    }
    public void handleHeal(){
        Game.getPlayer().setHP(Game.getPlayer().getHP() + Game.getPlayer().magi.handleMagic(3));
    }
    public void handleLose(){
        Game.getPlayer().setHP(Game.getPlayer().magi.handleMagic(4));
    }

}
