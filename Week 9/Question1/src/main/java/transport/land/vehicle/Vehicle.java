package transport.land.vehicle;
public class Vehicle {
    protected String name;
    protected String startingPoint, destination;
    protected double fairCost;
    public Vehicle(String name, String startingPoint, String destination, double fairCost) {
        this.name = name;
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.fairCost = fairCost;
    }
    public Vehicle() { this("Unknown", "Unknown", "Unknown", 0); }
    public void cost(){ System.out.println("Fair cost: " + fairCost + " \n"); }
}
