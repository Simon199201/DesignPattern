package imp;

public class ProductA extends Product {
    @Override
    public void method() {
        System.out.println("我是具体的产品A");
    }

    @Override
    public String toString() {
        return "ProductA{}";
    }
}
