package SegPar;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class FrameMultipleSelection_9 extends JFrame {
    private final JList<String> listJListColors;// list to store color names
    private final JList<String> listJListCopy; // list into which the color names are to be copied
    private JButton buttonJButtonCopy;// button to copy the selected names
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Grey", "Grey", "Green", "Light Grey", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    // Constructor of MultiSelectionFrame
    public FrameMultipleSelection_9() {
        super("Multiple-choice lists");
        setLayout(new FlowLayout());

        listJListColors = new JList<String>(colorNames); // list of color names
        listJListColors.setVisibleRowCount(5);
        listJListColors.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListColors)); // add list with scroll pane

        buttonJButtonCopy = new JButton("Copy >>>");
        buttonJButtonCopy.addActionListener(new ActionListener() // anonymous inner class
                                            {
                                                // handle button event
                                                @Override
                                                public void actionPerformed(ActionEvent event) {
                                                    // put the selected values ​​in listJListCopy
                                                    listJListCopy.setListData(listJListColors.getSelectedValuesList().toArray(new String[0]));
                                                }
                                            }
        );
        add(buttonJButtonCopy); // add copy button to JFrame
        listJListCopy = new JList<String>(); // list to save copied color names
        listJListCopy.setVisibleRowCount(5); // show 5 rows
        listJListCopy.setFixedCellWidth(100); // set the width
        listJListCopy.setFixedCellHeight(15); // set the height
        listJListCopy.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListCopy)); // add list with scroll pane
    }
} // end class MultiSelectionFrame