package Assignment02;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(13, "Ready Player One", false, "Some Guy", "action", 516);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

        Video v1 = new Video();
        Video v2 = new Video(22, "Bread Falling Over", true, "4 minutes");
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}