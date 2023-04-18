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

    int xSize = 21;
    int ySize = 10;

    public int xStart = 13;
    public int yStart = 10;

    ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();

    ArrayList<Integer> map = new ArrayList<Integer>();
    

    public GameMap(){

        loadMapToArray();

        createAndLoad2DArray();

        printMapToConsole();
        

    }

    //check if can move direction given current position
    //walls and doors
    public Boolean moveCheck(String s, int xCurrent, int yCurrent){

        switch (s) {
            case "up":{
                int newY = yCurrent - 1;
                if(yCurrent == 0){
                    return false;
                }

                if(x.get(xCurrent).get(newY) == 1){
                    return false;
                }else{
                    return true;
                }

            }
            case "down":{

                int newY = yCurrent + 1;
                if(yCurrent == ySize - 1){
                    return false;
                }

                if(x.get(xCurrent).get(newY) == 1){
                    return false;
                }else{
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
                }else{
                    return true;
                }

            }
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
        //1s are walls and objects 0s are open spaces
        map.addAll(Arrays.asList(
        1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
             1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1,
             1,1,1,1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,
             1,1,1,1,0,0,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,
             0,0,0,0,1,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,
             1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,0,0,1,
             1,0,1,0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,0,1,1,
             0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1,1,0,1,1,
             0,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,
             1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,1,1,1,1,1
        ));
    }


    
}
