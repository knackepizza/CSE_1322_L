// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment13;

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

    BluRayDisc search(String title) {
        Node current = head;

        while (current.next != null) {
            if (current.disc.getTitle() == title) {
                System.out.print("DVD " + current.disc.getTitle() + " found: ");
                return current.disc;
            }
            current = current.next;
        }
        if (current.disc.getTitle() == title) {
            System.out.print("DVD " + current.disc.getTitle() + " found: ");
            return current.disc;
        }
        System.out.println("DVD " + title + " not found");
        return new BluRayDisc();
    }

    boolean remove(String title) {
        Node current = head;
        Node previous = current;

        if (current.disc.getTitle() == title) {
            head = current.next;
            System.out.println("Delete of " + title + " successful.");
            return true;
        }
        while (current.disc.getTitle() != title) {
            previous = current;
            current = current.next;
            if (current == null) {
                System.out.println("Unable to delete " + title);
                return false;
            }
        }
        previous.next = current.next;
        System.out.println("Delete of " + title + " successful.");
        return true;
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
