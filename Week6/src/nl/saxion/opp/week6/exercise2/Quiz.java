package nl.saxion.opp.week6.exercise2;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
