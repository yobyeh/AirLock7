package Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//pop up woindow for map.. map button
//





public class ViewController implements ActionListener{

GameController gc;

JLabel text = new JLabel("Text", SwingConstants.CENTER);

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
    GridBagConstraints constraints = new GridBagConstraints();
    
    //Create labels with fixed size
    JLabel label1 = new JLabel("");
    label1.setBackground(Color.gray);
    label1.setOpaque(true);
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(label1, constraints);

    
    //text.setBackground(Color.red);
    //text.setOpaque(true);
    constraints = new GridBagConstraints();
    constraints.gridx = 2;
    constraints.gridy = 0;
    constraints.gridwidth = 4;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(text, constraints);

    JLabel label2 = new JLabel("");
    label2.setBackground(Color.gray);
    label2.setOpaque(true);
    constraints = new GridBagConstraints();
    constraints.gridx = 6;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(label2, constraints);

    JLabel questBox = new JLabel("Quest", SwingConstants.CENTER);
    constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 5;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(questBox, constraints);

    JButton up = new JButton("^");
    constraints = new GridBagConstraints();
    constraints.gridx = 6;
    constraints.gridy = 1;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
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

    JLabel items = new JLabel("Items", SwingConstants.CENTER);
    constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.gridwidth = 5;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(items, constraints);

    JButton left = new JButton("<");
    constraints = new GridBagConstraints();
    constraints.gridx = 5;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(left, constraints);

    JButton down = new JButton("V");
    constraints = new GridBagConstraints();
    constraints.gridx = 6;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(down, constraints);

    JButton right = new JButton(">");
    constraints = new GridBagConstraints();
    constraints.gridx = 7;
    constraints.gridy = 2;
    constraints.gridwidth = 1;
    //constraints.gridheight = 1;
    constraints.weightx = 1;
    constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(right, constraints);

    //spacers
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
    constraints.weightx = 1;
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

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}





    
}