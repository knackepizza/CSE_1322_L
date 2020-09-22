// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment06;

import java.util.Scanner;
import java.util.ArrayList;

public class PurchaseTicket {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        Ticket temp;
        int input = 0;

        while (input != 5) {
            displayMenu();
            input = scnr.nextInt();

            switch (input) {
                case 1:
                    System.out.println("How many days until the game?");
                    temp = new AdvanceBooking(scnr.nextInt());
                    tickets.add(temp);
                    System.out.println(temp);
                    break;
                case 2:
                    temp = new CurrentBooking();
                    tickets.add(temp);
                    System.out.println(temp);
                    break;
                case 3:
                    System.out.println("How many days until the game? [0 for today]");
                    temp = new DiscountBooking(scnr.nextInt());
                    tickets.add(temp);
                    System.out.println(temp);
                    break;
                case 4:
                    System.out.println("Here are all the tickets you sold:");
                    for (Ticket t : tickets) {
                        System.out.print(t);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        
        scnr.close();
    }

    static void displayMenu() {
        System.out.println("Choose from the following:");
        System.out.println("1. Sell a Ticket for a future game");
        System.out.println("2. Sell a Ticket for today's game");
        System.out.println("3. Sell a Discount Ticket");
        System.out.println("4. Print All Tickets");
        System.out.println("5. Exit");
    }
}
