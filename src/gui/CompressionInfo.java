package gui;

import java.util.EventObject;

public class CompressionInfo extends EventObject {

    /// Attributes ///
    private String inputPath;


    public CompressionInfo(Object source , String inputPath ) {
        super(source);
        this.inputPath = inputPath;
    }

    /// getters and setters ///
    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }
}
