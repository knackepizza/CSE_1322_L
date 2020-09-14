// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment05;

public class Cricket {
    private int chirpCount;

    /*
        Cricket needs Environment, so there would be no default constructor
    */

    public Cricket(Environment env) {
        chirpCount = (env.getTemperature() * 4) - 40;
    }

    int getChirpCount() { return chirpCount; }
    
    void reduceChirpSpeed(float amount) { 
        chirpCount *= amount;
    }
}
