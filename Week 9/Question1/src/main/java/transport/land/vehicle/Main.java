package transport.land.vehicle;
public class Main {
    public static void main(String[] args) {
        Train Shatabdi = new Train("Shatabdi Express", "Delhi", "Lucknow", 1200.0, 16, 12015);
        Shatabdi.display();
        Bus volvo = new Bus("Volvo Bus", "AMU", "Delhi", 1500.0, 50,  "AC Sleeper");
        volvo.display();
    }
}
