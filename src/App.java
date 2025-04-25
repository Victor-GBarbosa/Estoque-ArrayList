public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

        Estoque estoque = new Estoque();

        estoque.addProduct(new Hortifruti(5.99, "Banana", 1));
        estoque.addProduct(new Eletronicos(50, "mouse", "Multilaser"));

        estoque.getProductsList().get(0).showProduct();
        System.out.println();
        estoque.getProductsList().get(1).showProduct();
    }
}
