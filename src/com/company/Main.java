package com.company;

import java.util.Scanner;

public class Main {
    Player player = new Player();

    public static final Scanner userInput = new Scanner(System.in);




    public static void main(String[] args) {

        new Main();

    }


    public Main(){

        player.playerStart();
        Location.gameWorld();
        IO.Welcome();


    }
}
