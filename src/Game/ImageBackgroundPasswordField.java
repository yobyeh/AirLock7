package Game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPasswordField;

public class ImageBackgroundPasswordField extends JPasswordField {
    private Image backgroundImage;

    public ImageBackgroundPasswordField(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
        setOpaque(false); // Make the JTextArea transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, this);

        // Draw the text area content
        super.paintComponent(g);
    }
}