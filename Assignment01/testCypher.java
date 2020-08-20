package Assignment01;

public class testCypher extends Cypher {
    public static void main(String[] args) {
        Cypher c1 = new Cypher();

        c1.cypherMethod();
        c1.reverseMethod();
        
        System.out.println(c1.toString());

        Cypher c2 = new Cypher("123456789");

        c2.setOriginal("Attack at Dawn");

        c2.cypherMethod();
        c2.reverseMethod();
        
        System.out.println(c2.toString());
    }
}