// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Lab06;

public class FibIteration implements FindFibs {
    public long getFib(int n) {
        int last;
        int previous = 0;
        int current = 1;

        for (int i = 1; i < n; i++) {
            last = previous;
            previous = current;
            current = last + previous;
        }
        return current;
    }    
}
