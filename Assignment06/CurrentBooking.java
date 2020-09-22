// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment06;

public class CurrentBooking extends Ticket {

    private int ticketPrice;

    public CurrentBooking() {
        super();
        ticketPrice = 75;
    }
    public CurrentBooking(int p) {
        super();
        ticketPrice = p;
    }
    public CurrentBooking(int t, int p) {
        super(t);
        ticketPrice = p;
    }

    int getPrice() { return ticketPrice; }
    void setPrice(int p) { ticketPrice = p; }

    public String toString() {
        return "You sold: Ticket number " + super.getTicketNumber() + " with a price of $" + getPrice() + " for today's game.\n";
    }
    
}
