package controller;

import gui.CompressionInfo;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Encode implements CompressionBehaviour {
    @Override
    public void encodeOrDecode(CompressionInfo event) {
        try {
            String path = event.getInputPath();
            File inputFile = new File(path);
            File outputFile = new File("output.txt");
            String data = FileUtils.readFileToString(inputFile);
            data = encode(data);
            System.out.println(data);
            FileUtils.write(outputFile, data);
            JOptionPane.showMessageDialog(null, "encoding complete\noutput.txt will be in the program home directory"
                    , "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            System.err.println("File was not found!!!");
        } catch (IOException e) {
            System.err.println("You don't have input/output permission!!");
        }

    }
    private static String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append(runLength);
            dest.append(source.charAt(i));
        }
        return dest.toString();
    }
}
