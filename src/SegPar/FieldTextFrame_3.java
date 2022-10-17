package SegPar;
// The JTextField and JPasswordField components.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FieldTextFrame_3 extends JFrame {
    private final JTextField textField1; // fixed size text fiels
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private final JPasswordField passField; // password field with text

    //The constructor of FrameTextField add objects JTextField to JFrame
    public FieldTextFrame_3() {
        super("Test of JText and JPasswordField");
        setLayout(new FlowLayout());
        // Build text field with 10 columns
        textField1 = new JTextField(10);
        add(textField1); //add textField1 to JFrame
        //Build textfield with default text
        textField2 = new JTextField("Enter the text here");
        add(textField2); //add textField2 to JFrame
        //Build textfield with default text and 21 columns
        textField3 = new JTextField("Non-editable text field", 21);
        textField3.setEditable(false); //disable editing
        add(textField3); ////add textField3 to JFrame
        // build password field with default text
        passField = new JPasswordField("Hidden text");
        add(passField); //add passField to JFrame
        //register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passField.addActionListener(handler);
    }

    // private inner class for event handling
    private class TextFieldHandler implements ActionListener {
        // process text field events
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";
            // the user pressed Enter on the JTextField object textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s", event.getActionCommand());
                // the user pressed Enter on the JTextField object textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());
                // the user pressed Enter on the JTextField object textField3
            else if (event.getSource() == textField3)
                string = String.format("textField3: %s", event.getActionCommand());
                // the user pressed Enter on the JTextField object PasswordField
            else if (event.getSource() == passField)
                string = String.format("passField: %s", event.getActionCommand());
            // display the content of the JTextField object
            JOptionPane.showMessageDialog(null, string);
        }
    } // end private inner class TextFieldHandler
} // end class FrameTextField