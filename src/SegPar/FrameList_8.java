package SegPar;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class FrameList_8 extends JFrame {

    private final JList<String> listJListColors; // list to display colors
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Grey", "Grey", "Green", "Light Grey", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};

    // The ListFrame constructor adds the JScrollPane containing the JList to the JFrame
    public FrameList_8() {
        super("JList test");
        setLayout(new FlowLayout());
        listJListColors = new JList<String>(colorNames);// list of colorNames
        listJListColors.setVisibleRowCount(5);// show five rows at a time

        // don't allow multiple selections
        listJListColors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane object containing the JList to the frame
        add(new JScrollPane(listJListColors));


        listJListColors.addListSelectionListener(
                new ListSelectionListener() // anonymous inner class
                {
                    // handle list selection events
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[listJListColors.getSelectedIndex()]);
                    }
                }
        );
    }
} // end class ListFrame