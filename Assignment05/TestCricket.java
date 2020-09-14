// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment05;

public class TestCricket {
    public static void main(String[] args) {
        /*
            STILL NEED UML DIAGRAM
        */
        Environment e = new Environment(60);
        Cricket c1 = new Cricket(e);

        System.out.println("Normal Cricket: " + e.getTemperature() + " degrees yields " + c1.getChirpCount() + " chirps per minute.");

        e = new Environment(70);
        Cricket clem1 = new ClemsonCricket(e);

        System.out.println("Clemson Cricket: " + e.getTemperature() + " degrees yields " + clem1.getChirpCount() + " chirps per minute.");
    }
}
