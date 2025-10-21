package gaddi;
public class Vehicle {
    void run() { System.out.println("Vehicle is running..."); }
}
class Bike extends Vehicle {
    @Override
    void run() { System.out.println("Bike is running..."); }
}
class Car extends Vehicle {
    @Override
    void run() { System.out.println("Car is running..."); }
}
