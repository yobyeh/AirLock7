package Structure;
import java.awt.Point;

//key is location
//value is item name


public class Item {
    
    Point point;
    String itemName;
    public Boolean has;

    public Item(Point point, String itemName){

        this.point = point;
        this.itemName = itemName;

    }

}
