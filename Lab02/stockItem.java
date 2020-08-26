package Lab02;

public class stockItem {
    String description;
    int myID, myQuantity;
    float myPrice;

    public stockItem () {
        this.description = "Nice!";
        this.myID = 1;
        this.myQuantity = 1;
        this.myPrice = 1.0f;
    }

    public stockItem (String desc, int id, int quant, float price) {
        this.description = desc;
        this.myID = id;
        this.myQuantity = quant;
        this.myPrice = price;
    }

    void addQuantity(int amount) { this.myQuantity += amount; }
    void removeQuantity(int amount) { this.myQuantity -= amount; }

    String getDescription() { return this.description; }
    void setDescription(String input) { this.description = input; }

    int getID() { return this.myID; }
    void setID(int input) { this.myID = input; }

    int getQuantity() { return this.myQuantity; }
    void setQuantity(int input) { this.myQuantity = input; }
    
    float getPrice() { return this.myPrice; }
    void setPrice(float input) { this.myPrice = input; }

    public String toString() {
        return "ID: " + this.myID + ", Description: " + this.description + ", Quantity: " + this.myQuantity + ", Price: " + this.myPrice;
    }
}