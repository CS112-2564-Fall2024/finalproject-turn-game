package edu.miracosta.cs112.finalproject.finalproject;

public class Enemy extends gameCharacter{

    int MP = 10;
   Enemy(){
       attackStat = 10;
   }
    @Override
    public int magic(int playerHP) {
        if(MP >0){
            playerHP -= 20;
        }
        else{
            playerHP -= 10;
        }
        return playerHP;

    }
    public int getMP(){
        return MP;
    }
}
