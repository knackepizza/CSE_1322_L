// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab14;

public class BluRayCollection {
    private Node head;

    class Node { 
        public BluRayDisc disc;
        public Node next;
        public Node(BluRayDisc blu) {
            disc = blu;
        }
    }

    public BluRayCollection() {
        head = null;
    }

    void add(BluRayDisc blu) {
        Node tomato = new Node(blu);
        tomato.next = head;
        head = tomato;
    }

    // Appending means add to the end
    void addToEnd(BluRayDisc blu) {
        Node temp = new Node(blu);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = temp;
    }

    int countDiscs() {
        Node current = head;
        int discs = 1;

        while (current.next != null) {
            current = current.next;
            discs++;
        }

        return discs;
    }

    double calculateTotalCost() {
        Node current = head;
        double cost = 0.0;
        
        while (current.next != null) {
            cost += current.disc.getCost();
            current = current.next;
        }
        cost += current.disc.getCost();

        return Math.floor((cost * 0.1) * 100) / 10;
    }

    double calculateAverageCost() {
        return (calculateTotalCost() / countDiscs());
    }

    String listAllDiscs() {
        Node current = head;
        String list = "";

        while (current.next != null) {
            list += current.disc.toString() + "\n";
            current = current.next;
        } 
        list += current.disc.toString() + "\n";

        return list;
    }

    @Override
    public String toString() {
        return "\nNumber of BluRayDiscs: " + countDiscs() + 
               "\nTotal cost: " + calculateTotalCost() + 
               "\nAverage cost: " + calculateAverageCost() +
               "\n\nBluRayDisc List:\n\n" + listAllDiscs();
    }
}
