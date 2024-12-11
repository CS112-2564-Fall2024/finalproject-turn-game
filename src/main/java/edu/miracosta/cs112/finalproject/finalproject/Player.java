package edu.miracosta.cs112.finalproject.finalproject;

public class Player extends gameCharacter{

    int MP = 100;

    Player(){
        attackStat = 5;
    }
    Magic magi = new Magic();
    public class Magic{
        public int handleMagic(int choice) {
            if (MP > 0) {
                if (choice == 1) {
                    System.out.println("FIRE");
                    MP -= 30;
                    return 20;
                }
                if (choice == 2) {
                    System.out.println("ATTACK UP");
                    MP -= 20;
                    return 10;
                }
                if (choice == 3) {
                    System.out.println("HEAL");
                    MP -= 10;
                    return 20;
                }
                if (choice == 4) {
                    System.out.println("LOSE");
                    MP -= 10;
                    return -1000;
                }


            }
            System.out.println("NO MP");
            return 1;

        }}

//a breakpoint can be used to stop code once it reaches a selected line.
    // this can be good if multiple objects are being made, when only one should be made.
    //Or, if an object is ever being made.
    //step over continues.
    //step into skips to a selected line.
    public int getMP(){
        return this.MP;
    }

    public int magic(int choice){
        return Game.getPlayer().magi.handleMagic(choice);


    }
    public void setMP(int mp){
        this.MP = mp;
    }
}
