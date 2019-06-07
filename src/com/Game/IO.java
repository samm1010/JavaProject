package com.Game;

import Items.SuperItem;

public class IO {

    //Method for delaying text

    private void textDelay(long a) {
        try {
            Thread.sleep(a);
        } catch (InterruptedException ex) {}
    }

    //Intro message

    public void Welcome(String pName) {


        //Welcome Message

        System.out.println("Welcome to Outbreak.");

        textDelay(4000);

        System.out.println("The initial outbreak occurred 5 years ago, within 16 months most of the worlds governments fell.");

        textDelay(4000);

        System.out.println("Being a doomsday prepper meant you were born for this moment, you have your shelter, stocked to the brim with supplies. You know you and your family will survive this. The others were fools for doubting you.");

        textDelay(7000);

        System.out.println("One day you find yourself working particularly hard, exercising, chopping firewood, looking after the kids. The day takes a hard toll on you, you decide to rest hoping you'll awake to feel rested in the morning.");

        textDelay(7000);

        System.out.println("You awake that morning to a banging at your door.");

        textDelay(4000);

        System.out.println(pName + ", honey, what do you think it is, your wife whispers.");

        textDelay(4000);

        System.out.println("I'm not sure you say, reaching for your shotgun. But I'm going to find out ");

        textDelay(4000);

        System.out.println(pName + " your daughter cries. But you can barely hear her, all you can think about is whats on the other side of that door");

        textDelay(4000);

        System.out.println("You return bruised and beaten, but victorious. You had managed to shoot both the looters dead. Your attention now turns to other matters, you scan the room and suddenly a horrifying though enters your head.");

        textDelay(7000);

        System.out.println("WHERES");

        textDelay(1000);

        System.out.println("MY");

        textDelay(1000);

        System.out.println("DAUGHTER?");

        textDelay(4000);

        System.out.println("You rush out the back exit of the shelter - the only way she could have gone.");

        textDelay(4000);

        System.out.println("There you see her, you rush over as quick as your aching, battered legs will take you. ");

        textDelay(4000);

        System.out.println("She's alive. You approach her as she starts to cry");

        textDelay(4000);

        System.out.println("Then you see it. A bite.");

        textDelay(4000);

        System.out.println("You've heard about a cure, made of commonly found drugs, a quick check of the medicine cabinet shows you are missing three items. There is no choice. You must venture out");

        textDelay(7000);

        System.out.println("Taking only a unsubstantial amount of food and a small firearm, you leave the comfort of your home on foot, kissing your wife as you leave.");

        textDelay(7000);

        System.out.println("You must go out and find the three items needed to assemble a vaccine, but your carrying space is limited, you must return each item home before you can pick up another.");

        textDelay(5000);

    }
    /*main game logic, checks if player can move in direction*/

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

        /*take user input and change x and y coords*/
        System.out.print("Where would you like to travel?: ");
        String selection = Main.userInput.nextLine();
        if ((selection.equals("n") || selection.equals("N")) && Location.isNorthDirection()) {
            player.setCurrY(player.getCurrY() + 1);
        } else if ((selection.equals("s") || selection.equals("S")) && Location.isSouthDirection()) {
            player.setCurrY(player.getCurrY() - 1);
        } else if ((selection.equals("e") || selection.equals("E")) && Location.isEastDirection()) {
            player.setCurrX(player.getCurrX() + 1);
        } else if ((selection.equals("w") || selection.equals("W")) && Location.isWestDirection()) {
            player.setCurrX(player.getCurrX() - 1);
        } else if ((!selection.equals("w") || !selection.equals("W")) || !selection.equals("s") || !selection.equals("S") || !selection.equals("E") || !selection.equals("e") || !selection.equals("n") || !selection.equals("N")) {
            System.out.println("You have entered an incorrect value, please enter either N, S, W or E. Or move in a valid direction.");
        }

        System.out.println(Main.Playermovement(player.getCurrX(), player.getCurrY()));
        /*logic for dropping off item at home*/
        if (player.getCurrX() == 2 && player.getCurrY() == 2) {
            if (player.currentItem != null) {
                System.out.println("You have a arrived home, would you like to drop off your item?");
                System.out.println("Yes (Y) or No (N)");
                selection = Main.userInput.nextLine();
                if (selection.equals("y") || selection.equals("Y")) {
                    System.out.println("You have dropped " + player.currentItem.getName() + " at home, go and collect the other item/s");
                    player.drop();
                } else if (selection.equals("N") || selection.equals("N")) {
                    // Do Nothing
                } else
                    System.out.println("Invalid Input");

            }
            /*logic for checking item x,y values against player x,y values*/
        } else {
            if (player.currentItem == null) {
                if (player.getCurrX() == Main.vial.getX() && player.getCurrY() == Main.vial.getY()) {
                    System.out.println("in one of the shops you spot a small Vial, would you like to pick it up?");
                    promptPickup(player, Main.vial);
                } else if (player.getCurrX() == Main.recipe.getX() && player.getCurrY() == Main.recipe.getY()) {
                    System.out.println("on the reception desk you find a recipe for concocting the vaccine");
                    promptPickup(player, Main.recipe);
                } else if (player.getCurrX() == Main.medicine.getX() && player.getCurrY() == Main.medicine.getY()) {
                    System.out.println("In one of the cells you spot the medicine needed to make the vaccine");
                    promptPickup(player, Main.medicine);
                }
            }
        }
        if (player.itemCount() == 3) {
            System.out.println("Well done, you collected all three items to make the vaccine. Unfortunately, you were not in time and your daughter lays dead, for a moment....");
        } else Location.playerMovement(player);
    }
    /*function to prompt a pickup and assign the correct variables*/
    public static void promptPickup(Player player, SuperItem item) {
        System.out.println("Would you Like to pick up the object?");
        System.out.println("Yes (Y) or No (N)?");
        String selection = Main.userInput.nextLine();
        if (selection.equals("y") || selection.equals("Y")) {
            player.pickup(item);
            System.out.println("You picked up " + player.currentItem.getName());
        } else if (selection.equals("N") || selection.equals("N")) {
            // Do Nothing
        } else
            System.out.println("Invalid Input");
    }

}