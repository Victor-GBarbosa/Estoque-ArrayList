public class Eletronicos extends Product {
    protected String brand;

    public String getBrand() {
        return brand;
    }

    public Eletronicos(double price, String name, String brand) {
        super(price, name);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void showProduct() {
        System.out.println("Nome: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }
}
