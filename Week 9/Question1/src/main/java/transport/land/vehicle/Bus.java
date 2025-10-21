package transport.land.vehicle;
public class Bus extends Vehicle {
    private final int passengerCapacity;
    private final String busType;
    Bus(String name, String start, String dest, double fairCost, int passengerCapacity, String busType) {
        super(name, start, dest, fairCost);
        this.passengerCapacity = passengerCapacity;
        this.busType = busType;
    }
    public void display(){
        System.out.println("Bus Name: " + name);
        System.out.println("BusType: " + busType);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.printf("Route: %s to %s. \n", startingPoint, destination);
        super.cost();
    }
}
