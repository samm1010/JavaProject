package com.company;

public class Location {

    private static boolean northDirection = false;
    private static boolean southDirection = false;
    private static boolean westDirection = false;
    private static boolean eastDirection = false;

    //sets up array for game world

    public static void gameWorld() {
        String[][] map = new String[5][5];
        map[0][0] = "You have arrived at ";
        map[0][1] = "You have arrived at the mall OBJECT 1 HERE";
        map[0][2] = "You have arrived at ";
        map[0][3] = "You have arrived at ";
        map[0][4] = "You have arrived at ";
        map[1][0] = "You have arrived at ";
        map[1][1] = "You have arrived at ";
        map[1][2] = "You have arrived at ";
        map[1][3] = "You have arrived at ";
        map[1][4] = "You have arrived at ";
        map[2][0] = "You have arrived at ";
        map[2][1] = "You have arrived at ";
        map[2][2] = "You have arrived at ";
        map[2][3] = "You have arrived at ";
        map[2][4] = "You have arrived at ";
        map[3][0] = "You have arrived at ";
        map[3][1] = "You have arrived at ";
        map[3][2] = "You have arrived at ";
        map[3][3] = "You have arrived at ";
        map[3][4] = "You have arrived at ";
        map[4][0] = "You have arrived at ";
        map[4][1] = "You have arrived at the hospital OBJECT 2 HERE";
        map[4][2] = "You have arrived at ";
        map[4][3] = "You have arrived at ";
        map[4][4] = "You have arrived at the police station OBJECT 3 HERE";
        System.out.println(map[0][1]);
      /*  player.setCurrRoom(map[2][2]);*/

    }
    public boolean roomExists(int x, int y) {
        return (rowExists(x)) && (colExists(y));
    }

    public boolean rowExists(int x) {
        return (x >= 0) && (x <= 4);
    }

    public boolean colExists(int y) {
        return (y >= 0) && (y <= 4);
    }

    public void playerMovement(Player player) {
        northDirection = roomExists(player.getCurrX(), player.getCurrY()
                + 1);
        southDirection = roomExists(player.getCurrX(), player.getCurrY()
                - 1);
        eastDirection = roomExists(player.getCurrX() + 1,
                player.getCurrY());
        westDirection = roomExists(player.getCurrX() - 1,
                player.getCurrY());
        IO.movePlayer(player);

    }


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





