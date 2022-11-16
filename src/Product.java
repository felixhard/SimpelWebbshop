public class Product {
    static int i = 0;
    public Product(){
        i++;
        this.productId = i;
    }

    public int getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public int price;

    public void setPrice() {
        this.price = price;
    }

    private int productId;

}
