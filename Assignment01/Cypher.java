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
        String odd = "";
        String even = "";

        for (int i = 0; i < original.length(); i++) {
            if (i % 2 == 0) {
                odd += original.charAt(i);
            } else {
                even += original.charAt(i);
            }
        }
        
        encrypted = odd + even;
    }

    void reverseMethod() {        
        if (encrypted.length() % 2 == 0) {
            int x = 0;
            for (int i = encrypted.length() / 2; i < encrypted.length(); i++) {
                decrypted += encrypted.charAt(x);
                decrypted += encrypted.charAt(i);
                x++;
            }
        } else {
            int x = 0;
            for (int i = encrypted.length(); i < encrypted.length(); i++) {
                decrypted += encrypted.charAt(x);
                decrypted += encrypted.charAt(i);
                x++;
            }
            decrypted += encrypted.charAt(x);
        }
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