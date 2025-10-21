package neela.kapda;
public class Manager extends Employee {
    private String department;
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
