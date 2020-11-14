// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment11;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
            ArrayList<String> alphaArr = new ArrayList<>();
            ArrayList<String> betaArr = new ArrayList<>();

            // My working directory has each lab in a folder. I have to use Assignment11/alpha.txt to read into the folder.
            Scanner alphascnr = new Scanner(new File("Assignment11/alpha.txt"));
            Scanner betascnr = new Scanner(new File("Assignment11/beta.txt"));

            while (alphascnr.hasNextLine()) {
                alphaArr.add(alphascnr.nextLine());
            }
            
            while (betascnr.hasNextLine()) {
                betaArr.add(betascnr.nextLine());
            }

            compareTwoLines(alphaArr, betaArr);

            alphascnr.close();
            betascnr.close();

        } catch (NotEnoughDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Couldn't read file " + e.getMessage().split(" ")[0]);
        }
    }

    static void compareTwoLines(ArrayList<String> a, ArrayList<String> b) throws NotEnoughDataException {
        if (a.size() != b.size()) {
            throw new NotEnoughDataException("NOT ENOUGH DATA");
        }

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                System.out.println("Line " + (i + 1));
                System.out.println("< " + a.get(i));
                System.out.println("> " + b.get(i));
            }
        }
    }
}
