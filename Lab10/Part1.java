// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab10;

public class Part1 {
    public static void main(String[] args) {
        System.out.println(repeatNTimes("hello", 5));
        System.out.println(repeatNTimes("Good morning!", 3));
    }

    static String repeatNTimes(String s, int amount) {
        String temp = "";
        temp += s;
        if (amount != 1) {
            return temp + repeatNTimes(temp, amount-1);
        } else {
            return temp;
        }
    }
}
