package shape;
class Rectangle extends Shape {
    private double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void area() {
        double result = length * breadth;
        System.out.printf("Area of Rectangle: %.4f \n", result);
    }
}
