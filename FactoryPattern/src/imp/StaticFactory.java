package imp;

public class StaticFactory {
    public static Product createProduct(Class<?> productAClass){
        try {
            Product o = (Product) productAClass.newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
