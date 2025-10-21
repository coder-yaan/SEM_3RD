package central.uni;
public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Aligarh Muslim University", 8,
                "Science Faculty", "Computer Science", "Arman Rasool Faridi");
        dept.Display();
        System.out.println("University Ranking: " + dept.ranking);
    }
}