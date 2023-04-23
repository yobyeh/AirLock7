package Game;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Stack;

//todo: locations for all text shown as (x, y)
//alt text in stacked popped
//fill arrays
//check for point in array... if so display


//stores strings in order ish of game, text based on xy corrdinates
//every text creates a new point and adds it to the array
public class StoryText {

    //holds points of all text
    ArrayList<Point> textPoints = new ArrayList<Point>();
    //holds text in stacks alligns with point Array
    ArrayList<Stack<String>> textStacks = new ArrayList<Stack<String>>();

    //Starting game
    String start = "You wake up in AirLock 7, feeling dazed and confused.\n"
    + "The rest of your crew has been killed or kidnapped, and you're thankful\n"
    + "that you were quick enough to hide before the same thing happened to you. ";

    public StoryText(){
        loadText();
    }

    
    public Boolean textCheck(Point p){

        for(Point point : textPoints){
            if(p.equals(point)){
                return true;
            }
        }
        return false;
    }

    public String getPointText(Point p) {

        for(int i = 0; i < textPoints.size(); i++){

            if(p.equals(textPoints.get(i))){

                return textStacks.get(i).peek();

            }
        }
        return null;
    }

    private void loadText(){
        
        for(int i = 0; i < 20; i++){
            textStacks.add(new Stack<String>());
        }


        //-----------These are the puzzle related events-----------

        //Event: Finding broken down ship engine
        //Location: (4, 8) 
        textPoints.add(new Point(1,6));
        textStacks.get(0).push("You find the ships engine. It seems to be broken down.\n"
        + "You might be able to fix it with the correct tools");

        //Event: Finding keypad for storage room
        //Location: (6, 5)
       //textPoints.add(new Point(5,4));
        textStacks.get(1).push("You find a keypad that requires 4 numbers in order to unlock.");

        //Event: Unsuccessfully guessing storage room password
        //textPoints.add(new Point(4,2));
        textStacks.get(2).push("The code you enter is incorrect. Nothing happens.");

        //Event: Successfully guessing storage room password
        //Location: (6, 5)
        String eventPuzzle4 = "You guess the passcode correctly. The door to storage slides open!";

        //Event: Missing tools to fix broken down ship engine
        //Location: (2, 7)
        String eventPuzzle5 = "You realize are missing the necessary tools to fix the engine.";

        //Event: Fixing broken down ship engine
        //Location: (2, 7)
        String eventPuzzle6 = "The engine purrs to life.";

        //Event: Placing insterstellar map in bridge console
        //Location: (20, 5)
        String eventPuzzle7 = "You place the interstellar map in the console and the ship's\n"
        + "screens light up.";

        //Event: Flying home
        //Location: (20, 6)
        String eventPuzzle8 = "You set your destination. You are now boldly flying...home!\n"
        + "Congratulations, spacefarer!";


        //-----------These are key item related events-----------

        //Event: Finding keycard
        //Location: (11, 4)
        String eventItem1 = "You find a keycard to the bridge!";

        //Event: Finding map
        //Location: (19, 4)
        String eventItem2 = "You find the ship map and the instellar map on\n"
        + "the science officer's counter.";

        //Event: Finding door code note
        //Location: (15, 3)
        String eventItem3 = "You find a sticky note with part of a code on it.\n"
        + "The code reads: 102-; the last number has been erased.";

        //Event: Finding wrench
        //Location: (8, 1) 
        String eventItem4 = "You find a wrench!";

        //Event: Finding Bolt
        //Location: (2, 5)  
        String eventItem5 = "You find a bolt!";

        ////-----------These are non-key item related events-----------

        //Event: Rummaging through empty boxes 1
        //Location: (6, 2) 
        String eventStorageBoxes1 = "You find a set of boxes and check inside.\n" 
        + "They are empty.";

        //Event: Rummaging through boxes 2
        //Location: (8, 3)
        String eventStorageBoxes2 = "You find a set of boxes and check inside. There are\n" 
        + "stacks and stacks of Captain Force comic books. You wonder who they belong to.";

        //Checking the captain's bed
        //Location: (12, 3)
        String captainsBed = "You give the captain's bed a once over. It's been made\n"
        + "and looks untouched.";

        //Checking bridge control pannels
        //Location: (19, 7)
        String controlPannels = "You check the control pannel in front of you. You do not\n"
        + "need it to fly home, so you leave it alone.";


        //-----------These are the location related events-----------

        //Event: Airlock door locking behind you
        //Location: (15, 8)
        String eventAirLockDoor = "Just as you exit the room, the door shuts behind\n"
        + "you. There is no returning to the safety of AirLock 7 anymore.";

        //Event: Finding locked storage room door
        //Location: (6, 5)
        String eventStorageDoor = "You find the Storage Room door. It is locked.";

        //Event: Entering the engine room for the first time
        //Location: (4, 8)
        String eventEngineRoom = "You enter the engine room and find that it's\n"
        + "strangely silent. The hum of the ships engine is missing.";

        //Event: Entering the storage room for the first time
        //Location: (6, 4)
        String eventStorageRoom = "You enter a small room. It is full of boxes\n"
        + "and boxes of supplies. In one corner, you spot an item that "
        + "catches your eye.";

        //Event: Entering the captain's room for the first time
        //Location: (13, 5)
        String eventCaptainsRoom = "You enter the captain's room cautiously so as\n"
        + "not to disturb her belongings. Her room is highly organized - the\n"
        + "captain is a stickler for rules. On her personal desk you spot an\n"
        + "item that catches your eye.";

        //Event: Finding the locked door to the bridge
        //Location: (17, 6)
        String eventBridgeDoor = "You find the door to the bridge. You notice\n"
        + "the pannel on side requiring a keycard to enter.";

        //Event: Entering the bridge for the first time
        //Location: (18, 6)
        String eventBridge = "You enter a large room full of chairs and command consoles.\n"
        + "The captain's seat looks strange without her on there, but most of the\n"
        + "ship's functionality seems to be intact.";
    }


    
}
