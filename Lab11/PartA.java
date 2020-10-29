// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab11;

public class PartA {
    public static void main(String[] args) {
        int[] arr = {5, 7, 11, 3, 0};

        System.out.println("Printing an element out of bounds");
        
        for (int i = 0; i <= arr.length; i++) {
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("You went out of limits in the array");
            }
        }
    }
}
