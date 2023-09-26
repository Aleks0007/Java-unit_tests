package seminars.first.Shop;  

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparing(Product::getCost));
        return products;
    }

    public Product getMostExpensiveProduct() {
        return products.stream().max(Comparator.comparing(Product::getCost)).orElse(null);
    }
}
