package Assignment01;

public class testCypher extends Cypher {
    public static void main(String[] args) {
        Cypher c2 = new Cypher("123456789");

        c2.setOriginal("Attack at Dawn");

        System.out.println(c2.cypherMethod());
        System.out.println(c2.reverseMethod());
        
        System.out.println(c2.toString());
    }
}