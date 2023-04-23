/**
*This is the game map interface for AirLock 7. It is
*implemented in GameMap.java.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Game;

//Interface
private interface Map{

    public void loadMapToArray();

    public void createAndLoad2DArray();

    public void printMapToConsole();    
}
