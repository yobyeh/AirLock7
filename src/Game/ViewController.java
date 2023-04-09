package Game;
import javax.swing.*;
import java.awt.*;


public class ViewController {




public void startDisplay(){

    JFrame frame = new JFrame("AirLock7");
    frame.setSize(800, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panelMain = new JPanel();
    panelMain.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // JPanel panel1 = new JPanel();
    // panel1.setLayout(new GridBagLayout());

    // JPanel panel2 = new JPanel();
    // panel2.setLayout(new GridBagLayout());

    // JPanel panel3 = new JPanel();
    // panel3.setLayout(new GridBagLayout());

    //Create labels with fixed size
    JLabel label1 = new JLabel("Label 1");
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 1;
    constraints.gridheight = 2;
    // constraints.weightx = 1;
    // constraints.weighty = 1;
    constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(label1, constraints);

    JTextArea textArea = new JTextArea("Text Area");
      constraints.gridx = 1;
      constraints.gridy = 0;
      constraints.gridwidth = 1;
      constraints.gridheight = 2;
      //constraints.weightx = 1;
      //constraints.weighty = 1;
      constraints.fill = GridBagConstraints.BOTH;
    panelMain.add(textArea, constraints);

    //   JLabel label3 = new JLabel("Label 3");
    //   constraints.gridx = 2;
    //   constraints.gridy = 0;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 2;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel1.add(label3, constraints);

    //   JLabel label4 = new JLabel("Label 4");
    //   constraints.gridx = 0;
    //   constraints.gridy = 0;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 1;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel2.add(label4, constraints);

    //   JLabel label6 = new JLabel("Label 6");
    //   constraints.gridx = 1;
    //   constraints.gridy = 0;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 1;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel2.add(label6, constraints);

    //   JLabel label9 = new JLabel("Label 9");
    //   constraints.gridx = 2;
    //   constraints.gridy = 0;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 1;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel3.add(label9, constraints);

    //   JButton up = new JButton("^");
    //   constraints.gridx = 1;
    //   constraints.gridy = 1;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 1;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel2.add(up, constraints);

    //   JButton left = new JButton("<");
    //   constraints.gridx = 0;
    //   constraints.gridy = 0;
    //   constraints.gridwidth = 1;
    //   constraints.gridheight = 1;
    //   constraints.weightx = 1;
    //   constraints.weighty = 1;
    //   constraints.fill = GridBagConstraints.BOTH;
    //   panel2.add(left, constraints);

    
    // // Create labels with fixed size
    // JLabel label1 = new JLabel("Label 1");
    // label1.setPreferredSize(new Dimension(200, 400));

    // JTextArea textArea = new JTextArea("Label 2");
    // textArea.setPreferredSize(new Dimension(400, 400));

    // JLabel label3 = new JLabel("Label 3");
    // label3.setPreferredSize(new Dimension(200, 400));
    // JLabel label4 = new JLabel("Label 4");
    // label4.setPreferredSize(new Dimension(600, 200));
    
    // JLabel label6 = new JLabel("Label 6");
    // label6.setPreferredSize(new Dimension(100, 200));
    // JLabel label9 = new JLabel("Label 9");
    // label9.setPreferredSize(new Dimension(500, 200));

    // JButton up = new JButton("^");
    // up.setPreferredSize(new Dimension(100, 200));
    // JButton left = new JButton("<");
    // left.setPreferredSize(new Dimension(100, 200));
    // JButton down = new JButton("V");
    // down.setPreferredSize(new Dimension(100, 200));
    // JButton right = new JButton(">");
    // right.setPreferredSize(new Dimension(100, 200));


    frame.getContentPane().add(panelMain);
    //frame.pack();
    frame.setVisible(true);


}





    
}