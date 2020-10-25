// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment09;

public class Driver {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            String folds = paperFold("", i);
            System.out.println("For " + i + " folds we get: " + folds);
        }
    }

    static String paperFold(String str, int folds) {
        str = invertFold(str);
        str += "v";
        if (folds != 0) {
            return (str + paperFold(str, folds - 1));
        }
        return "";
    }

    static String reverseString(String str) {
        String temp = "";
        for (int i = str.length()-1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return temp;
    }

    static String invertFold(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'v':
                    temp += '^';
                    break;
                case '^':
                    temp += 'v';
                    break;
            }
        }
        return temp;
    }
}
