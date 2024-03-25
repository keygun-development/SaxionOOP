package nl.saxion.opp.week6.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new NumericalQuestion("What is 1 + 1?", 2));
        quiz.addQuestion(new NumericalQuestion("What is 2 + 2?", 4));
        quiz.addQuestion(new ChoiceQuestion("What programming language do we use in this course?", 1, new String[]{"Java", "Python", "C++"}));

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quiz.getQuestions().size(); i++) {
            System.out.println("******* Question " + (i + 1) + " *******");
            System.out.println(quiz.getQuestions().get(i).toString());
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (quiz.getQuestions().get(i).isCorrect(answer)) {
                System.out.println("That answer is correct!");
            } else {
                System.out.println("That answer is incorrect!");
            }
            System.out.println();
        }
    }
}
