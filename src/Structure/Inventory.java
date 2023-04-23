/**
*This is the user inventory class. Here we get,
*set, search, and add key items in gameplay to
*the inventory with use of the HashTable class.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Structure;

//Import(s)
import java.awt.Point;


public class Inventory{
//items..
//Map 18,3.. 
//Key Card 14,2..
//Wrench 7,0..
//Bolt 1,4..

HashTable table;

    //Initilizing inventory
    public Inventory(){

        table = new HashTable(10);
        loadInventory();
    }

    //Loading inventory
    private void loadInventory() {

        table.put(new Point(18, 3), "Map");
        table.put(new Point(14, 2), "Key Card");
        table.put(new Point(7, 0), "Wrench");
        table.put(new Point(1, 4), "Bolt");
    }

    //Item getters
    public void giveItem(Point itemPoint){

        Item item = table.search(itemPoint);
        item.has = true;    
    }

    //Checking if user has item
    public Boolean hasItem(Point itemPoint){

        if(table.search(itemPoint) == null){
            System.out.println("Error 1");
            return false;
        }
        
        else{
            return table.search(itemPoint).has;
        }
    }

    //Printing invetory
    public void print(){
        
        table.print();
    }

    //Searching for items
    public boolean search(Point p) {
        
        if(table.search(p) != null){
            return true;
        }
        
        else{
            return false;
        }
    }

    //Searching for items
    public boolean alreadyHasItem(Point p) {
        
        if(table.search(p) != null && table.search(p).has){
            return true;
        }
        
        else{
            return false;
        }
    }


}
