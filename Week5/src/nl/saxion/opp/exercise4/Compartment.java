package nl.saxion.opp.exercise4;

public class Compartment {
    private Product product;
    private int amount;

    public Compartment(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Compartment() {
        this.product = null;
        this.amount = 0;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return product.toString()+" ["+amount+" items remaining]";
    }
}
