package appliance;
public class WashingMachine extends Appliance {
    WashingMachine(String brand, int power) {
        super(brand, power);
    }
    @Override
    public void turnOn() {
        System.out.println(brand + " Washing Machine is now ON. Power: " + power + "W");
    }
    @Override
    public void turnOff() {
        System.out.println(brand + " Washing Machine is now OFF.");
    }
}
