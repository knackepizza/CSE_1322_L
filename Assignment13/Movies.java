// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Assignment13;

public class Movies {
    public static void main(String[] args) {
        // You guys have tons of print statements even on methods that say only to return a variable, like the remove method
        System.out.println("My BluRay Collection");

        BluRayCollection b = new BluRayCollection();
        b.add(new BluRayDisc(19.95, 2020, "Invasion", "Fyodor Sergeyevich Bondarchuk"));
        b.add(new BluRayDisc(17.50, 2020, "Time to Hunt", "Yoon Sung-Hyun"));
        b.add(new BluRayDisc(15.95, 2019, "The Outpost", "Rod Lurie"));
        b.add(new BluRayDisc(19.95, 2020, "Bloodshot", "David S F Wilson"));
        b.add(new BluRayDisc(24.95, 2020, "The 2nd Brian", "Skiba"));

        System.out.println(b.toString());

        System.out.println(b.search("Bloodshot"));
        System.out.println(b.search("Jaws"));
        System.out.println(b.remove("Bloodshot"));

        System.out.println(b.toString());

        System.out.println(b.remove("Jaws"));

        System.out.println(b.toString());
    }
}
