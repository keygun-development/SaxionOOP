package nl.saxion.opp.exercise0;

public class Food extends Item {
    private int forHowManyPersons;
    private boolean hot;

    public Food(String name, double price, int forHowManyPersons, boolean hot) {
        super(name, price);
        this.forHowManyPersons = forHowManyPersons;
        this.hot = hot;
    }

    public Food(String name, double price, int forHowManyPersons) {
        this(name, price, forHowManyPersons, false);
    }

    public int getForHowManyPersons() {
        return this.forHowManyPersons;
    }

    public boolean isHot() {
        return this.hot;
    }

    public String toString() {
        return super.toString() + "[hot: " + this.hot + ", for "+this.forHowManyPersons+" people.]";
    }
}
