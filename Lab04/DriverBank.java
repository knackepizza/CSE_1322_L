// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

import java.util.Scanner;

public class DriverBank {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        BankAccount c = new BankAccount();
        SavingsAccount s = new SavingsAccount();

        int input = 1;
        String accountType = "";

        while (input != 0) {
            displayMenu();
            System.out.print("Please Choose an Option: ");
            input = scnr.nextInt();
            System.out.println();

            switch (input) {
                case 1:
                    if (accountType == "") { 
                        accountType = "checking"; 
                        System.out.print("Please Enter Your Initital Balance (Minimum 500): ");
                        c.setBalance(scnr.nextFloat());
                    } else {
                        System.out.println("Savings Account already created.");
                    }
                    break;
                case 2:
                if (accountType == "") { 
                    accountType = "savings";
                    System.out.print("Please Enter Your Initital Balance (Minimum 1000): ");
                    s.setBalance(scnr.nextFloat());
                    System.out.print("What is the interest rate: ");
                    s.setInterestRate(scnr.nextFloat());
                    s.addInterest();
                } else {
                    System.out.println("Checking Account already created.");
                }
                    break;
                case 3:
                    if (accountType == "checking") {
                        System.out.println("If you withdraw more than 5 times you will be charged a 10 fee from the amount withdrawn.");
                        System.out.println("Current balance: " + c.getBalance());
                        System.out.print("How much do you want to withdraw? ");
                        c.withdraw(scnr.nextInt());
                    } else {
                        System.out.println("You cannot withdraw from your savings account.");
                    }
                    break;
                case 4:
                    System.out.print("How much do you want to deposit? ");
                    if (accountType == "checking") {
                        c.deposit(scnr.nextInt());
                    } else {
                        s.deposit(scnr.nextInt());
                    }
                    break;
                case 5:
                    if (accountType == "checking") {
                        System.out.println("Your balance: " + c.getBalance());
                    } else {
                        System.out.println("Your balance with interest is: " + s.getBalance());
                    }
                    break;
            }
            System.out.println();
        }
        
        System.out.println("You chose Exit > Thanks for banking with us!");
        
        scnr.close();
    }

    static void displayMenu() {
        System.out.println("---MENU---");
        System.out.println("0 - Exit");
        System.out.println("1 - Create a Checking Account");
        System.out.println("2 - Create a Savings Account");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Deposit");
        System.out.println("5 - Check Balance");
    }
}
