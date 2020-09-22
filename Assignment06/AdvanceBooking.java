// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment06;

public class AdvanceBooking extends Ticket {
    private int numDaysUntilGame, ticketPrice;

    public AdvanceBooking() {
        super();
        numDaysUntilGame = 0;
        ticketPrice = 0;
    }
    public AdvanceBooking(int n) {
        super();
        numDaysUntilGame = n;
        if (numDaysUntilGame > 15) {
            ticketPrice = 25;
        } else {
            ticketPrice = 50;
        }
    }

    int getPrice() { return ticketPrice; }
    int getNumDaysUntilGame() { return numDaysUntilGame; }

    void setPrice(int p) { ticketPrice = p; }
    void setDaysUntil(int d) { numDaysUntilGame = d; }

    public String toString() {
        return "You sold: Ticket number " + super.getTicketNumber() + " with a price of $" + getPrice() + " for a game in " + numDaysUntilGame + " days.\n";
    }
}
