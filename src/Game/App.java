/**
*This is the maain code section for our project, AirLock7.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

// this project uses a modified hash table to store the items the player can pick up.
// if the game were to continue in development this would work well for storing a large number of items also

// this project aslo uses a an array of stacks to hold all the text for the game
// when an event happens the stacks are popped

//CONTRIBUTIONS
// John Patrick: game logic, UI, testing, bugfixes.
// Luis K. Pena: hash table, text, testing.
// Sergio Costa:game map, map design, testing.

//Package(s)
package Game;


public class App {
    public static void main(String[] args) throws Exception {
        
        //Instantiating and initializing variables
        ViewController vc = new ViewController();
        GameController gc = new GameController(vc);
        
        //Starting game
        vc.startDisplay();
        vc.giveGameController(gc);
        gc.startGame();     
    }
}
