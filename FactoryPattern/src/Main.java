import imp.Product;
import imp.ProductA;
import imp.ProductB;
import imp.StaticFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Product product = StaticFactory.createProduct(ProductB.class);
        if (product != null) {
            System.out.println(product.toString());
        }
    }
}
