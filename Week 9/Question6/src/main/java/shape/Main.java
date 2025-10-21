package shape;
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        rect.area();
        circle.area();
    }
}