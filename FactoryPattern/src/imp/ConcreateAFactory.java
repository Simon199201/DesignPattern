package imp;

/**
 *
 */
public class ConcreateAFactory extends Factory {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
