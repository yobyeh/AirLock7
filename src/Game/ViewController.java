/**
*This is our main controller. It displays the GUI to
*the player, including buttons, locations, text, etc.
* 
* @authors  John Patrick, Luis K. Pena, Sergio Costa
* @version  1.0
* @since    04/20/2023
*/

//Package(s)
package Game;

//Imports
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

//pop up woindow for map.. map button
//splash screen ?

public class ViewController implements ActionListener{

//Instantiating button variables
JButton up;
JButton down;
JButton left;
JButton right;

//Instantiating controller
GameController gc;

//Instantiating JFrame components
JTextPane text;
JLabel locationBox;
//JTextArea label2;
ImageBackgroundPasswordField label2;
JScrollPane textScrollPane;

//Instantiating GUI images
private Image imageStorage;
private ImageIcon iconUP;
private ImageIcon iconDown;
private ImageIcon iconLeft;
private ImageIcon iconRight;


public ViewController(){

    //Starting display
    loadimages();
}

private void loadimages() {

    //Try/catch methods
    try{
        imageStorage = ImageIO.read(getClass().getResource("/Resources/storagePassword1.png"));
    } catch(IOException e) {
        System.out.println(e.toString());
    }

    //Setting images for important icons
    iconUP = new ImageIcon(getClass().getResource("/Resources/UpKey.png"));
    //Image scaleUP = iconUP.getImage();
    //scaleUP = scaleUP.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    //iconUP = new ImageIcon(scaleUP);
    iconDown = new ImageIcon(getClass().getResource("/Resources/DownKey.png"));
    iconLeft = new ImageIcon(getClass().getResource("/Resources/LeftKey.png"));
    iconRight = new ImageIcon(getClass().getResource("/Resources/RightKey.png"));


}

public void giveGameController(GameController gc){
    this.gc = gc;
}

public void startDisplay(){

    JFrame frame = new JFrame("AirLock7");
    frame.setSize(1200, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panelMain = new JPanel();
    panelMain.setLayout(new GridBagLayout());
    panelMain.setSize(1200, 600);
    panelMain.setBackground(Color.gray);
    GridBagConstraints constraints = new GridBagConstraints();
    
    //Creatin labels with fixed size
    JLabel label1 = new JLabel("");
    label1.setBackground(Color.gray);
    label1.setOpaque(true);
    label1.setPreferredSize(new Dimension(110, 50));
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(label1, constraints);

    ////-----------Text Event Display Pannel-----------////
    text = new JTextPane();
    SimpleAttributeSet attributes = new SimpleAttributeSet();
    StyleConstants.setAlignment(attributes, StyleConstants.ALIGN_CENTER);
    StyleConstants.setFontSize(attributes, 18);
    StyleConstants.setFontFamily(attributes, "Dialog");
    text.setParagraphAttributes(attributes, true);

    
    textScrollPane = new JScrollPane(text);
    textScrollPane.setPreferredSize(new Dimension(300, 60));
    constraints = new GridBagConstraints();
    constraints.gridx = 2;
    constraints.gridy = 0;
    constraints.gridwidth = 4;
    constraints.weightx = 1;
    constraints.weighty = 0.9;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(textScrollPane, constraints);

    ////-----------Password Display Pannel-----------////
    label2 = new ImageBackgroundPasswordField(imageStorage);
    label2.setFont(new Font("Dialog", Font.BOLD, 14));
    label2.setBackground(Color.gray);
    //label2.setOpaque(true);
    //label2.setPreferredSize(new Dimension(400, 50));
    constraints = new GridBagConstraints();
    constraints.gridx = 6;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    label2.setVisible(false);
    panelMain.add(label2, constraints);

    ////-----------Location Display Pannel-----------////
    locationBox = new JLabel("Current Location: 12,9", SwingConstants.CENTER);
    locationBox.setFont(new Font("Dialog", Font.BOLD, 14));
    locationBox.setBackground(Color.gray);
    locationBox.setOpaque(true);
    locationBox.setPreferredSize(new Dimension(300, 50));
    constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 6;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 0.9;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(locationBox, constraints);


    ////-----------Up Button Display-----------////
    up = new JButton("");
    up.setPreferredSize(new Dimension(70, 50));
    up.setIcon(iconUP);
    constraints = new GridBagConstraints();
    constraints.gridx = 6;
    constraints.gridy = 1;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    up.addActionListener(this);
    panelMain.add(up, constraints);

    JLabel label3 = new JLabel("");
    label3.setBackground(Color.gray);
    label3.setOpaque(true);
    constraints = new GridBagConstraints();
    constraints.gridx = 7;
    constraints.gridy = 1;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(label3, constraints);

    JLabel items = new JLabel("", SwingConstants.CENTER);
    //items.setPreferredSize(new Dimension(600, 50));
    constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.gridwidth = 5;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 0.9;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(items, constraints);

    ////-----------Left Button Display-----------////
    left = new JButton("<");
    left.setPreferredSize(new Dimension(50, 50));
    left.setIcon(iconLeft);
    constraints = new GridBagConstraints();
    constraints.gridx = 5;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    left.addActionListener(this);
    panelMain.add(left, constraints);

    ////-----------Down Button Display-----------////
    down = new JButton("V");
    down.setPreferredSize(new Dimension(50, 50));
    constraints = new GridBagConstraints();
    down.setIcon(iconDown);
    constraints.gridx = 6;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    down.addActionListener(this);
    panelMain.add(down, constraints);

    ////-----------Right Button Display-----------////
    right = new JButton(">");
    right.setPreferredSize(new Dimension(50, 50));
    constraints = new GridBagConstraints();
    right.setIcon(iconRight);
    constraints.gridx = 7;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    right.addActionListener(this);
    panelMain.add(right, constraints);

    ////-----------Spacers Display-----------////
    JLabel space0 = new JLabel("0");
    constraints = new GridBagConstraints();
    constraints.gridx = 0; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space0, constraints);

    JLabel space1 = new JLabel("1");
    constraints = new GridBagConstraints();
    constraints.gridx = 1; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space1, constraints);

