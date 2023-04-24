/**
*This is our game controller. From here we launch the
*majority of the game's functionaility.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Game;

//Imports
import java.awt.Point;
import Structure.GameMap;


public class GameController {
    
    //Instantiating game
    ViewController vc;
    GameMap map;
    Player player;
    StoryText st;
    boolean engineOn = false;

    //Intiailizing GUI
    public GameController(ViewController vc){
        this.vc = vc;        
    }

    //Starting game
    public void startGame(){

        //Building map
        map = new GameMap(vc);

        //Creating new player with starting point
        player = new Player(map.xStart, map.yStart);

        //Giving map
        map.givePlayer(player);

        //Starting story text events
        st = new StoryText();
        vc.setTextbox(st.start);
    }

    //Checking for up button user input
    public void upButton(){

        if(map.moveCheck("up", player.getX(), player.getY())){
            player.setY(player.getY() - 1);
            updateLocationView();
            updateTextBox();
            if(player.checkForItem()){
                locationTextUpdateItem();

                //if map show map button
                if(player.getPlayerPoint().equals(new Point(18, 3))){
                    vc.showMapBtn();
                }
            }
            locationTextUpdate();
        }

        if(player.getPlayerPoint().equals(new Point(5,4))){
            vc.showPasswordArea();
        }
        
        else{
            vc.hidePasswordArea();
        }
    }

    //Checking for down button user input
    public void downButton(){

        if(map.moveCheck("down", player.getX(), player.getY())){
            player.setY(player.getY() + 1);
            updateLocationView();
            updateTextBox();
            if(player.checkForItem()){
                locationTextUpdateItem();
                

                //if map show map button
                if(player.getPlayerPoint().equals(new Point(18, 3))){
                    vc.showMapBtn();
                }
            }
            locationTextUpdate();
        }
        
        if(player.getPlayerPoint().equals(new Point(5,4))){
            vc.showPasswordArea();
        }
        
        else{
            vc.hidePasswordArea();
        }
    }

    //Checking for left button user input
    public void leftButton(){

        if(map.moveCheck("left", player.getX(), player.getY())){
            player.setX(player.getX() - 1);
            updateLocationView();
            updateTextBox();
            if(player.checkForItem()){
                locationTextUpdateItem();
                

                //if map show map button
                if(player.getPlayerPoint().equals(new Point(18, 3))){
                    vc.showMapBtn();
                }
            }
            locationTextUpdate();
            vc.hidePasswordArea();
        }
    }

    //Checking for right button user input
    public void rightButton(){

        if(map.moveCheck("right", player.getX(), player.getY())){
            player.setX(player.getX() + 1);
            updateLocationView();
            updateTextBox();
            if(player.checkForItem()){
                locationTextUpdateItem();     

                //if map show map button
                if(player.getPlayerPoint().equals(new Point(18, 3))){
                    vc.showMapBtn();
                }
            }
            locationTextUpdate();
            vc.hidePasswordArea();
        }
    }

    //Functions for item related event triggers
    private void locationTextUpdateItem() {

        //If wrench and bolt update engine
        if(player.has(new Point(7, 0)) && player.has(new Point(1, 4))){
            st.popLocation(new Point(1, 6));

            //Updating control pannel if engine is fixed
            if(player.getPlayerPoint().equals(new Point(1, 6)) && engineOn == false){

                st.popLocation(new Point(19, 4));
                engineOn = true;
            }       
        }
    }

    private void locationTextUpdate(){

        System.out.println("locationTextUpdate");

        //Checking if player fixed engine
        if(player.getPlayerPoint().equals(new Point(1, 6)) && engineOn == false){

            st.popLocation(new Point(19, 4));
            engineOn = true;
            System.out.println("engine fixed");
        }

        if(engineOn && player.has(new Point(18, 3))){
            st.popLocation(new Point(19, 4));
            System.out.println("engine, map");
        }

    }
    
    //Updating location to GUI
    public void updateLocationView(){

        vc.setLocationBox("Current Location: " + player.getX() + "," + player.getY());

    }
    
    //Updating the textbox GUI for player
    public void updateTextBox(){

        if(st.textCheck(player.getPlayerPoint())){     
            vc.displayText(st.getPointText(player.getPlayerPoint()));
        }
        
        else{
            vc.clearTextbox();
        }
    }
}
