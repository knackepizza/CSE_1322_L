// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

public class CheckingAccount extends BankAccount {

    int noOfTransactions = 0, processingFee = 0;

    // Default constructor invokes super
    public CheckingAccount() {
        super(0, 0);
    }

    public CheckingAccount(int accNum, int bal) {
        super(accNum, bal);
    }

    void withdraw(int val) {
        noOfTransactions += 1;

        if (noOfTransactions > 5) {
            processingFee = 10; 
        }

        super.withdraw(val + processingFee);
    }
    
}
