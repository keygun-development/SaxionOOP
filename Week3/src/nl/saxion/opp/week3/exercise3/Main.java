package nl.saxion.opp.week3.exercise3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FoodQuiz quiz = new FoodQuiz();
        boolean correct = true;

        while(correct) {
            quiz.nextQuestion();
            System.out.print("Please enter the number of your answer: ");
            String answer = quiz.getAnswer();
            correct = quiz.checkAnswer(answer);
        }
    }
}