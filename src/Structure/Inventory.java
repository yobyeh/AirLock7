package Structure;

import java.awt.Point;

public class Inventory {
//items..
//Map 18,3.. 
//Key Card 14,2..
//Wrench 7,0..
//Bolt 1,4..

HashTable table;

    public Inventory(){

        table = new HashTable(10);
        loadInventory();
    }

    private void loadInventory() {

        table.put(new Point(18, 3), "Map");
        table.put(new Point(14, 2), "Key Card");
        table.put(new Point(7, 0), "Wrench");
        table.put(new Point(1, 4), "Bolt");

    }

    public void getItem(Point itemPoint){

        Item item = table.search(itemPoint);
        item.has = true;
        
    }

    public Boolean hasItem(Point itemPoint){

        if(table.search(itemPoint) == null){
            System.out.println("Error 1");
            return false;
        }else{
            return table.search(itemPoint).has;
        }
    }

    public void print(){
        
        table.print();
    }

    public boolean search(Point p) {
        
        if(table.search(p) != null){
            return true;
        }else{
            return false;
        }
    }

    
}
