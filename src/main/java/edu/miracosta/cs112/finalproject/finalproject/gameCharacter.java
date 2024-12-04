package edu.miracosta.cs112.finalproject.finalproject;

 abstract class gameCharacter {
     int HPstat = 100;
     int attackStat;
     gameCharacter() {

     }
    public void setHP(int Hpstat){
         this.HPstat = Hpstat;

    }
    public int getHP(){
        return this.HPstat;
    }
    public int getAttackStat(){
        return this.attackStat;

    }
    public void setAttackStat(int attackStat){
         this.attackStat = attackStat;

    }
    public abstract int magic(int HP);
    public abstract int getMP();



}
