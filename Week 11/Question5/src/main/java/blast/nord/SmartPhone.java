package blast.nord;
public class SmartPhone implements SmartDevice {
    @Override
    public void powerOn() { System.out.println("SmartPhone is powering on..."); }
    @Override
    public void connectWiFi() { System.out.println("SmartPhone connected to Wi-Fi."); }
}