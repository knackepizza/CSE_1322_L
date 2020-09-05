// Name: Nick Nettleton
// Class: 1321L
// Professor Adeojo

package Lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    static ArrayList<Question> questions = new ArrayList<Question>();

    static void Add(String q, String d) {
        questions.add(new Question(q, d));
    }

    static void Remove(int i) {
        questions.remove(i);
    }

    void Modify(int i, String q, String d) {
        questions.set(i, new Question(q, d));
    }

    static void QuizGive() {
        Scanner scnr = new Scanner(System.in);
        int i = 1;
        for (Question q : questions) {
            System.out.println("Question " + i + ": " + q.getQuestion());
            System.out.print("What is your answer: ");
            String answer = scnr.next();
            q.setAnswer(answer);
            i++;
        }
    }

    static void resultsPaper() {
        int i = 1;
        for (Question q : questions) {
            System.out.println("Q" + i + ": " + q.getQuestion());
            System.out.println("A:" + q.getAnswer());
            i++;
        }
    }
}
