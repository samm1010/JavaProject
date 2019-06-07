package com.Game;

public class Location {


    private static boolean northDirection = false;
    private static boolean southDirection = false;
    private static boolean westDirection = false;
    private static boolean eastDirection = false;

    //sets up array for game world and descriptions

    private String[][] map = new String[5][5];

    public Location() {
        map[0][0] = "You have arrived at a vape shop";
        map[0][1] = "You have arrived at a victorian train station";
        map[0][2] = "You have arrived at an old Mcdonald's";
        map[0][3] = "You have arrived at a subway station";
        map[0][4] = "You have arrived at at a gym";
        map[1][0] = "You have arrived at a pier";
        map[1][1] = "You have arrived at the mall"; /*object 1 is here*/
        map[1][2] = "You have arrived at cliff by the sea";
        map[1][3] = "You have arrived at the Airport";
        map[1][4] = "You have arrived at a bus station";
        map[2][0] = "You have arrived at a football cage with zombies inside";
        map[2][1] = "You have arrived at a forest";
        map[2][2] = "You have arrived at Your home";
        map[2][3] = "You have arrived at a your street";
        map[2][4] = "You have arrived at the shops at the end of the road";
        map[3][0] = "You have arrived at a college";
        map[3][1] = "You have arrived at a office building";
        map[3][2] = "You have arrived at a motorway bridge";
        map[3][3] = "You have arrived at the hospital"; /*object 2 is here*/
        map[3][4] = "You have arrived at a strip club";
        map[4][0] = "You have arrived at a petrol station";
        map[4][1] = "You have arrived at a university";
        map[4][2] = "You have arrived at a game shop";
        map[4][3] = "You have arrived at a military base";
        map[4][4] = "You have arrived at the police station"; /* object 3 is here*/

    }
    public String getDescription(int x, int y) {
        return this.map[x][y];
    }




    public static boolean roomExists(int x, int y) {
        return (rowExists(x)) && (colExists(y));
    }

    public static boolean rowExists(int x) {
        return (x >= 0) && (x <= 4);
    }

    public static boolean colExists(int y) {
        return (y >= 0) && (y <= 4);
    }

    /*sets player x and y when player moves */
    public static void playerMovement(Player player) {
        northDirection = roomExists(player.getCurrX(), player.getCurrY() +
                1);
        southDirection = roomExists(player.getCurrX(), player.getCurrY() -
                1);
        eastDirection = roomExists(player.getCurrX() + 1,
                player.getCurrY());
        westDirection = roomExists(player.getCurrX() - 1,
                player.getCurrY());
        IO.movePlayer(player);

    }

    /*functions for returning whether option movement is viable*/
    public static boolean isNorthDirection() {
        return northDirection;
    }

    public static boolean isSouthDirection() {
        return southDirection;
    }

    public static boolean isWestDirection() {
        return westDirection;
    }

    public static boolean isEastDirection() {
        return eastDirection;
    }
}