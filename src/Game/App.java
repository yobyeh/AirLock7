package Game;

//todo: 10 classes



public class App {
    public static void main(String[] args) throws Exception {
        
        ViewController vc = new ViewController();
        GameController gc = new GameController(vc);
        
        vc.startDisplay();
        vc.giveGameController(gc);
        gc.startGame();
       

    }
}
