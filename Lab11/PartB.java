// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo
package Lab11;

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        char again = 'y';

        while (again == 'y') {
            System.out.println("Enter time in 24-hour notation:");
            int time = scnr.nextInt();

            try {
                System.out.println("That is the same as " + splitTime(time));
            } catch (InvalidTimeFormatException e) {
                // This Lab11.InvalidTimeFormatException: Message.
                // Did you want JUST the Message?
                System.err.println(e);
            }

            System.out.println("Again? (y/n)");
            again = scnr.next().charAt(0);
        }
        

        scnr.close();
    }

    static String splitTime(int n) throws InvalidTimeFormatException {
        int[] digits = new int[4];
        int i = 0;

        while (n > 0) {
            digits[i] = n % 10;
            n = n / 10;
            i++;
        }

        String hours = digits[3] + "" + digits[2];
        String minutes = digits[1] + "" + digits[0]; 
        
        int hour = Integer.parseInt(hours);
        int minute = Integer.parseInt(minutes);

        if (hour > 23 || hour < 0) {
            throw new InvalidTimeFormatException("Hour can only be between 0 and 23");
        }
        
        if (minute > 59 || minute < 0) {
            throw new InvalidTimeFormatException("Minutes can only be between 0 and 59");
        }
        
        return interpretHour(hour) + ":" + minutes + " " + dayOrNight(hour);
    }

    static int interpretHour(int h) {
        if (h > 12) {
            return (h % 12);
        } else {
            return h;
        }
    }

    static String dayOrNight(int h) {
        if (h >= 12) {
            return "PM";
        } else {
            return "AM";
        }
    }
}
