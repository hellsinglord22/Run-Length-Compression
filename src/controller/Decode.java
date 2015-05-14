package controller;

import gui.CompressionInfo;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decode implements CompressionBehaviour {
    @Override
    public void encodeOrDecode(CompressionInfo event) {
        try {
            String path = event.getInputPath();
            File inputFile = new File(path);
            File outputFile = new File("output.txt");
            String data = FileUtils.readFileToString(inputFile);
            data = decode(data);
            System.out.println(data);
            FileUtils.write(outputFile, data);
            JOptionPane.showMessageDialog(null, "decoding complete\noutput.txt will be in the program home directory"
                    , "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            System.err.println("File was not found!!!");
        } catch (IOException e) {
            System.err.println("You don't have input/output permission!!");
        }


    }
    private static String decode(String source) {
        StringBuffer dest = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            matcher.find();
            while (number-- != 0) {
                dest.append(matcher.group());
            }
        }
        return dest.toString();
    }
}
