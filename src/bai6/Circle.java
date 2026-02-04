package bai6;

import java.util.Scanner;

class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius = 6;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}