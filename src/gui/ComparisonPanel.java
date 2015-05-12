package gui;

import javax.swing.*;
import java.awt.*;

public class ComparisonPanel extends JPanel {

    /// Attributes //
    private JButton browseInputPathButton,encodeButton , decodeButton;
    private JTextField inputPathTextField;
    private JLabel inputPathLabel;
    private GridBagConstraints constraints;

    public ComparisonPanel() {
        /// Initialize attributes ///
        browseInputPathButton = new JButton("Browse");
        encodeButton = new JButton("encode");
        decodeButton = new JButton("decode");
        inputPathLabel = new JLabel("input path: ");
        inputPathTextField = new JTextField(15);
        constraints = new GridBagConstraints();

        /// set properties ///
        setLayout(new GridBagLayout());
        setComponentsPosition();
        setComponentsBehaviour();




    }
    private void setComponentsPosition() {

    }
    private void setComponentsBehaviour() {

    }

}
