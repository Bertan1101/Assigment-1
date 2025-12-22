public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Milk", 2.5, 20);
        Customer customer = new Customer(101, "Bertan", 20.0, "87001234567");
        Store store = new Store("Galmart", "Astana", product);

        System.out.println(product);
        System.out.println(customer);
        System.out.println(store);

        store.sellProduct(customer, 3);

        System.out.println(customer);
        System.out.println(product);
        store.showIncome();
    }
}
