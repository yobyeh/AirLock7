/**
*This is our player class. This is the center of game:
*the player. Everything that happens in gameplay
*mechanically relates to this class.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Game;

//Imports
import java.awt.Point;
import Structure.HashTable;
import Structure.Inventory;


public class Player {

    //Instantiating player location and inventory
    private int xLocation;
    private int yLocation;
    private Inventory inventory;

    //Function to intialize player
    public Player(int x, int y){
        
        //Starting location setters
        xLocation = x;
        yLocation = y;

        //Intalizing inventory
        inventory = new Inventory();
        inventory.print();
    }

    //Checking for items by point on map
    public boolean has(Point itemPoint) {

        return inventory.hasItem(itemPoint);
    }

    //Player coordinate getters
    public int getX(){
        return xLocation;
    }

    public int getY(){
        return yLocation;
    }

    //Player coordinate setters
    public void setY(int y) {
        yLocation = y;
    }

    public void setX(int x) {
        xLocation = x;
    }

    //Getting player point
    public Point getPlayerPoint(){
        return new Point(xLocation, yLocation);
    }

    //Checking for items
    public boolean checkForItem(){
        if(inventory.search(getPlayerPoint()) && !inventory.alreadyHasItem(getPlayerPoint())){

            inventory.giveItem(getPlayerPoint());
            inventory.print();

            return true;
        }else{
            return false;
        }
    }
}
