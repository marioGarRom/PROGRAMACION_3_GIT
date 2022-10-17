package SegPar;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameworkCrawlerMouse_10 extends JFrame {
    private final JPanel mousePanel;// panel on which mouse events will occur
    private final JLabel statusBar; // display event information

    // The MouseTrackerFrame constructor sets up the GUI and registers the mouse event handlers
    public FrameworkCrawlerMouse_10() {
        super("Show mouse events");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); // add panel to JFrame

        statusBar = new JLabel("Mouse out of JPanel");
        add(statusBar, BorderLayout.SOUTH);// add label to JFrame
        // create and register a listener for mouse and mouse movement events
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        // The MouseListener event handlers
        // handle the event when the mouse is released right after the button is pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("[%d, %d] was clicked", event.getX(), event.getY()));
        }

        // handle event when mouse is pressed
        @Override
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed on [%d, %d]", event.getX(), event.getY()));
        }

        // handle event when mouse button is released
        @Override
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Dropped on [%d, %d]", event.getX(), event.getY()));
        }

        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered [%d, %d]", event.getX(), event.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        // handle event when mouse leaves area
        @Override
        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse out of JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        // MouseMotionListener event handlers handle
        // the event when the user drags the mouse with the button pressed
        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged on [%d, %d]", event.getX(), event.getY()));
        }

        // handle event when user moves mouse
        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved on [%d, %d]", event.getX(), event.getY()));
        }
    } // end inner class MouseHandler
} // end MouseTrackerFrame class