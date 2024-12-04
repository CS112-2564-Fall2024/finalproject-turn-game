package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;

public class winController {
    @FXML
    Label youWin = new Label();
    @FXML
    Label youStillSuck = new Label();
    @FXML
    ImageView winImage = new ImageView();

    public void initialize(){

        URL Imo = mainApplication.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/enemyAttacj.jpg");
        System.out.println("Image URL: " + Imo);
        assert Imo != null;
        winImage.setImage(new Image(Imo.toString()));
    }
}
