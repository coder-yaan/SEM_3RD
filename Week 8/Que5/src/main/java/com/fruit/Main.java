package com.fruit;

public class Main {

    public static void main(String[] args) {

        Fruit chalta = new Fruit();

        Fruit grapes = new Fruit("Green");
        grapes.setTaste("Sour");
        grapes.setPrice(65);

        Fruit apple = new Fruit("Red", "Sweet");
        apple.setPrice(102);

        Fruit mango = new Fruit("Yellow", "Sweet", 65);

        System.out.println("Chalta Details:");
        chalta.display();

        System.out.println("Apple Details:");
        apple.display();

        System.out.println("Grapes Details:");
        grapes.display();

        System.out.println("Mango Details:");
        mango.display();
    }
}
