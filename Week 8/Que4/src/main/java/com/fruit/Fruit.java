package com.fruit;
public class Fruit {
    private String color;
    private String taste;
    private double price;
    Fruit () {
        this.color = "Unknown";
        this.taste = "Unknown";
        this.price = 0.0;
    }
    Fruit (String color){
        this.color = color;
    }
    Fruit (String color, String taste) {
        this.color = color;
        this.taste = taste;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getTaste() { return taste; }
    public void setTaste(String taste) { this.taste = taste; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; } 
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price + "\n");
    }
}
