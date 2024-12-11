package edu.miracosta.cs112.finalproject.finalproject;

public class Game {
    //model class. Core class.

    //Player and Enemy objects are made in the Game (core) class.
    //The Player and Enemy Objects will have their variables constantly change,
    //So, we can't have them declared multiple times.
    //If they were, any sort of change would be reverted with each scene change,
    //And no progression would occur.
    static Player player = new Player();
    static Enemy enemy = new Enemy();

    //Each scene will need to get the Player object and Enemy object.
    //So, getPlayer gets the player object.
    //and vice versa.

    //ImplementStuff is necessary for other classes to realize they can get data from here.

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
