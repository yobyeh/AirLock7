/**
*This is our item structure for our HashTable. We
*use an event's location as the item's key and
*the value is the item's name as a string.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Structure;

//Imports
import java.awt.Point;


public class Item {
    
    //Intializing variables
    Point point;
    String itemName;
    public Boolean has = false;

    //Item setter function
    public Item(Point point, String itemName){

        this.point = point;
        this.itemName = itemName;
    }
}
