package Game;

//stores strings in order ish of game, text based on xy corrdinates


public class StoryText {

    //-----------These are the puzzle related events-----------

    //Event: Finding broken down ship engine
    String eventPuzzle1 = "You find the ships engine. It seems to be broken down. "
            + "You might be able to fix it with the correct tools";

    //Event: Finding keypad for storage room
    String eventPuzzle2 = "You find a keypad that requires 4 numbers in order to unlock.";

    //Event: Unsuccessfully guessing storage room password
    String eventPuzzle3 = "The code you enter is incorrect. Nothing happens.";

    //Event: Successfully guessing storage room password
    String eventPuzzle4 = "You guess the passcode correctly. The door to storage slides open!";

    //Event: Missing tools to fix broken down ship engine
    String eventPuzzle5 = "You realize are missing the necessary tools to fix the engine.";

    //Event: Fixing broken down ship engine
    String eventPuzzle6 = "The engine purrs to life.";

    //Event: Placing insterstellar map in bridge console
    String eventPuzzle7 = "You place the interstellar map in the console and the ship's "
        + "screens light up.";

    //Event: Flying home
    String eventPuzzle8 = "You set your destination. You are now boldly flying...home! "
        + "Congratulations, spacefarer!";

    //-----------These are the item related events-----------

    //Event: Finding keycard
    String eventItem1 = "You find a keycard to the bridge!";

    //Event: Finding map
    String eventItem2 = "You find the ship map and the instellar map!";

    //Event: Finding door code note
    String eventItem3 = "You find a sticky note with part of a code on it. "
            + "The code reads: 102-; the last number has been erased.";

    //Event: Finding wrench
    String eventItem4 = "You find a wrench!";

    //Event: Finding Bolt
    String eventItem5 = "You find a bolt!";

    //-----------These are the location related events-----------

    //Event: Entering the engine room for the first time
    String eventEngineRoom = "You enter the engine room and find that it's "
            + "strangely silent. The hum of the ships engine is missing.";

    //Event: Entering the storage room for the first time
    String eventStorageRoom = "You enter a small room. It is full of boxes "
            + "and boxes of supplies. In one corner, you spot an item that "
            + "catches your eye.";

    //Event: Entering the captain's room for the first time
    String eventCaptainsRoom = "You enter the captain's room cautiously so as "
            + "not to disturb her belongings. Her room is highly organized - the "
            + "captain is a stickler for rules. On her personal desk you spot an "
            + "item that catches your eye.";

    //Event: Entering the bridge for the first time
    String eventBridge = "You enter a large room full of chairs and command consoles. "
            + "The captain's seat looks strange without her on there, but most of the "
            + "ship's functionality seems to be intact.";

}
