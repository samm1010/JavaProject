package com.Game;


import Items.*;

import java.util.Scanner;

public class Main {
    /*initialing variables */
    public static Location gameWorld = new Location();
    IO mainmenu = new IO();
    Player player = new Player("", 2, 2);
    public static SuperItem vial, recipe, medicine;
    public static final Scanner userInput = new Scanner(System.in);
    public static String Playerlocation;


    public static void main(String[] args) {

        new Main();

    }


    public Main() {
        /*sets name creates items and calls main game logic*/
        player.setName(player.inputName());
        vial = new Items_Vial();
        recipe = new Items_Recipe();
        medicine = new Items_Medicine();
        mainmenu.Welcome(player.getName());
        gameWorld.playerMovement(player);









    }

    /*function to return player location from array*/

    public static String Playermovement(int x, int y) {

        Playerlocation = gameWorld.getDescription(x, y);
        return Playerlocation;
    }


}