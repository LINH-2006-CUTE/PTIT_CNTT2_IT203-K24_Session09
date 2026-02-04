package bai6;

import java.util.Scanner;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}