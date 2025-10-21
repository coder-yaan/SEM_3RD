package com.fruitseller;

public class Main {
    public static void main(String[] args) {
        Fruit mango = new Fruit();
        mango.setDetails("Yellow", "Sweet", 50.0);
        System.out.println("Mango Details:");
        mango.display();
    }
}
