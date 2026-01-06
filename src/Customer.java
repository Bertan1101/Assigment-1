public class Customer extends Person {

    private double balance;

    public Customer(int id, String name, double balance) {
        super(id, name);
        setBalance(balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', balance=" + balance + "}";
    }
}
