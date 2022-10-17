package SegPar;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameFlowLayout_14 extends JFrame {
    private final JButton leftJButtonButton; // button to set left alignment
    private final JButton buttonJButtonCenter; // button to set the alignment to center
    private final JButton buttonJButtonRight; // button to set the alignment to the right
    private final FlowLayout schema; // schema object
    private final Container container; // container to set the schema

    // set up the GUI and register the button listeners
    public FrameFlowLayout_14() {
        super("FlowLayout Demo");

        schema = new FlowLayout();
        container = getContentPane(); // get container for schema
        setLayout(schema);
// set buttonJButtonLeft and register listener component
        leftJButtonButton = new JButton("Left");
        add(leftJButtonButton); // add Left button to frame
        leftJButtonButton.addActionListener(new ActionListener() // anonymous inner class
        {
            // process event of buttonJButtonIzquierda
            @Override
            public void actionPerformed(ActionEvent event) {
                schema.setAlignment(FlowLayout.LEFT);

                // realign attached components
                schema.layoutContainer(container);
            }
        });

        // set buttonJButtonCenter and register listener component
        buttonJButtonCenter = new JButton("Center");
        add(buttonJButtonCenter); // add Center button to frame
        buttonJButtonCenter.addActionListener(new ActionListener() // anonymous inner class
        {
            // process event of buttonJButtonCentro
            @Override
            public void actionPerformed(ActionEvent event) {
                schema.setAlignment(FlowLayout.CENTER);

                // realign attached components
                schema.layoutContainer(container);
            }
        });

        // set RightButtonJButton and register listener
        buttonJButtonRight = new JButton("Right");
        add(buttonJButtonRight); // add Right button to frame
        buttonJButtonRight.addActionListener(new ActionListener() // anonymous inner class
        {
            // process event of buttonJButtonRight
            @Override
            public void actionPerformed(ActionEvent event) {
                schema.setAlignment(FlowLayout.RIGHT);
                // realign attached components
                schema.layoutContainer(container);
            }
        });
    } // end FrameFlowLayout constructor
} // end FrameFlowLayout class