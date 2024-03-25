package nl.saxion.opp.week6.exercise2;

public class NumericalQuestion extends Question {
    public NumericalQuestion(String question, int answer) {
        super(question, answer);
    }

    public boolean isCorrect(int answer) {
        return getAnswer() == answer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a question where you must answer true or false. Please answer the following question:\n\n");
        sb.append(super.toString()+"\n");
        return sb.toString();
    }
}
