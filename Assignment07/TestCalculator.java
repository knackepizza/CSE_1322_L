// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment07;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input = 0;
        String a = "", b = "";
        Calculator calc;

        System.out.println("Would you like to do calculations with decimal or hexadecimal numbers (1 for Decimal, 2 for Hexadecimal)");
        input = scnr.nextInt();

        if (input == 1) {
            calc = new Calculator();
        } else {
            calc = new HexCalc();
        }

        while (input != 0) {
            displayMenu();
            System.out.print("Please Choose an Option: ");
            input = scnr.nextInt();

            if (input != 0) {
                System.out.println("Please enter the first number");
                a = scnr.next();
                System.out.println("Please enter the second number");
                b = scnr.next();
            }

            switch (input) {
                case 1:
                    System.out.println(calc.add(a, b));
                    break;
                case 2:
                    System.out.println(calc.subtract(a, b));
                    break;
                case 3:
                    System.out.println(calc.multiply(a, b));
                    break;
                case 4:
                    System.out.println(calc.divide(a, b));
                    break;
            }
        }

        scnr.close();
    }   
    
    static void displayMenu() {
        System.out.println("---MENU---");
        System.out.println("0 - Exit");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
    }
}
