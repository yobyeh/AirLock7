package Game;

import Structure.HashTable;

//todo: display text dosent repeat "YAY YOU PICKED THIS UP" every time.
//stores items in a hash table 


public class Player {

    //players current location 0s are smallest value not 1
    private int xLocation;
    private int yLocation;

    //stores a hash table called inventory
    //HashTable inventory = new HashTable();

    //make player given starting location
    public Player(int x, int y){
        xLocation = x;
        yLocation = y;
    }

    //remembers picked up items 
    public void giveItem(String s){
        //inventory.addItem("Item Name");
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




    
}