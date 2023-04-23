/**
*This is our HashTable data structure. It is used to
*by the inventory class in order to store items 
*that are necessary for game progression. Each item
*is stored a string and we use comparisons to check 
*if a user has the item in their inventory.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Structure;

//Imports
import java.awt.Point;
import java.util.*;


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

    //Item add to HashTable function 
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

    //Item search function
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

    //Funtion to print items
    public void print(){

        //Iterating over HashTable
        for(int i = 0; i < tableSize; i++){

            //If bucket is not empty
            if(table[i] != null){

                //Print item and item name to screen
                for(int j = 0; j < table[i].size(); j++){

                    Item item = table[i].get(j);
                    System.out.println(item.point.toString() + " " + item.itemName + " " + item.has);
                }
            }
        }
    }
}
