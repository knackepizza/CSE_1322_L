// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment07;

public class Calculator implements CalcOps {
    
    public int hexToDec(String hexValue) {
        // String Non-numerical to number
        return Integer.parseInt(hexValue, 16);
    }

    public int strToInt(String strValue) {
        // String Number to number
        return Integer.parseInt(strValue);
    }

    public String add(String a, String b) {
        int x = strToInt(a) + strToInt(b);
        return x + "";
    }

    public String subtract(String a, String b) {
        int x = strToInt(a) - strToInt(b);
        return x + "";
    }

    public String multiply(String a, String b) {
        int x = strToInt(a) * strToInt(b);
        return x + "";
    }

    public String divide(String a, String b) {
        int x = strToInt(a) / strToInt(b);
        return x + "";
    }
}