    JLabel space2 = new JLabel("2");
    constraints = new GridBagConstraints();
    constraints.gridx = 2; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space2, constraints);

    JLabel space3 = new JLabel("3");
    constraints = new GridBagConstraints();
    constraints.gridx = 3; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space3, constraints);

    JLabel space4 = new JLabel("4");
    constraints = new GridBagConstraints();
    constraints.gridx = 4; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space4, constraints);

    JLabel space5 = new JLabel("5");
    constraints = new GridBagConstraints();
    constraints.gridx = 5; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 0.9;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space5, constraints);

    JLabel space6 = new JLabel("6");
    constraints = new GridBagConstraints();
    constraints.gridx = 6; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space6, constraints);

    JLabel space7 = new JLabel("7");
    constraints = new GridBagConstraints();
    constraints.gridx = 7; 
    constraints.gridy = 3;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    //constraints.weighty = 1;
    //constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(space7, constraints);
    
    
    frame.getContentPane().add(panelMain);
    //frame.pack();
    frame.setVisible(true);


}

public void setTextbox(String s){
    text.setText(s);
}

public void clearTextbox(){
    text.setText("");
}

public void setLocationBox(String s){
    locationBox.setText(s);
}


public void actionPerformed(ActionEvent e) {
    if(e.getSource() == up){
        gc.upButton();
    }
    if(e.getSource() == down){
        gc.downButton();
    }
    if(e.getSource() == left){
        gc.leftButton();
    }
    if(e.getSource() == right){
        gc.rightButton();
    }

}


public void showPasswordArea(){
    label2.setVisible(true);
}

public void hidePasswordArea(){
    label2.setVisible(false);
}

public String getPassword(){

    return label2.getText();
}


public void displayText(String text) {
    setTextbox(text);
}



    
}