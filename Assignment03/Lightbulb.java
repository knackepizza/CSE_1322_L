// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
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
    void setId(int i) {
        id = i;
    }

    /*
        You guys said that the isOnOrOff() should return a boolean, 
        but in the examples you display it as a 0 or 1 value.
        So I added a method to make it 0 or 1 like you guys have it.
    */
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
