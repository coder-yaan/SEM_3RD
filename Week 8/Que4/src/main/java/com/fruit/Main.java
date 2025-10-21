package com.fruit;
public class Main {
    public static void main(String[] args) {
        Fruit chalta = new Fruit();
        Fruit mango = new Fruit("Yellow");
        mango.setTaste("Sweet");
        mango.setPrice(75.00);
        Fruit apple = new Fruit("Red", "Sweet");
        apple.setPrice(100);
        System.out.println("Chalta Details:");
        chalta.display();
        System.out.println("Mango Details:");
        mango.display();
        System.out.println("Apple Details:");
        apple.display();
    }
}