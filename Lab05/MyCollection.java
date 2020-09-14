// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab05;

import java.util.Scanner;
import java.util.ArrayList;

public class MyCollection {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        String tempName, tempAuthor;
        int tempIsbn, tempIssueNum;

        int amountOfItems = 0;

        while (amountOfItems != 5) {
            System.out.print("Please enter B for Book and P for Periodical: ");
            char input = scnr.next().charAt(0);
            scnr.nextLine();
            switch (input) {
                case 'B':
                    System.out.print("Please enter name of Book: ");
                    tempName = scnr.nextLine();
                    System.out.print("Please enter name of Author: ");
                    tempAuthor = scnr.nextLine();
                    System.out.print("Please enter the ISBN: ");
                    tempIsbn = scnr.nextInt();

                    items.add(new Book(tempName, tempAuthor, tempIsbn));
                    amountOfItems++;
                    break;
                case 'P':
                    System.out.print("Please enter name of Periodical: ");
                    tempName = scnr.nextLine();
                    System.out.print("Please enter the Issue #: ");
                    tempIssueNum = scnr.nextInt();

                    items.add(new Periodical(tempName, tempIssueNum));
                    amountOfItems++;
                    break;
                default:
                    System.out.println("Try again.\n");
                    break;
            }
        }

        for (Item i : items) {
            System.out.println(i.getListing());
        }

        scnr.close();
    }
}
