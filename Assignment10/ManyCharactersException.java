// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment10;

public class ManyCharactersException extends Exception {
    // Java always recommends that I add this... why?
    private static final long serialVersionUID = 1L;

    public ManyCharactersException(String msg) {
        super(msg);
    }
}
