// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment03;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numOfLightbulbs;
        int[] printVals = {
            7, 12, 21, 25, 33, 36, 41, 
            49, 54, 63, 72, 88, 91, 99
        };

        // If user inputs 50 lightbulbs, <lightbulbs> will be 49
        ArrayList<Lightbulb> lightbulbs = new ArrayList<Lightbulb>();

        // Ask user for amount of lightbulbs
        System.out.print("Enter number of lightbulbs: ");
        numOfLightbulbs = scnr.nextInt();

        // Add how many lightbulbs user said
        for (int i = 1; i <= numOfLightbulbs; i++) {
            lightbulbs.add(new Lightbulb(i));
        }

        // Traverse lightbulbs and only pull if multiple of number supplied
        for (int skip = 1; skip <= numOfLightbulbs; skip++) {
            for (Lightbulb l : lightbulbs) {
                if ((lightbulbs.indexOf(l) + 1) % skip == 0) {
                    l.pullString();
                }
            }
        }

        // Print values only in the specified array
        for (int val : printVals) {
            if (val < numOfLightbulbs) {
                /*
                    val-1 because the value is human-readable (1, 2, 3)
                    while the ArrayList is machine-readable (0, 1, 2)
                */
                System.out.println(lightbulbs.get(val - 1));
            }
        }    

        scnr.close();
    }
}
