public class Employee extends Person {

    private double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Employee";
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
