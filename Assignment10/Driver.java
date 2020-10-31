// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment10;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = "";

        System.out.println("Enter strings. When finished enter DONE");
        
        while (!input.equals("DONE")) {
            input = scnr.nextLine();

            try {
                checkInput(input);
            } catch (ManyCharactersException e) {
                // This outputs Assignment10.ManyCharactersException: Message.
                // Did you want JUST the Message?
                System.err.println(e);
            }
        }

        scnr.close();
    }

    static void checkInput(String msg) throws ManyCharactersException {
        if (msg.length() < 20) {
            System.out.println("You entered: " + msg);
        } else {
            throw new ManyCharactersException("You entered too many characters");
        }
    }
}
