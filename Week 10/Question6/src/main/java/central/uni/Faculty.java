package central.uni;
public class Faculty extends University {
    String facultyName;
    Faculty(String uniName, int ranking, String facultyName) {
        super(uniName, ranking);
        this.facultyName = facultyName;
    }
    void Details() {
        System.out.println("University: " + uniName);
        System.out.println("Faculty Name: " + facultyName);
    }
}
