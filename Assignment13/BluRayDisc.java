// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment13;

public class BluRayDisc {
    private String title, director;
    private int yearOfRelease;
    private double cost;

    public BluRayDisc() {
        cost = 4.95;
        yearOfRelease = 2001;
        title = "Shrek";
        director = "Andrew Adamson";
    }
    public BluRayDisc(double c, int y, String t, String d) {
        cost = c;
        yearOfRelease = y;
        title = t;
        director = d;
    }

    double getCost() { return cost; }

    String getTitle() { return title; }

    @Override
    public String toString() {
        return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
    }
}
