package Lab01;

/*
    Are we still supposed to do this?
    Class: CSE 1322L
    Section: ?
    Term: Fall 2020
    Instructor: Peter Adeojo
    Name: Nick Nettleton
    Lab#: 1
*/
public class PatternC {
    public static void main(String[] args) {
        char[][] arr = new char[10][10];
        int lines = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int k = lines; k < arr[i].length; k++) {
                arr[i][k] = '*';
            }

            for (int j = 0; j < lines; j++) {
                arr[i][j] = '-';
            }
            lines++;
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b]);
            }
            System.out.println();
        }
    }
}