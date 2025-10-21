package com.fruit;
public class Fruit {

    private String color;
    private String taste;
    private double price;

    Fruit() { this("Unknown","Unknown",0);  }
    Fruit (String color) { this(color,"Unknown",0);  }
    Fruit (String color, String taste) { this(color,taste,0); }
    Fruit (String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
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

