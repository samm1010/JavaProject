package Items;

public class SuperItem {
    private String name;
    private int currX;
    private int currY;
    private boolean itemEquipped;
    private boolean itemAtHome = false;


    public int getX() {
        return this.currX;
    }
    public int getY() {
        return this.currY;
    }

    public void setX(int x) {
        this.currX += x;
    }
    public void setY(int y) {
        this.currY += y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getItemEquipped() {
        return this.itemEquipped;
    }
    public void setItemEquipped(boolean equipped) {
        this.itemEquipped = equipped;
        this.itemAtHome = true;
    }
}