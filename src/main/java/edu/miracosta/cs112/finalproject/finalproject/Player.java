package edu.miracosta.cs112.finalproject.finalproject;

public class Player extends gameCharacter{

    int MP = 100;
    Magic magi = new Magic();
    public class Magic{
        public int handleMagic(int choice) {
            if (MP > 0) {
                if (choice == 1) {
                    System.out.println("FIRE");
                    return 20;
                }
                if (choice == 2) {
                    System.out.println("ATTACK UP");
                    return 10;
                }
                if (choice == 3) {
                    System.out.println("HEAL");
                    return 20;
                }
                if (choice == 4) {
                    System.out.println("LOSE");
                    return -1000;
                }


            }
            System.out.println("NO MP");
            return 0;

        }}


    public int getMP(){
        return this.MP;
    }

    public int magic(int choice){
        return Game.getPlayer().magi.handleMagic(choice);


    }
}
