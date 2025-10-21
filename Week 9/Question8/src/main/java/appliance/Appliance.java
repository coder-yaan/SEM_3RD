package appliance;
public abstract class Appliance {
    protected String brand;
    protected int power;
    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }
    abstract protected void turnOn();
    abstract protected void turnOff();
}
