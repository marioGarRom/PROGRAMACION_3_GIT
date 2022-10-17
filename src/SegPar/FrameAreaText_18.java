package SegPar;

// Copia el texto seleccionado de un área JText a otra.

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class FrameAreaText_18 extends JFrame {
    private final JTextArea TextArea1; // show demo string
    private final JTextArea TextArea2; // the highlighted text is copied here
    private final JButton copyButton; // start copying text

    // constructor with no arguments
    public FrameAreaText_18() {
        super("JTextArea Demo");
        Box box = Box.createHorizontalBox(); // create a frame
        String demo = "This is a demo string for\n" + "illustrating how to copy text\nfrom one textarea to\n" + "another, using an\nexternal event\n";

        TextArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(TextArea1)); // add scroll panel

        copyButton = new JButton("Copy >>>"); // create copy button
        box.add(copyButton); // add copy button to box
        copyButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    // set the text in textArea2 with the selected text from textArea1
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        TextArea2.setText(TextArea1.getSelectedText());
                    }
                }
        );

        TextArea2 = new JTextArea(10, 15);
        TextArea2.setEditable(false);
        box.add(new JScrollPane(TextArea2)); // add scroll panel

        add(box); // add frame to frame
    }
} // end class TextAreaFrame