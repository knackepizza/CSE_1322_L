// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

import java.util.Scanner;

public class DriverBank {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("0 - Exit");
        System.out.println("1 - Create a Checking Account");
        System.out.println("2 - Create a Savings Account");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Deposit");
        System.out.println("5 - Check Balance");

        System.out.print("Please Choose an Option: ");
        int input = scnr.nextInt();

        switch (input) {
            case 1:
                System.out.print("Please Enter Your Initital Balance (Minimum 500): ");
                CheckingAccount c = new CheckingAccount(1, scnr.nextInt());
                break;
            case 2:
                System.out.print("Please Enter Your Initital Balance (Minimum 1000): ");
                int tempInitBalance = scnr.nextInt();
                System.out.print("What is the interest rate: ");
                float tempIntRate = scnr.nextFloat();
                SavingsAccount s = new SavingsAccount(tempIntRate, tempInitBalance);
                break;
            case 3:
                System.out.println("If you withdraw more than 5 times you will be charged a 10 fee from the amount withdrawn.");
                System.out.println("Current balance: " + c.getBalance());
                System.out.print("How much do you want to withdraw? ");
                c.withdraw(scnr.nextInt());
                break;
            case 4:
                System.out.print("How much do you want to deposit? ");
                c.deposit(scnr.nextInt());
                break;
            case 5:
                System.out.println("Your balance: " + c.getBalance());
        }
        
        System.out.println("You chose Exit > Thanks for banking with us!");
    }
}
