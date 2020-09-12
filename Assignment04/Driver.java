// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment04;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int input = 1;
        float a, b, c;
        ArrayList<Shape> shapes = new ArrayList<>();

        while (input != 0) {
            displayMenu();
            System.out.print("Please choose an option: ");
            input = scnr.nextInt();

            System.out.println();
            switch (input) {
                case 1:
                    System.out.print("Please enter 1st side for a Rectangle: ");
                    a = scnr.nextFloat();
                    System.out.print("Please enter 2nd side for a Rectangle: ");
                    b = scnr.nextFloat();

                    shapes.add(new Rectangle(a, b));

                    System.out.println("Done creating Rectangle\n");
                    break;
                case 2:
                    System.out.print("Please enter 1st side for a Triangle: ");
                    a = scnr.nextFloat();
                    System.out.print("Please enter 2nd side for a Triangle: ");
                    b = scnr.nextFloat();
                    System.out.print("Please enter 3rd side for a Triangle: ");
                    c = scnr.nextFloat();

                    shapes.add(new Triangle(a, b, c));

                    System.out.println("Done creating Triangle\n");
                    break;
                case 3:
                    for (Shape s : shapes) { 
                        System.out.println(s); 
                    }
                    System.out.println();
                    break;
            }
        }

        System.out.println("Thank you for trying my program!");
    }

    static void displayMenu() {
        System.out.println("---MENU---");
        System.out.println("0 - Exit");
        System.out.println("1 - Add a Rectangle");
        System.out.println("2 - Add a Triangle");
        System.out.println("3 - Display All Shapes with Details");
    }
}