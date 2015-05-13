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
    private JFileChooser myFileChooser;

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
        myFileChooser = new JFileChooser();

        /// set properties ///
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        setComponentsPosition();
        setComponentsBehaviour();

    }


    /// Methods ///
    private void setComponentsPosition() {
        // first row ///
        setGrid(0, 0);
        constraints.weighty = 0.1;
        constraints.insets = new Insets(30, 5, 5, 5);
        add(inputPathLabel, constraints);

        setGrid(0, 1);
        add(inputPathTextField, constraints);

        setGrid(0, 2);
        add(browseInputPathButton, constraints);

        /// second row ///
        constraints.weighty = 2;
        constraints.anchor = GridBagConstraints.LINE_END;
        setGrid(1, 0);
        add(encodeButton, constraints);

        setGrid(1, 2);
        constraints.anchor = GridBagConstraints.LINE_START;
        add(decodeButton, constraints);

    }


    private void setComponentsBehaviour() {
        browseInputPathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myFileChooser.showOpenDialog(ComparisonPanel.this) == JFileChooser.APPROVE_OPTION) {
                    String path = myFileChooser.getSelectedFile().toString();
                    inputPathTextField.setText(path);
                }
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
