// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Lab06;

public class FibFormula implements FindFibs {
    public long getFib(int n) {
        double fib, fib2;
        
        fib = ((1 + Math.sqrt(5)) / 2);
        fib = Math.pow(fib, n);
        fib2 = ((1 - Math.sqrt(5)) / 2);
        fib = fib - fib2;
        fib = fib / Math.sqrt(5);

        Long ans = new Double(fib).longValue();
        return ans;
    }
}
