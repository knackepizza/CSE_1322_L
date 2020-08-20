package Assignment01;

public class Cypher {
    String original = "", encrypted = "", decrypted = "";

    public Cypher () {
        original = "cypher";
    }

    public Cypher (String input) {
        original = input;
    }

    String cypherMethod() {
        String input = original;
        String[] arr = input.split("");
        for (int i = 0; i < input.length(); i += 2) {
            encrypted += arr[i];
        }
        for (int i = 1; i < input.length(); i += 2) {
            encrypted += arr[i];
        }
        encrypted = String.join("", encrypted);
        return encrypted;
    }

    String reverseMethod() {
        String input = encrypted;
        String[] arr = input.split("");
        // Halfarr doesn't work on odd numbers
        int halfArr = Math.round(arr.length / 2) + (arr.length % (arr.length / 2));
        String[] oddArr = new String[halfArr], evenArr = new String[arr.length];
        System.out.println("halfarr " + halfArr + " arrlen " + arr.length);
        for (int i = 0; i < halfArr; i++) {
            oddArr[i] = arr[i];
        }
        for (int i = halfArr; i < arr.length; i++) {
            evenArr[i - halfArr] = arr[i];
        }
        for (int i = 0; i < halfArr; i++) {
            decrypted += oddArr[i];
            if (evenArr[i] != null) {
                decrypted += evenArr[i];
            }
        }
        decrypted = String.join("", decrypted);
        return decrypted;
    }

    String getOriginal() {
        return original;
    }
    String getEncrypted() {
        return encrypted;
    }
    String getDecrypted() {
        return decrypted;
    }

    void setOriginal(String input) {
        original = input;
        encrypted = "";
    }
    void setEncrypted(String input) {
        encrypted = input;
    }
    void setDecrypted(String input) {
        decrypted = input;
    }

    public static void main(String[] args) {
        Cypher c2 = new Cypher("12345678901");
        System.out.println(c2.cypherMethod());
        c2.setOriginal("shit");
        System.out.println(c2.cypherMethod());
        System.out.println(c2.reverseMethod());
        // System.out.println(c2.reverseMethod());
    }
}