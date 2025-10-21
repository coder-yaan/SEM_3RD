package neela.kapda;
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Abdul Ansari", 547);
        emp.setSalary(420000, 30000, 25000);
        emp.setJoiningDate(15, 8, 2022);
        emp.displayEmployee();
    }
}