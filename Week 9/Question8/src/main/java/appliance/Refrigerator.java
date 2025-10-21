package appliance;
public class Refrigerator extends Appliance {
    Refrigerator(String brand, int power) {
        super(brand, power);
    }
    @Override
    public void turnOn() {
        System.out.println(brand + " Refrigerator is cooling. Power: " + power + "W");
    }
    @Override
    public void turnOff() {
        System.out.println(brand + " Refrigerator is turned OFF.");
    }
}