package com.company;

import java.util.Scanner;

public class IO {

    //Method for delaying text

    private static void textDelay(long a) {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException ex)
        {
        }
    }


    //Intro message

    public static void Welcome() {
        //system objects
        Scanner userInput = new Scanner(System.in);

        //Welcome Message

        System.out.println("Welcome to Outbreak.");

        textDelay(2000);

        System.out.println("The initial outbreak occurred 5 years ago, within 16 months most of the worlds governments fell.");

        System.out.println("Being a doomsday prepper meant you were born for this moment, you have your shelter, stocked to the brim with supplies. You know you and your family will survive this. The others were fools for doubting you.");

        System.out.println("One day you find yourself working particularly hard, exercising, chopping firewood, looking after the kids. The day takes a hard toll on you, you decide to rest hoping you'll awake to feel rested in the morning.");

        System.out.println("You awake that morning to a banging at your door.");

        System.out.print("Enter your name: ");

        String pName = userInput.nextLine();

        System.out.println(pName +" honey what do you think it is, your wife whispers.");

        System.out.println("I'm not sure you say, reaching for your shotgun. But I'm going to find out ");

        System.out.println(pName +" your daughter cries. But you can barely hear her, all you can think about is whats on the other side of that door");

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


        //System.out.println("Your adventure awaits " + pName + "!");
    }

    public static void movePlayer(Player player) {

        if (Dungeon.isNorthDirection() == true) {
            System.out.println("North (n)\n");
        }
        if (Dungeon.isSouthDirection() == true) {
            System.out.println("South (s)\n");
        }
        if (Dungeon.isEastDirection() == true) {
            System.out.println("East (e)\n");
        }
        if (Dungeon.isWestDirection() == true) {
            System.out.println("West (w)\n");
        }

        System.out.print("Where would you like to travel?: ");
        String selection = ProjectMoria.USERINPUT.nextLine();
        if (selection.equals("n") && Dungeon.isNorthDirection()) {
            player.setCurrY(player.getCurrY() + 1);
        } else if (selection.equals("s") && Dungeon.isSouthDirection()) {
            player.setCurrY(player.getCurrY() - 1);
        } else if (selection.equals("e") && Dungeon.isEastDirection()) {
            player.setCurrX(player.getCurrX() + 1);
        } else if (selection.equals("w") && Dungeon.isWestDirection()) {
            player.setCurrX(player.getCurrX() - 1);
        }

    }


    }
