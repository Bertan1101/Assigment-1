import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Add Employee");
            System.out.println("3. View All");
            System.out.println("4. Demonstrate Polymorphism");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice == 1) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Balance: ");
                double balance = scanner.nextDouble();

                people.add(new Customer(id, name, balance));
            }

            if (choice == 2) {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();

                people.add(new Employee(id, name, salary));
            }

            if (choice == 3) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

            if (choice == 4) {
                for (Person p : people) {
                    System.out.println(p.getName() + " is a " + p.getRole());
                }
            }
        }
    }
}