package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    /// Attributes ///
    private Container mainFrameContainer;
    private ComparisonPanel mainFrameComparisonPanel;


    /// Constructor ///
    public MainFrame(String title) {
            super(title);

        /// Initialize attributes ///
        mainFrameContainer = getContentPane();
        mainFrameComparisonPanel = new ComparisonPanel();

        // set properties ///
        setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        setComponentsPositions();
        setComponentsBehaviour();
    }

    /// Methods ///
    private void setComponentsPositions() {

    }

    private void setComponentsBehaviour() {

    }


}
