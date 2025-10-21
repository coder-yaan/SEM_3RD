package com.fruit;
public class Fruit {
    private String color;
    private String taste;
    private double price;
    Fruit (String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price + "\n");
    }
}