// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;
        try {
            String dataline = "";
            // My working directory has each lab in a folder. I have to use Lab12/input.txt to read into the folder.
            Scanner scnr = new Scanner(new File("Lab12/input.txt"));
            
            while (scnr.hasNextLine()) {
                dataline = scnr.nextLine();
                System.out.println(dataline);
                lines++;
            }

            scnr.close();

            // Output file info
            System.out.println("Total lines = " + lines);
            System.out.println("Total words = " + words);
            System.out.println("Total chars = " + chars);

            /* TODO: Output file info to file */
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
