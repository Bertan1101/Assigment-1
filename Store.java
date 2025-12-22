public class Store {

    private String storeName;
    private String address;
    private Product product;
    private double income;

    public Store() {
        this.storeName = "No Name Store";
        this.address = "Unknown";
        this.income = 0.0;
    }

    public Store(String storeName, String address, Product product) {
        this.storeName = storeName;
        this.address = address;
        this.product = product;
        this.income = 0.0;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getIncome() {
        return income;
    }

    public void sellProduct(Customer customer, int amount) {
        double totalPrice = product.getPrice() * amount;

        if (customer.canAfford(totalPrice) && product.getQuantity() >= amount) {
            customer.pay(totalPrice);
            product.reduceQuantity(amount);
            income += totalPrice;
            System.out.println("Sale successful!");
        } else {
            System.out.println("Sale failed!");
        }
    }

    public void showIncome() {
        System.out.println("Store income: " + income);
    }

    public String toString() {
        return "Store{name='" + storeName +
                "', address='" + address +
                "', product=" + product +
                ", income=" + income + '}';
    }
}
