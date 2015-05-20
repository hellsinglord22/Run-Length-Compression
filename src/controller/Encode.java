package controller;


import gui.CompressionInfo;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static edu.rice.hj.Module1.*;
import edu.rice.hj.api.HjMetrics;
import edu.rice.hj.api.HjRunnable;
import edu.rice.hj.runtime.config.HjSystemProperty;
import edu.rice.hj.runtime.metrics.AbstractMetricsManager;

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
    private static String encode(String source)  {
        StringBuffer dest = new StringBuffer();
        for (final int[] i = {0}; i[0] < source.length(); i[0]++) {
            final int[] runLength = {1};
            finish(()->{
                async(()->{
                    while (i[0] +1 < source.length() && source.charAt(i[0]) == source.charAt(i[0] +1)) {
                        runLength[0]++;
                        i[0]++;
                    }
                });
            });
            dest.append(runLength[0]);
            dest.append(source.charAt(i[0]));
        }
        return dest.toString();
    }
}
