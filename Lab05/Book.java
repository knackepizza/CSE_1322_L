// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab05;

public class Book extends Item {
    private String author;
    private int isbn;

    public Book() {
        super();
    }
    public Book(String t, String a, int i) {
        super(t);
        author = a;
        isbn = i;
    }

    String getListing() {
        return super.getTitle() + ", " + author + ", " + isbn;
    }

    String getAuthor() { return author; }
    int getIsbn() { return isbn; }
    
}
