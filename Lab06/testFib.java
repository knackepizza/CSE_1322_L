// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Lab06;

import java.util.Scanner;

public class testFib {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int input = scnr.nextInt();

        System.out.println("The Fibonacci value at position " + input + " using iteration is " + new FibIteration().getFib(input));
        System.out.println("The Fibonacci value at position " + input + " using a formula is " + new FibFormula().getFib(input));
    }
}
