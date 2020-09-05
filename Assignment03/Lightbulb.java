// Name: Nick Nettleton
// Class: 1321L
// Professor Adeojo

package Assignment03;

public class Lightbulb {
    int id;
    boolean isOn;

    public Lightbulb() {
        id = 0;
        isOn = false;
    }

    public Lightbulb(int uId) {
        id = uId;
    } 

    public Lightbulb(int uId, boolean uIsOn) {
        id = uId;
        isOn = uIsOn;
    } 

    void pullString() {
        isOn = !isOn;
    }

    boolean isOnOrOff() {
        return isOn;
    }

    public String toString() {
        return id + " " + isOn;
    }
}
