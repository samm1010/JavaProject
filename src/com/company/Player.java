package com.company;

public class Player {

    private String name;
    private int currX;
    private int currY;

    public Player(String name, int startX, int startY){
        this.name = name;
        this.currX = startX;
        this.currY = startY;
    }


        public String getName(){
        return this.name;
    }

        public int getCurrX () {
            return this.currX;
        }

        public int getCurrY () {
            return this.currY;
        }

        public void setName(String name){
        this.name = name;
        }

        public String inputName(){
        System.out.print("Enter your name: ");
        return Main.userInput.nextLine();
        }


        public void setCurrX (int currX) {
            this.currX = currX;
        }

        public void setCurrY (int currY){
          this.currY = currY;
       }
    }


