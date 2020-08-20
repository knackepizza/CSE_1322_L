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
public class PatternD {
    public static void main(String[] args) {
        char[][] arr = new char[10][10];
        int lines = 4;
        int stars = 1;

        for (int i = 0; i < 5; i++) {
            int lineCount = 0;
            int starCount = 0;
            for (int j = 0; j < 10; j++) {
                if (lines > lineCount) {
                    arr[i][j] = '-';
                    lineCount++;
                } else if (stars > starCount) {
                    arr[i][j] = '*';
                    starCount++;
                }
            }
            
            lines--;
            stars += 2;
        }
        for (int i = 5; i < 10; i++) {
            lines++;
            stars -= 2;
            int lineCount = 0;
            int starCount = 0;
            for (int j = 0; j < 10; j++) {
                if (lines > lineCount) {
                    arr[i][j] = '-';
                    lineCount++;
                } else if (starCount < stars) {
                    arr[i][j] = '*';
                    starCount++;
                }
            }
        }

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b]);
            }
            System.out.println();
        }
    }
}