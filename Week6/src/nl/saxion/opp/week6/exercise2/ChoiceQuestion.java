package nl.saxion.opp.week6.exercise2;

public class ChoiceQuestion extends Question {
    private String[] choices;
    public ChoiceQuestion(String question, int answer, String[] choices) {
        super(question, answer);
        this.choices = choices;
    }

    public boolean isCorrect(int answer) {
        return getAnswer() == answer;
    }

    public String[] getChoices() {
        return choices;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a question where you must answer true or false. Please answer the following question:\n\n");
        sb.append(super.toString()+"\n");
        for (int i = 0; i < choices.length; i++) {
            sb.append((i + 1) + ". " + choices[i] + "\n");
        }
        return sb.toString();
    }
}
