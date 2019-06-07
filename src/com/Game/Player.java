package com.Game;

import Items.SuperItem;

public class Player {

    private String name;
    private int currX;
    private int currY;
    private int itemCount = 0;
    public SuperItem currentItem;

    public Player(String name, int startX, int startY) {
        this.name = name;
        this.currX = startX;
        this.currY = startY;
    }


    public String getName() {
        return this.name;
    }

    public int getCurrX() {
        return this.currX;
    }

    public int getCurrY() {
        return this.currY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String inputName() {
        System.out.print("Enter your name: ");
        return Main.userInput.nextLine();
    }


    public void setCurrX(int currX) {
        this.currX = currX;
    }

    public void setCurrY(int currY) {
        this.currY = currY;
    }
    public int itemCount() {
        return this.itemCount;
    }
    /*pickup item*/
    public void pickup(SuperItem item) {
        this.currentItem = item;
        this.currentItem.setItemEquipped(true);
    }
    /*drops item ONLY at home and adds to counter to know if all items have been collected*/

    public void drop() {
        this.itemCount++;
        this.currentItem.setX(this.getCurrX());
        this.currentItem.setY(this.getCurrY());
        this.currentItem.setItemEquipped(false);
        this.currentItem = null;
    }
}