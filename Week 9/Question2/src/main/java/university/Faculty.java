package university;
class Faculty extends University {
    protected String facultyName;
    public Faculty(String uniName, int ranking, String facultyName) {
        super(uniName, ranking);
        this.facultyName = facultyName;
    }
    public void Details() {
        System.out.println("University Name: " + this.uniName);
        System.out.println("Faculty Name: " + facultyName);
    }
}