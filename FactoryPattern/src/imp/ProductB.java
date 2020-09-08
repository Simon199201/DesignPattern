package imp;

public class ProductB extends Product {
    @Override
    public void method() {
        System.out.println("我是具体的产品B");
    }

    @Override
    public String toString() {
        return "ProductB{}";
    }
}
