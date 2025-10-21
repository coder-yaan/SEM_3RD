package com.car;

public class CAR {
    private String model;
    private String color;
    private double price;

    public CAR() {
        this("Unknown", "White", 0.0);
    }

    public CAR(String model) {
        this(model, "White", 0.0);
    }
    public CAR(String model, String color) {
        this(model, color, 0.0);
    }
    public CAR(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }

    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }

    public void setDetails(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String getDetails() {
        return "Model: " + model + ", Color: " + color + ", Price: " + price;
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
