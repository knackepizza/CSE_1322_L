package Assignment01;

public class testCypher {
    public static void main(String[] args) {
        Cypher c1 = new Cypher();

        c1.cypherMethod();
        c1.reverseMethod();
        
        System.out.println(c1.toString());

        Cypher c2 = new Cypher("Ram Ranch really rocks");

        c2.cypherMethod();
        c2.reverseMethod();
        
        System.out.println(c2.toString());
    }
}