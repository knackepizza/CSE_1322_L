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

        for (int skip = 1; skip <= numOfLightbulbs; skip++) {
            for (Lightbulb l : lightbulbs) {
                if (l.getId() % skip == 0) {
                    l.pullString();
                }
            }
        }

        for (int val : printVals) {
            if (val < numOfLightbulbs) {
                System.out.println(lightbulbs.get(val).toString());
            }
        }    

        scnr.close();
    }
}
