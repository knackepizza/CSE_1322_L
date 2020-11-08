// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment11;

public class NotEnoughDataException extends Exception {
    // Java suggets that I include this, not sure why
    private static final long serialVersionUID = 1L;
    
    public NotEnoughDataException(String msg) {
        super(msg);
    }
}
