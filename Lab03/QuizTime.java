// Name: Nick Nettleton
// Class: 1321L
// Professor Adeojo

package Lab03;
import java.util.Scanner;

public class QuizTime extends Quiz {
    public static void main(String[] args) {
        displayMenu();
    }

    static void displayMenu() {
        Scanner scnr = new Scanner(System.in);
        String[] options = {
            "|||| MENU ||||",
            "1. Add a question",
            "2. Display questions",
            "3. Delete a question",
            "4. Take the quiz",
            "5. Show questions and answers",
            "6. Quit"
        };

        for (String option : options) {
            System.out.println(option);
        }

        System.out.print("Choose: ");
        int input = scnr.nextInt();
        takeMenuInput(input);
        scnr.close();
    }

    static void takeMenuInput(int input) {
        Scanner scnr = new Scanner(System.in);
        String tempQ, tempD;
        System.out.println();
        switch(input) {
            case 1:
                System.out.print("[?] What is the question: ");
                tempQ = scnr.nextLine();
                System.out.print("[?] What is the difficulty: ");
                tempD = scnr.nextLine();
                Add(tempQ, tempD);
                System.out.println();
                break;
            case 2:
                if (!questions.isEmpty()) {
                    int i = 0;
                    for (Question q : questions) {
                        System.out.println("Q" + i + ": " + q.getQuestion());
                        i++;
                    }
                    System.out.println();
                } else {
                    System.out.println("\n[!] No questions\n");
                }
                break;
            case 3:
                System.out.println("[!] Deletable Questions:");
                if (!questions.isEmpty()) {
                    int i = 0;
                    for (Question q : questions) {
                        System.out.println(i + ": " + q.getQuestion());
                        i++;
                    }
                    System.out.print("\n[?] Which question would you like to delete: ");
                    Remove(scnr.nextInt());
                } else {
                    System.out.println("[!] No deletable questions\n");
                }
                break;
            case 4:
                if (!questions.isEmpty()) {
                    QuizGive();
                } else {
                    System.out.println("\n[!] No questions\n");
                }
                break;
            case 5:
                if (!questions.isEmpty()) {
                    resultsPaper();
                    System.out.println();
                } else {
                    System.out.println("\n[!] No questions\n");
                }
                break;
            default:
                break;
        }
        if (input != 6) {
            displayMenu();
        }
        scnr.close();
    }
}
