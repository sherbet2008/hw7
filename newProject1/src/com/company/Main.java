package com.company;

public class Main {


    public static void main(String[] args) {

         Magic  magic=new Magic(3,34,"Save life");
         Medic medic=new Medic(3,4,"Treat");
         Warrior warrior =new Warrior(55,33,"Defend");

            Hero heroes[]={magic,medic,warrior};

        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].applySuperAbility(heroes.toString());


        }









    }


}
