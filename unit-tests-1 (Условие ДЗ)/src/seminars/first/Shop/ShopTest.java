package seminars.first.Shop;

import org.junit.jupiter.api.Test; 
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void testSortProductsByPrice() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("apple");
        
        Product product2 = new Product();
        product2.setCost(5);
        product2.setTitle("banana");
        
        Product product3 = new Product();
        product3.setCost(20);
        product3.setTitle("cherry");
        
        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));
        
        List<Product> sortedProducts = shop.sortProductsByPrice();
        
        assertEquals(product2, sortedProducts.get(0));
        assertEquals(product1, sortedProducts.get(1));
        assertEquals(product3, sortedProducts.get(2));
    }

    @Test
    void testGetMostExpensiveProduct() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("apple");
        
        Product product2 = new Product();
        product2.setCost(5);
        product2.setTitle("banana");
        
        Product product3 = new Product();
        product3.setCost(20);
        product3.setTitle("cherry");
        
        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));
        
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        
        assertEquals(product3, mostExpensiveProduct);
    }

    @Test
    void testShopContainsCorrectProducts() {
        Product product1 = new Product();
        product1.setCost(10);
        product1.setTitle("apple");
        
        Product product2 = new Product();
        product2.setCost(5);
        product2.setTitle("banana");
        
        Product product3 = new Product();
        product3.setCost(20);
        product3.setTitle("cherry");
        
        Shop shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));
        
        List<Product> shopProducts = shop.getProducts();
        
        assertTrue(shopProducts.containsAll(Arrays.asList(product1, product2, product3)));
        assertEquals(3, shopProducts.size());
    }
}
