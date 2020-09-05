// Name: Nick Nettleton
// Class: 1321L
// Professor Adeojo

package Lab03;

public class Question {
    String question, answer, difficulty;

    public Question(String q, String d) {
        question = q;
        difficulty = d;
    }

    void setQuestion(String input) {
        question = input;
    }
    String getQuestion() {
        return question;
    }

    void setAnswer(String input) {
        answer = input;
    }
    String getAnswer() {
        return answer;
    }
}
