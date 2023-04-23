package Game;

import java.awt.Point;

import Structure.GameMap;


//todo... 
//implement text
//items
//doors

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
        map = new GameMap(vc);

        //new player + starting spot
        player = new Player(map.xStart, map.yStart);

        map.givePlayer(player);

        //intro
        st = new StoryText();
        vc.setTextbox(st.start);

    }

    public void upButton(){

        if(map.moveCheck("up", player.getX(), player.getY())){
            player.setY(player.getY() - 1);
            updateLocationView();
            updateTextBox();
            player.checkForItem();
        }
        if(player.getPlayerPoint().equals(new Point(5,4))){
            vc.showPasswordArea();
        }
    }

    public void downButton(){
        //vc.setTextbox("down");
        if(map.moveCheck("down", player.getX(), player.getY())){
            player.setY(player.getY() + 1);
            updateLocationView();
            updateTextBox();
            player.checkForItem();
        }
    }

    public void leftButton(){
        //vc.setTextbox("left");
        if(map.moveCheck("left", player.getX(), player.getY())){
            player.setX(player.getX() - 1);
            updateLocationView();
            updateTextBox();
            player.checkForItem();
        }
    }

    public void rightButton(){
        //vc.setTextbox("right");
        if(map.moveCheck("right", player.getX(), player.getY())){
            player.setX(player.getX() + 1);
            updateLocationView();
            updateTextBox();
            player.checkForItem();
        }
    }
    
    public void updateLocationView(){

        vc.setLocationBox("Current Location: " + player.getX() + "," + player.getY());

    }
    
    public void updateTextBox(){

        if(st.textCheck(player.getPlayerPoint())){
            
            vc.displayText(st.getPointText(player.getPlayerPoint()));
            
        }else{
            vc.clearTextbox();
        }


    }



    
}
