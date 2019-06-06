package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Location Map;
    Location gameWorld = new Location();
    IO mainmenu = new IO();
    Player player = new Player("", 2, 2);
    public static final Scanner userInput = new Scanner(System.in);
    String Playerlocation;


    public static void main(String[] args) {

        new Main();

    }


    public Main() {
//        player.playerStart();
//        player.setName(Main.userInput.nextLine());
        player.setName(player.inputName());
        mainmenu.Welcome(player.getName());
        gameWorld.playerMovement(player);
        System.out.println(player.getCurrX());
        System.out.println(player.getCurrY());
        System.out.println(Playermovement(player.getCurrX(),player.getCurrY()));
        gameWorld.playerMovement(player);
        System.out.println(player.getCurrX());
        System.out.println(player.getCurrY());
        System.out.println(Playermovement(player.getCurrX(),player.getCurrY()));






    }

    public String Playermovement(int x, int y) {

        Playerlocation = gameWorld.getDescription(x, y);
        return Playerlocation;
    }
    }