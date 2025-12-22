public class Customer {

    private int id;
    private String name;
    private double balance;
    private String phone;

    public Customer() {
        this.id = 0;
        this.name = "Guest";
        this.balance = 0.0;
        this.phone = "Unknown";
    }

    public Customer(int id, String name, double balance, String phone) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean canAfford(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Customer{id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", phone='" + phone + '\'' +
                '}';
    }
}
