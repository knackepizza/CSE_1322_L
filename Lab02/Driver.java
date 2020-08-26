package Lab02;

public class Driver {
    public static void main(String[] args) {
        stockItem s1 = new stockItem("TSLA", 312, 14, 2014.3);
        
        // Demonstrating each method

        // Demonstrate changing Quantity
        System.out.println("Initital Quantity: " + s1.getQuantity());
        s1.addQuantity(21);
        System.out.println("Added 21: " + s1.getQuantity());
        s1.removeQuantity(7);
        System.out.println("Removed 7: " + s1.getQuantity());
        s1.setQuantity(18);
        System.out.println("Quantity set to 18: " + s1.getQuantity() + "\n");
        
        // Demonstrate changing ID
        System.out.println("Initital ID:" + s1.getID());
        s1.setID(4);
        System.out.println("ID set to 4: " + s1.getID() + "\n");

        // Demonstrate changing Price
        System.out.println("Initital Price: " + s1.getPrice());
        s1.setPrice(1988.2);
        System.out.println("Price set to 1988.2: " + s1.getPrice() + "\n");

        // Demonstrate changing Description
        System.out.println("Initital Description: " + s1.getDescription());
        s1.setDescription("SPY");
        System.out.println("Description set to SPY: " + s1.getDescription() + "\n");

        System.out.println(s1.toString());

        stockItem s2 = new stockItem("NIO", 4089, 58, 15.8);
        System.out.println(s2.toString());
    }
}