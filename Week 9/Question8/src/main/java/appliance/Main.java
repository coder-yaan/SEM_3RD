package appliance;
public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("Samsung", 1500);
        Refrigerator rf = new Refrigerator("LG", 800);
        wm.turnOn(); wm.turnOff();
        rf.turnOn(); rf.turnOff();
    }
}
