package transport.land.vehicle;
public class Train extends Vehicle {
    private int numberOfCoaches;
    private int trainNumber;
    Train(String name, String start, String dest, double fairCost, int numberOfCoaches, int trainNumber) {
        super(name, start, dest, fairCost);
        this.numberOfCoaches = numberOfCoaches;
        this.trainNumber = trainNumber;
    }
    public void display(){
        System.out.println("Train Name: " + name);
        System.out.println("Train number: " + trainNumber);
        System.out.println("Number of coaches: " + numberOfCoaches);
        System.out.printf("Route: %s to %s. \n", startingPoint, destination);
        super.cost();
    }
}
