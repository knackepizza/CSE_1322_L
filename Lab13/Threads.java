// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab13;

import java.util.Random;

public class Threads implements Runnable {
    String name;
    int time;
    Random randomTimer = new Random();
    
    public Threads(String name) {
        this.name = name;
        time = randomTimer.nextInt(1000);
    }

    @Override
    public void run() {
        try {
            System.out.println("My name is " + name + ", I am going to sleep after: " + time + " ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am going awake now");
        } catch (InterruptedException ignored) {

        }
    }
    
}
