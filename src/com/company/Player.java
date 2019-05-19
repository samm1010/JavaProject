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

//    public void setName (String Name) {
//        this.name = Name;
//    }

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
        System.out.print("\nEnter your name: ");
        return Main.userInput.nextLine();



        }


/*        public Room getCurrRoom () {
            return currRoom;
        }

        public void setCurrRoom (Room room){
            currRoom = room;
        }*/

//        public void setCurrX ( int currX){
//            this.currX = currX;
//        }
//
//        public void setCurrY ( int currY){
//            this.currY = currY;
//        }
    }



/*

    public void playerStart() {
        name = "sam";
        currX = 2;
        currY = 2;
        *//*System.out.println(currX);*//*

    }

    public int getCurrX() {
        return currX;
    }

    public int getCurrY() {
        return currY;
    }
}*/