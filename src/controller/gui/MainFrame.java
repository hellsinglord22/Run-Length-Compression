package controller.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    /// Attributes ///
    private Container mainFrameContainer;
    private ComparisonPanel mainFrameComparisonPanel;


    /// Constructor ///
    public MainFrame(String title) {
            super(title);

        /// Change looks and feels //
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("couldn't load the looks and feels");
        }

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
        mainFrameContainer.add(mainFrameComparisonPanel);
    }

    private void setComponentsBehaviour() {
        // Rooting information here ///
    }


}
