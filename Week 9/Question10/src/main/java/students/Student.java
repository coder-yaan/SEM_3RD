package students;

class Student {
    private String name;
    private int rollNo;
    private double marks;

    static String schoolName = "Aligarh Public School";

    Student(String name, int rollNo, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static void changeSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
    }

    public void showDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School: " + schoolName);
        System.out.println();
    }
}
