
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public synchronized void
    updateSalary(double salary) {
        this.salary = salary;
    }

    public void printDetail() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

