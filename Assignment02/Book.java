package Assignment02;

public class Book {
    private int id, pages, minDaysOnHold;
    private boolean isCheckedIn;
    private String dueDate, title, author, genre;

    public Book () {
        id = 234000123;
        title = "Lord of the Rings";
        isCheckedIn =  false;
        author = "Tolkien";
        genre = "fiction";
        pages = 238;
    }

    public Book (int uId, String uTitle, boolean uIsCheckedIn, String uAuthor, String uGenre, int uPages) {
        id = uId;
        title = uTitle;
        isCheckedIn =  uIsCheckedIn;
        author = uAuthor;
        genre = uGenre;
        pages = uPages;
    }

    public String toString() {
        if (minDaysOnHold != 0) {
            return "Id: " + id + "\nTitle: " + title + "\nChecked in: " + isCheckedIn + "\nAuthor" + author + "\nGenre: " + genre + "\nPages: " + pages + "\nNo. of Days On Hold: " + minDaysOnHold;
        }
        return "Id: " + id + "\nTitle: " + title + "\nChecked in: " + isCheckedIn + "\nAuthor" + author + "\nGenre: " + genre + "\nPages: " + pages + "\n";
    }

    // What is this method even for?
    public void putOnHold(int numDaysOnHold) {
        this.minDaysOnHold = numDaysOnHold;
    }
    public void putOnHold(String uAuthor, String uTitle, int uPages, int numDaysOnHold) {
        author = uAuthor;
        title = uTitle;
        pages = uPages;
        this.minDaysOnHold = numDaysOnHold;
    }

    public void checkOut() {
        isCheckedIn = false;
    }
    public void checkIn() {
        isCheckedIn = true;
    }
    
    int getId() { return id; }
    void setId(int input) { id = input; }

    String getTitle() { return title; }
    void setTitle(String input) { title = input; }

    boolean getIsCheckedIn() { return isCheckedIn; }
    void setIsCheckedIn(boolean input) { isCheckedIn = input; }

    String getAuthor() { return author; }
    void setAuthor(String input) { author = input; }

    String getGenre() { return genre; }
    void setGenre(String input) { genre = input; }

    int getPages() { return pages; }
    void setPages(int input) { pages = input; }
}
