/**
*This class allows us to override the paint function
*of JFrame in order to load in custom images for our
*GUI
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Game;

//Imports
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPasswordField;


public class ImageBackgroundPasswordField extends JPasswordField {
    private Image backgroundImage;

    //Setting image background
    public ImageBackgroundPasswordField(Image backgroundImage) {
        
        this.backgroundImage = backgroundImage;
        
        //Making JText area transparent
        setOpaque(false);
    }

    //Overriding paint function
    @Override
    protected void paintComponent(Graphics g) {
        
        //Drawing background image
        g.drawImage(backgroundImage, 0, 0, this);

        //Drawing text area content
        super.paintComponent(g);
    }
}