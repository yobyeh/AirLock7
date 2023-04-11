package Structure;

//Importing packages
import java.util.*;
import java.util.set;

//to store items the player has picked up
//bool check given item String to see if it has been stored 
//implemented in player class
//sorted array output for view to display items in order 

public class HashTable {

    //Instantiating user inventory HashTable
    HashTable<Integer, String> userInventory = new HashTable<>();

    //Function to add item to user inventory
    public void addItem(Integer location, String item){

        //Accepts an Integer as location in the bag for the key
        userInventory.put(location, item);
    }

    //Function to search user inventory for items
    public Boolean searchInventory(String item){

        //Returning boolean for whether item exists in inventory or not
        return userInventory.containsValue(item);
    }

    //Function to get location/key for each item
    public Integer getKey(String item){

        //Getting number of keys from user inventory HashTable
        Set<Integer> location = userInventory.keySet();

        //Iterating over user intenvory
        for(Integer key: location){

            //If item is in user invetory return its key
            if(userInventory.containsValue(item)){

                return userInventory.getKey(item);
            }

        }
    }
}
