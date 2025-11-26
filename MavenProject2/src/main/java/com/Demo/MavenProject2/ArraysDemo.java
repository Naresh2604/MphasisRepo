package com.Demo.MavenProject2;

public class ArraysDemo {
    public static void main(String[] args) {
        // ✅ Create an array of Fruits objects
        Fruits[] fruitsArr = new Fruits[3];

        // ✅ Create fruit objects using constructor
        fruitsArr[0] = new Fruits("Apple", "Red", 56);
        fruitsArr[1] = new Fruits("Banana", "Yellow", 20);
        fruitsArr[2] = new Fruits("Grapes", "Green", 45);

        // ✅ Loop through array and print details
        for (Fruits f : fruitsArr) {
            System.out.println(f.getFruitName() + " - " + f.getFruitColor() + " - " + f.getFruitCost());
        }
    }            
}
