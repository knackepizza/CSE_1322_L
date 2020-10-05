// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

// I use VSCODE and I need to have this to keep my classpath correct
package Assignment07;

public class HexCalc extends Calculator {

    public String decToHex(int a) {
        return Integer.toHexString(a);
    }

    public String add(String a, String b) {
        int x = hexToDec(a) + hexToDec(b);
        return decToHex(x);
    }

    public String subtract(String a, String b) {
        int x = hexToDec(a) - hexToDec(b);
        return decToHex(x);
    }

    public String multiply(String a, String b) {
        int x = hexToDec(a) * hexToDec(b);
        return decToHex(x);
    }

    public String divide(String a, String b) {
        int x = hexToDec(a) / hexToDec(b);
        return decToHex(x);
    }
}
