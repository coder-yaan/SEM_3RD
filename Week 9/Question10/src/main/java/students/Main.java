package students;
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student( "Abdul",509, 91.6);
        Student s2 = new Student( "Ahad",560, 90.9);

        System.out.println("Before changing school name:");
        s1.showDetails();
        s2.showDetails();

        Student.changeSchoolName("Saiyyid Hamid Senior Secondary School");

        System.out.println("After changing school name:");
        s1.showDetails();
        s2.showDetails();
    }
}