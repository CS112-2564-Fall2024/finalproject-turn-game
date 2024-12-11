package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;

public class loseController {
    @FXML
    Label youLose = new Label();
    @FXML
    Label youSuck = new Label();
    @FXML
    ImageView loseImage = new ImageView();
    public void initialize(){

        URL Imo = mainApplication.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/loseImage.png");
        System.out.println("Image URL: " + Imo);
        assert Imo != null;
        loseImage.setImage(new Image(Imo.toString()));
    }
}
