/**
*This is our game map for AirLock7. Here we
*use a set of coordinates in a 2D array to
*stand in for the map. The player then navigates
*the map and can move within any items in the
*2D array that are 0's, while any 1's represent
*collidable objects like walls.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Structure;

//Imports
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import Game.Player;
import Game.ViewController;


public class GameMap implements Map{

    //Instantiating and intializing x:y coordinates
    int xSize = 21;
    int ySize = 10;

    //Initializing starting point for map
    public int xStart = 13 - 1;
    public int yStart = 10 - 1;

    //Intializing controller and player
    ViewController vc;
    Player player;

    //Instantiating and intializing 2D array of coordinates
    ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> map = new ArrayList<Integer>();

    //Door Unlocked and location
    Boolean bridgeLock = true;
    Point bridgeDoor = new Point(16,5);
    Boolean storageLock = true;
    Point storageDoor = new Point(5,4);

    //Game map function to display location for user
    public GameMap(ViewController vc){

        this.vc = vc;

        loadMapToArray();

        createAndLoad2DArray();

        printMapToConsole();     
    }

    //Checking for locked doors and wall collisions
    public Boolean moveCheck(String s, int xCurrent, int yCurrent){

        switch(s){
            
            case "up":{
                int newY = yCurrent - 1;
                if(yCurrent == 0){
                    return false;
                }

                if(x.get(xCurrent).get(newY) == 1){
                    return false;
                }
                
                if(player.getPlayerPoint().equals(storageDoor)){
                    if(lockedStorage()){
                        return false;
                    }
                    
                    else{
                        return true;
                    }
                }
                
                return true;
            }

            case "down":{

                int newY = yCurrent + 1;
                if(yCurrent == ySize - 1){
                    return false;
                }

                if(x.get(xCurrent).get(newY) == 1){
                    return false;
                }
                
                else{
                    return true;
                }

            }
            case "left":{
                int newX = xCurrent - 1;
                if(xCurrent ==  0){
                    return false;
                }

                if(x.get(newX).get(yCurrent) == 1){
                    return false;
                }else{
                    return true;
                }

            }

            case "right":{
                int newX = xCurrent + 1;
                if(xCurrent == xSize - 1){
                    return false;
                }

                if(x.get(newX).get(yCurrent) == 1){
                    return false;
                }

                if(player.getPlayerPoint().equals(bridgeDoor)){
                    if(lockedBridge()){
                        return false;
                    }else{
                        return true;
                    }
                }

                return true;
            }
        }

        return true;
    }


    //Checking storage room door status
    private boolean lockedStorage() {

        if(storageLock == true){
            //vc.showPasswordArea();
            if(vc.getPassword().equals("4571")){
                storageLock = false;
                return false;
            }
            else{
                return true;
            }    
        }
        
        else{
            return false;
        }
    }

    //Checking bridge door staturs
    private boolean lockedBridge() {

        if(bridgeLock == true){

            if(player.has(new Point(14, 2))){
                bridgeLock = false;
                return false;
            }

            return true;
        }
        
        else{
            
            return false;
        }
    }

    //Printing map to console
    private void printMapToConsole() {

        for(int i = 0; i < ySize; i++){

            for(int j = 0; j < xSize; j ++){
                
                System.out.print(x.get(j).get(i) + " ");    
            } 

            //Printing out coordinates
            System.out.println(" ");
            System.out.println(" ");
        }
    }

    //Function to instantiate and intialize 2D Array
    private void createAndLoad2DArray() {
        
        //Making x 2D
        for(int i = 0; i < xSize; i++){
            x.add(new ArrayList<Integer>());
        }

        //Loading map in 2D
        int mapIndex = 0;
        for(int i = 0; i < ySize; i++){

            for(int j = 0; j < xSize; j ++){
                
                x.get(j).add(map.get(mapIndex));
                mapIndex++;
            }
        }
    }

    private void loadMapToArray(){

        //Intializing map for 2D array
        map.addAll(Arrays.asList(
        1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
             1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1,
             1,1,1,1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,
             1,1,1,1,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,
             1,0,0,0,1,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,
             1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,0,0,1,
             1,0,1,0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,0,1,1,
             0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1,1,0,1,1,
             0,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,
             1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1
        ));
    }

    //Player giving function
    public void givePlayer(Player player) {
        this.player = player;
    }
}
