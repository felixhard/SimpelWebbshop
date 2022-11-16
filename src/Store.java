import java.util.ArrayList;
import java.util.List;

public class Store {

    private String name;
    private List<Product> products = new ArrayList<>();
    public Store(){
        initializeStoreWithProducts();
    }

    private void initializeStoreWithProducts() {
        products.add(new Lamp());
        products.add(new Lamp());
        products.add(new Clock());
        products.add(new Clock());


    }
    public void showStock(){
        for (Product p: products) {
            System.out.println(p.toString());


        }
    }

}
