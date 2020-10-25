// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab10;

public class Part2 {
    public static void main(String[] args) {
        System.out.println(isReverse("Computer", "retupmCo"));
        System.out.println(isReverse("Hello", "olleh"));
    }
    
    static boolean isReverse(String s1, String s2) {
        char s1start = Character.toLowerCase(s1.charAt(0));
        char s2end = Character.toLowerCase(s2.charAt(s2.length()-1));

        if (s1.length() == 1 || s2.length() == 1) {
            if (s1start == s2end) {
                return true;
            } else {
                return false;
            }
        } else if (s1.length() != s2.length()) {
            return false;
        } else {    
            if (s1start == s2end) {
                String s1cut = s1.substring(1);
                String s2cut = s2.substring(0, s2.length()-1);
                return isReverse(s1cut, s2cut);
            } else {
                return false;
            } 
        }
    }
}
