package central.uni;
public class Department extends Faculty {
    String deptName;
    String chairman;
    Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName);
        this.deptName = deptName;
        this.chairman = chairman;
    }
    void Details() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Chairman: " + chairman);
    }
    void Display() {
        super.Details();
        this.Details();
    }
}