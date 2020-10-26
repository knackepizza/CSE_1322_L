// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment09;

public class Driver {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            String folds = paperFold(i);
            System.out.println("For " + i + " folds we get: " + folds);
        }
    }

    static String paperFold(int folds) {
        if (folds == 1) {
            return "v";
        } else {
            String s = paperFold(folds - 1);
            return invertFold(reverseString(s)) + "v" + s;
        }
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
