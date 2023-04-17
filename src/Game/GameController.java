package Game;

import Structure.GameMap;


//todo... 
//implement text

public class GameController {
    ViewController vc;
    GameMap map;
    Player player;

    public GameController(ViewController vc){
        this.vc = vc;
        
    }

    public void startGame(){

        //build map
        map = new GameMap();

        //new player + starting spot
        player = new Player(0, 0);

        vc.setTextbox("test test test");



        //game loop

    
    
    }

    public void upButton(){
        //vc.setTextbox("up");
        if(map.moveCheck("up", player.getX(), player.getY())){
            player.setY(player.getY() - 1);
            updateLocationView();
        }
    }

    public void downButton(){
        //vc.setTextbox("down");
        if(map.moveCheck("down", player.getX(), player.getY())){
            player.setY(player.getY() + 1);
            updateLocationView();
        }
    }

    public void leftButton(){
        //vc.setTextbox("left");
        if(map.moveCheck("left", player.getX(), player.getY())){
            player.setX(player.getX() - 1);
            updateLocationView();
        }
    }

    public void rightButton(){
        //vc.setTextbox("right");
        if(map.moveCheck("right", player.getX(), player.getY())){
            player.setX(player.getX() + 1);
            updateLocationView();
        }
    }
    
    public void updateLocationView(){

        vc.setTextbox(player.getX() + " , " + player.getY());

    }
    
   



    
}
