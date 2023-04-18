package Game;

import Structure.GameMap;


//todo... 
//implement text

public class GameController {
    ViewController vc;
    GameMap map;
    Player player;
    StoryText st;

    public GameController(ViewController vc){
        this.vc = vc;
        
    }

    public void startGame(){

        //build map
        map = new GameMap();

        //new player + starting spot
        player = new Player(map.xStart, map.yStart);

        //intro
        st = new StoryText();
        vc.setTextbox(st.start);

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
            updateTextBox();
        }
    }

    public void leftButton(){
        //vc.setTextbox("left");
        if(map.moveCheck("left", player.getX(), player.getY())){
            player.setX(player.getX() - 1);
            updateLocationView();
            updateTextBox();
        }
    }

    public void rightButton(){
        //vc.setTextbox("right");
        if(map.moveCheck("right", player.getX(), player.getY())){
            player.setX(player.getX() + 1);
            updateLocationView();
            updateTextBox();
        }
    }
    
    public void updateLocationView(){

        vc.setLocationBox("Current Location: " + player.getX() + "," + player.getY());

    }
    
    public void updateTextBox(){

        



    }



    
}
