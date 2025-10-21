package cheap.tcs;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Abdul Ahad Ansari", "9876543210");

        // create inner objects through Person's methods
        p.setAddress("12A", "Zakaria Street", "Aligarh", "Uttar Pradesh");
        p.setDOB(14, 11, 2005);

        p.display();
    }
}
