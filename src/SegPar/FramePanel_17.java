package SegPar;
// Use of a JPanel object to help layout components.

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FramePanel_17 extends JFrame {
    private final JPanel buttonPanel; // panel containing the buttons
    private final JButton[] buttons;

    // constructor with no arguments
    public FramePanel_17() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, buttons.length));

        // create and add the buttons
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonPanel.add(buttons[count]); // add the button to the panel
        }
        add(buttonPanel, BorderLayout.SOUTH); // add panel to JFrame
    }
} // end FramePanel class