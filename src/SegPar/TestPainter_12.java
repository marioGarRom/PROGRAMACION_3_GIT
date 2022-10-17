package SegPar;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestPainter_12 {
    public static void main(String[] args) {
        // crea objeto JFrame
        JFrame application = new JFrame("A simple drawing program");
        DrawingPanel_12 Drawing = new DrawingPanel_12();
        application.add(Drawing, BorderLayout.CENTER);
        // create a label and place it in the SOUTH region of the BorderLayout
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
} // end Painter class