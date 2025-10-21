package area.calculator;
public class AreaCalculator {
    double area(int side) { return side * side; }
    double area(int length, int breadth) { return length * breadth; }
    double area(double radius) { return Math.PI * radius * radius; }
}