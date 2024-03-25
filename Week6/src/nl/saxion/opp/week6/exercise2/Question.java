package nl.saxion.opp.week6.exercise2;

public abstract class Question {
    private String question;
    private int answer;

    public Question(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public abstract boolean isCorrect(int answer);

    public String toString() {
        return question;
    }
}
