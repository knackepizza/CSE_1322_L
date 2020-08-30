package Assignment02;

public class Driver {
    public static void main(String[] args) {
        Object[] objArr = new Object[5];

        objArr[0] = new Book(234000123, "Lord of the Rings", false, "Tolkien", "fiction", 328);
        objArr[1] = new Video(500012345, "V1", true, "2.5 hours");
        objArr[2] = new Book(555000789, "War and Peace", true, "Tolstoy", "fiction", 780);
        objArr[3] = new Video(820017895, "V20", false, "1.5 hours");
        objArr[4] = new Book(513904578, "Alice's Adventures in Wonderland", false, "Carroll", "fiction", 523);

        // The instructions for what to do with the putOnHold method were incredibly unclear.
        ((Book) objArr[4]).putOnHold(15);

        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i].toString());
        }
    }
}