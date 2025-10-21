package com.fruit;
public class Main {
    public static void main(String[] args) {  
        Fruit mango = new Fruit("Yellow", "Sweet", 50.0);
        Fruit apple = new Fruit("Red", "Sweet", 100.0);
        System.out.println("Mango Details:");
        mango.display();
    }
}
