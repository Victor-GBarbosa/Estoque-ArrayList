public class Hortifruti extends Product {
    protected double weight;

    public double getWeight() {
        return weight;
    }

    public Hortifruti(double price, String name, double weight) {
        super(price, name);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void showProduct() {
        System.out.println("Nome: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Weight: " + this.weight);
    }
}
