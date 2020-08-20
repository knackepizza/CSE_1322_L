package Assignment01;

public class Cypher {
    String original = "", encrypted = "", decrypted = "";

    public Cypher () {
        original = "cypher";
    }

    public Cypher (String input) {
        original = input;
    }

    void cypherMethod() {
        String input = original;
        String[] arr = input.split("");
        encrypted = "";

        for (int i = 0; i < input.length(); i += 2) {
            encrypted += arr[i];
        }
        for (int i = 1; i < input.length(); i += 2) {
            encrypted += arr[i];
        }

        encrypted = String.join("", encrypted);
    }

    void reverseMethod() {
        String input = encrypted;
        String[] arr = input.split("");
        decrypted = "";

        int halfArr = Math.round(arr.length / 2) + (arr.length % (arr.length / 2));
        String[] oddArr = new String[halfArr], evenArr = new String[arr.length];

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
    }
    void setEncrypted(String input) {
        encrypted = input;
    }
    void setDecrypted(String input) {
        decrypted = input;
    }

    public String toString() {
        return "The encrypted message is '" + encrypted + "' and the decrypted message is '" + decrypted + "'"; 
    }
}