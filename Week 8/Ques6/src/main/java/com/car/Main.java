package com.car;
public class Main {
    public static void main(String[] args) {
        CAR car1 = new CAR();
        car1.setPrice(0);
        car1.display();
        CAR car2 = new CAR("Tesla Model 3");
        car2.setPrice(55000);
        car2.display();
        CAR car3 = new CAR("BMW X5", "Black");
        car3.setPrice(75000);
        car3.display();
    }
}
