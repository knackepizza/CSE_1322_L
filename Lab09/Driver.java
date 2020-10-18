// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab09;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int a, b;

        System.out.println("Please enter a value for x");
        a = scnr.nextInt();
        System.out.println("Please enter a value for y");
        b = scnr.nextInt();
        System.out.println(CalculateExponent(a, b));

        System.out.println("Please enter a value for i");
        a = scnr.nextInt();
        System.out.println("Please enter a value for j");
        b = scnr.nextInt();
        System.out.println(IntegerMultiply(a, b));

        scnr.close();
    }

    static int CalculateExponent(int x, int y) {
        if (y > 0) {
            return (x * CalculateExponent(x, y-1));
        } else {
            return 1;
        }
    }

    static int IntegerMultiply(int i, int j) {
        if (j > 0) {
            return (i + IntegerMultiply(i, j-1));
        } else {
            return 0;
        }
    }
}