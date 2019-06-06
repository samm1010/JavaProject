package com.company;

import java.util.Scanner;

public class IO {

    Player player;

    //Method for delaying text

    private void textDelay(long a) {
        try {
            Thread.sleep(a);
        } catch (InterruptedException ex) {
        }
    }

    //Intro message

    public void Welcome(String pName) {


        //Welcome Message

        System.out.println("Welcome to Outbreak.");

        textDelay(2000);

        System.out.println("The initial outbreak occurred 5 years ago, within 16 months most of the worlds governments fell.");

        System.out.println("Being a doomsday prepper meant you were born for this moment, you have your shelter, stocked to the brim with supplies. You know you and your family will survive this. The others were fools for doubting you.");

        System.out.println("One day you find yourself working particularly hard, exercising, chopping firewood, looking after the kids. The day takes a hard toll on you, you decide to rest hoping you'll awake to feel rested in the morning.");

        System.out.println("You awake that morning to a banging at your door.");

        System.out.println(pName + " honey what do you think it is, your wife whispers.");

        System.out.println("I'm not sure you say, reaching for your shotgun. But I'm going to find out ");

        System.out.println(pName + " your daughter cries. But you can barely hear her, all you can think about is whats on the other side of that door");

        System.out.println("You return bruised and beaten, but victorious. You had managed to shoot both the looters dead. Your attention now turns to other matters, you scan the room and suddenly a horrifying though enters your head.");

        System.out.println("WHERES");

        System.out.println("MY");

        System.out.println("DAUGHTER?");

        System.out.println("You rush out the back exit of the shelter - the only way she could have gone.");

        System.out.println("There you see her, you rush over as quick as your aching, battered legs will take you. ");

        System.out.println("She's alive. You approach her as she starts to cry");

        System.out.println("Then you see it. A bite.");

        System.out.println("You've heard about a cure, made of commonly found drugs, a quick check of the medicine cabinet shows you are missing three items. There is no choice. You must venture out");

        System.out.println("Taking only a unsubstantial amount of food and a small firearm, you leave the comfort of your home on foot, kissing your wife as you leave.");


    }


    public static void movePlayer(Player player) {

        if (Location.isNorthDirection() == true) {
            System.out.println("North (n)\n");
        }
        if (Location.isSouthDirection() == true) {
            System.out.println("South (s)\n");
        }
        if (Location.isEastDirection() == true) {
            System.out.println("East (e)\n");
        }
        if (Location.isWestDirection() == true) {
            System.out.println("West (w)\n");


        }

        System.out.print("Where would you like to travel?: ");
        String selection = Main.userInput.nextLine();
        if (selection.equals("n") || selection.equals("N") && Location.isNorthDirection()) {
            player.setCurrY(player.getCurrY() + 1);
        } else if (selection.equals("s") || selection.equals("S") && Location.isSouthDirection()) {
            player.setCurrY(player.getCurrY() - 1);
        } else if (selection.equals("e") || selection.equals("E") && Location.isEastDirection()) {
            player.setCurrX(player.getCurrX() + 1);
        } else if (selection.equals("w") || selection.equals("W") && Location.isWestDirection()) {
            player.setCurrX(player.getCurrX() - 1);
        } else if (!selection.equals("w") || !selection.equals("W") || !selection.equals("s")|| !selection.equals("S") || !selection.equals("E")|| !selection.equals("e")|| !selection.equals("n")|| !selection.equals("N"))  {
            System.out.println("You have entered an incorrect value, please enter either N, S, W or E.");



        }

    }
}