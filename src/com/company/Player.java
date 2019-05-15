package com.company;

public class Player {

    public String name;
    public int currX;
    public int currY;


    public void playerStart() {
        name = "sam";
        currX = 2;
        currY = 2;
        System.out.println(currX);

    }

}

/*
    private final String name;
    private final String description;
    private int currX;
    private int currY;
    private Room currRoom;

    public Player(String name, String description, int maxHitPoints,
                  int minDamage, int maxDamage, int defense, double critChance) {
        this.name = name;
        this.description = description;
        this.currX = 2;
        this.currY = 2;



    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getCurrX() {
        return currX;
    }

    public int getCurrY() {
        return currY;
    }


    public Room getCurrRoom() {
        return currRoom;
    }

    public void setCurrRoom(Room room) {
        currRoom = room;
    }

    public void setCurrX(int currX) {
        this.currX = currX;
    }

    public void setCurrY(int currY) {
        this.currY = currY;
    }
}
*/
