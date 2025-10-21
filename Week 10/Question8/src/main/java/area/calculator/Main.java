package area.calculator;
public class Main {
    public static void main(String[] args) {
        AreaCalculator s = new AreaCalculator();

        System.out.println("Area of Square (side=5): " + s.area(5));
        System.out.println("Area of Rectangle (length=4, breadth=6): " + s.area(4, 6));
        System.out.println("Area of Circle (radius=3.5): " + s.area(3.5));
    }
}