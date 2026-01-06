public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
