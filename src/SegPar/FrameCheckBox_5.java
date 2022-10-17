package SegPar;
// JcheckBox buttons and element events.

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class FrameCheckBox_5 extends JFrame {
    private JTextField textField; // display the text in changing fonts
    private JCheckBox boldJCheckBox; // to select/deselect bold
    private JCheckBox italicsJCheckBox; // to select/deselect italics

    // The constructor of CheckBoxFrame adds JCheckBox objects to JFrame
    public FrameCheckBox_5() {
        super("JCheckBox test");
        setLayout(new FlowLayout());
        // set JTextField and its font
        textField = new JTextField("Watch how the font style changes", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);// add textField to JFrame

        // register listener components for JCheckBox objects
        boldJCheckBox = new JCheckBox("Bold font");
        italicsJCheckBox = new JCheckBox("Italics");
        add(boldJCheckBox);
        add(italicsJCheckBox);
        FrameCheckBox handler = new FrameCheckBox();
        boldJCheckBox.addItemListener(handler);
        italicsJCheckBox.addItemListener(handler);
    }

    // private inner class for handling ItemListener events
    private class FrameCheckBox implements ItemListener {
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent evento) {
            Font tipoletra = null; // store the new Font object
            // determine which CheckBox objects are selected and create the Font object
            if (boldJCheckBox.isSelected() && italicsJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD, 14);
            else if (italicsJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.ITALIC, 14);
            else
                tipoletra = new Font("Serif", Font.PLAIN, 14);
            textField.setFont(tipoletra);
        }
    }
}// end class CheckBoxFrame