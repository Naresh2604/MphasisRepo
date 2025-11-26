package com.Demo.MavenProject2;

public class Fruits {
    private String fruitName;
    private String fruitColor;
    private double fruitCost;

    // ✅ Parameterized constructor
    public Fruits(String fruitName, String fruitColor, double fruitCost) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.fruitCost = fruitCost;
    }

    // ✅ Getters and Setters
    public String getFruitName() {
        return fruitName;
    }


    public String getFruitColor() {
        return fruitColor;
    }

    public double getFruitCost() {
        return fruitCost;
    }
 
}
