// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Lab07;

import java.util.Scanner;

public class CalculatorTestDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int input = 1;
        float a = 0, b = 0;
        Calculator calc = new Calculator();

        while (input != 0) {
            displayMenu();
            System.out.print("Please Choose an Option: ");
            input = scnr.nextInt();

            if (input != 0) {
                System.out.println("Please enter the first number");
                a = scnr.nextFloat();
                System.out.println("Please enter the second number");
                b = scnr.nextFloat();
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
        System.out.println("You chose to Exit > THANK YOU! GOOD BYE!!!");
        
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
