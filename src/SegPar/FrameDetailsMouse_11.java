package SegPar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameDetailsMouse_11 extends JFrame {
    private String details; // String displayed in StatusBar
    private final JLabel statusBar; // JLabel that appears at the bottom of the window

    // constructor sets String of title bar and registers mouse listener component
    public FrameDetailsMouse_11() {
        super("Clicks and mouse buttons");
        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // add handler
    }

    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {
        // handle mouse click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // get mouse position x
            int yPos = event.getY(); // get mouse y position

            details = String.format("Clicked %d time(s)", event.getClickCount());
            if (event.isMetaDown()) // right mouse button
                details += "with the right mouse button";
            else if (event.isAltDown()) // middle mouse button
                details += "with the middle mouse button";
            else // left mouse button
                details += "with the left mouse button";
            statusBar.setText(details); // display message in statusbar
        }
    }
} // end class MouseDetailFrame