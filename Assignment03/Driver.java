// Name: Nick Nettleton
// Class: 1321L
// Professor Adeojo

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

        System.out.print("Enter number of lightbulbs: ");
        numOfLightbulbs = scnr.nextInt();

        for (int i = 0; i < numOfLightbulbs; i++) {
            lightbulbs.add(new Lightbulb(i));
        }

        // Iterator to add a skip until max value
        for (int skip = 0; skip < numOfLightbulbs; skip++) {
            for (int i = skip; i < numOfLightbulbs; i += skip) {
                lightbulbs.get(i).pullString();
                System.out.println(lightbulbs.get(i).toString());
                System.out.println("SKIP: " + skip + " | LB: " + i);
                if (skip == 0) skip++;
            }
            System.out.println("=== NEW SKIP ===");
        }

        for (int val : printVals) {
            if (val < numOfLightbulbs) {
                System.out.println(lightbulbs.get(val).toString());
            }
        }

        scnr.close();
    }
}
