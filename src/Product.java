abstract public class Product {

    protected double price;
    protected String name;

    abstract public void showProduct();

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
