package edu.miracosta.cs112.finalproject.finalproject;

public class Game {
    //model class. Core class.
    static Player player = new Player();
    static Enemy enemy = new Enemy();

    public static void implementStuff() {
        enemy.setAttackStat(10);
    }
    public static Player getPlayer(){
        return player;

    }
    public static Enemy getEnemy(){
        return enemy;

    }
}
