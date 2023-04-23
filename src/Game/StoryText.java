/**
*These are the text based events for our game, AirLock7.
*Events are stored in an ArrayList of Stacks, and events in 
*the same stack are organized in reverse order for structure 
*use. When a player has the correct item/solves apuzzle, we 
*pop the top string in the stack to create event gameplay
*changes.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s) 
package Game;

//Imports
import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;


public class StoryText{

    //Array to hold all event points
    ArrayList<Point> textPoints = new ArrayList<Point>();

    //Stack for text events
    ArrayList<Stack<String>> textStacks = new ArrayList<Stack<String>>();

    //Starting game
    String start = "You wake up in AirLock 7, feeling dazed and confused.\n"
    + "The rest of your crew has been killed or kidnapped, and you are thankful\n"
    + "that you were quick enough to hide before the same thing happened to you.";

    //Loading text events
    public StoryText(){
        loadText();
    }

    //Checking if map point has text event
    public Boolean textCheck(Point p){

        for(Point point : textPoints){
            if(p.equals(point)){
                return true;
            }
        }
        return false;
    }

    //Getting triggered text event from map point
    public String getPointText(Point p) {

        for(int i = 0; i < textPoints.size(); i++){

            if(p.equals(textPoints.get(i))){

                return textStacks.get(i).peek();

            }
        }
        return null;
    }

    //hapens once per item gained at item point.
    public void popLocation(Point p) {

        // for(int i = 0; i < textPoints.size(); i++){

        //     if(p.equals(textPoints.get(i))){

        //         if(textStacks.get(i).size() > 1){
        //             textStacks.get(i).pop();
        //         }
                
        //     }
        // }

        // //wrench
        // if(p.equals(new Point(0, 0))){

        // }

        //map
        if(p.equals(new Point(18, 3))){

            if(textStacks.get(18).size() > 1){
                textStacks.get(18).pop();
            }
        }

        // //Bolt
        // if(p.equals(new Point(0, 0))){

        // }

        // //Key Card
        // if(p.equals(new Point(14, 2))){

        //     if(textStacks.get(i).size() > 1){
        //         textStacks.get(i).pop();
        //     }

        // }

    }

    //Function to load text events
    private void loadText(){
        
        for(int i = 0; i < 20; i++){
            textStacks.add(new Stack<String>());
        }

        ////-----------These are game intro related events-----------////

        //AIRLOCK 7 EVENT: Introduction
        textPoints.add(new Point(12, 9));
        textStacks.get(0).push("You wake up in AirLock 7, feeling dazed and confused.\n"
        + "The rest of your crew has been killed or kidnapped, and you are thankful\n"
        + "that you were quick enough to hide before the same thing happened to you.");

        //AIRLOCK & EVENT: Airlock door locking behind you
        textPoints.add(new Point(14, 7));
        textStacks.get(1).push("Just as you exit the room, the door shuts behind\n"
        + "you. There is no returning to the safety of AirLock 7 anymore.");


        ////-----------These are captain's room related events-----------////

        //Event: Entering the captain's room for the first time
        textPoints.add(new Point(12, 4));
        textStacks.get(2).push("You enter the captain's room cautiously so as\n"
        + "not to disturb her belongings. Her room is highly organized - the\n"
        + "captain is a stickler for rules.");

        //CAPTAIN'S ROOM EVENT: Finding keycard
        textPoints.add(new Point(14, 2));
        textStacks.get(3).push("You check the table in front of you.\n" 
        + "You find a keycard to the bridge!");

        //CAPTAIN'S ROOM EVENT: Checking the captain's bed
        textPoints.add(new Point(10, 2));
        textStacks.get(4).push("You give the captain's bed a once over. It is\n" 
        + "immaculately made and looks untouched.");

        //CAPTAIN'S ROOM EVENT: Finding door code note
        textPoints.add(new Point(10, 3));
        textStacks.get(5).push("You find a sticky note with part of a code on it.\n"
        + "The code reads: 457-; the last number has been erased.");


        ////-----------These are engine room related events-----------////
                
        //ENGINE ROOM EVENT: Entering the engine room for the first time
        textPoints.add(new Point(4, 7));
        textStacks.get(6).push("You enter the engine room and find a massive\n"
        + "piece of machinery. Ships like this require immense power\n"
        + "for interstellar travel and the engine's size reflects this.");

        //ENGINE ROOM EVENT: Finding a bolt
        textPoints.add(new Point(1, 4));
        textStacks.get(7).push("You rummage through a large box and find a bolt!\n");

        //ENGINE EVENT: Fixing broken down ship engine
        textPoints.add(new Point(1,6));
        textStacks.get(8).push("The ship's engine is damaged. You use your wrench\n"
        + "and bolt to fix it. The engine purrs to life.");

        //ENGINE EVENT: Finding broken down ship engine 
        textStacks.get(8).push("You find the ship's engine. It seems to be broken down.\n"
        + "You might be able to fix it with the correct tools");


        ////-----------These are storage room related events-----------////

        //STORAGE ROOM EVENT: Successfully guessing storage room password
        textPoints.add(new Point(5, 4));
        textStacks.get(9).push("You guess the passcode correctly. The door to storage slides open!");

        //STORAGE ROOM EVENT: Finding keypad for storage room
        textStacks.get(9).push("You find the Storage Room door. It is locked.\n"
        + "You find a keypad that requires 4 numbers in order to open it.");

        //STORAGE ROOM EVENT: Entering the storage room for the first time
        textPoints.add(new Point(5, 3));
        textStacks.get(10).push("You enter a small room. It is full of boxes\n"
        + "and boxes of supplies. The storage room is an important part of any"
        + "space fairing vessel.");

        //STORAGE ROOM EVENT: Finding Wrench
        textPoints.add(new Point(7, 0));
        textStacks.get(11).push("You check the table in front of you and find a wrench!");

        //STORAGE ROOM EVENT: Rummaging through boxes 1
        textPoints.add(new Point(5, 1));
        textStacks.get(12).push("You find a set of boxes and check inside.\n" 
        + "They are empty.");

        //STORAGE ROOM EVENT: Rummaging through boxes 2
        textPoints.add(new Point(7, 2));
        textStacks.get(13).push("You find a set of boxes and check inside. There are\n" 
        + "stacks and stacks of Captain Force comic books. You wonder who they belong to.");


        ////-----------These are bridge related events-----------////

        //BRDIGE EVENT: Finding the locked door to the bridge
        textPoints.add(new Point(16, 5));
        textStacks.get(14).push("You find the door to the bridge. You notice\n"
        + "the pannel on side requiring a keycard to enter.");

        //BRDIGE EVENT: Entering the bridge for the first time
        textPoints.add(new Point(17, 5));
        textStacks.get(15).push("You enter a large room full of chairs and command consoles.\n"
        + "The captain's seat looks strange without her on there, but most of the\n"
        + "ship's functionality seems to be intact.");

        //Checking bridge control pannels
        textPoints.add(new Point(19, 3));
        textStacks.get(16).push("You check the control pannel in front of you. You do not\n"
        + "need it to fly home, so you leave it alone.");

        //BRIDGE EVENT: Finding map
        textPoints.add(new Point(18, 3));
        textStacks.get(17).push("You find the ship map and the instellar map on\n"
        + "the science officer's counter.");
        
        //BRIDGE EVENT: Flying home
        textPoints.add(new Point(19, 4));
        textStacks.get(18).push("You stand in front of the ship's navigation console.\n"
        + "You place the interstellar map in the map card slot and set set your destination.\n" 
        + "You are now boldly flying...home! Congratulations, spacefarer!");

        //BRIDGE EVENT: Placing insterstellar map in bridge console
        textStacks.get(18).push("You stand in front of the ship's navigation console.\n"
        + "You notice that the map card slot is empty.");        
    }    
}
