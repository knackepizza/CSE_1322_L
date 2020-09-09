// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

public class BankAccount {
    int accountNumber, balance;

    public BankAccount(int accNum, int bal) {
        accountNumber = accNum;
        balance = bal;
    }

    void deposit(int val) {
        balance += val;
    }
    void withdraw(int val) {
        balance -= val;
    }

    int getAccountNumber() { return accountNumber; }
    void setAccountNumber(int val) { accountNumber = val; }

    int getBalance() { return balance; }
    void setBalance(int val) { balance = val; }
}
