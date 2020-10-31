// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab11;

public class InvalidTimeFormatException extends Exception {
    // Java always recommends that I add this... why?
    private static final long serialVersionUID = 1L;
    
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}
