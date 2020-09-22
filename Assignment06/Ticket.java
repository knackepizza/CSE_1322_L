// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment06;

public abstract class Ticket {
    private int ticketNumber;
    private static int nextTicketNumber = 1;

    public Ticket() {
        ticketNumber = nextTicketNumber++;
    }
    public Ticket(int t) {
        ticketNumber = t;
    }

    abstract int getPrice();

    int getTicketNumber() { return ticketNumber; }
    int getNextTicketNumber() { return nextTicketNumber; }

    public String toString() {
        return "Ticket Number: " + ticketNumber;
    }
}
