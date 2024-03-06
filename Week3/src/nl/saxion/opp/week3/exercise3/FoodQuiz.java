package nl.saxion.opp.week3.exercise3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodQuiz {
    private int round = 1;
    private ArrayList<Dish> dishes = new ArrayList<>();
    private int randomIndex;
    private int score = 0;

    public FoodQuiz() throws FileNotFoundException {
        new CSVReader("resources/indian_food.csv");

        CSVReader.readLine();
        while (CSVReader.hasNext()) {
            String lineInFile = CSVReader.readLine();
            String[] line = lineInFile.split(";");
            Dish dish = new Dish(line[0], line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), line[5], line[6], line[7], line[8]);
            dishes.add(dish);
        }
    }

    public String[] getAnswerOptions() {
        return new String[]{"main course", "dessert", "starter", "snack"};
    }


    public String getQuestionText() {
        return "What type of dish is described above?\n" +
                "\t1. main course\n" +
                "\t2. dessert\n" +
                "\t3. starter\n" +
                "\t4. snack";
    }

    public int getScore() {
        return score;
    }

    public String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void nextQuestion() {
        System.out.println("******** Question " + getRound() + ": *******");
        randomIndex = (int) (Math.random() * dishes.size());
        round++;
        Dish randomDish = dishes.get(randomIndex);

        System.out.println("Dish name: " + randomDish.getName());
        System.out.println("Ingredients: " + randomDish.getIngredients());
        System.out.println("");

        System.out.println(this.getQuestionText());
    }

    public boolean checkAnswer(String answerText) {
        int answer = Integer.parseInt(answerText);
        Dish randomDish = dishes.get(randomIndex);
        if (randomDish.getCourse().equals(getAnswerOptions()[answer - 1])) {
            score++;
            System.out.println("Correct! SCORE: " + getScore() + ".");
            return true;
        }
        System.out.println("That's WRONG! It was a " + randomDish.getCourse() + ". GAME OVER.");
        return false;
    }

    public int getRound() {
        return round;
    }
}
