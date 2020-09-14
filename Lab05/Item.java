// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab05;

public abstract class Item {
    private String title;

    public Item() {
        title = "";
    }
    public Item(String t) {
        title = t;
    }

    abstract String getListing();

    String getTitle() { return title; }
}
