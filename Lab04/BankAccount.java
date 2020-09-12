// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

public class BankAccount {
    int accountNumber;
    float balance;

    public BankAccount() {
        accountNumber = 0;
        balance = 0;
    }
    public BankAccount(int accNum, int bal) {
        accountNumber = accNum;
        balance = bal;
    }

    void deposit(float val) {
        balance += val;
    }
    void withdraw(float val) {
        balance -= val;
    }

    int getAccountNumber() { return accountNumber; }
    void setAccountNumber(int val) { accountNumber = val; }

    float getBalance() { return balance; }
    void setBalance(float val) { balance = val; }
}
