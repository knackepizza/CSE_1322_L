// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab13;

public class ThreadsDriver {
    public static void main(String[] args) {
        System.out.println("Program will Now Start: ");
        Thread threadOne = new Thread(new Threads("Thread1"));
        Thread threadTwo = new Thread(new Threads("Thread2"));

        threadOne.start();
        threadTwo.start();
    }
}
