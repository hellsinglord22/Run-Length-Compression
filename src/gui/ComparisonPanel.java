package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparisonPanel extends JPanel {

    /// Attributes //
    private JButton browseInputPathButton,encodeButton , decodeButton;
    private JTextField inputPathTextField;
    private JLabel inputPathLabel;
    private GridBagConstraints constraints;
    private Border innerBorder , outerBorder;

    public ComparisonPanel() {
        /// Initialize attributes ///
        browseInputPathButton = new JButton("Browse");
        encodeButton = new JButton("encode");
        decodeButton = new JButton("decode");
        inputPathLabel = new JLabel("input path: ");
        inputPathTextField = new JTextField(15);
        constraints = new GridBagConstraints();
        innerBorder = BorderFactory.createEtchedBorder();
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        /// set properties ///
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        setComponentsPosition();
        setComponentsBehaviour();




    }


    /// Methods ///
    private void setComponentsPosition() {

    }


    private void setComponentsBehaviour() {
        browseInputPathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        encodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        decodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }




    private void setGrid(int row, int column) {
        constraints.gridx = column;
        constraints.gridy = row;
    }

}
