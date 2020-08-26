package Assignment02;

public class Video {
    int id, minDaysOnHold;
    boolean isCheckedIn;
    String dueDate, title, length;

    public Video () {
        id = 516271;
        title = "John Wick: Chapter 2";
        isCheckedIn =  false;
        length = "1.25 hours";
    }

    public Video (int uId, String uTitle, boolean uIsCheckedIn, String ulength) {
        id = uId;
        title = uTitle;
        isCheckedIn =  uIsCheckedIn;
        length = ulength;
    }

    public String toString() {
        return "Id: " + id + "\nTitle: " + title + "\nChecked in: " + isCheckedIn + "\nLength: " + length + "\n";
    }

    // What is this method even for?
    public void putOnHold(int numDaysOnHold) {
        minDaysOnHold = numDaysOnHold;
    }

    int getId() { return id; }
    void setId(int input) { id = input; }

    String getTitle() { return title; }
    void setTitle(String input) { title = input; }

    boolean getIsCheckedIn() { return isCheckedIn; }
    void setIsCheckedIn(boolean input) { isCheckedIn = input; }

    String getLength() { return length; }
    void setLength(String input) { length = input; }
}