package gaddi;
public class Main {
    public static void main(String[] args) {
        Vehicle v;
        v = new Bike();
        v.run();
        v = new Car();
        v.run();
    }
}