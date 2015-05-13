package controller.gui;

import java.util.EventObject;

public class CompressionInfo extends EventObject {

    /// Attributes ///
    private String inputPath;
    private Order buttonClicked;


    public CompressionInfo(Object source , String inputPath , Order buttonClicked) {
        super(source);
        this.inputPath = inputPath;
        this.buttonClicked = buttonClicked;
    }

    /// getters and setters ///
    public Order getButtonClicked() {
        return buttonClicked;
    }

    public void setButtonClicked(Order buttonClicked) {
        this.buttonClicked = buttonClicked;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }
}
