// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment06;

public class DiscountBooking extends Ticket {
    private int numDaysUntilGame, ticketPrice;

    public DiscountBooking() {
        super();
        numDaysUntilGame = 0;
    }
    public DiscountBooking(int n) {
        super();
        numDaysUntilGame = n;
        if (numDaysUntilGame > 0) {
            ticketPrice = 10;
        } else {
            ticketPrice = 75;
        }
    }

    int getPrice() { return ticketPrice; }
    int getNumDaysUntilGame() { return numDaysUntilGame; }

    void setPrice(int p) { ticketPrice = p; }
    void setDaysUntil(int d) { numDaysUntilGame = d; }

    public String toString() {
        return "Ticket number " + super.getTicketNumber() + " with a price of $" + getPrice() + " is a discount ticket for a game in " + numDaysUntilGame + " days.\n";
    }
}
