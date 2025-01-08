package PacketCapture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TsharkAnalyzer {

    public static void main(String[] args) {
        // TShark command to run
        String command = "tshark -i 5 -p -Y \"dns.qry.name\"";
        
        try {
            // Execute the TShark command
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            Process process = processBuilder.start();
            
            // Get the output of TShark
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
          
            // Read the output line by line
            while ((line = reader.readLine()) != null) {
                // Process each line from TShark's output
                System.out.println(line);  // This could be further parsed or analyzed
            }
            
            // Wait for TShark process to finish
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
