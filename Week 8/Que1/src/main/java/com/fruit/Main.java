package com.fruit;
public class Main {
    public static void main(String[] args) {

        Fruit mango = new Fruit();
        mango.setColor("Yellow");
        mango.setTaste("Sweet");
        mango.setPrice(50.0);

        Fruit apple = new Fruit();
        apple.setColor("Red");
        apple.setTaste("Sweet");
        apple.setPrice(100.0);

        Fruit grapes = new Fruit();
        grapes.setColor("Green");
        grapes.setTaste("Sour");
        grapes.setPrice(60.0);
        
        System.out.println("Mango Details:");
        mango.display();
        System.out.println("Apple Details:");
        apple.display();
        System.out.println("Grapes Details:");
        grapes.display();
    }
}