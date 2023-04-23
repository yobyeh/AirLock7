package Structure;

import java.awt.Point;

public class Inventory {
//items..
//Map 18,3.. 
//Key 13,2..
//Wrench 8,0..
//Bolt 1,4..

HashTable table;

    public Inventory(){

        table = new HashTable(10);
        loadInventory();
    }

    private void loadInventory() {

        table.put(new Point(18, 3), "Map");
        table.put(new Point(13, 2), "Key");
        table.put(new Point(8, 0), "Wrench");
        table.put(new Point(1, 4), "Bolt");

    }

    public void getItem(Point itemPoint){

        Item item = table.search(itemPoint);
        item.has = true;
        
    }

    public Boolean hasItem(Point itemPoint){

        if(table.search(itemPoint) != null){

            return true;
        }else{
            return false;
        }
    }

    
}
