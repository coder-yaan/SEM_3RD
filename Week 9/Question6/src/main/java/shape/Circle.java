package shape;
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.4f \n", result);
    }
}
