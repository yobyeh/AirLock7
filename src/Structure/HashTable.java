package Structure;

//Importing packages
import java.util.*;

//to store items the player has picked up
//bool check given item String to see if it has been stored 
//implemented in player class
//sorted array output for view to display items in order 

public class HashTable {

    //Instantiating global variables
    int tableSize;
    int size;

    //Instantiating userInventory
    ArrayList [] userInventory;

    public HashTable(int tableSize){

        //Initializing userInventory size
        userInventory = new ArrayList[tableSize];
        this.tableSize = tableSize;
    }

    public int biggestBucket(){

        //Instantiating and initializing variables
        int biggestBucket = 0;

        //Looping through userInventory looking for non-null locations.
        for(int i = 0; i < userInventory.length; i++){

            if(userInventory[i] != null){

                ArrayList bucket = userInventory[i];

                //Setting bucket to biggest size
                if(biggestBucket < bucket.size()){

                    biggestBucket = bucket.size();
                }
            }
        }

        //Returning biggest bucket
        return biggestBucket;
    }

    public float averageBucket(){

        float bucketCount = 0;
        float bucketSizeSum = 0;

        //Looping through userInventory looking for non-null locations.
        for(int i = 0; i < userInventory.length; i++){

            //Incrementing bucket size and count
            if(userInventory[i] != null){

                ArrayList bucket = userInventory[i];
                bucketSizeSum += bucket.size();
                bucketCount++;
            }
        }

        //Returning average bucket
        return bucketSizeSum/bucketCount;
    }

    public String toString()
    {
        //Instantiating and initializing variables
        String s = "";

        //Overriding toString() method
        for(int tableIndex = 0; tableIndex < tableSize; tableIndex++) {

            if (userInventory[tableIndex] != null) {

                //Instantiating bucket variable
                ArrayList bucket = userInventory[tableIndex];

                for(int listIndex = 0; listIndex < bucket.size(); listIndex++) {
                    Entry e = (Entry)bucket.get(listIndex);
                    s = s + "key: " + e.key + ", value: " + e.value + "\n";
                }
            }
        }

        //Returning string
        return s;
    }

    protected class Entry
    {
        //Instantiating variables for key/value pairs
        String key;
        Object value;

        //Method for adding objects to userInventory
        Entry(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public boolean isEmpty() {

        //Checking key/value pair size to determine if it is empty
        if(size == 0){

            return true;
        }

        //Returning false if not empty
        else{

            return false;
        }
    }

    public int size(){

        //Returning number of key/value pairs in dictionary
        return size;
    }

    public Object put(String key, Object value){

        //Computing an array index from put() key argument
        int hashCode = key.hashCode();
        int arrayIndex = Math.abs(hashCode) % tableSize;

        //Checking if array index location in the userInventory is null
        if(userInventory[arrayIndex] == null){

            //Creating a new bucket if null
            userInventory[arrayIndex] = new ArrayList();

            //Creating new entry with key/value pair
            Entry e = new Entry(key, value);

            //Adding new entry to bucket
            userInventory[arrayIndex].add(0, e);

            //Increasing size
            size++;

            return null;
        }

        //If array index location is not null
        else{

            //Iterating through bucket
            for(int i = 0; i < userInventory[arrayIndex].size(); i++){

                //Getting current key/value pair
                Entry curr = (Entry)userInventory[arrayIndex].get(i);

                //If current bucket key equals key argument passed to put()
                if(curr.key.equals(key)){

                    //Saving current bucket value to oldValue object
                    Object oldValue = curr.value;

                    //Setting current bucket value to new value
                    curr.value = value;

                    //Returning old value
                    return oldValue;
                }
            }

            //Creating new entry if key is not found in bucket
            Entry e = new Entry(key, value);

            //Adding new entry to bucket
            userInventory[arrayIndex].add(0, e);

            //Incrementing size
            size++;
        }

        //Returning null if no match found
        return null;
    }

    public Object get(String key){

        //Computing an array index from get() key argument
        int hashCode = key.hashCode();
        int arrayIndex = Math.abs(hashCode) % tableSize;

        //Checking if array index location in the userInventory is null
        if(userInventory[arrayIndex] == null){

            //If null then return null
            return null;
        }

        //If array index location is not null
        else{

            //Iterating through bucket
            for(int i = 0; i < userInventory[arrayIndex].size(); i++){

                //Getting current key/value pair
                Entry curr = (Entry) userInventory[arrayIndex].get(i);

                //Comparing current bucket key to key argument in get()
                if(curr.key.equals(key)){

                    //If found then return current bucket key value
                    return curr.value;
                }
            }
        }

        //Returning null if no match found
        return null;
    }
}
