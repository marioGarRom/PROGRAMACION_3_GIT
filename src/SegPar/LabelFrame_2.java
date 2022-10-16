package SegPar;
// Jlabel components with text and icons.

import java.awt.*;
import javax.swing.*;

public class LabelFrame_2 extends JFrame {
    private JLabel label1; // JLabel with text only
    private JLabel label2; // JLabel built with text and an icon
    private JLabel label3; // JLabel with additional text and icon

    public LabelFrame_2() {


        super("JLabel test");
        setLayout(new FlowLayout()); // set the frame schema

        // JLabel constructor with a String argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); // add label1 to JFrame

        // JLabel constructor with string, Icon, and alignment arguments
        Icon pc = new ImageIcon(getClass().getResource("01pc.png"));
        label2 = new JLabel("Label with text and icon", pc, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // add label2 to JFrame

        label3 = new JLabel(); // JLabel constructor with no arguments
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(pc); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); // add label3 to JFrame
    }
}// end LabelFrame class