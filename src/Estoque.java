import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Product> productsList = new ArrayList<>();

    public List<Product> getProductsList() {
        return productsList;
    }

    public void addProduct(Product product) {
        this.productsList.add(product);
    }
}


