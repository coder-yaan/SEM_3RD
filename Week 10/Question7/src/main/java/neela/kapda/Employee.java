package neela.kapda;
public class Employee {
    private String empName;
    private int empID;
    private Salary salary;
    private JoiningDate joiningDate;
    Employee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    public void setSalary(double basic, double hra, double pf) {
        this.salary = new Salary(basic, hra, pf);
    }
    public void setJoiningDate(int day, int month, int year) {
        this.joiningDate = new JoiningDate(day, month, year);
    }
    class Salary{
        private double basic, hra, pf;
        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }
        void displaySalary() {
            System.out.println("Salary Details: ");
            System.out.println("Basic: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("PF: " + pf);
        }
    }
    class JoiningDate {
        int day, month, year;
        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }
    void displayEmployee(Salary salary, JoiningDate jd) {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
        salary.displaySalary();
        jd.displayJoiningDate();
    }
    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
        if (salary != null) salary.displaySalary();
        if (joiningDate != null) joiningDate.displayJoiningDate();
    }
}
