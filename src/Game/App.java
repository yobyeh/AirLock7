/**
*This is the maain code section for our project, AirLock7.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

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
