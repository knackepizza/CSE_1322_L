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

    int getId() {
        return id;
    }

    int convertBoolToInt(boolean val) {
        if (val == true) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return id + " " + convertBoolToInt(isOn);
    }
}
