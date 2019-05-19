package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Location map = new Location();
    IO mainmenu = new IO();
    Player player = new Player("", 2, 2);
    public static final Scanner userInput = new Scanner(System.in);




    public static void main(String[] args) {

        new Main();

    }


    public Main(){
//        player.playerStart();
//        player.setName(Main.userInput.nextLine());
        player.setName(player.inputName());
        mainmenu.Welcome(player.getName());

        System.out.println(player.getName());
        System.out.print("X: " + player.getCurrX() +"Y: " + player.getCurrY());

        /*map.gameWorld(Player.getCurrX(),player.getCurrY());*/
/*
        IO.Welcome();
*/


    }
}
