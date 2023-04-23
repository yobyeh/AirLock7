package Game;

import java.awt.Point;

import Structure.HashTable;
import Structure.Inventory;

//todo: display text dosent repeat "YAY YOU PICKED THIS UP" every time.
//stores items in a hash table 


public class Player {

    //players current location 0s are smallest value not 1
    private int xLocation;
    private int yLocation;
    private Inventory inventory;

    //stores a hash table called inventory
    //HashTable inventory = new HashTable();

    //make player given starting location
    public Player(int x, int y){
        xLocation = x;
        yLocation = y;

        inventory = new Inventory();
    }

    //remembers picked up items 
    public void giveItem(Point itemPoint){
        inventory.getItem(itemPoint);
    }

    //checks for items by point
    public boolean has(Point itemPoint) {

        return inventory.hasItem(itemPoint);
    }

    public int getX(){
        return xLocation;
    }

    public int getY(){
        return yLocation;
    }

    public void setY(int y) {
        yLocation = y;
    }

    public void setX(int x) {
        xLocation = x;
    }

    public Point getPlayerPoint(){
        return new Point(xLocation, yLocation);
    }

}
