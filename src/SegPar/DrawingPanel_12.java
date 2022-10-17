package SegPar;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawingPanel_12 extends JPanel {
    // lista de referencias Point
    private final ArrayList<Point> points = new ArrayList<>();

    // set the GUI and register the mouse event handler
    public DrawingPanel_12() {
        // handle mouse move event on frame
        addMouseMotionListener(new MouseMotionAdapter() // anonymous inner class
                               {
                                   // store drag coordinates and redraw
                                   @Override
                                   public void mouseDragged(MouseEvent event) {
                                       points.add(event.getPoint());
                                       repaint(); // redraw JFrame
                                   }
                               }
        );
    }

    // draw ovals in a 4 x 4 bounding box, at specified locations in the window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clear the drawing area
        // draw all points
        for (Point point : points)
            g.fillOval(point.x, point.y, 4, 4);
    }
} // end DrawingPanel class