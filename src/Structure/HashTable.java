package Structure;

import java.awt.Point;
//Importing packages
import java.util.*;

//to store items the player has picked up
//bool check given item String to see if it has been stored 
//implemented in player class
//sorted array output for view to display items in order 

//modified hash table for inventory with points as keys
//if game expanded to have more items this will be able to handle all the items easily
public class HashTable {

    //Instantiating global variables
    int tableSize;
    int size;

    //Instantiating table
    LinkedList<Item>[] table;

    public HashTable(int tableSize){

        //Initializing table size
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
    }

    private int getHashIndex(Point p){
        Double x = p.getX();
        Double y = p.getY();
        String s = x.toString() + y.toString();
        int hashCode = s.hashCode();
        int index = Math.abs(hashCode) % tableSize;
        
        return index;
    }

    public void put(Point keyPoint, String value){

        int index = getHashIndex(keyPoint);

        //Checking if array index location in the table is null
        if(table[index] == null){

            //Creating a new bucket if null
            table[index] = new LinkedList<Item>();

            //Creating new entry with key/value pair
            Item newItem = new Item(keyPoint, value);

            //Adding new entry to bucket
            table[index].add(0, newItem);

            //Increasing size
            size++;

        }
        //If array index location is not null
        else{

            //Iterating through bucket
            for(int i = 0; i < table[index].size(); i++){

                //Getting current key/value pair
                Item currenItem = table[index].get(i);

                //If current bucket key equals key argument passed to put()
                if(currenItem.point.equals(keyPoint)){

                    return;
                }
            }

            //Creating new entry if key is not found in bucket
            Item newItem = new Item(keyPoint, value);

            //Adding new entry to bucket
            table[index].add(0, newItem);

            //Incrementing size
            size++;
        }
    }

    public Item search(Point keyPoint){

        int index = getHashIndex(keyPoint);

        //Checking if array index location in the table is null
        if(table[index] == null){

            //If null return  null
            return null;
        }
        //If array index location is not null
        else{

            //Iterating through bucket
            for(int i = 0; i < table[index].size(); i++){

                //Getting current key/value pair
                Item currenItem = table[index].get(i);

                //Comparing current bucket key to key argument in get()
                if(currenItem.point.equals(keyPoint)){

                    //If found then return the object
                    return currenItem;
                }
            }
        }

        //Returning null if no match found
        return null;
    }

    public void print(){

        for(int i = 0; i < tableSize; i++){

            if(table[i] != null){

                for(int j = 0; j < table[i].size(); j++){

                    Item item = table[i].get(j);
                    System.out.println(item.point.toString() + " " + item.itemName);
                }
            }
        }
    }

}
