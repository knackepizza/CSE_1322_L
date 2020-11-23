// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab14;

public class Movies {
    public static void main(String[] args) {
        System.out.println("My BluRay Collection");

        BluRayCollection b = new BluRayCollection();
        b.add(new BluRayDisc(19.95, 2020, "Invasion", "Fyodor Sergeyevich Bondarchuk"));
        b.add(new BluRayDisc(17.50, 2020, "Time to Hunt", "Yoon Sung-Hyun"));
        b.add(new BluRayDisc(15.95, 2019, "The Outpost", "Rod Lurie"));
        b.add(new BluRayDisc(19.95, 2020, "Bloodshot", "David S F Wilson"));
        b.add(new BluRayDisc(24.95, 2020, "The 2nd Brian", "Skiba"));

        System.out.println(b.toString());
    }
}
