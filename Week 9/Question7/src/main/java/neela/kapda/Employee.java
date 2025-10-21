package neela.kapda;
public class Employee {
    protected String name;
    protected double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}