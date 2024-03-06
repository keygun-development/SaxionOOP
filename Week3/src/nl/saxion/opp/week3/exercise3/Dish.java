package nl.saxion.opp.week3.exercise3;

public class Dish {
    private String name;
    private String ingredients;
    private String diet;
    private int prepTime;
    private int cookTime;
    private String flavorProfile;
    private String course;
    private String state;
    private String region;

    public Dish(String name, String ingredients, String diet, int prepTime, int cookTime, String flavorProfile, String course, String state, String region) {
        this.name = name;
        this.ingredients = ingredients;
        this.diet = diet;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.flavorProfile = flavorProfile;
        this.course = course;
        this.state = state;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getCourse() {
        return course;
    }
}
