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
        ArrayList<Lightbulb> lightbulbs = new ArrayList<Lightbulb>();

        System.out.print("Enter number of lightbulbs: ");
        numOfLightbulbs = scnr.nextInt();

        for (int i = 0; i < numOfLightbulbs; i++) {
            lightbulbs.add(new Lightbulb(i));
        }

        for (Lightbulb l : lightbulbs) {
            System.out.println(l.toString());
        }
    }
}
