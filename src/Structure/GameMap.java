package Structure;

import java.util.ArrayList;
import java.util.Arrays;

//todo.... doors in move check 
//implement walls
//implement doors
//implement items




//stores each locked door in a bool 

//stores a 2d array of ones and zeros that is the map
//zeros are where a player can stand... 1s are walls 
//map should be 8:4 ratio to match when displaying on screen size

//stores location of items 
//once item moved over, is stored as string in hash table owned by player 


public class GameMap {

    int xSize = 5;
    int ySize = 5;

    ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();

    ArrayList<Integer> map = new ArrayList<Integer>();
    

    public GameMap(){

        loadMapToArray();

        createAndLoad2DArray();

        printMapToConsole();
        

    }

    //check if can move direction given current position
    //walls and doors
    public Boolean moveCheck(String s, int x, int y){

        switch (s) {
            case "up":{

                if(y == 0){
                    return false;
                }

            }
                     break;
            case "down":{

                if(y == ySize - 1){
                    return false;
                }


            }
                     break;
            case "left":{

                if(x ==  0){
                    return false;
                }

            }
                     break;
            case "right":{

                if(x == xSize - 1){
                    return false;
                }

            }
                     break;
        }

        return true;
    }



    private void printMapToConsole() {

        for(int i = 0; i < ySize; i++){

            for(int j = 0; j < xSize; j ++){
                
                System.out.print(x.get(j).get(i) + " ");
                
            } 

            System.out.println(" ");
            System.out.println(" ");
        }

    }

    private void createAndLoad2DArray() {
        
        //make x 2D
        for(int i = 0; i < xSize; i++){
            x.add(new ArrayList<Integer>());
        }

        //load map in 2D
        int mapIndex = 0;
        for(int i = 0; i < ySize; i++){

            for(int j = 0; j < xSize; j ++){
                
                x.get(j).add(map.get(mapIndex));
                mapIndex++;
            } 
        }
    }

    private void loadMapToArray(){

        //the map..
        //1s are walls 0s are open spaces
        map.addAll(Arrays.asList(
        0,0,1,1,1,
             1,0,1,1,1,
             1,0,0,1,0,
             1,1,0,0,0,
             1,1,1,1,0
        ));
    }


    
}
