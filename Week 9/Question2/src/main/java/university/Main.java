package university;
public class Main {
    public static void main(String[] args) {
        Department CSDept = new Department("Aligarh Muslim University", 9,
                "Science Faculty", "Computer Science Department", "ARF");
        CSDept.Display();
        CSDept.showRanking();
    }
}