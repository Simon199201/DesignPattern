package imp;

/**
 *
 */
public class ConcreateBFactory extends Factory {
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
