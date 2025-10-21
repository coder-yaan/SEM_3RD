package university;
class Department extends Faculty {
    private String deptName, chairman;
    public Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName);
        this.deptName = deptName;
        this.chairman = chairman;
    }
    public void Details() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Chairman: " + chairman);
    }
    public void Display() {
        super.Details(); this.Details();
    }
}