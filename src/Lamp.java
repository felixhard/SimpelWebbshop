public class Lamp extends Product {
    @Override
    public String toString() {
        return "Lampa: " + this.getPrice() + "Sek" + " " + "ID:" + " " + this.getProductId();
    }
    public Lamp(){
        this.setPrice();
        price = 100;
    }
}
