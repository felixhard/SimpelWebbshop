public class Clock extends Product {
    @Override
    public String toString() {
        return "Klocka: " + this.getPrice() + "Sek" + " " + "ID:" + " " + this.getProductId();
    }
    public Clock(){
        this.setPrice();
        price = 150;
    }
}
